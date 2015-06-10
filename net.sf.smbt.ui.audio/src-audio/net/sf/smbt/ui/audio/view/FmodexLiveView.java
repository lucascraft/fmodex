/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.ui.audio.view;

import static org.jouvieje.fmodex.defines.FMOD_MODE.FMOD_DEFAULT;
import static org.jouvieje.fmodex.defines.FMOD_MODE.FMOD_LOOP_NORMAL;
import static org.jouvieje.fmodex.defines.FMOD_MODE.FMOD_OPENMEMORY;
import static org.jouvieje.fmodex.defines.FMOD_MODE.FMOD_SOFTWARE;

import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import net.sf.smbt.fmodex.core.AudioUtils;
import net.sf.smbt.fmodex.core.ezaudio.AudioChannel;
import net.sf.smbt.fmodex.core.ezaudio.AudioClip;
import net.sf.smbt.fmodex.core.ezaudio.AudioFile;
import net.sf.smbt.fmodex.core.ezaudio.AudioProject;
import net.sf.smbt.fmodex.core.ezaudio.AudioScene;
import net.sf.smbt.fmodex.core.ezaudio.AudioSound;
import net.sf.smbt.fmodex.core.ezaudio.AudioTrack;
import net.sf.smbt.fmodex.core.ezaudio.Device;
import net.sf.smbt.fmodex.core.ezaudio.IChannel;
import net.sf.smbt.fmodex.core.ezaudio.TimeTag;
import net.sf.smbt.fmodex.core.ezaudio.provider.EzaudioItemProviderAdapterFactory;
import net.sf.smbt.ui.audio.Activator;
import net.sf.smbt.ui.audio.dnd.FmodexAudioFileDragAdapter;
import net.sf.smbt.ui.audio.dnd.FmodexAudioFileTransfert;
import net.sf.smbt.ui.audio.provider.FmodexContentProvider;
import net.sf.smbt.ui.audio.provider.FmodexLabelProvider;
import net.sf.smbt.ui.audio.widgets.AbstractDeviceWidget;
import net.sf.smbt.ui.audio.widgets.FmodexWidgetManager;
import net.sf.smbt.ui.audio.widgets.XUITrack;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.ui.widgets.common.ColorsUtil;
import net.sf.smbt.ui.widgets.vu.SevenSegmentsDisplay;
import net.sf.smbt.ui.widgets.vu.UbiDbMeter;
import net.sf.smbt.ui.widgets.vu.UbiKnob;
import net.sf.smbt.ui.widgets.vu.UbiSelectionListener;
import net.sf.smbt.ui.widgets.vu.UbiVuMeter;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ColumnViewerEditor;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.TreeViewerFocusCellManager;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.progress.UIJob;

@SuppressWarnings("unused")
public class FmodexLiveView extends ViewPart {
	public final static String VOID_UTF8_STRING = new String("".getBytes(Charset.availableCharsets().get("UTF-8")), Charset.availableCharsets().get("UTF-8"));
	
//	private int lastSceneID;
	private Composite detailsPanel;
	private SashForm bottomSash, sash;
	private Composite deviceWidgetContainer;
	private AudioClip clip;
	private AudioProject project;
	private ComposedAdapterFactory adapterFactory;
	
