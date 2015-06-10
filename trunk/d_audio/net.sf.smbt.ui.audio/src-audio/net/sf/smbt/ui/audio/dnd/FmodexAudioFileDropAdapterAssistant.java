package net.sf.smbt.ui.audio.dnd;

import java.util.ArrayList;
import java.util.Iterator;

import net.sf.smbt.fmodex.core.Activator;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.CopyFilesAndFoldersOperation;
import org.eclipse.ui.actions.MoveFilesAndFoldersOperation;
import org.eclipse.ui.actions.ReadOnlyStateChecker;
import org.eclipse.ui.navigator.CommonDropAdapter;
import org.eclipse.ui.navigator.CommonDropAdapterAssistant;
import org.eclipse.ui.part.ResourceTransfer;
import org.eclipse.ui.views.navigator.LocalSelectionTransfer;

@SuppressWarnings("deprecation")
public class FmodexAudioFileDropAdapterAssistant extends CommonDropAdapterAssistant {
	
	private static final boolean DEBUG = false;
	private static final IResource[] NO_RESOURCES = new IResource[0];

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.navigator.CommonDropAdapterAssistant#isSupportedType(org.eclipse.swt.dnd.TransferData)
	 */
	public boolean isSupportedType(TransferData aTransferType) {
		return super.isSupportedType(aTransferType)
				|| FileTransfer.getInstance().isSupportedType(aTransferType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.navigator.CommonDropAdapterAssistant#validateDrop(java.lang.Object,
	 *      int, org.eclipse.swt.dnd.TransferData)
	 */
	public IStatus validateDrop(Object target, int aDropOperation,
			TransferData transferType) {

		if (!(target instanceof IResource)) {
			return createStatus(
							IStatus.INFO,
							0,
							"",//WorkbenchNavigatorMessages.DropAdapter_targetMustBeResource,
							null);
		}
		IResource resource = (IResource) target;
		if (!resource.isAccessible()) {
			return createErrorStatus(
							0,
							"",//WorkbenchNavigatorMessages.DropAdapter_canNotDropIntoClosedProject,
							null);
		}
		IContainer destination = getActualTarget(resource);
		if (destination.getType() == IResource.ROOT) {
			return createErrorStatus(
							0,
							"",//WorkbenchNavigatorMessages.DropAdapter_resourcesCanNotBeSiblings,
							null);
		}
		@SuppressWarnings("unused")
		String message = null;
		// drag within Eclipse?
		if (LocalSelectionTransfer.getTransfer().isSupportedType(transferType)) {
			IResource[] selectedResources = getSelectedResources();
			
			boolean bProjectDrop = false;
			for (int iRes = 0; iRes < selectedResources.length; iRes++) {
				IResource res = selectedResources[iRes];
				if(res instanceof IProject) {
					bProjectDrop = true;
				}
			}
			if(bProjectDrop) {
				// drop of projects not supported on other IResources
				// "Path for project must have only one segment."
				message = "";//WorkbenchNavigatorMessages.DropAdapter_canNotDropProjectIntoProject;
			} else {
				if (selectedResources.length == 0) {
					message = "";//WorkbenchNavigatorMessages.DropAdapter_dropOperationErrorOther;
				} else {
					CopyFilesAndFoldersOperation operation;
					if (aDropOperation == DND.DROP_COPY) {
						if (DEBUG) {
							System.out
									.println("ResourceDropAdapterAssistant.validateDrop validating COPY."); //$NON-NLS-1$
						}
	
						operation = new CopyFilesAndFoldersOperation(getShell());
					} else {
						if (DEBUG) {
							System.out
									.println("ResourceDropAdapterAssistant.validateDrop validating MOVE."); //$NON-NLS-1$
						}
						operation = new MoveFilesAndFoldersOperation(getShell());
					}
					message = operation.validateDestination(destination,
							selectedResources);
				}
			}
		} // file import?
		else if (FileTransfer.getInstance().isSupportedType(transferType)) {
			String[] sourceNames = (String[]) FileTransfer.getInstance()
					.nativeToJava(transferType);
			if (sourceNames == null) {
				// source names will be null on Linux. Use empty names to do
				// destination validation.
				// Fixes bug 29778
				sourceNames = new String[0];
			}
			CopyFilesAndFoldersOperation copyOperation = new CopyFilesAndFoldersOperation(
					getShell());
			message = copyOperation.validateImportDestination(destination,
					sourceNames);
		}
//		if (message != null) {
//			return Activator.createErrorStatus(0, message, null);
//		}
		return Status.OK_STATUS;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.navigator.CommonDropAdapterAssistant#handleDrop(CommonDropAdapter,
	 *      DropTargetEvent, Object)
	 */
	public IStatus handleDrop(CommonDropAdapter aDropAdapter,
			DropTargetEvent aDropTargetEvent, Object aTarget) {

		if (DEBUG) {
			System.out
					.println("ResourceDropAdapterAssistant.handleDrop (begin)"); //$NON-NLS-1$
		}

		// alwaysOverwrite = false;
		if (aDropAdapter.getCurrentTarget() == null
				|| aDropTargetEvent.data == null) {
			return Status.CANCEL_STATUS;
		}
		IStatus status = null;
		IResource[] resources = null;
		TransferData currentTransfer = aDropAdapter.getCurrentTransfer();
		if (LocalSelectionTransfer.getTransfer().isSupportedType(
				currentTransfer)) {
			resources = getSelectedResources();
		} else if (ResourceTransfer.getInstance().isSupportedType(
				currentTransfer)) {
			resources = (IResource[]) aDropTargetEvent.data;
		}

		if (FileTransfer.getInstance().isSupportedType(currentTransfer)) {
			status = performFileDrop(aDropAdapter, aDropTargetEvent.data);
		} else if (resources != null && resources.length > 0) {
			if (aDropAdapter.getCurrentOperation() == DND.DROP_COPY) {
				if (DEBUG) {
					System.out
							.println("ResourceDropAdapterAssistant.handleDrop executing COPY."); //$NON-NLS-1$
				}
				status = performResourceCopy(aDropAdapter, getShell(),
						resources);
			} else {
				if (DEBUG) {
					System.out
							.println("ResourceDropAdapterAssistant.handleDrop executing MOVE."); //$NON-NLS-1$
				}

				status = performResourceMove(aDropAdapter, resources);
			}
		}
		openError(status);
		IContainer target = getActualTarget((IResource) aDropAdapter
				.getCurrentTarget());
		if (target != null && target.isAccessible()) {
			try {
				target.refreshLocal(IResource.DEPTH_ONE, null);
			} catch (CoreException e) {
			}
		}
		return status;
	}

	IStatus createErrorStatus(int severity, String msg, Object o) {
		return new Status(severity, Activator.PLUGIN_ID, msg);
	}
	IStatus createStatus(int status, int severity, String msg, Object o) {
		return new Status(severity, Activator.PLUGIN_ID, msg);
	}
	IStatus createError(String msg, Object o) {
		return new Status(IStatus.ERROR, Activator.PLUGIN_ID, msg);
	}
	IStatus createErrorStatus(String msg) {
		return new Status(IStatus.ERROR, Activator.PLUGIN_ID, msg);
	}
	IStatus createInfoStatus(String msg) {
		return new Status(IStatus.INFO, Activator.PLUGIN_ID, msg);
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.navigator.CommonDropAdapterAssistant#validatePluginTransferDrop(org.eclipse.jface.viewers.IStructuredSelection,
	 *      java.lang.Object)
	 */
	public IStatus validatePluginTransferDrop(
			IStructuredSelection aDragSelection, Object aDropTarget) {
		if (!(aDropTarget instanceof IResource)) {
			return createStatus(
							IStatus.INFO,
							0,
							"",//WorkbenchNavigatorMessages.DropAdapter_targetMustBeResource,
							null);
		}
		IResource resource = (IResource) aDropTarget;
		if (!resource.isAccessible()) {
			return createErrorStatus(
							0,
							"",//WorkbenchNavigatorMessages.DropAdapter_canNotDropIntoClosedProject,
							null);
		}
		IContainer destination = getActualTarget(resource);
		if (destination.getType() == IResource.ROOT) {
			return createErrorStatus(
							0,
							"",//WorkbenchNavigatorMessages.DropAdapter_resourcesCanNotBeSiblings,
							null);
		}

		IResource[] selectedResources = getSelectedResources(aDragSelection);

		String message = null;
		if (selectedResources.length == 0) {
			message = "";//WorkbenchNavigatorMessages.DropAdapter_dropOperationErrorOther;
		} else {
			MoveFilesAndFoldersOperation operation;

			operation = new MoveFilesAndFoldersOperation(getShell());
			message = operation.validateDestination(destination,
					selectedResources);
		}
		if (message != null) {
			return createErrorStatus(0, message, null);
		}
		return Status.OK_STATUS;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.navigator.CommonDropAdapterAssistant#handlePluginTransferDrop(org.eclipse.jface.viewers.IStructuredSelection, java.lang.Object)
	 */
	public IStatus handlePluginTransferDrop(IStructuredSelection aDragSelection, Object aDropTarget) {

		IContainer target = getActualTarget((IResource) aDropTarget);
		IResource[] resources = getSelectedResources(aDragSelection);
		
		MoveFilesAndFoldersOperation operation = new MoveFilesAndFoldersOperation(
				 getShell());
		operation.copyResources(resources, target);

		if (target != null && target.isAccessible()) {
			try {
				target.refreshLocal(IResource.DEPTH_ONE, null);
			} catch (CoreException e) {
			}
		}
		return Status.OK_STATUS;
	}

	/**
	 * Returns the actual target of the drop, given the resource under the
	 * mouse. If the mouse target is a file, then the drop actually occurs in
	 * its parent. If the drop location is before or after the mouse target and
	 * feedback is enabled, the target is also the parent.
	 */
	private IContainer getActualTarget(IResource mouseTarget) {

		/* if cursor is on a file, return the parent */
		if (mouseTarget.getType() == IResource.FILE) {
			return mouseTarget.getParent();
		}
		/* otherwise the mouseTarget is the real target */
		return (IContainer) mouseTarget;
	}

	/**
	 * Returns the resource selection from the LocalSelectionTransfer.
	 * 
	 * @return the resource selection from the LocalSelectionTransfer
	 */
	private IResource[] getSelectedResources() {

		ISelection selection = LocalSelectionTransfer.getTransfer()
				.getSelection();
		if (selection instanceof IStructuredSelection) {
			return getSelectedResources((IStructuredSelection)selection);
		} 
		return NO_RESOURCES;
	}

	/**
	 * Returns the resource selection from the LocalSelectionTransfer.
	 * 
	 * @return the resource selection from the LocalSelectionTransfer
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private IResource[] getSelectedResources(IStructuredSelection selection) {
		ArrayList selectedResources = new ArrayList();

		for (Iterator i = selection.iterator(); i.hasNext();) {
			Object o = i.next();
			if (o instanceof IResource) {
				selectedResources.add(o);
			} else if (o instanceof IAdaptable) {
				IAdaptable a = (IAdaptable) o;
				IResource r = (IResource) a.getAdapter(IResource.class);
				if (r != null) {
					selectedResources.add(r);
				}
			}
		}
		return (IResource[]) selectedResources
				.toArray(new IResource[selectedResources.size()]);
	}

	/**
	 * Performs a resource copy
	 */
	private IStatus performResourceCopy(CommonDropAdapter dropAdapter,
			Shell shell, IResource[] sources) {
		MultiStatus problems = new MultiStatus(PlatformUI.PLUGIN_ID, 1,
				"", null);
		mergeStatus(problems, validateTarget(dropAdapter.getCurrentTarget(),
				dropAdapter.getCurrentTransfer(), dropAdapter
						.getCurrentOperation()));

		IContainer target = getActualTarget((IResource) dropAdapter
				.getCurrentTarget());
		CopyFilesAndFoldersOperation operation = new CopyFilesAndFoldersOperation(
				shell);
		operation.copyResources(sources, target);

		return problems;
	}

	/**
	 * Performs a resource move
	 */
	private IStatus performResourceMove(CommonDropAdapter dropAdapter,
			IResource[] sources) {
		MultiStatus problems = new MultiStatus(PlatformUI.PLUGIN_ID, 1,
				"", null);
		mergeStatus(problems, validateTarget(dropAdapter.getCurrentTarget(),
				dropAdapter.getCurrentTransfer(), dropAdapter
						.getCurrentOperation()));

		IContainer target = getActualTarget((IResource) dropAdapter
				.getCurrentTarget());
		ReadOnlyStateChecker checker = new ReadOnlyStateChecker(getShell(),
				"",
				"");
		sources = checker.checkReadOnlyResources(sources);
		MoveFilesAndFoldersOperation operation = new MoveFilesAndFoldersOperation(
				getShell());
		operation.copyResources(sources, target);

		return problems;
	}

	/**
	 * Performs a drop using the FileTransfer transfer type.
	 */
	private IStatus performFileDrop(CommonDropAdapter anAdapter, Object data) {
		MultiStatus problems = new MultiStatus(PlatformUI.PLUGIN_ID, 0,
				"", null);
		mergeStatus(problems,
				validateTarget(anAdapter.getCurrentTarget(), anAdapter
						.getCurrentTransfer(), anAdapter.getCurrentOperation()));

		final IContainer target = getActualTarget((IResource) anAdapter
				.getCurrentTarget());
		final String[] names = (String[]) data;
		// Run the import operation asynchronously.
		// Otherwise the drag source (e.g., Windows Explorer) will be blocked
		// while the operation executes. Fixes bug 16478.
		Display.getCurrent().asyncExec(new Runnable() {
			public void run() {
				getShell().forceActive();
				CopyFilesAndFoldersOperation operation = new CopyFilesAndFoldersOperation(
						getShell());
				operation.copyFiles(names, target);
			}
		});
		return problems;
	}

	/**
	 * Ensures that the drop target meets certain criteria
	 */
	private IStatus validateTarget(Object target, TransferData transferType,
			int dropOperation) {
		if (!(target instanceof IResource)) {
			return createInfoStatus("");
		}
		IResource resource = (IResource) target;
		if (!resource.isAccessible()) {
			return createErrorStatus("");
		}
		IContainer destination = getActualTarget(resource);
		if (destination.getType() == IResource.ROOT) {
			return createErrorStatus("");
		}
		String message = null;
		// drag within Eclipse?
		if (LocalSelectionTransfer.getTransfer().isSupportedType(transferType)) {
			IResource[] selectedResources = getSelectedResources();

			if (selectedResources.length == 0) {
				message = "";
			} else {
				CopyFilesAndFoldersOperation operation;
				if (dropOperation == DND.DROP_COPY) {
					operation = new CopyFilesAndFoldersOperation(getShell());
				} else {
					operation = new MoveFilesAndFoldersOperation(getShell());
				}
				message = operation.validateDestination(destination,
						selectedResources);
			}
		} // file import?
		else if (FileTransfer.getInstance().isSupportedType(transferType)) {
			String[] sourceNames = (String[]) FileTransfer.getInstance()
					.nativeToJava(transferType);
			if (sourceNames == null) {
				// source names will be null on Linux. Use empty names to do
				// destination validation.
				// Fixes bug 29778
				sourceNames = new String[0];
			}
			CopyFilesAndFoldersOperation copyOperation = new CopyFilesAndFoldersOperation(
					getShell());
			message = copyOperation.validateImportDestination(destination,
					sourceNames);
		}
		if (message != null) {
			return createErrorStatus(message);
		}
		return Status.OK_STATUS;
	}

	/**
	 * Adds the given status to the list of problems. Discards OK statuses. If
	 * the status is a multi-status, only its children are added.
	 */
	private void mergeStatus(MultiStatus status, IStatus toMerge) {
		if (!toMerge.isOK()) {
			status.merge(toMerge);
		}
	}

	/**
	 * Opens an error dialog if necessary. Takes care of complex rules necessary
	 * for making the error dialog look nice.
	 */
	private void openError(IStatus status) {
		if (status == null) {
			return;
		}

		String genericTitle = "";
		int codes = IStatus.ERROR | IStatus.WARNING;

		// simple case: one error, not a multistatus
		if (!status.isMultiStatus()) {
			ErrorDialog
					.openError(getShell(), genericTitle, null, status, codes);
			return;
		}

		// one error, single child of multistatus
		IStatus[] children = status.getChildren();
		if (children.length == 1) {
			ErrorDialog.openError(getShell(), status.getMessage(), null,
					children[0], codes);
			return;
		}
		// several problems
		ErrorDialog.openError(getShell(), genericTitle, null, status, codes);
	}

	
	
	
}
