/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.impl;

import java.io.File;

import net.sf.smbt.fmodex.core.ezaudio.AudioChannel;
import net.sf.smbt.fmodex.core.ezaudio.AudioChannelGroup;
import net.sf.smbt.fmodex.core.ezaudio.AudioClip;
import net.sf.smbt.fmodex.core.ezaudio.AudioFile;
import net.sf.smbt.fmodex.core.ezaudio.AudioMIDI;
import net.sf.smbt.fmodex.core.ezaudio.AudioMP3;
import net.sf.smbt.fmodex.core.ezaudio.AudioMixer;
import net.sf.smbt.fmodex.core.ezaudio.AudioOGG;
import net.sf.smbt.fmodex.core.ezaudio.AudioProject;
import net.sf.smbt.fmodex.core.ezaudio.AudioReverb;
import net.sf.smbt.fmodex.core.ezaudio.AudioScene;
import net.sf.smbt.fmodex.core.ezaudio.AudioSound;
import net.sf.smbt.fmodex.core.ezaudio.AudioSoundGroup;
import net.sf.smbt.fmodex.core.ezaudio.AudioSystem;
import net.sf.smbt.fmodex.core.ezaudio.AudioTrack;
import net.sf.smbt.fmodex.core.ezaudio.AudioWAV;
import net.sf.smbt.fmodex.core.ezaudio.Channel;
import net.sf.smbt.fmodex.core.ezaudio.Device;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioFactory;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;
import net.sf.smbt.fmodex.core.ezaudio.FMGeometry;
import net.sf.smbt.fmodex.core.ezaudio.IChannel;
import net.sf.smbt.fmodex.core.ezaudio.ISound;
import net.sf.smbt.fmodex.core.ezaudio.Input;
import net.sf.smbt.fmodex.core.ezaudio.Speaker;
import net.sf.smbt.fmodex.core.ezaudio.TimeTag;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.jouvieje.fmodex.ChannelGroup;
import org.jouvieje.fmodex.Geometry;
import org.jouvieje.fmodex.Reverb;
import org.jouvieje.fmodex.Sound;
import org.jouvieje.fmodex.SoundGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzaudioPackageImpl extends EPackageImpl implements EzaudioPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioMP3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioWAVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioOGGEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioSceneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioTrackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioClipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioMIDIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioMixerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmdspEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioChannelGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioSoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioReverbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioSoundGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iSoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmGeometryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dsP_CALLBACKEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filE_CALLBACKEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memorY_CALLBACKEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sounD_CALLBACKEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codeC_CALLBACKEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dsP_KINDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum structuresEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cliP_STATUSEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fileEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType soundEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dspEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType grometryEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reverbEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType soundGroupEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fmoD_CREATESOUNDEXINFOEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType channelEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType channelGroupEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType systemEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzaudioPackageImpl() {
		super(eNS_URI, EzaudioFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EzaudioPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzaudioPackage init() {
		if (isInited) return (EzaudioPackage)EPackage.Registry.INSTANCE.getEPackage(EzaudioPackage.eNS_URI);

		// Obtain or create and register package
		EzaudioPackageImpl theEzaudioPackage = (EzaudioPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzaudioPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzaudioPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theEzaudioPackage.createPackageContents();

		// Initialize created meta-data
		theEzaudioPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzaudioPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzaudioPackage.eNS_URI, theEzaudioPackage);
		return theEzaudioPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioSystem() {
		return audioSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioSystem_Fmodex() {
		return (EAttribute)audioSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioFile() {
		return audioFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioFile_File() {
		return (EAttribute)audioFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioFile_Ext() {
		return (EAttribute)audioFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioMP3() {
		return audioMP3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioMP3_SamplingRate() {
		return (EAttribute)audioMP3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioWAV() {
		return audioWAVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioWAV_SamplingRate() {
		return (EAttribute)audioWAVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioOGG() {
		return audioOGGEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioOGG_SamplingRate() {
		return (EAttribute)audioOGGEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioScene() {
		return audioSceneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioScene_Clips() {
		return (EReference)audioSceneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioScene_Label() {
		return (EAttribute)audioSceneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioProject() {
		return audioProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioProject_Scenes() {
		return (EReference)audioProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioProject_Tracks() {
		return (EReference)audioProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioProject_Clips() {
		return (EReference)audioProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioProject_AudioResources() {
		return (EReference)audioProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioProject_System() {
		return (EReference)audioProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioProject_Effects() {
		return (EReference)audioProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioProject_Speakers() {
		return (EReference)audioProjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioProject_In() {
		return (EReference)audioProjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioProject_Sounds() {
		return (EReference)audioProjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioProject_Channels() {
		return (EReference)audioProjectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioProject_Devices() {
		return (EReference)audioProjectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioProject_DspList() {
		return (EReference)audioProjectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioTrack() {
		return audioTrackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioTrack_Channel() {
		return (EReference)audioTrackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioTrack_Clips() {
		return (EReference)audioTrackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioTrack_Label() {
		return (EAttribute)audioTrackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioTrack_Devices() {
		return (EReference)audioTrackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioClip() {
		return audioClipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioClip_File() {
		return (EReference)audioClipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioClip_Sound() {
		return (EReference)audioClipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioClip_Track() {
		return (EReference)audioClipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioClip_Label() {
		return (EAttribute)audioClipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioClip_TimeTag() {
		return (EReference)audioClipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioMIDI() {
		return audioMIDIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioChannel() {
		return audioChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioChannel_Fmodex() {
		return (EAttribute)audioChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioMixer() {
		return audioMixerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioMixer_Out() {
		return (EReference)audioMixerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioMixer_Channel() {
		return (EReference)audioMixerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeaker() {
		return speakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFMDSP() {
		return fmdspEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFMDSP_Fmodex() {
		return (EAttribute)fmdspEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFMDSP_Kind() {
		return (EAttribute)fmdspEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioChannelGroup() {
		return audioChannelGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioChannelGroup_Children() {
		return (EReference)audioChannelGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioChannelGroup_Fmodex() {
		return (EAttribute)audioChannelGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioSound() {
		return audioSoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioSound_Fmodex() {
		return (EAttribute)audioSoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioSound_Exinfo() {
		return (EAttribute)audioSoundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioReverb() {
		return audioReverbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioReverb_Fmodex() {
		return (EAttribute)audioReverbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioSoundGroup() {
		return audioSoundGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioSoundGroup_Children() {
		return (EReference)audioSoundGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioSoundGroup_Fmodex() {
		return (EAttribute)audioSoundGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getISound() {
		return iSoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFMGeometry() {
		return fmGeometryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFMGeometry_Fmodex() {
		return (EAttribute)fmGeometryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIChannel() {
		return iChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIChannel_DspList() {
		return (EReference)iChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_ID() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Track() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Channel() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeTag() {
		return timeTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTag_Time() {
		return (EAttribute)timeTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTag_Duration() {
		return (EAttribute)timeTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeTag_Status() {
		return (EAttribute)timeTagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getChannel() {
		return channelEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getChannelGroup() {
		return channelGroupEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSystem() {
		return systemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDSP_CALLBACK() {
		return dsP_CALLBACKEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFILE_CALLBACK() {
		return filE_CALLBACKEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMEMORY_CALLBACK() {
		return memorY_CALLBACKEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSOUND_CALLBACK() {
		return sounD_CALLBACKEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCODEC_CALLBACK() {
		return codeC_CALLBACKEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDSP_KIND() {
		return dsP_KINDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOPERATION() {
		return operationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSTRUCTURES() {
		return structuresEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCLIP_STATUS() {
		return cliP_STATUSEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFile() {
		return fileEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSound() {
		return soundEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDSP() {
		return dspEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGrometry() {
		return grometryEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReverb() {
		return reverbEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSoundGroup() {
		return soundGroupEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFMOD_CREATESOUNDEXINFO() {
		return fmoD_CREATESOUNDEXINFOEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzaudioFactory getEzaudioFactory() {
		return (EzaudioFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		audioSystemEClass = createEClass(AUDIO_SYSTEM);
		createEAttribute(audioSystemEClass, AUDIO_SYSTEM__FMODEX);

		audioFileEClass = createEClass(AUDIO_FILE);
		createEAttribute(audioFileEClass, AUDIO_FILE__FILE);
		createEAttribute(audioFileEClass, AUDIO_FILE__EXT);

		audioMP3EClass = createEClass(AUDIO_MP3);
		createEAttribute(audioMP3EClass, AUDIO_MP3__SAMPLING_RATE);

		audioWAVEClass = createEClass(AUDIO_WAV);
		createEAttribute(audioWAVEClass, AUDIO_WAV__SAMPLING_RATE);

		audioOGGEClass = createEClass(AUDIO_OGG);
		createEAttribute(audioOGGEClass, AUDIO_OGG__SAMPLING_RATE);

		audioSceneEClass = createEClass(AUDIO_SCENE);
		createEReference(audioSceneEClass, AUDIO_SCENE__CLIPS);
		createEAttribute(audioSceneEClass, AUDIO_SCENE__LABEL);

		audioProjectEClass = createEClass(AUDIO_PROJECT);
		createEReference(audioProjectEClass, AUDIO_PROJECT__SCENES);
		createEReference(audioProjectEClass, AUDIO_PROJECT__TRACKS);
		createEReference(audioProjectEClass, AUDIO_PROJECT__CLIPS);
		createEReference(audioProjectEClass, AUDIO_PROJECT__AUDIO_RESOURCES);
		createEReference(audioProjectEClass, AUDIO_PROJECT__SYSTEM);
		createEReference(audioProjectEClass, AUDIO_PROJECT__EFFECTS);
		createEReference(audioProjectEClass, AUDIO_PROJECT__SPEAKERS);
		createEReference(audioProjectEClass, AUDIO_PROJECT__IN);
		createEReference(audioProjectEClass, AUDIO_PROJECT__SOUNDS);
		createEReference(audioProjectEClass, AUDIO_PROJECT__DSP_LIST);
		createEReference(audioProjectEClass, AUDIO_PROJECT__CHANNELS);
		createEReference(audioProjectEClass, AUDIO_PROJECT__DEVICES);

		audioTrackEClass = createEClass(AUDIO_TRACK);
		createEReference(audioTrackEClass, AUDIO_TRACK__CHANNEL);
		createEReference(audioTrackEClass, AUDIO_TRACK__CLIPS);
		createEAttribute(audioTrackEClass, AUDIO_TRACK__LABEL);
		createEReference(audioTrackEClass, AUDIO_TRACK__DEVICES);

		audioClipEClass = createEClass(AUDIO_CLIP);
		createEReference(audioClipEClass, AUDIO_CLIP__FILE);
		createEReference(audioClipEClass, AUDIO_CLIP__SOUND);
		createEReference(audioClipEClass, AUDIO_CLIP__TRACK);
		createEAttribute(audioClipEClass, AUDIO_CLIP__LABEL);
		createEReference(audioClipEClass, AUDIO_CLIP__TIME_TAG);

		audioMIDIEClass = createEClass(AUDIO_MIDI);

		audioChannelEClass = createEClass(AUDIO_CHANNEL);
		createEAttribute(audioChannelEClass, AUDIO_CHANNEL__FMODEX);

		audioMixerEClass = createEClass(AUDIO_MIXER);
		createEReference(audioMixerEClass, AUDIO_MIXER__OUT);
		createEReference(audioMixerEClass, AUDIO_MIXER__CHANNEL);

		speakerEClass = createEClass(SPEAKER);

		inputEClass = createEClass(INPUT);

		fmdspEClass = createEClass(FMDSP);
		createEAttribute(fmdspEClass, FMDSP__FMODEX);
		createEAttribute(fmdspEClass, FMDSP__KIND);

		audioChannelGroupEClass = createEClass(AUDIO_CHANNEL_GROUP);
		createEReference(audioChannelGroupEClass, AUDIO_CHANNEL_GROUP__CHILDREN);
		createEAttribute(audioChannelGroupEClass, AUDIO_CHANNEL_GROUP__FMODEX);

		audioSoundEClass = createEClass(AUDIO_SOUND);
		createEAttribute(audioSoundEClass, AUDIO_SOUND__FMODEX);
		createEAttribute(audioSoundEClass, AUDIO_SOUND__EXINFO);

		audioReverbEClass = createEClass(AUDIO_REVERB);
		createEAttribute(audioReverbEClass, AUDIO_REVERB__FMODEX);

		audioSoundGroupEClass = createEClass(AUDIO_SOUND_GROUP);
		createEReference(audioSoundGroupEClass, AUDIO_SOUND_GROUP__CHILDREN);
		createEAttribute(audioSoundGroupEClass, AUDIO_SOUND_GROUP__FMODEX);

		iSoundEClass = createEClass(ISOUND);

		fmGeometryEClass = createEClass(FM_GEOMETRY);
		createEAttribute(fmGeometryEClass, FM_GEOMETRY__FMODEX);

		iChannelEClass = createEClass(ICHANNEL);
		createEReference(iChannelEClass, ICHANNEL__DSP_LIST);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__ID);
		createEReference(deviceEClass, DEVICE__TRACK);
		createEReference(deviceEClass, DEVICE__CHANNEL);

		timeTagEClass = createEClass(TIME_TAG);
		createEAttribute(timeTagEClass, TIME_TAG__TIME);
		createEAttribute(timeTagEClass, TIME_TAG__DURATION);
		createEAttribute(timeTagEClass, TIME_TAG__STATUS);

		// Create enums
		dsP_CALLBACKEEnum = createEEnum(DSP_CALLBACK);
		filE_CALLBACKEEnum = createEEnum(FILE_CALLBACK);
		memorY_CALLBACKEEnum = createEEnum(MEMORY_CALLBACK);
		sounD_CALLBACKEEnum = createEEnum(SOUND_CALLBACK);
		codeC_CALLBACKEEnum = createEEnum(CODEC_CALLBACK);
		dsP_KINDEEnum = createEEnum(DSP_KIND);
		operationEEnum = createEEnum(OPERATION);
		structuresEEnum = createEEnum(STRUCTURES);
		cliP_STATUSEEnum = createEEnum(CLIP_STATUS);

		// Create data types
		fileEDataType = createEDataType(FILE);
		soundEDataType = createEDataType(SOUND);
		dspEDataType = createEDataType(DSP);
		grometryEDataType = createEDataType(GROMETRY);
		reverbEDataType = createEDataType(REVERB);
		soundGroupEDataType = createEDataType(SOUND_GROUP);
		fmoD_CREATESOUNDEXINFOEDataType = createEDataType(FMOD_CREATESOUNDEXINFO);
		channelEDataType = createEDataType(CHANNEL);
		channelGroupEDataType = createEDataType(CHANNEL_GROUP);
		systemEDataType = createEDataType(SYSTEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		audioMP3EClass.getESuperTypes().add(this.getAudioFile());
		audioWAVEClass.getESuperTypes().add(this.getAudioFile());
		audioOGGEClass.getESuperTypes().add(this.getAudioFile());
		audioMIDIEClass.getESuperTypes().add(this.getAudioFile());
		audioChannelEClass.getESuperTypes().add(this.getIChannel());
		audioChannelGroupEClass.getESuperTypes().add(this.getIChannel());
		audioSoundEClass.getESuperTypes().add(this.getISound());
		audioSoundGroupEClass.getESuperTypes().add(this.getISound());

		// Initialize classes and features; add operations and parameters
		initEClass(audioSystemEClass, AudioSystem.class, "AudioSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioSystem_Fmodex(), this.getSystem(), "fmodex", null, 0, 1, AudioSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioFileEClass, AudioFile.class, "AudioFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioFile_File(), this.getFile(), "file", null, 0, 1, AudioFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioFile_Ext(), ecorePackage.getEString(), "ext", null, 0, 1, AudioFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioMP3EClass, AudioMP3.class, "AudioMP3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioMP3_SamplingRate(), ecorePackage.getEFloat(), "samplingRate", null, 0, 1, AudioMP3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioWAVEClass, AudioWAV.class, "AudioWAV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioWAV_SamplingRate(), ecorePackage.getEFloat(), "samplingRate", null, 0, 1, AudioWAV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioOGGEClass, AudioOGG.class, "AudioOGG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioOGG_SamplingRate(), ecorePackage.getEFloat(), "samplingRate", null, 0, 1, AudioOGG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioSceneEClass, AudioScene.class, "AudioScene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAudioScene_Clips(), this.getAudioClip(), null, "clips", null, 0, -1, AudioScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioScene_Label(), ecorePackage.getEString(), "label", null, 0, 1, AudioScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioProjectEClass, AudioProject.class, "AudioProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAudioProject_Scenes(), this.getAudioScene(), null, "scenes", null, 0, -1, AudioProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioProject_Tracks(), this.getAudioTrack(), null, "tracks", null, 0, -1, AudioProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioProject_Clips(), this.getAudioClip(), null, "clips", null, 0, -1, AudioProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioProject_AudioResources(), this.getAudioFile(), null, "audioResources", null, 0, -1, AudioProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioProject_System(), this.getAudioSystem(), null, "system", null, 0, 1, AudioProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioProject_Effects(), this.getAudioMixer(), null, "effects", null, 0, -1, AudioProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioProject_Speakers(), this.getSpeaker(), null, "speakers", null, 0, -1, AudioProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioProject_In(), this.getInput(), null, "in", null, 0, -1, AudioProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioProject_Sounds(), this.getISound(), null, "sounds", null, 0, -1, AudioProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioProject_DspList(), this.getFMDSP(), null, "dspList", null, 0, -1, AudioProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioProject_Channels(), this.getIChannel(), null, "channels", null, 0, -1, AudioProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioProject_Devices(), this.getDevice(), null, "devices", null, 0, -1, AudioProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioTrackEClass, AudioTrack.class, "AudioTrack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAudioTrack_Channel(), this.getIChannel(), null, "channel", null, 0, 1, AudioTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioTrack_Clips(), this.getAudioClip(), null, "clips", null, 0, -1, AudioTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioTrack_Label(), ecorePackage.getEString(), "label", null, 0, 1, AudioTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioTrack_Devices(), this.getDevice(), null, "devices", null, 0, -1, AudioTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioClipEClass, AudioClip.class, "AudioClip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAudioClip_File(), this.getAudioFile(), null, "file", null, 0, 1, AudioClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioClip_Sound(), this.getAudioSound(), null, "sound", null, 0, 1, AudioClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioClip_Track(), this.getAudioTrack(), null, "track", null, 0, 1, AudioClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioClip_Label(), ecorePackage.getEString(), "label", null, 0, 1, AudioClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioClip_TimeTag(), this.getTimeTag(), null, "timeTag", null, 0, 1, AudioClip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioMIDIEClass, AudioMIDI.class, "AudioMIDI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(audioChannelEClass, AudioChannel.class, "AudioChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioChannel_Fmodex(), this.getChannel(), "fmodex", null, 0, 1, AudioChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioMixerEClass, AudioMixer.class, "AudioMixer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAudioMixer_Out(), this.getSpeaker(), null, "out", null, 0, 1, AudioMixer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioMixer_Channel(), this.getIChannel(), null, "channel", null, 0, -1, AudioMixer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speakerEClass, Speaker.class, "Speaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fmdspEClass, net.sf.smbt.fmodex.core.ezaudio.FMDSP.class, "FMDSP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMDSP_Fmodex(), this.getDSP(), "fmodex", null, 0, 1, net.sf.smbt.fmodex.core.ezaudio.FMDSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFMDSP_Kind(), this.getDSP_KIND(), "kind", null, 0, 1, net.sf.smbt.fmodex.core.ezaudio.FMDSP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioChannelGroupEClass, AudioChannelGroup.class, "AudioChannelGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAudioChannelGroup_Children(), this.getIChannel(), null, "children", null, 0, -1, AudioChannelGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioChannelGroup_Fmodex(), this.getChannelGroup(), "fmodex", null, 0, 1, AudioChannelGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioSoundEClass, AudioSound.class, "AudioSound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioSound_Fmodex(), this.getSound(), "fmodex", null, 0, 1, AudioSound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioSound_Exinfo(), this.getFMOD_CREATESOUNDEXINFO(), "exinfo", null, 0, 1, AudioSound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioReverbEClass, AudioReverb.class, "AudioReverb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioReverb_Fmodex(), this.getReverb(), "fmodex", null, 0, 1, AudioReverb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioSoundGroupEClass, AudioSoundGroup.class, "AudioSoundGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAudioSoundGroup_Children(), this.getISound(), null, "children", null, 0, -1, AudioSoundGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAudioSoundGroup_Fmodex(), this.getSoundGroup(), "fmodex", null, 0, 1, AudioSoundGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iSoundEClass, ISound.class, "ISound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fmGeometryEClass, FMGeometry.class, "FMGeometry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMGeometry_Fmodex(), this.getGrometry(), "fmodex", null, 0, 1, FMGeometry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iChannelEClass, IChannel.class, "IChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIChannel_DspList(), this.getFMDSP(), null, "dspList", null, 0, -1, IChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Track(), this.getAudioTrack(), null, "track", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDevice_Channel(), this.getAudioChannel(), null, "channel", null, 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeTagEClass, TimeTag.class, "TimeTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeTag_Time(), ecorePackage.getELong(), "time", null, 0, 1, TimeTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeTag_Duration(), ecorePackage.getELong(), "duration", null, 0, 1, TimeTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeTag_Status(), this.getCLIP_STATUS(), "status", null, 0, 1, TimeTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dsP_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK.class, "DSP_CALLBACK");
		addEEnumLiteral(dsP_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK.CREATE);
		addEEnumLiteral(dsP_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK.DIALOG);
		addEEnumLiteral(dsP_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK.GET_PARAM);
		addEEnumLiteral(dsP_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK.READ);
		addEEnumLiteral(dsP_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK.RELEASE);
		addEEnumLiteral(dsP_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK.RESET);
		addEEnumLiteral(dsP_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK.SET_PARAM);
		addEEnumLiteral(dsP_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK.SET_POSITION);

		initEEnum(filE_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK.class, "FILE_CALLBACK");
		addEEnumLiteral(filE_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK.ASYNC_CANCEL);
		addEEnumLiteral(filE_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK.ASYNC_READ);
		addEEnumLiteral(filE_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK.CLOSE);
		addEEnumLiteral(filE_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK.OPEN);
		addEEnumLiteral(filE_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK.READ);
		addEEnumLiteral(filE_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK.SEEK);

		initEEnum(memorY_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.MEMORY_CALLBACK.class, "MEMORY_CALLBACK");
		addEEnumLiteral(memorY_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.MEMORY_CALLBACK.ALLOC);
		addEEnumLiteral(memorY_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.MEMORY_CALLBACK.FREE);
		addEEnumLiteral(memorY_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.MEMORY_CALLBACK.REALLOC);

		initEEnum(sounD_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.SOUND_CALLBACK.class, "SOUND_CALLBACK");
		addEEnumLiteral(sounD_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.SOUND_CALLBACK.NON_BLOCK);
		addEEnumLiteral(sounD_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.SOUND_CALLBACK.PCM_READ);
		addEEnumLiteral(sounD_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.SOUND_CALLBACK.PCM_SET_POS);

		initEEnum(codeC_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK.class, "CODEC_CALLBACK");
		addEEnumLiteral(codeC_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK.CLOSE);
		addEEnumLiteral(codeC_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK.GET_LENGTH);
		addEEnumLiteral(codeC_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK.GET_POSITION);
		addEEnumLiteral(codeC_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK.GET_WAVE_FORMAT);
		addEEnumLiteral(codeC_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK.META_DATA);
		addEEnumLiteral(codeC_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK.OPEN);
		addEEnumLiteral(codeC_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK.READ);
		addEEnumLiteral(codeC_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK.SET_POSITION);
		addEEnumLiteral(codeC_CALLBACKEEnum, net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK.SOUND_CREATE);

		initEEnum(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.class, "DSP_KIND");
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.CHORUS);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.COMPRESSOR);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.DELAY);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.DISTORTION);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.ECHO);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.FFT_WINDOW);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.FLANGE);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.HIGH_PASS);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.IT_ECHO);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.IT_LOW_PASS);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.LOW_PASS_SIMPLE);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.LOW_PASS);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.NORMALIZE);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.OSCILLATOR);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.PARAM_EQ);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.PITCH_SHIFFT);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.RESAMPLER);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.REVERB);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.SFX_REVERB);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.TREMOLO);
		addEEnumLiteral(dsP_KINDEEnum, net.sf.smbt.fmodex.core.ezaudio.DSP_KIND.TYPE);

		initEEnum(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.class, "OPERATION");
		addEEnumLiteral(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.OPEN_STATE);
		addEEnumLiteral(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.OUTPUT_TYPE);
		addEEnumLiteral(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.PLUGIN_TYPE);
		addEEnumLiteral(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.RESULT);
		addEEnumLiteral(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.SOUND_FORMAT);
		addEEnumLiteral(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.SOUND_TYPE);
		addEEnumLiteral(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.SOUNDGROUP_BEHAVIOR);
		addEEnumLiteral(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.SPEAKER);
		addEEnumLiteral(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.SPEAKER_MAP_TYPE);
		addEEnumLiteral(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.SPEAKER_MODE);
		addEEnumLiteral(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.SYSTEM_CALLBACK_TYPE);
		addEEnumLiteral(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.TAG_DATA_TYPE);
		addEEnumLiteral(operationEEnum, net.sf.smbt.fmodex.core.ezaudio.OPERATION.TAG_TYPE);

		initEEnum(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.class, "STRUCTURES");
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.ADVANCED_SETTINGS);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.ASYNC_READ_INFO);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.CD_TOC);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.CODEC_DESCRIPTION);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.CODEC_STATE);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.CODEC_WAVE_FORMAT);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.CREATE_SOUND_INFO);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.DSP_DESCRIPTION);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.DSP_PARAMETER_DESC);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.DSP_STATE);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.GUID);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.MEMORY_USAGE_DETAILS);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.REVERB_CHANNEL_PROPERTIES);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.REVERB_PROPERTIES);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.SYNC_POINT);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.TAG);
		addEEnumLiteral(structuresEEnum, net.sf.smbt.fmodex.core.ezaudio.STRUCTURES.VECTOR);

		initEEnum(cliP_STATUSEEnum, net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS.class, "CLIP_STATUS");
		addEEnumLiteral(cliP_STATUSEEnum, net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS.PLAY);
		addEEnumLiteral(cliP_STATUSEEnum, net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS.PAUSE);
		addEEnumLiteral(cliP_STATUSEEnum, net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS.STOP);

		// Initialize data types
		initEDataType(fileEDataType, File.class, "File", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(soundEDataType, Sound.class, "Sound", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dspEDataType, org.jouvieje.fmodex.DSP.class, "DSP", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(grometryEDataType, Geometry.class, "Grometry", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(reverbEDataType, Reverb.class, "Reverb", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(soundGroupEDataType, SoundGroup.class, "SoundGroup", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fmoD_CREATESOUNDEXINFOEDataType, org.jouvieje.fmodex.structures.FMOD_CREATESOUNDEXINFO.class, "FMOD_CREATESOUNDEXINFO", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(channelEDataType, Channel.class, "Channel", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(channelGroupEDataType, ChannelGroup.class, "ChannelGroup", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(systemEDataType, org.jouvieje.fmodex.System.class, "System", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EzaudioPackageImpl