	private void initAdapterFactory() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EzaudioItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}

	//
	// User double click action handling action
	//
	private Map<AudioTrack, TreeViewerColumn> treeColumnsMap;
	private Map<AudioTrack, XUITrack> xuiTrackMap;
	//
	// Master controls actions
	// 
	private Action masterPlayAction, masterPlayContinueAction, masterStopAction, masterOverdubAction;
	private Action masterNextCueAction, masterPrevCueAction, doubleClickAction2;
	private Action dumpToConsoleAction, monitorDevicesAction;
	private Action addTrackAction, addSceneAction, addClipAction;
	
	//private Action dumpHierarchicalOSCAction;
	//private Action openAbletonPrefsAction;
	
	//private UIAdapterImpl masterUIAdapter;
	private SevenSegmentsDisplay timeSongLCD;
	private UbiKnob masterVolume, masterPan;

	private Device device;
	
	private UbiVuMeter masterVu;
	private UbiDbMeter dbMeter;

	private ScrolledComposite sc, scXui;
	private SelectionListener hbarScXui, hbarSc;
	private Composite devicesPanel, xuiPanel;
	private GridLayout xuiPanelLayout;
	private TreeViewer devicesViewer;
	
	private FmodexLabelProvider fmodexLabelProvider;

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "net.sf.smbt.ui.ableton.LiveView";

	private TreeViewer subDetailsViewer;
	private Image playImage, stopImage, playImageBig, stopImageBig, deviceImage, paramImage;
	
	public FmodexLiveView() {
		treeColumnsMap 	= new ConcurrentHashMap<AudioTrack, TreeViewerColumn>();
		xuiTrackMap		= new HashMap<AudioTrack, XUITrack>();
		
		initAdapterFactory();
		
		project 		= AudioUtils.INSTANCE.createAudioProject();
		
		playImage		= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui", "icons/actions/media-playback-start-green.png").createImage();
		stopImage		= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui", "icons/actions/media-playback-stop.png").createImage();
		playImageBig	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/play.png").createImage();
		stopImageBig	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/stop.png").createImage();
		deviceImage 	= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/device.gif").createImage();
		paramImage		= Activator.imageDescriptorFromPlugin("net.sf.smbt.ui", "icons/parameter.gif").createImage();
	}
	
	class LiveUIJob2 extends UIJob {
		long loop = 0; 
		public LiveUIJob2() {
			super(UUID.randomUUID().toString());
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			if (subDetailsViewer != null && !subDetailsViewer.getControl().isDisposed()) {
				subDetailsViewer.refresh(true);
			}	
			schedule(75);
			return Status.OK_STATUS;
		}
	}
	
	public void createPartControl(Composite parent) {
		parent.setBackground(GUIToolkit.BG);
		
		fmodexLabelProvider = new FmodexLabelProvider();

		new LiveUIJob2().schedule();
		
		createDetailsPanel(parent); 
		makeActions();
		contributeToActionBars();
	}
	
	private class DevicesContentProvider implements ITreeContentProvider {
		/**
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
		 */
		public Object[] getChildren(Object parentElement) {
//			if (parentElement instanceof AbstractLiveDevice) {
//				Object[] params = ((AbstractLiveDevice)parentElement).getParameters().toArray();
//				return params;
//			}
			return new Object[0];
		}

		/**
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
		 */
		public Object getParent(Object element) {
//			if (element instanceof LiveParam) {
//				return ((LiveParam)element).eContainer();
//			}
			return null;
		}

		/**
		 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
		 */
		public boolean hasChildren(Object element) {
//			if (element instanceof AbstractLiveDevice) {
//				return !((AbstractLiveDevice)element).getParameters().isEmpty();
//			}
			return false;
		}
		@Override
		public void dispose() {}
		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {}
		@SuppressWarnings("unchecked")
		@Override
		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof List) {
				return ((List<Object>)inputElement).toArray();
			}
			return new Object[0];
		}
	}
	
	private void createDetailsPanel(Composite container) {
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		detailsPanel = GUIToolkit.INSTANCE.createComposite(container, SWT.DOUBLE_BUFFERED);
		detailsPanel.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		detailsPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		sash = new SashForm(detailsPanel, SWT.BORDER | SWT.VERTICAL);
		sash.setLayout(GridLayoutFactory.fillDefaults().create());
		sash.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		sash.setBackground(GUIToolkit.FG);
		
		Composite topPanel = GUIToolkit.INSTANCE.createComposite(detailsPanel, SWT.DOUBLE_BUFFERED);
		topPanel.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		topPanel.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).create());
		
		Composite timeDetails = GUIToolkit.INSTANCE.createComposite(topPanel, SWT.DOUBLE_BUFFERED);
		timeDetails.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		timeDetails.setLayoutData(GridDataFactory.fillDefaults().align(SWT.END, SWT.CENTER).grab(true, false).create());
		
		Composite masterButtons = GUIToolkit.INSTANCE.createComposite(topPanel, SWT.DOUBLE_BUFFERED);
		masterButtons.setLayout(GridLayoutFactory.fillDefaults().create());
		masterButtons.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).grab(true, false).create());
		
		final Button playStopButton = new Button(masterButtons, SWT.TOGGLE);
		playStopButton.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).hint(64, 64).minSize(64, 64).create());
		playStopButton.setForeground(ColorsUtil.BG);
		playStopButton.setImage(
			playImageBig
		);
		playStopButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (playStopButton.getSelection()) {
					playStopButton.setImage(stopImageBig);
				} else {
					playStopButton.setImage(playImageBig);
				}
				for (AudioScene s : project.getScenes()) {
					for (AudioClip c : s.getClips()) {
						if (c != null) {
							AudioSound sound = c.getSound();
							AudioTrack track = c.getTrack();
							if (sound instanceof AudioSound && track instanceof AudioTrack) {
								if (track.getChannel() instanceof AudioChannel) {
									AudioChannel channel = (AudioChannel) track.getChannel();
									if (channel != null && channel.getFmodex() != null) {
										if (AudioUtils.INSTANCE.isPlaying(channel)) {
											channel.getFmodex().setPaused(true);
										}
									}
								}
							}
						}
					}
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {}
		});

		Composite upPanel = GUIToolkit.INSTANCE.createComposite(topPanel, SWT.SHADOW_ETCHED_IN);
		upPanel.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		upPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		
		Composite vPanel = GUIToolkit.INSTANCE.createComposite(upPanel, SWT.SHADOW_ETCHED_IN);
		vPanel.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		vPanel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).grab(true, false).create());
		
		masterVolume = new UbiKnob(vPanel, SWT.HORIZONTAL);
		masterVolume.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).hint(48, 48).grab(false, false).create());
		masterVolume.setMax(100f);
		masterVolume.setSelection(50);
		masterVolume.addSelectionListener(new UbiSelectionListener() {
			@Override
			public void handle() {
				float value = new Float(masterVolume.getSelection())/100f;
//				if (value != liveController.getLiveApp().getMasterTrack().getVolume()) {
//					liveController.getLiveApp().getMasterTrack().setVolume(value);
//				}
			}
		});

		Label masterVolumeLabel = GUIToolkit.INSTANCE.createLabel(vPanel, "Vol");
		masterVolumeLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).grab(false, false).create());
		
		Composite pPanel = GUIToolkit.INSTANCE.createComposite(upPanel, SWT.DOUBLE_BUFFERED);
		pPanel.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).create());
		pPanel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).grab(true, false).create());
		
		masterPan = new UbiKnob(pPanel, SWT.HORIZONTAL);
		masterPan.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).hint(48, 48).grab(false, false).create());
		masterPan.setMax(100f);
		masterPan.setSelection(50);
		masterPan.addSelectionListener(new UbiSelectionListener() {
			@Override
			public void handle() {
				float value = new Float(masterPan.getSelection() - 50) / 50f;
//				if (value != liveController.getLiveApp().getMasterTrack().getPan()) {
//					liveController.getLiveApp().getMasterTrack().setPan(value);
//				}
			}
		});
