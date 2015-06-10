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
import net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS;
import net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK;
import net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK;
import net.sf.smbt.fmodex.core.ezaudio.DSP_KIND;
import net.sf.smbt.fmodex.core.ezaudio.Device;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioFactory;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;
import net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK;
import net.sf.smbt.fmodex.core.ezaudio.FMDSP;
import net.sf.smbt.fmodex.core.ezaudio.FMGeometry;
import net.sf.smbt.fmodex.core.ezaudio.IChannel;
import net.sf.smbt.fmodex.core.ezaudio.ISound;
import net.sf.smbt.fmodex.core.ezaudio.Input;
import net.sf.smbt.fmodex.core.ezaudio.MEMORY_CALLBACK;
import net.sf.smbt.fmodex.core.ezaudio.OPERATION;
import net.sf.smbt.fmodex.core.ezaudio.SOUND_CALLBACK;
import net.sf.smbt.fmodex.core.ezaudio.STRUCTURES;
import net.sf.smbt.fmodex.core.ezaudio.Speaker;
import net.sf.smbt.fmodex.core.ezaudio.TimeTag;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.jouvieje.fmodex.Channel;
import org.jouvieje.fmodex.ChannelGroup;
import org.jouvieje.fmodex.DSP;
import org.jouvieje.fmodex.Geometry;
import org.jouvieje.fmodex.Reverb;
import org.jouvieje.fmodex.Sound;
import org.jouvieje.fmodex.SoundGroup;
import org.jouvieje.fmodex.structures.FMOD_CREATESOUNDEXINFO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzaudioFactoryImpl extends EFactoryImpl implements EzaudioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzaudioFactory init() {
		try {
			EzaudioFactory theEzaudioFactory = (EzaudioFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezaudio/1.0"); 
			if (theEzaudioFactory != null) {
				return theEzaudioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzaudioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzaudioFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EzaudioPackage.AUDIO_SYSTEM: return createAudioSystem();
			case EzaudioPackage.AUDIO_FILE: return createAudioFile();
			case EzaudioPackage.AUDIO_MP3: return createAudioMP3();
			case EzaudioPackage.AUDIO_WAV: return createAudioWAV();
			case EzaudioPackage.AUDIO_OGG: return createAudioOGG();
			case EzaudioPackage.AUDIO_SCENE: return createAudioScene();
			case EzaudioPackage.AUDIO_PROJECT: return createAudioProject();
			case EzaudioPackage.AUDIO_TRACK: return createAudioTrack();
			case EzaudioPackage.AUDIO_CLIP: return createAudioClip();
			case EzaudioPackage.AUDIO_MIDI: return createAudioMIDI();
			case EzaudioPackage.AUDIO_CHANNEL: return createAudioChannel();
			case EzaudioPackage.AUDIO_MIXER: return createAudioMixer();
			case EzaudioPackage.SPEAKER: return createSpeaker();
			case EzaudioPackage.INPUT: return createInput();
			case EzaudioPackage.FMDSP: return createFMDSP();
			case EzaudioPackage.AUDIO_CHANNEL_GROUP: return createAudioChannelGroup();
			case EzaudioPackage.AUDIO_SOUND: return createAudioSound();
			case EzaudioPackage.AUDIO_REVERB: return createAudioReverb();
			case EzaudioPackage.AUDIO_SOUND_GROUP: return createAudioSoundGroup();
			case EzaudioPackage.ISOUND: return createISound();
			case EzaudioPackage.FM_GEOMETRY: return createFMGeometry();
			case EzaudioPackage.ICHANNEL: return createIChannel();
			case EzaudioPackage.DEVICE: return createDevice();
			case EzaudioPackage.TIME_TAG: return createTimeTag();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EzaudioPackage.DSP_CALLBACK:
				return createDSP_CALLBACKFromString(eDataType, initialValue);
			case EzaudioPackage.FILE_CALLBACK:
				return createFILE_CALLBACKFromString(eDataType, initialValue);
			case EzaudioPackage.MEMORY_CALLBACK:
				return createMEMORY_CALLBACKFromString(eDataType, initialValue);
			case EzaudioPackage.SOUND_CALLBACK:
				return createSOUND_CALLBACKFromString(eDataType, initialValue);
			case EzaudioPackage.CODEC_CALLBACK:
				return createCODEC_CALLBACKFromString(eDataType, initialValue);
			case EzaudioPackage.DSP_KIND:
				return createDSP_KINDFromString(eDataType, initialValue);
			case EzaudioPackage.OPERATION:
				return createOPERATIONFromString(eDataType, initialValue);
			case EzaudioPackage.STRUCTURES:
				return createSTRUCTURESFromString(eDataType, initialValue);
			case EzaudioPackage.CLIP_STATUS:
				return createCLIP_STATUSFromString(eDataType, initialValue);
			case EzaudioPackage.FILE:
				return createFileFromString(eDataType, initialValue);
			case EzaudioPackage.SOUND:
				return createSoundFromString(eDataType, initialValue);
			case EzaudioPackage.DSP:
				return createDSPFromString(eDataType, initialValue);
			case EzaudioPackage.GROMETRY:
				return createGrometryFromString(eDataType, initialValue);
			case EzaudioPackage.REVERB:
				return createReverbFromString(eDataType, initialValue);
			case EzaudioPackage.SOUND_GROUP:
				return createSoundGroupFromString(eDataType, initialValue);
			case EzaudioPackage.FMOD_CREATESOUNDEXINFO:
				return createFMOD_CREATESOUNDEXINFOFromString(eDataType, initialValue);
			case EzaudioPackage.CHANNEL:
				return createChannelFromString(eDataType, initialValue);
			case EzaudioPackage.CHANNEL_GROUP:
				return createChannelGroupFromString(eDataType, initialValue);
			case EzaudioPackage.SYSTEM:
				return createSystemFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EzaudioPackage.DSP_CALLBACK:
				return convertDSP_CALLBACKToString(eDataType, instanceValue);
			case EzaudioPackage.FILE_CALLBACK:
				return convertFILE_CALLBACKToString(eDataType, instanceValue);
			case EzaudioPackage.MEMORY_CALLBACK:
				return convertMEMORY_CALLBACKToString(eDataType, instanceValue);
			case EzaudioPackage.SOUND_CALLBACK:
				return convertSOUND_CALLBACKToString(eDataType, instanceValue);
			case EzaudioPackage.CODEC_CALLBACK:
				return convertCODEC_CALLBACKToString(eDataType, instanceValue);
			case EzaudioPackage.DSP_KIND:
				return convertDSP_KINDToString(eDataType, instanceValue);
			case EzaudioPackage.OPERATION:
				return convertOPERATIONToString(eDataType, instanceValue);
			case EzaudioPackage.STRUCTURES:
				return convertSTRUCTURESToString(eDataType, instanceValue);
			case EzaudioPackage.CLIP_STATUS:
				return convertCLIP_STATUSToString(eDataType, instanceValue);
			case EzaudioPackage.FILE:
				return convertFileToString(eDataType, instanceValue);
			case EzaudioPackage.SOUND:
				return convertSoundToString(eDataType, instanceValue);
			case EzaudioPackage.DSP:
				return convertDSPToString(eDataType, instanceValue);
			case EzaudioPackage.GROMETRY:
				return convertGrometryToString(eDataType, instanceValue);
			case EzaudioPackage.REVERB:
				return convertReverbToString(eDataType, instanceValue);
			case EzaudioPackage.SOUND_GROUP:
				return convertSoundGroupToString(eDataType, instanceValue);
			case EzaudioPackage.FMOD_CREATESOUNDEXINFO:
				return convertFMOD_CREATESOUNDEXINFOToString(eDataType, instanceValue);
			case EzaudioPackage.CHANNEL:
				return convertChannelToString(eDataType, instanceValue);
			case EzaudioPackage.CHANNEL_GROUP:
				return convertChannelGroupToString(eDataType, instanceValue);
			case EzaudioPackage.SYSTEM:
				return convertSystemToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioSystem createAudioSystem() {
		AudioSystemImpl audioSystem = new AudioSystemImpl();
		return audioSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioFile createAudioFile() {
		AudioFileImpl audioFile = new AudioFileImpl();
		return audioFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioMP3 createAudioMP3() {
		AudioMP3Impl audioMP3 = new AudioMP3Impl();
		return audioMP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioWAV createAudioWAV() {
		AudioWAVImpl audioWAV = new AudioWAVImpl();
		return audioWAV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioOGG createAudioOGG() {
		AudioOGGImpl audioOGG = new AudioOGGImpl();
		return audioOGG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioScene createAudioScene() {
		AudioSceneImpl audioScene = new AudioSceneImpl();
		return audioScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioProject createAudioProject() {
		AudioProjectImpl audioProject = new AudioProjectImpl();
		return audioProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioTrack createAudioTrack() {
		AudioTrackImpl audioTrack = new AudioTrackImpl();
		return audioTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioClip createAudioClip() {
		AudioClipImpl audioClip = new AudioClipImpl();
		return audioClip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioMIDI createAudioMIDI() {
		AudioMIDIImpl audioMIDI = new AudioMIDIImpl();
		return audioMIDI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioChannel createAudioChannel() {
		AudioChannelImpl audioChannel = new AudioChannelImpl();
		return audioChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioMixer createAudioMixer() {
		AudioMixerImpl audioMixer = new AudioMixerImpl();
		return audioMixer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speaker createSpeaker() {
		SpeakerImpl speaker = new SpeakerImpl();
		return speaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMDSP createFMDSP() {
		FMDSPImpl fmdsp = new FMDSPImpl();
		return fmdsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioChannelGroup createAudioChannelGroup() {
		AudioChannelGroupImpl audioChannelGroup = new AudioChannelGroupImpl();
		return audioChannelGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioSound createAudioSound() {
		AudioSoundImpl audioSound = new AudioSoundImpl();
		return audioSound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioReverb createAudioReverb() {
		AudioReverbImpl audioReverb = new AudioReverbImpl();
		return audioReverb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioSoundGroup createAudioSoundGroup() {
		AudioSoundGroupImpl audioSoundGroup = new AudioSoundGroupImpl();
		return audioSoundGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISound createISound() {
		ISoundImpl iSound = new ISoundImpl();
		return iSound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMGeometry createFMGeometry() {
		FMGeometryImpl fmGeometry = new FMGeometryImpl();
		return fmGeometry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IChannel createIChannel() {
		IChannelImpl iChannel = new IChannelImpl();
		return iChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTag createTimeTag() {
		TimeTagImpl timeTag = new TimeTagImpl();
		return timeTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSP_CALLBACK createDSP_CALLBACKFromString(EDataType eDataType, String initialValue) {
		DSP_CALLBACK result = DSP_CALLBACK.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDSP_CALLBACKToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FILE_CALLBACK createFILE_CALLBACKFromString(EDataType eDataType, String initialValue) {
		FILE_CALLBACK result = FILE_CALLBACK.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFILE_CALLBACKToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MEMORY_CALLBACK createMEMORY_CALLBACKFromString(EDataType eDataType, String initialValue) {
		MEMORY_CALLBACK result = MEMORY_CALLBACK.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMEMORY_CALLBACKToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOUND_CALLBACK createSOUND_CALLBACKFromString(EDataType eDataType, String initialValue) {
		SOUND_CALLBACK result = SOUND_CALLBACK.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSOUND_CALLBACKToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CODEC_CALLBACK createCODEC_CALLBACKFromString(EDataType eDataType, String initialValue) {
		CODEC_CALLBACK result = CODEC_CALLBACK.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCODEC_CALLBACKToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSP_KIND createDSP_KINDFromString(EDataType eDataType, String initialValue) {
		DSP_KIND result = DSP_KIND.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDSP_KINDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OPERATION createOPERATIONFromString(EDataType eDataType, String initialValue) {
		OPERATION result = OPERATION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOPERATIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STRUCTURES createSTRUCTURESFromString(EDataType eDataType, String initialValue) {
		STRUCTURES result = STRUCTURES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSTRUCTURESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLIP_STATUS createCLIP_STATUSFromString(EDataType eDataType, String initialValue) {
		CLIP_STATUS result = CLIP_STATUS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCLIP_STATUSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFileFromString(EDataType eDataType, String initialValue) {
		return (File)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sound createSoundFromString(EDataType eDataType, String initialValue) {
		return (Sound)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSoundToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSP createDSPFromString(EDataType eDataType, String initialValue) {
		return (DSP)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDSPToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Geometry createGrometryFromString(EDataType eDataType, String initialValue) {
		return (Geometry)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGrometryToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reverb createReverbFromString(EDataType eDataType, String initialValue) {
		return (Reverb)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReverbToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundGroup createSoundGroupFromString(EDataType eDataType, String initialValue) {
		return (SoundGroup)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSoundGroupToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMOD_CREATESOUNDEXINFO createFMOD_CREATESOUNDEXINFOFromString(EDataType eDataType, String initialValue) {
		return (FMOD_CREATESOUNDEXINFO)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFMOD_CREATESOUNDEXINFOToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannelFromString(EDataType eDataType, String initialValue) {
		return (Channel)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChannelGroup createChannelGroupFromString(EDataType eDataType, String initialValue) {
		return (ChannelGroup)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelGroupToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.jouvieje.fmodex.System createSystemFromString(EDataType eDataType, String initialValue) {
		return (org.jouvieje.fmodex.System)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzaudioPackage getEzaudioPackage() {
		return (EzaudioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzaudioPackage getPackage() {
		return EzaudioPackage.eINSTANCE;
	}

} //EzaudioFactoryImpl
