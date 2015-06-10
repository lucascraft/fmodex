/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.provider;


import java.util.Collection;
import java.util.List;

import net.sf.smbt.fmodex.core.ezaudio.AudioProject;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioFactory;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link net.sf.smbt.fmodex.core.ezaudio.AudioProject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AudioProjectItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioProjectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EzaudioPackage.Literals.AUDIO_PROJECT__SCENES);
			childrenFeatures.add(EzaudioPackage.Literals.AUDIO_PROJECT__TRACKS);
			childrenFeatures.add(EzaudioPackage.Literals.AUDIO_PROJECT__CLIPS);
			childrenFeatures.add(EzaudioPackage.Literals.AUDIO_PROJECT__AUDIO_RESOURCES);
			childrenFeatures.add(EzaudioPackage.Literals.AUDIO_PROJECT__SYSTEM);
			childrenFeatures.add(EzaudioPackage.Literals.AUDIO_PROJECT__EFFECTS);
			childrenFeatures.add(EzaudioPackage.Literals.AUDIO_PROJECT__SPEAKERS);
			childrenFeatures.add(EzaudioPackage.Literals.AUDIO_PROJECT__IN);
			childrenFeatures.add(EzaudioPackage.Literals.AUDIO_PROJECT__SOUNDS);
			childrenFeatures.add(EzaudioPackage.Literals.AUDIO_PROJECT__DSP_LIST);
			childrenFeatures.add(EzaudioPackage.Literals.AUDIO_PROJECT__CHANNELS);
			childrenFeatures.add(EzaudioPackage.Literals.AUDIO_PROJECT__DEVICES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AudioProject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AudioProject"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AudioProject_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AudioProject.class)) {
			case EzaudioPackage.AUDIO_PROJECT__SCENES:
			case EzaudioPackage.AUDIO_PROJECT__TRACKS:
			case EzaudioPackage.AUDIO_PROJECT__CLIPS:
			case EzaudioPackage.AUDIO_PROJECT__AUDIO_RESOURCES:
			case EzaudioPackage.AUDIO_PROJECT__SYSTEM:
			case EzaudioPackage.AUDIO_PROJECT__EFFECTS:
			case EzaudioPackage.AUDIO_PROJECT__SPEAKERS:
			case EzaudioPackage.AUDIO_PROJECT__IN:
			case EzaudioPackage.AUDIO_PROJECT__SOUNDS:
			case EzaudioPackage.AUDIO_PROJECT__DSP_LIST:
			case EzaudioPackage.AUDIO_PROJECT__CHANNELS:
			case EzaudioPackage.AUDIO_PROJECT__DEVICES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__SCENES,
				 EzaudioFactory.eINSTANCE.createAudioScene()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__TRACKS,
				 EzaudioFactory.eINSTANCE.createAudioTrack()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__CLIPS,
				 EzaudioFactory.eINSTANCE.createAudioClip()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__AUDIO_RESOURCES,
				 EzaudioFactory.eINSTANCE.createAudioFile()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__AUDIO_RESOURCES,
				 EzaudioFactory.eINSTANCE.createAudioMP3()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__AUDIO_RESOURCES,
				 EzaudioFactory.eINSTANCE.createAudioWAV()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__AUDIO_RESOURCES,
				 EzaudioFactory.eINSTANCE.createAudioOGG()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__AUDIO_RESOURCES,
				 EzaudioFactory.eINSTANCE.createAudioMIDI()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__SYSTEM,
				 EzaudioFactory.eINSTANCE.createAudioSystem()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__EFFECTS,
				 EzaudioFactory.eINSTANCE.createAudioMixer()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__SPEAKERS,
				 EzaudioFactory.eINSTANCE.createSpeaker()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__IN,
				 EzaudioFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__SOUNDS,
				 EzaudioFactory.eINSTANCE.createISound()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__SOUNDS,
				 EzaudioFactory.eINSTANCE.createAudioSound()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__SOUNDS,
				 EzaudioFactory.eINSTANCE.createAudioSoundGroup()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__DSP_LIST,
				 EzaudioFactory.eINSTANCE.createFMDSP()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__CHANNELS,
				 EzaudioFactory.eINSTANCE.createIChannel()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__CHANNELS,
				 EzaudioFactory.eINSTANCE.createAudioChannel()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__CHANNELS,
				 EzaudioFactory.eINSTANCE.createAudioChannelGroup()));

		newChildDescriptors.add
			(createChildParameter
				(EzaudioPackage.Literals.AUDIO_PROJECT__DEVICES,
				 EzaudioFactory.eINSTANCE.createDevice()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EzaudioEditPlugin.INSTANCE;
	}

}