//		masterPan.addMenuAction(
//			new LinkOscAbletonCommandAction(
//				masterPan, 
//				ABLETON_OSC_MAPPING.MASTER_VOLUME.getLiteral(),
//				100f
//			)
//		);
		
		Label masterPanLabel = GUIToolkit.INSTANCE.createLabel(pPanel, "Pan");
		masterPanLabel.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).grab(false, false).create());
		
		//
		// Vu Meters
		//
		
		Composite vuMetersPanel = GUIToolkit.INSTANCE.createComposite(upPanel, SWT.DOUBLE_BUFFERED);
		vuMetersPanel.setLayout(GridLayoutFactory.fillDefaults().equalWidth(false).numColumns(2).create());
		vuMetersPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).span(2,1).create());

		masterVu = new UbiVuMeter(vuMetersPanel, SWT.VERTICAL);
		masterVu.setLevel(0);
		masterVu.setMax(100);
		masterVu.setLayout(GridLayoutFactory.fillDefaults().create());
		masterVu.setLayoutData(GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.TOP).hint(20, 250).grab(true, false).create());

		Composite tracksPanel = GUIToolkit.INSTANCE.createComposite(sash, SWT.DOUBLE_BUFFERED);
		tracksPanel.setLayout(GridLayoutFactory.fillDefaults(). numColumns(2).equalWidth(false).create());
		tracksPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		subDetailsViewer = GUIToolkit.INSTANCE.createTreeViewer(tracksPanel, SWT.FULL_SELECTION);
		subDetailsViewer.setLabelProvider(			
			fmodexLabelProvider
		);
		
		FmodexContentProvider fmodexContentProvider = new FmodexContentProvider();
		
		subDetailsViewer.setContentProvider(fmodexContentProvider);
		subDetailsViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		subDetailsViewer.getTree().setForeground(GUIToolkit.FG);
		subDetailsViewer.getTree().setBackground(GUIToolkit.BG);
		subDetailsViewer.getTree().setHeaderVisible(true);
		subDetailsViewer.getTree().setLinesVisible(true);
		subDetailsViewer.setInput(project);
		
		//
		// Drag and drop support
		//
		
		Transfer[] dndTransferTypes = new Transfer[] { FmodexAudioFileTransfert.INSTANCE};
		
		subDetailsViewer.addDragSupport(
			DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_DEFAULT, 
			dndTransferTypes, 
			new FmodexAudioFileDragAdapter(subDetailsViewer)
		);
		subDetailsViewer.addDropSupport(
			DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_DEFAULT, 
			dndTransferTypes, 
			new net.sf.smbt.ui.audio.dnd.FmodexAudioFileDropAdapter(subDetailsViewer)
		);
		
		subDetailsViewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction2.run();
			}
		});
		
		TreeViewerFocusCellManager focusCellManager = new TreeViewerFocusCellManager(
			subDetailsViewer, 
			new FocusCellOwnerDrawHighlighter(subDetailsViewer) {
				@Override
				public ViewerCell getFocusCell() {
					ViewerCell cell = super.getFocusCell();
					handleClipDetails(
						cell.getElement(), 
						cell.getColumnIndex()
					);
					return cell;
				}
			}
		);
		
		
		
		
		
		UIJob refreshDetailsJob =  new UbiJob("Refresh Details") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				synchronized (project) {
					synchronized (project.getTracks()) {
						for (AudioTrack t : treeColumnsMap.keySet()) {
							if (!project.getTracks().contains(t)) {
								TreeViewerColumn col = treeColumnsMap.get(t);
								treeColumnsMap.remove(t);
								col.getColumn().dispose();

								XUITrack xui = xuiTrackMap.get(t);
								xuiTrackMap.remove(t);
								xui.dispose();
							}
						}
						int i = 1;
						for (AudioTrack track : project.getTracks()) {
							if (!treeColumnsMap.containsKey(track)) {
								TreeViewerColumn tc = createTableViewerColumn("Track "+ i, 110);
								treeColumnsMap.put(track, tc);
								xuiTrackMap.put(track, new XUITrack(xuiPanel, track, tc, project));
							} else {
								treeColumnsMap.get(track).getColumn().setText("Track " + i);
								int w 				= treeColumnsMap.get(track).getColumn().getWidth();
								Rectangle rect 		= xuiTrackMap.get(track).getBounds();
								xuiTrackMap.get(track).setBounds(rect.x, rect.y, w, rect.height);
								GridData gd 		= (GridData) xuiTrackMap.get(track).getLayoutData();
								gd.horizontalIndent = 0;
								gd.widthHint = w;
								gd.minimumWidth = SWT.DEFAULT;
							}
							i++;
						}
						xuiPanelLayout.numColumns = project.getTracks().size();
						xuiPanel.layout(true);
						if (subDetailsViewer != null && subDetailsViewer.getContentProvider() != null) {
							if (subDetailsViewer.getInput() != project) {
								subDetailsViewer.setInput(project);
								deviceWidgetContainer.layout(true);
							}
							subDetailsViewer.refresh(true);
						}
						devicesPanel.setVisible(true);
					}
				}
				schedule(1000);
				return Status.OK_STATUS;
			}
		};
		refreshDetailsJob.setSystem(true);
		refreshDetailsJob.setPriority(Job.INTERACTIVE);
		refreshDetailsJob.schedule(1000);
		

		
		ColumnViewerEditorActivationStrategy actSupport = new ColumnViewerEditorActivationStrategy(subDetailsViewer) {
			protected boolean isEditorActivationEvent(ColumnViewerEditorActivationEvent event) {
				return false;
			}
		};
		
		TreeViewerEditor.create(subDetailsViewer, focusCellManager, actSupport, ColumnViewerEditor.KEYBOARD_ACTIVATION);

		scXui = GUIToolkit.INSTANCE.createScrolledComposite(sash);
		scXui.setLayout(GridLayoutFactory.fillDefaults().create());
		scXui.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		scXui.getParent().setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));

		xuiPanel =  GUIToolkit.INSTANCE.createComposite(scXui, SWT.DOUBLE_BUFFERED);
		xuiPanelLayout = GridLayoutFactory.fillDefaults().numColumns(16).equalWidth(false).margins(0, 0).extendedMargins(0, 0, 0, 0).spacing(0, 0).create();
		xuiPanel.setLayout(xuiPanelLayout);
		xuiPanel.setLayoutData(GridDataFactory.fillDefaults().grab(false, true).create());

		scXui.setExpandVertical(true);
		scXui.setExpandHorizontal(true);
		scXui.setAlwaysShowScrollBars(true);
		scXui.setOrientation(SWT.VERTICAL);

		scXui.setContent(xuiPanel);
		scXui.addControlListener(new ControlAdapter() {
			public void controlResized(ControlEvent e) {
				Rectangle r = sash.getClientArea();
				scXui.setMinSize(xuiPanel.computeSize(r.width, SWT.DEFAULT));
			}
		});
		
		devicesPanel = GUIToolkit.INSTANCE.createComposite(sash, SWT.DOUBLE_BUFFERED);
		devicesPanel.setLayout(GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(false).create());
		devicesPanel.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());

		bottomSash = new SashForm(devicesPanel, SWT.HORIZONTAL);
		bottomSash.setLayout(GridLayoutFactory.fillDefaults().create());
		bottomSash.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		bottomSash.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		
		devicesViewer = GUIToolkit.INSTANCE.createTreeViewer(bottomSash, SWT.FULL_SELECTION);
		devicesViewer.setLabelProvider(new LabelProvider() {
			@Override
			public Image getImage(Object element) {
				return deviceImage;
			}
			@Override
			public String getText(Object element) {
				if (element instanceof Device) {
					return ((Device)element).getID();
				}
				return "???";
			}
		});
		
		devicesViewer.setContentProvider(new DevicesContentProvider());
		devicesViewer.getControl().setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		
		sc = GUIToolkit.INSTANCE.createScrolledComposite(bottomSash);
		sc.setLayout(GridLayoutFactory.fillDefaults().create());
		sc.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		sc.getParent().setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		
		deviceWidgetContainer = GUIToolkit.INSTANCE.createComposite(sc, SWT.DOUBLE_BUFFERED);
		deviceWidgetContainer.setLayout(GridLayoutFactory.fillDefaults().create());
		deviceWidgetContainer.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		deviceWidgetContainer.getParent().setBackground(GUIToolkit.BG);
		deviceWidgetContainer.addControlListener(
			new ControlListener() {
				@Override
				public void controlResized(ControlEvent e) {}
				@Override
				public void controlMoved(ControlEvent e) {}
			}
		);
		
		
		
		sc.setExpandVertical(true);
		sc.setAlwaysShowScrollBars(true);
		sc.setOrientation(SWT.VERTICAL);
		
		sc.setContent(deviceWidgetContainer);
		sc.addControlListener(new ControlAdapter() {
			public void controlResized(ControlEvent e) {
				Rectangle r = sc.getClientArea();
				sc.setMinSize(devicesPanel.computeSize(r.width, SWT.DEFAULT));
			}
		});
		
		hbarSc = new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				scXui.getHorizontalBar().removeSelectionListener(hbarScXui);
				scXui.getHorizontalBar().setSelection(e.x);
				scXui.getHorizontalBar().addSelectionListener(hbarScXui);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				
			}
		};
		if (scXui.getHorizontalBar() != null) {
			sc.getHorizontalBar().addSelectionListener(
				hbarSc
			);
		}
		Rectangle r = sc.getClientArea();
		sc.setMinSize(devicesPanel.computeSize(r.width, SWT.DEFAULT));
		
		devicesViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = devicesViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					Object obj = null;
					StructuredSelection ssel = (StructuredSelection) selection;
					if (!ssel.isEmpty()) {
						obj = ssel.getFirstElement();
					}
					AbstractDeviceWidget w = FmodexWidgetManager.INSTANCE.getNullWidget();
					if (obj instanceof Device) {
						device = (Device) obj;
						w = FmodexWidgetManager.INSTANCE.getWidget(device.getID());
					}
					
					if (w instanceof AbstractDeviceWidget) {
						deviceWidgetContainer.setVisible(true);
						AbstractDeviceWidget widget = (AbstractDeviceWidget) w;
						for (Control c : deviceWidgetContainer.getChildren()) {
							c.setVisible(false);
							if (!c.isDisposed()) {
								c.dispose();
							}
						}
						Control control = widget.createControl(deviceWidgetContainer, SWT.NONE);
						if (!control.isDisposed() && control != null) {
							control.setVisible(true);
						}
						if (device != null) {
							if (device.getTrack() != null && device.getTrack().getChannel() != null && clip != null) {
								IChannel channel = device.getTrack().getChannel();
								if (channel instanceof AudioChannel) {
									widget.init((AudioChannel)channel, clip.getSound());
								}
							}
						}
						deviceWidgetContainer.layout(true);
						widget.redraw();
					} else {
						sc.setVisible(false);
						for (Control c : sc.getChildren()) {
							c.setVisible(false);
							if (!c.isDisposed()) {
								c.dispose();
							}
						}
					}
					sc.redraw();
				} else {
					deviceWidgetContainer.setVisible(false);
					for (Control c : deviceWidgetContainer.getChildren()) {
						c.setVisible(false);
						if (!c.isDisposed()) {
							c.dispose();
						}
					}
				}
			}
		});
		
		bottomSash.setWeights(new int[] {1, 5});
		
		if (devicesPanel != null) {
			deviceWidgetContainer.setVisible(true);
			devicesPanel.setVisible(true);
			devicesPanel.setSize(sash.getSize().x, 250);
			devicesPanel.layout(true);
			deviceWidgetContainer.setSize(sash.getSize().x, 250);
			deviceWidgetContainer.redraw();
			deviceWidgetContainer.layout(true);
			deviceWidgetContainer.redraw();
			devicesPanel.layout(true);
			devicesPanel.redraw();

			if (devicesViewer.getTree()  != null && devicesViewer.getTree().getItemCount() > 0) {
				@SuppressWarnings("rawtypes")
				List lst = (List) devicesViewer.getInput();
				devicesViewer.getTree().select(devicesViewer.getTree().getItem(0));
				subDetailsViewer.refresh(true);
			}
			devicesPanel.layout(true);
			devicesPanel.redraw();
			for (Control c : devicesPanel.getChildren()) {
				if (c instanceof Control) {
					c.redraw();
				}
			}
		}

		
		sash.setWeights(new int[] {2, 2, 2});
	}
	
	
	
	
	
	void handleToggleClip(int r, int colIndex, Object object) {
		/*
		if (object instanceof LiveScene) {
			if (liveController.getLiveApp().getTracks().size() > colIndex) {
				LiveTrack track = liveController.getLiveApp().getTracks().get(colIndex);
				if (track != null && lastTrackID != track.getTrackID()) {
					lastTrackID = track.getTrackID();
					for (LiveClip clip : track.getClips()) {
						if (clip.getClipID() == r) {
							liveController.handleClipState(track.getTrackID(), clip.getClipID(), clip.getClipState().equals(CLIP_STATE.PLAYING) ? CLIP_STATE.STOP : CLIP_STATE.PLAYING);
						}
					}
				}
			}	
		}
		*/
	}
	
	int lastTrackID = 0;
	private void handleClipDetails(Object object, int colIndex) {
		if (object instanceof AudioScene) {
			if (((AudioScene)object).getClips().size()>colIndex) {
				clip = ((AudioScene)object).getClips().get(colIndex);
				if(project.getTracks().size() > colIndex) {
					AudioTrack track = project.getTracks().get(colIndex);
					devicesViewer.setInput(track.getDevices());
					if (!track.getDevices().isEmpty()) {
						devicesViewer.setSelection(new StructuredSelection(track.getDevices().get(0)));
					}
				}
			}
			lastTrackID = colIndex;
		}
	}
	private TreeViewerColumn createTableViewerColumn(String title, int bound) {
		final TreeViewerColumn viewerColumn = new TreeViewerColumn(subDetailsViewer, SWT.NONE);
		final TreeColumn column				= viewerColumn.getColumn();
		
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		
		viewerColumn.setLabelProvider(new StyledCellLabelProvider() {
			@Override
			protected void paint(Event event, Object element) {	
					TreeItem treeItem = (TreeItem) event.item;
					
					Object obj = treeItem.getData(viewerColumn.getColumn().getText() + "#clip");
					Object track = treeItem.getData(viewerColumn.getColumn().getText() + "#track");
					if (obj != null && track != null) {
						AudioClip c = (AudioClip) obj;
						int x = event.getBounds().x;
						int y = event.getBounds().y;

						String txt = "";
						AudioChannel channel = (AudioChannel)((AudioTrack)track).getChannel();
						if (c.getSound() != null && channel != null) {
							TimeTag tag = AudioUtils.INSTANCE.getTimePosition(c.getSound(), channel);
							long ms 	= tag.getTime();
							long lenms 	= tag.getDuration(); 
							
							txt = String.format(
								" (%02d:%02d:%02d/%02d:%02d:%02d)", 
								ms / 1000 / 60, 
								ms / 1000 % 60, 
								ms / 10 % 100,
								lenms / 1000 / 60, 
								lenms / 1000 % 60, 
								lenms / 10 % 100
								//tag.getStatus().equals(CLIP_STATUS.PAUSE) ? "Paused " : tag.getStatus().equals(CLIP_STATUS.PLAY) ? "Playing" : "Stopped"
							);
							
							event.gc.drawText(c.getLabel() + " " + txt, x, y);

							int width	= 0;
							int height	= event.height-4;
							int x0		= event.x;
							int y0		= event.y+2;
							float l		= tag.getDuration();
							float p		= tag.getTime();

							Color oldBG = event.gc.getBackground();
							Color oldFG = event.gc.getForeground();
							event.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
	
							if (p>0 && l>0) {
								float ratio = p / l;
								width		= Float.valueOf(ratio * (float)viewerColumn.getColumn().getWidth()).intValue();
								event.gc.setAlpha(100);
								event.gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
								event.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
								event.gc.fillRoundRectangle(x0, y0, width, height, 2, 2);
								event.gc.setAlpha(255);
								event.gc.drawRoundRectangle(x0, y0, width, height, 2, 2);
							}
							event.gc.setForeground(oldFG);
							event.gc.setBackground(oldBG);
						}
					} else {
						super.paint(event, element);
					}
			}
			@Override
			public void update(ViewerCell cell) {
				super.update(cell);
				if (cell.getElement() instanceof AudioScene) {
					AudioScene scene = (AudioScene) cell.getElement();
					int idx = cell.getColumnIndex();
					if (project.getTracks().size() > idx) {
						AudioClip clip = scene.getClips().get(idx);
						AudioTrack track = project.getTracks().get(idx);
						track.setLabel(viewerColumn.getColumn().getText());
						AudioFile file = clip.getFile();
						if (file != null) {}
						cell.getItem().setData(track.getLabel()+"#clip", clip);
						cell.getItem().setData(track.getLabel()+"#track", track);
						cell.setText(clip.getLabel());
					}	
				} else {
					cell.setText("clip !!!");
				}
			}
		});
		return viewerColumn;
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		//manager.add(dumpHierarchicalOSCAction);
		manager.add(addTrackAction);
		manager.add(new Separator());
		manager.add(dumpToConsoleAction);
		manager.add(new Separator());
		manager.add(masterPrevCueAction);
		//manager.add(masterPlayAction);
		manager.add(masterPlayContinueAction);
		//manager.add(masterStopAction);
		manager.add(masterNextCueAction);
		manager.add(masterOverdubAction);
		manager.add(new Separator());
	}

	/*
	private void fillContextMenu(IMenuManager manager) {
		manager.add(dumpToConsoleAction);
		manager.add(new Separator());
		manager.add(masterPrevCueAction);
		manager.add(masterPlayAction);
		manager.add(masterPlayContinueAction);
		manager.add(masterStopAction);
		manager.add(masterNextCueAction);
		manager.add(masterOverdubAction);
		manager.add(new Separator());
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	*/
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(addClipAction);
		manager.add(addSceneAction);
		manager.add(addTrackAction);
		//manager.add(openAbletonPrefsAction);
	//	manager.add(dumpHierarchicalOSCAction);
		manager.add(new Separator());
		manager.add(monitorDevicesAction);
		manager.add(dumpToConsoleAction);
		manager.add(new Separator());
		manager.add(masterPrevCueAction);
		//manager.add(masterPlayAction);
		manager.add(masterPlayContinueAction);
		//manager.add(masterStopAction);
		manager.add(masterNextCueAction);
		manager.add(masterOverdubAction);
		manager.add(new Separator());
	}

	private void handleDoubleClickSelection(Object obj, boolean forward) {
		if (obj instanceof AudioScene) {
			handleLiveSceneDoubleClick((AudioScene) obj);
		} 
		synchronized (project.getScenes()) {
			if (project.getScenes().size() > 1) {
				int idx = project.getScenes().indexOf(obj);
				if (idx >= 0 ) {
					Object o = project.getScenes().get(idx);
					if (idx >= project.getScenes().size()-1) {
						o = project.getScenes().get(0);
					}
					subDetailsViewer.setSelection(new StructuredSelection(o));
					subDetailsViewer.refresh(o, true);
				}
			}
			subDetailsViewer.refresh(obj, true);
		}
	}

	private void makeActions() {
		/*
		openAbletonPrefsAction= new Action("Open Preferences", SWT.TOGGLE) {
			public void run() {
				PlatformUI.getPreferenceStore().
				if (liveController != null && liveController.getAbletonOscEngine() != null) {
					liveController.monitorDevices(isChecked());
				}
			}
		};*/	

		monitorDevicesAction = new Action("Monitor Devices", SWT.TOGGLE) {
			public void run() {
//				if (liveController != null && liveController.getAbletonOscEngine() != null) {
//					liveController.monitorDevices(isChecked());
//				}
				if (devicesPanel != null) {
					deviceWidgetContainer.setVisible(true);
//					devicesPanel.setVisible(liveController.isMonitorDevices());
					devicesPanel.setSize(sash.getSize().x, 250);
					devicesPanel.layout(true);
					deviceWidgetContainer.setSize(sash.getSize().x, 250);
					deviceWidgetContainer.redraw();
					deviceWidgetContainer.layout(true);
					deviceWidgetContainer.redraw();
					devicesPanel.layout(true);
					devicesPanel.redraw();

					if (devicesViewer.getTree()  != null && devicesViewer.getTree().getItemCount() > 0) {
						@SuppressWarnings("rawtypes")
						List lst = (List) devicesViewer.getInput();
						devicesViewer.getTree().select(devicesViewer.getTree().getItem(0));
						subDetailsViewer.refresh(true);
					}
					devicesPanel.layout(true);
					devicesPanel.redraw();
					for (Control c : devicesPanel.getChildren()) {
						if (c instanceof Control) {
							c.redraw();
						}
					}
					sash.setWeights(new int[] {2, 3, 2});
				}
			}
		};	
		monitorDevicesAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/actions/icon_target.png"
			)
		);
		dumpToConsoleAction = new Action("Dump Console As OSC", SWT.TOGGLE) {
			public void run() {
//				if (liveController != null && liveController.getAbletonOscEngine() != null) {
//					liveController.dumpToConsole(isChecked());
//				}
			}
		};	
		dumpToConsoleAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/status/software-update-available.png"
			)
		);
/*
		dumpHierarchicalOSCAction = new Action("Dump OSC Structure", SWT.PUSH) {
			public void run() {
				if (liveController != null && liveController.getAbletonOscEngine() != null) {
					liveController.structuralDump();
				}
			}
		};	
		dumpHierarchicalOSCAction.setImageDescriptor(
			net.sf.smbt.ui.ableton.Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/new/wand.png"
			)
		);
*/
		doubleClickAction2 = new Action() {
			public void run() {
				ISelection selection = subDetailsViewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				handleDoubleClickSelection(obj, true);
			}
		};

		addTrackAction = new Action() {
			public void run() {
				AudioTrack track = AudioUtils.INSTANCE.createAudioTrack();
				project.getTracks().add(
					track
				);
				int idx = project.getTracks().indexOf(track);
				int cIdx = 0;
				for (AudioScene s : project.getScenes()) {
//					AudioSound sound = AudioUtils.INSTANCE.createSound(
//						"/Media/drumloop.wav", 
//						FMOD_DEFAULT | FMOD_SOFTWARE | FMOD_LOOP_NORMAL | FMOD_OPENMEMORY
//					);
					AudioClip clip = AudioUtils.INSTANCE.createClip("--");
					if (!track.getClips().contains(clip)) {
						track.getClips().add(cIdx, clip);
					}
					cIdx++;
//					clip.setSound(sound);
					clip.setTrack(track);
					s.getClips().add(idx, clip);
				}
			}
		};
		addTrackAction.setEnabled(true);
		addTrackAction.setText("Add Track");
		addTrackAction.setToolTipText("Add Track");
		addTrackAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.audio", 
				"icons/addTrack.png"
			)
		);
		
		addSceneAction = new Action() {
			public void run() {
				
			}
		};
		addSceneAction.setEnabled(true);
		addSceneAction.setText("Add Scene");
		addSceneAction.setToolTipText("Add Scene");
		addSceneAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.audio", 
				"icons/addScene.png"
			)
		);

		addClipAction = new Action() {
			public void run() {
				ISelection sel = subDetailsViewer.getSelection();
				if (sel instanceof StructuredSelection) {
					Object o = ((StructuredSelection)sel).getFirstElement();
					if (o instanceof AudioScene) {
						int idx = project.getScenes().indexOf(o);
						AudioTrack track = project.getTracks().get(lastTrackID);
						if (track != null) {
							File f = handleClipSlot();
							AudioClip c = null;
							if (!((AudioScene)o).getClips().isEmpty() && ((AudioScene)o).getClips().size()>lastTrackID) {
								c = ((AudioScene)o).getClips().get(lastTrackID);
							}
							if(c == null) {
								c = AudioUtils.INSTANCE.createClip("--");
							}
							AudioFile file = AudioUtils.INSTANCE.createAudioFile(f);
							c.setFile(file);
							c.setLabel(f.getName());
							try {
								c.setSound(
									AudioUtils.INSTANCE.createSound(
										f.getCanonicalPath(),
										FMOD_DEFAULT | FMOD_SOFTWARE | FMOD_LOOP_NORMAL | FMOD_OPENMEMORY
									)
								);
							} catch (Exception e) {
								e.printStackTrace();
							}
//							((AudioScene)o).getClips().add(lastTrackID, c);
							}
						}
					}
			}
		};
		addClipAction.setEnabled(true);
		addClipAction.setText("Add Clip");
		addClipAction.setToolTipText("Add Clip");
		addClipAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.audio", 
				"icons/addClip.gif"
			)
		);

		
		masterPlayAction  = new Action() {
			public void run() {
//				liveController.handleMasterTrackState(MASTER_CTRL.PLAY);
			}
		};
		masterPlayAction.setEnabled(true);
		masterPlayAction.setText("Play Live");
		masterPlayAction.setToolTipText("Play Live Tooltip");
		masterPlayAction.setImageDescriptor(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-playback-start.png"));
		//
		// 
		//
		masterPrevCueAction  = new Action() {
			public void run() {
//				liveController.handleMasterTrackState(MASTER_CTRL.PREC);
			}
		};
		masterPrevCueAction.setEnabled(true);
		masterPrevCueAction.setText("Prev Cue");
		masterPrevCueAction.setToolTipText("Go Prev Cue");
		masterPrevCueAction.setImageDescriptor(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-skip-backward.png"));
		
		masterNextCueAction  = new Action() {
			public void run() {
//				liveController.handleMasterTrackState(MASTER_CTRL.NEXT);
			}
		};
		masterNextCueAction.setEnabled(true);
		masterNextCueAction.setText("Next Cue");
		masterNextCueAction.setToolTipText("Go Next Cue");
		masterNextCueAction.setImageDescriptor(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-skip-forward.png"));
		
		masterPlayContinueAction  = new Action() {
			public void run() {
//				liveController.handleMasterTrackState(MASTER_CTRL.CONTINUE);
			}
		};
		masterPlayContinueAction.setEnabled(true);
		masterPlayContinueAction.setText("Continue Play Live");
		masterPlayContinueAction.setToolTipText("Continue Play Live Tooltip");
		masterPlayContinueAction.setImageDescriptor(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-playback-continue.png"));
		
		masterStopAction  = new Action() {
			public void run() {
//				liveController.handleMasterTrackState(MASTER_CTRL.STOP);
			}
		};
		masterStopAction.setEnabled(true);
		masterStopAction.setText("Stop Live");
		masterStopAction.setToolTipText("Stop Live Tooltip");
		masterStopAction.setImageDescriptor(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/actions/media-playback-stop.png"));
		
		masterOverdubAction  = new Action() {
			public void run() {
//				liveController.handleOverdub();
			}
		};
		masterOverdubAction.setEnabled(true);
		masterOverdubAction.setText("ToggleOverdub");
		masterOverdubAction.setToolTipText("Toggle Overdub Tooltip");
		masterOverdubAction.setImageDescriptor(Activator.imageDescriptorFromPlugin("net.sf.smbt.ui.ableton", "icons/new/bell.png"));
	}
	
	private File handleClipSlot() {
		FileDialog dlg = new FileDialog(Display.getDefault().getActiveShell());
		dlg.setFilterExtensions(new String[] {"wav", "mp3", "aif", "ogg"});
		dlg.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString());
		String filePath = dlg.open();
		return new File(filePath);
	}
	
	void handleLiveSceneDoubleClick(AudioScene scene) {
		for (AudioScene s : project.getScenes()) {
			if (!s.equals(scene)) {
				for (AudioClip c : s.getClips()) {
					if (c != null) {
						AudioSound sound = c.getSound();
						AudioTrack track = c.getTrack();
						if (sound instanceof AudioSound && track instanceof AudioTrack) {
							if (track.getChannel() instanceof AudioChannel) {
								AudioChannel channel = (AudioChannel) track.getChannel();
								if (channel != null && channel.getFmodex() != null) {
									if (AudioUtils.INSTANCE.isPlaying(channel)) {
										channel.getFmodex().setPaused(true);
									}
								}
							}
						}
					}
				}
			}
		}
		for (AudioClip c : scene.getClips()) {
			if (c != null) {
				AudioSound sound = c.getSound();
				if (sound != null) {
					AudioTrack t = c.getTrack();
					if (t instanceof AudioTrack) {
						IChannel channel = t.getChannel();
						if (channel  instanceof AudioChannel) {
							AudioUtils.INSTANCE.playSound(sound, (AudioChannel) channel);
						}
					}
				}
			}
		}
	}

	void handleLiveTrackDoubleClick(/* LiveTrack track */) {
//		CmdPipe engine = liveController.getEngineFromTrack(track);
//		if (engine != null) {
//			// what will I gonna do w/ that ???
//		}
	}

	void handleLiveClipDoubleClick(/* LiveClip clip */) {
/*
		CmdPipe engine =liveController.getEngineFromClip(clip);
		if (engine != null) {
			engine.send(
				AbletonLiveUtils.INSTANCE.createLivePlayClipslot(
					clip.getTrack().getTrackID(), 
					clip.getClipID()
				)
			);
		}
*/
	}
	
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		//viewer.getControl().setFocus();
	}
}