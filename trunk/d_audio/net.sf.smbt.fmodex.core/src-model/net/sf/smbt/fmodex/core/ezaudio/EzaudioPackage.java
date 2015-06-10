/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioFactory
 * @model kind="package"
 * @generated
 */
public interface EzaudioPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezaudio";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezaudio/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezaudio";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzaudioPackage eINSTANCE = net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioSystemImpl <em>Audio System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioSystemImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioSystem()
	 * @generated
	 */
	int AUDIO_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_SYSTEM__FMODEX = 0;

	/**
	 * The number of structural features of the '<em>Audio System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioFileImpl <em>Audio File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioFileImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioFile()
	 * @generated
	 */
	int AUDIO_FILE = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FILE__FILE = 0;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FILE__EXT = 1;

	/**
	 * The number of structural features of the '<em>Audio File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FILE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioMP3Impl <em>Audio MP3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioMP3Impl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioMP3()
	 * @generated
	 */
	int AUDIO_MP3 = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_MP3__FILE = AUDIO_FILE__FILE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_MP3__EXT = AUDIO_FILE__EXT;

	/**
	 * The feature id for the '<em><b>Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_MP3__SAMPLING_RATE = AUDIO_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Audio MP3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_MP3_FEATURE_COUNT = AUDIO_FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioWAVImpl <em>Audio WAV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioWAVImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioWAV()
	 * @generated
	 */
	int AUDIO_WAV = 3;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_WAV__FILE = AUDIO_FILE__FILE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_WAV__EXT = AUDIO_FILE__EXT;

	/**
	 * The feature id for the '<em><b>Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_WAV__SAMPLING_RATE = AUDIO_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Audio WAV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_WAV_FEATURE_COUNT = AUDIO_FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioOGGImpl <em>Audio OGG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioOGGImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioOGG()
	 * @generated
	 */
	int AUDIO_OGG = 4;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_OGG__FILE = AUDIO_FILE__FILE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_OGG__EXT = AUDIO_FILE__EXT;

	/**
	 * The feature id for the '<em><b>Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_OGG__SAMPLING_RATE = AUDIO_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Audio OGG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_OGG_FEATURE_COUNT = AUDIO_FILE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioSceneImpl <em>Audio Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioSceneImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioScene()
	 * @generated
	 */
	int AUDIO_SCENE = 5;

	/**
	 * The feature id for the '<em><b>Clips</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_SCENE__CLIPS = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_SCENE__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Audio Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_SCENE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl <em>Audio Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioProject()
	 * @generated
	 */
	int AUDIO_PROJECT = 6;

	/**
	 * The feature id for the '<em><b>Scenes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PROJECT__SCENES = 0;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PROJECT__TRACKS = 1;

	/**
	 * The feature id for the '<em><b>Clips</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PROJECT__CLIPS = 2;

	/**
	 * The feature id for the '<em><b>Audio Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PROJECT__AUDIO_RESOURCES = 3;

	/**
	 * The feature id for the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PROJECT__SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PROJECT__EFFECTS = 5;

	/**
	 * The feature id for the '<em><b>Speakers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PROJECT__SPEAKERS = 6;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PROJECT__IN = 7;

	/**
	 * The feature id for the '<em><b>Sounds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PROJECT__SOUNDS = 8;

	/**
	 * The feature id for the '<em><b>Dsp List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PROJECT__DSP_LIST = 9;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PROJECT__CHANNELS = 10;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PROJECT__DEVICES = 11;

	/**
	 * The number of structural features of the '<em>Audio Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_PROJECT_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioTrackImpl <em>Audio Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioTrackImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioTrack()
	 * @generated
	 */
	int AUDIO_TRACK = 7;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__CHANNEL = 0;

	/**
	 * The feature id for the '<em><b>Clips</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__CLIPS = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK__DEVICES = 3;

	/**
	 * The number of structural features of the '<em>Audio Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_TRACK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioClipImpl <em>Audio Clip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioClipImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioClip()
	 * @generated
	 */
	int AUDIO_CLIP = 8;

	/**
	 * The feature id for the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP__FILE = 0;

	/**
	 * The feature id for the '<em><b>Sound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP__SOUND = 1;

	/**
	 * The feature id for the '<em><b>Track</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP__TRACK = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Time Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP__TIME_TAG = 4;

	/**
	 * The number of structural features of the '<em>Audio Clip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CLIP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioMIDIImpl <em>Audio MIDI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioMIDIImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioMIDI()
	 * @generated
	 */
	int AUDIO_MIDI = 9;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_MIDI__FILE = AUDIO_FILE__FILE;

	/**
	 * The feature id for the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_MIDI__EXT = AUDIO_FILE__EXT;

	/**
	 * The number of structural features of the '<em>Audio MIDI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_MIDI_FEATURE_COUNT = AUDIO_FILE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.IChannelImpl <em>IChannel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.IChannelImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getIChannel()
	 * @generated
	 */
	int ICHANNEL = 21;

	/**
	 * The feature id for the '<em><b>Dsp List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICHANNEL__DSP_LIST = 0;

	/**
	 * The number of structural features of the '<em>IChannel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICHANNEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '<em>Channel</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jouvieje.fmodex.Channel
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 40;

	/**
	 * The meta object id for the '<em>Channel Group</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jouvieje.fmodex.ChannelGroup
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getChannelGroup()
	 * @generated
	 */
	int CHANNEL_GROUP = 41;

	/**
	 * The meta object id for the '<em>System</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jouvieje.fmodex.System
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 42;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioChannelImpl <em>Audio Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioChannelImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioChannel()
	 * @generated
	 */
	int AUDIO_CHANNEL = 10;

	/**
	 * The feature id for the '<em><b>Dsp List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CHANNEL__DSP_LIST = ICHANNEL__DSP_LIST;

	/**
	 * The feature id for the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CHANNEL__FMODEX = ICHANNEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Audio Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CHANNEL_FEATURE_COUNT = ICHANNEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioMixerImpl <em>Audio Mixer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioMixerImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioMixer()
	 * @generated
	 */
	int AUDIO_MIXER = 11;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_MIXER__OUT = 0;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_MIXER__CHANNEL = 1;

	/**
	 * The number of structural features of the '<em>Audio Mixer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_MIXER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.SpeakerImpl <em>Speaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.SpeakerImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getSpeaker()
	 * @generated
	 */
	int SPEAKER = 12;

	/**
	 * The number of structural features of the '<em>Speaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.InputImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 13;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.FMDSPImpl <em>FMDSP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.FMDSPImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getFMDSP()
	 * @generated
	 */
	int FMDSP = 14;

	/**
	 * The feature id for the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMDSP__FMODEX = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMDSP__KIND = 1;

	/**
	 * The number of structural features of the '<em>FMDSP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMDSP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioChannelGroupImpl <em>Audio Channel Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioChannelGroupImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioChannelGroup()
	 * @generated
	 */
	int AUDIO_CHANNEL_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Dsp List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CHANNEL_GROUP__DSP_LIST = ICHANNEL__DSP_LIST;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CHANNEL_GROUP__CHILDREN = ICHANNEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CHANNEL_GROUP__FMODEX = ICHANNEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Audio Channel Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_CHANNEL_GROUP_FEATURE_COUNT = ICHANNEL_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.ISoundImpl <em>ISound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.ISoundImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getISound()
	 * @generated
	 */
	int ISOUND = 19;

	/**
	 * The number of structural features of the '<em>ISound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISOUND_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioSoundImpl <em>Audio Sound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioSoundImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioSound()
	 * @generated
	 */
	int AUDIO_SOUND = 16;

	/**
	 * The feature id for the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_SOUND__FMODEX = ISOUND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exinfo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_SOUND__EXINFO = ISOUND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Audio Sound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_SOUND_FEATURE_COUNT = ISOUND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioReverbImpl <em>Audio Reverb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioReverbImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioReverb()
	 * @generated
	 */
	int AUDIO_REVERB = 17;

	/**
	 * The feature id for the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_REVERB__FMODEX = 0;

	/**
	 * The number of structural features of the '<em>Audio Reverb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_REVERB_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioSoundGroupImpl <em>Audio Sound Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioSoundGroupImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioSoundGroup()
	 * @generated
	 */
	int AUDIO_SOUND_GROUP = 18;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_SOUND_GROUP__CHILDREN = ISOUND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_SOUND_GROUP__FMODEX = ISOUND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Audio Sound Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_SOUND_GROUP_FEATURE_COUNT = ISOUND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.FMGeometryImpl <em>FM Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.FMGeometryImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getFMGeometry()
	 * @generated
	 */
	int FM_GEOMETRY = 20;

	/**
	 * The feature id for the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FM_GEOMETRY__FMODEX = 0;

	/**
	 * The number of structural features of the '<em>FM Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FM_GEOMETRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.DeviceImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 22;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Track</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TRACK = 1;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CHANNEL = 2;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.TimeTagImpl <em>Time Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.TimeTagImpl
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getTimeTag()
	 * @generated
	 */
	int TIME_TAG = 23;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TAG__TIME = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TAG__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TAG__STATUS = 2;

	/**
	 * The number of structural features of the '<em>Time Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TAG_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK <em>DSP CALLBACK</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getDSP_CALLBACK()
	 * @generated
	 */
	int DSP_CALLBACK = 24;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK <em>FILE CALLBACK</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getFILE_CALLBACK()
	 * @generated
	 */
	int FILE_CALLBACK = 25;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.MEMORY_CALLBACK <em>MEMORY CALLBACK</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.MEMORY_CALLBACK
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getMEMORY_CALLBACK()
	 * @generated
	 */
	int MEMORY_CALLBACK = 26;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.SOUND_CALLBACK <em>SOUND CALLBACK</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.SOUND_CALLBACK
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getSOUND_CALLBACK()
	 * @generated
	 */
	int SOUND_CALLBACK = 27;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK <em>CODEC CALLBACK</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getCODEC_CALLBACK()
	 * @generated
	 */
	int CODEC_CALLBACK = 28;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.DSP_KIND <em>DSP KIND</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.DSP_KIND
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getDSP_KIND()
	 * @generated
	 */
	int DSP_KIND = 29;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.OPERATION <em>OPERATION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.OPERATION
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getOPERATION()
	 * @generated
	 */
	int OPERATION = 30;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.STRUCTURES <em>STRUCTURES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.STRUCTURES
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getSTRUCTURES()
	 * @generated
	 */
	int STRUCTURES = 31;

	/**
	 * The meta object id for the '{@link net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS <em>CLIP STATUS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getCLIP_STATUS()
	 * @generated
	 */
	int CLIP_STATUS = 32;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 33;

	/**
	 * The meta object id for the '<em>Sound</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jouvieje.fmodex.Sound
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getSound()
	 * @generated
	 */
	int SOUND = 34;

	/**
	 * The meta object id for the '<em>DSP</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jouvieje.fmodex.DSP
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getDSP()
	 * @generated
	 */
	int DSP = 35;

	/**
	 * The meta object id for the '<em>Grometry</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jouvieje.fmodex.Geometry
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getGrometry()
	 * @generated
	 */
	int GROMETRY = 36;

	/**
	 * The meta object id for the '<em>Reverb</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jouvieje.fmodex.Reverb
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getReverb()
	 * @generated
	 */
	int REVERB = 37;

	/**
	 * The meta object id for the '<em>Sound Group</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jouvieje.fmodex.SoundGroup
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getSoundGroup()
	 * @generated
	 */
	int SOUND_GROUP = 38;


	/**
	 * The meta object id for the '<em>FMOD CREATESOUNDEXINFO</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jouvieje.fmodex.structures.FMOD_CREATESOUNDEXINFO
	 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getFMOD_CREATESOUNDEXINFO()
	 * @generated
	 */
	int FMOD_CREATESOUNDEXINFO = 39;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSystem <em>Audio System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio System</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioSystem
	 * @generated
	 */
	EClass getAudioSystem();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSystem#getFmodex <em>Fmodex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fmodex</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioSystem#getFmodex()
	 * @see #getAudioSystem()
	 * @generated
	 */
	EAttribute getAudioSystem_Fmodex();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioFile <em>Audio File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio File</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioFile
	 * @generated
	 */
	EClass getAudioFile();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioFile#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioFile#getFile()
	 * @see #getAudioFile()
	 * @generated
	 */
	EAttribute getAudioFile_File();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioFile#getExt <em>Ext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ext</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioFile#getExt()
	 * @see #getAudioFile()
	 * @generated
	 */
	EAttribute getAudioFile_Ext();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioMP3 <em>Audio MP3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio MP3</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioMP3
	 * @generated
	 */
	EClass getAudioMP3();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioMP3#getSamplingRate <em>Sampling Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampling Rate</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioMP3#getSamplingRate()
	 * @see #getAudioMP3()
	 * @generated
	 */
	EAttribute getAudioMP3_SamplingRate();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioWAV <em>Audio WAV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio WAV</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioWAV
	 * @generated
	 */
	EClass getAudioWAV();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioWAV#getSamplingRate <em>Sampling Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampling Rate</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioWAV#getSamplingRate()
	 * @see #getAudioWAV()
	 * @generated
	 */
	EAttribute getAudioWAV_SamplingRate();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioOGG <em>Audio OGG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio OGG</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioOGG
	 * @generated
	 */
	EClass getAudioOGG();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioOGG#getSamplingRate <em>Sampling Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sampling Rate</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioOGG#getSamplingRate()
	 * @see #getAudioOGG()
	 * @generated
	 */
	EAttribute getAudioOGG_SamplingRate();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioScene <em>Audio Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Scene</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioScene
	 * @generated
	 */
	EClass getAudioScene();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioScene#getClips <em>Clips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clips</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioScene#getClips()
	 * @see #getAudioScene()
	 * @generated
	 */
	EReference getAudioScene_Clips();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioScene#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioScene#getLabel()
	 * @see #getAudioScene()
	 * @generated
	 */
	EAttribute getAudioScene_Label();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject <em>Audio Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Project</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject
	 * @generated
	 */
	EClass getAudioProject();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getScenes <em>Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenes</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject#getScenes()
	 * @see #getAudioProject()
	 * @generated
	 */
	EReference getAudioProject_Scenes();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject#getTracks()
	 * @see #getAudioProject()
	 * @generated
	 */
	EReference getAudioProject_Tracks();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getClips <em>Clips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clips</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject#getClips()
	 * @see #getAudioProject()
	 * @generated
	 */
	EReference getAudioProject_Clips();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getAudioResources <em>Audio Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audio Resources</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject#getAudioResources()
	 * @see #getAudioProject()
	 * @generated
	 */
	EReference getAudioProject_AudioResources();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject#getSystem()
	 * @see #getAudioProject()
	 * @generated
	 */
	EReference getAudioProject_System();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject#getEffects()
	 * @see #getAudioProject()
	 * @generated
	 */
	EReference getAudioProject_Effects();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getSpeakers <em>Speakers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speakers</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject#getSpeakers()
	 * @see #getAudioProject()
	 * @generated
	 */
	EReference getAudioProject_Speakers();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject#getIn()
	 * @see #getAudioProject()
	 * @generated
	 */
	EReference getAudioProject_In();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getSounds <em>Sounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sounds</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject#getSounds()
	 * @see #getAudioProject()
	 * @generated
	 */
	EReference getAudioProject_Sounds();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject#getChannels()
	 * @see #getAudioProject()
	 * @generated
	 */
	EReference getAudioProject_Channels();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject#getDevices()
	 * @see #getAudioProject()
	 * @generated
	 */
	EReference getAudioProject_Devices();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getDspList <em>Dsp List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dsp List</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject#getDspList()
	 * @see #getAudioProject()
	 * @generated
	 */
	EReference getAudioProject_DspList();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioTrack <em>Audio Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Track</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioTrack
	 * @generated
	 */
	EClass getAudioTrack();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getChannel()
	 * @see #getAudioTrack()
	 * @generated
	 */
	EReference getAudioTrack_Channel();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getClips <em>Clips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clips</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getClips()
	 * @see #getAudioTrack()
	 * @generated
	 */
	EReference getAudioTrack_Clips();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getLabel()
	 * @see #getAudioTrack()
	 * @generated
	 */
	EAttribute getAudioTrack_Label();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Devices</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getDevices()
	 * @see #getAudioTrack()
	 * @generated
	 */
	EReference getAudioTrack_Devices();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip <em>Audio Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Clip</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioClip
	 * @generated
	 */
	EClass getAudioClip();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>File</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioClip#getFile()
	 * @see #getAudioClip()
	 * @generated
	 */
	EReference getAudioClip_File();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getSound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sound</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioClip#getSound()
	 * @see #getAudioClip()
	 * @generated
	 */
	EReference getAudioClip_Sound();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getTrack <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Track</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioClip#getTrack()
	 * @see #getAudioClip()
	 * @generated
	 */
	EReference getAudioClip_Track();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioClip#getLabel()
	 * @see #getAudioClip()
	 * @generated
	 */
	EAttribute getAudioClip_Label();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getTimeTag <em>Time Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Tag</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioClip#getTimeTag()
	 * @see #getAudioClip()
	 * @generated
	 */
	EReference getAudioClip_TimeTag();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioMIDI <em>Audio MIDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio MIDI</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioMIDI
	 * @generated
	 */
	EClass getAudioMIDI();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioChannel <em>Audio Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Channel</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioChannel
	 * @generated
	 */
	EClass getAudioChannel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioChannel#getFmodex <em>Fmodex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fmodex</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioChannel#getFmodex()
	 * @see #getAudioChannel()
	 * @generated
	 */
	EAttribute getAudioChannel_Fmodex();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioMixer <em>Audio Mixer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Mixer</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioMixer
	 * @generated
	 */
	EClass getAudioMixer();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.fmodex.core.ezaudio.AudioMixer#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioMixer#getOut()
	 * @see #getAudioMixer()
	 * @generated
	 */
	EReference getAudioMixer_Out();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioMixer#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Channel</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioMixer#getChannel()
	 * @see #getAudioMixer()
	 * @generated
	 */
	EReference getAudioMixer_Channel();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.Speaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speaker</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.Speaker
	 * @generated
	 */
	EClass getSpeaker();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.FMDSP <em>FMDSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMDSP</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.FMDSP
	 * @generated
	 */
	EClass getFMDSP();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.FMDSP#getFmodex <em>Fmodex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fmodex</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.FMDSP#getFmodex()
	 * @see #getFMDSP()
	 * @generated
	 */
	EAttribute getFMDSP_Fmodex();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.FMDSP#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.FMDSP#getKind()
	 * @see #getFMDSP()
	 * @generated
	 */
	EAttribute getFMDSP_Kind();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioChannelGroup <em>Audio Channel Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Channel Group</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioChannelGroup
	 * @generated
	 */
	EClass getAudioChannelGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioChannelGroup#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioChannelGroup#getChildren()
	 * @see #getAudioChannelGroup()
	 * @generated
	 */
	EReference getAudioChannelGroup_Children();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioChannelGroup#getFmodex <em>Fmodex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fmodex</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioChannelGroup#getFmodex()
	 * @see #getAudioChannelGroup()
	 * @generated
	 */
	EAttribute getAudioChannelGroup_Fmodex();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSound <em>Audio Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Sound</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioSound
	 * @generated
	 */
	EClass getAudioSound();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSound#getFmodex <em>Fmodex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fmodex</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioSound#getFmodex()
	 * @see #getAudioSound()
	 * @generated
	 */
	EAttribute getAudioSound_Fmodex();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSound#getExinfo <em>Exinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exinfo</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioSound#getExinfo()
	 * @see #getAudioSound()
	 * @generated
	 */
	EAttribute getAudioSound_Exinfo();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioReverb <em>Audio Reverb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Reverb</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioReverb
	 * @generated
	 */
	EClass getAudioReverb();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioReverb#getFmodex <em>Fmodex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fmodex</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioReverb#getFmodex()
	 * @see #getAudioReverb()
	 * @generated
	 */
	EAttribute getAudioReverb_Fmodex();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSoundGroup <em>Audio Sound Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Sound Group</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioSoundGroup
	 * @generated
	 */
	EClass getAudioSoundGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSoundGroup#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioSoundGroup#getChildren()
	 * @see #getAudioSoundGroup()
	 * @generated
	 */
	EReference getAudioSoundGroup_Children();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSoundGroup#getFmodex <em>Fmodex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fmodex</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioSoundGroup#getFmodex()
	 * @see #getAudioSoundGroup()
	 * @generated
	 */
	EAttribute getAudioSoundGroup_Fmodex();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.ISound <em>ISound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISound</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.ISound
	 * @generated
	 */
	EClass getISound();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.FMGeometry <em>FM Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FM Geometry</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.FMGeometry
	 * @generated
	 */
	EClass getFMGeometry();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.FMGeometry#getFmodex <em>Fmodex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fmodex</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.FMGeometry#getFmodex()
	 * @see #getFMGeometry()
	 * @generated
	 */
	EAttribute getFMGeometry_Fmodex();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.IChannel <em>IChannel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IChannel</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.IChannel
	 * @generated
	 */
	EClass getIChannel();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.fmodex.core.ezaudio.IChannel#getDspList <em>Dsp List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dsp List</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.IChannel#getDspList()
	 * @see #getIChannel()
	 * @generated
	 */
	EReference getIChannel_DspList();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.Device#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.Device#getID()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_ID();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.fmodex.core.ezaudio.Device#getTrack <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Track</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.Device#getTrack()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Track();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.fmodex.core.ezaudio.Device#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.Device#getChannel()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Channel();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.fmodex.core.ezaudio.TimeTag <em>Time Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Tag</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.TimeTag
	 * @generated
	 */
	EClass getTimeTag();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.TimeTag#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.TimeTag#getTime()
	 * @see #getTimeTag()
	 * @generated
	 */
	EAttribute getTimeTag_Time();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.TimeTag#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.TimeTag#getDuration()
	 * @see #getTimeTag()
	 * @generated
	 */
	EAttribute getTimeTag_Duration();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.fmodex.core.ezaudio.TimeTag#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.TimeTag#getStatus()
	 * @see #getTimeTag()
	 * @generated
	 */
	EAttribute getTimeTag_Status();

	/**
	 * Returns the meta object for data type '{@link org.jouvieje.fmodex.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Channel</em>'.
	 * @see org.jouvieje.fmodex.Channel
	 * @model instanceClass="org.jouvieje.fmodex.Channel"
	 * @generated
	 */
	EDataType getChannel();

	/**
	 * Returns the meta object for data type '{@link org.jouvieje.fmodex.ChannelGroup <em>Channel Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Channel Group</em>'.
	 * @see org.jouvieje.fmodex.ChannelGroup
	 * @model instanceClass="org.jouvieje.fmodex.ChannelGroup"
	 * @generated
	 */
	EDataType getChannelGroup();

	/**
	 * Returns the meta object for data type '{@link org.jouvieje.fmodex.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>System</em>'.
	 * @see org.jouvieje.fmodex.System
	 * @model instanceClass="org.jouvieje.fmodex.System"
	 * @generated
	 */
	EDataType getSystem();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK <em>DSP CALLBACK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DSP CALLBACK</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK
	 * @generated
	 */
	EEnum getDSP_CALLBACK();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK <em>FILE CALLBACK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>FILE CALLBACK</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK
	 * @generated
	 */
	EEnum getFILE_CALLBACK();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.fmodex.core.ezaudio.MEMORY_CALLBACK <em>MEMORY CALLBACK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MEMORY CALLBACK</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.MEMORY_CALLBACK
	 * @generated
	 */
	EEnum getMEMORY_CALLBACK();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.fmodex.core.ezaudio.SOUND_CALLBACK <em>SOUND CALLBACK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SOUND CALLBACK</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.SOUND_CALLBACK
	 * @generated
	 */
	EEnum getSOUND_CALLBACK();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK <em>CODEC CALLBACK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CODEC CALLBACK</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK
	 * @generated
	 */
	EEnum getCODEC_CALLBACK();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.fmodex.core.ezaudio.DSP_KIND <em>DSP KIND</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DSP KIND</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.DSP_KIND
	 * @generated
	 */
	EEnum getDSP_KIND();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.fmodex.core.ezaudio.OPERATION <em>OPERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OPERATION</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.OPERATION
	 * @generated
	 */
	EEnum getOPERATION();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.fmodex.core.ezaudio.STRUCTURES <em>STRUCTURES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>STRUCTURES</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.STRUCTURES
	 * @generated
	 */
	EEnum getSTRUCTURES();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS <em>CLIP STATUS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CLIP STATUS</em>'.
	 * @see net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS
	 * @generated
	 */
	EEnum getCLIP_STATUS();

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EDataType getFile();

	/**
	 * Returns the meta object for data type '{@link org.jouvieje.fmodex.Sound <em>Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sound</em>'.
	 * @see org.jouvieje.fmodex.Sound
	 * @model instanceClass="org.jouvieje.fmodex.Sound"
	 * @generated
	 */
	EDataType getSound();

	/**
	 * Returns the meta object for data type '{@link org.jouvieje.fmodex.DSP <em>DSP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DSP</em>'.
	 * @see org.jouvieje.fmodex.DSP
	 * @model instanceClass="org.jouvieje.fmodex.DSP"
	 * @generated
	 */
	EDataType getDSP();

	/**
	 * Returns the meta object for data type '{@link org.jouvieje.fmodex.Geometry <em>Grometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Grometry</em>'.
	 * @see org.jouvieje.fmodex.Geometry
	 * @model instanceClass="org.jouvieje.fmodex.Geometry"
	 * @generated
	 */
	EDataType getGrometry();

	/**
	 * Returns the meta object for data type '{@link org.jouvieje.fmodex.Reverb <em>Reverb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reverb</em>'.
	 * @see org.jouvieje.fmodex.Reverb
	 * @model instanceClass="org.jouvieje.fmodex.Reverb"
	 * @generated
	 */
	EDataType getReverb();

	/**
	 * Returns the meta object for data type '{@link org.jouvieje.fmodex.SoundGroup <em>Sound Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sound Group</em>'.
	 * @see org.jouvieje.fmodex.SoundGroup
	 * @model instanceClass="org.jouvieje.fmodex.SoundGroup"
	 * @generated
	 */
	EDataType getSoundGroup();

	/**
	 * Returns the meta object for data type '{@link org.jouvieje.fmodex.structures.FMOD_CREATESOUNDEXINFO <em>FMOD CREATESOUNDEXINFO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FMOD CREATESOUNDEXINFO</em>'.
	 * @see org.jouvieje.fmodex.structures.FMOD_CREATESOUNDEXINFO
	 * @model instanceClass="org.jouvieje.fmodex.structures.FMOD_CREATESOUNDEXINFO"
	 * @generated
	 */
	EDataType getFMOD_CREATESOUNDEXINFO();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzaudioFactory getEzaudioFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioSystemImpl <em>Audio System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioSystemImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioSystem()
		 * @generated
		 */
		EClass AUDIO_SYSTEM = eINSTANCE.getAudioSystem();

		/**
		 * The meta object literal for the '<em><b>Fmodex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_SYSTEM__FMODEX = eINSTANCE.getAudioSystem_Fmodex();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioFileImpl <em>Audio File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioFileImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioFile()
		 * @generated
		 */
		EClass AUDIO_FILE = eINSTANCE.getAudioFile();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_FILE__FILE = eINSTANCE.getAudioFile_File();

		/**
		 * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_FILE__EXT = eINSTANCE.getAudioFile_Ext();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioMP3Impl <em>Audio MP3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioMP3Impl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioMP3()
		 * @generated
		 */
		EClass AUDIO_MP3 = eINSTANCE.getAudioMP3();

		/**
		 * The meta object literal for the '<em><b>Sampling Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_MP3__SAMPLING_RATE = eINSTANCE.getAudioMP3_SamplingRate();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioWAVImpl <em>Audio WAV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioWAVImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioWAV()
		 * @generated
		 */
		EClass AUDIO_WAV = eINSTANCE.getAudioWAV();

		/**
		 * The meta object literal for the '<em><b>Sampling Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_WAV__SAMPLING_RATE = eINSTANCE.getAudioWAV_SamplingRate();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioOGGImpl <em>Audio OGG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioOGGImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioOGG()
		 * @generated
		 */
		EClass AUDIO_OGG = eINSTANCE.getAudioOGG();

		/**
		 * The meta object literal for the '<em><b>Sampling Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_OGG__SAMPLING_RATE = eINSTANCE.getAudioOGG_SamplingRate();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioSceneImpl <em>Audio Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioSceneImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioScene()
		 * @generated
		 */
		EClass AUDIO_SCENE = eINSTANCE.getAudioScene();

		/**
		 * The meta object literal for the '<em><b>Clips</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_SCENE__CLIPS = eINSTANCE.getAudioScene_Clips();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_SCENE__LABEL = eINSTANCE.getAudioScene_Label();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl <em>Audio Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioProject()
		 * @generated
		 */
		EClass AUDIO_PROJECT = eINSTANCE.getAudioProject();

		/**
		 * The meta object literal for the '<em><b>Scenes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_PROJECT__SCENES = eINSTANCE.getAudioProject_Scenes();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_PROJECT__TRACKS = eINSTANCE.getAudioProject_Tracks();

		/**
		 * The meta object literal for the '<em><b>Clips</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_PROJECT__CLIPS = eINSTANCE.getAudioProject_Clips();

		/**
		 * The meta object literal for the '<em><b>Audio Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_PROJECT__AUDIO_RESOURCES = eINSTANCE.getAudioProject_AudioResources();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_PROJECT__SYSTEM = eINSTANCE.getAudioProject_System();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_PROJECT__EFFECTS = eINSTANCE.getAudioProject_Effects();

		/**
		 * The meta object literal for the '<em><b>Speakers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_PROJECT__SPEAKERS = eINSTANCE.getAudioProject_Speakers();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_PROJECT__IN = eINSTANCE.getAudioProject_In();

		/**
		 * The meta object literal for the '<em><b>Sounds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_PROJECT__SOUNDS = eINSTANCE.getAudioProject_Sounds();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_PROJECT__CHANNELS = eINSTANCE.getAudioProject_Channels();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_PROJECT__DEVICES = eINSTANCE.getAudioProject_Devices();

		/**
		 * The meta object literal for the '<em><b>Dsp List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_PROJECT__DSP_LIST = eINSTANCE.getAudioProject_DspList();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioTrackImpl <em>Audio Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioTrackImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioTrack()
		 * @generated
		 */
		EClass AUDIO_TRACK = eINSTANCE.getAudioTrack();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_TRACK__CHANNEL = eINSTANCE.getAudioTrack_Channel();

		/**
		 * The meta object literal for the '<em><b>Clips</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_TRACK__CLIPS = eINSTANCE.getAudioTrack_Clips();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_TRACK__LABEL = eINSTANCE.getAudioTrack_Label();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_TRACK__DEVICES = eINSTANCE.getAudioTrack_Devices();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioClipImpl <em>Audio Clip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioClipImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioClip()
		 * @generated
		 */
		EClass AUDIO_CLIP = eINSTANCE.getAudioClip();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_CLIP__FILE = eINSTANCE.getAudioClip_File();

		/**
		 * The meta object literal for the '<em><b>Sound</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_CLIP__SOUND = eINSTANCE.getAudioClip_Sound();

		/**
		 * The meta object literal for the '<em><b>Track</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_CLIP__TRACK = eINSTANCE.getAudioClip_Track();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_CLIP__LABEL = eINSTANCE.getAudioClip_Label();

		/**
		 * The meta object literal for the '<em><b>Time Tag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_CLIP__TIME_TAG = eINSTANCE.getAudioClip_TimeTag();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioMIDIImpl <em>Audio MIDI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioMIDIImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioMIDI()
		 * @generated
		 */
		EClass AUDIO_MIDI = eINSTANCE.getAudioMIDI();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioChannelImpl <em>Audio Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioChannelImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioChannel()
		 * @generated
		 */
		EClass AUDIO_CHANNEL = eINSTANCE.getAudioChannel();

		/**
		 * The meta object literal for the '<em><b>Fmodex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_CHANNEL__FMODEX = eINSTANCE.getAudioChannel_Fmodex();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioMixerImpl <em>Audio Mixer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioMixerImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioMixer()
		 * @generated
		 */
		EClass AUDIO_MIXER = eINSTANCE.getAudioMixer();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_MIXER__OUT = eINSTANCE.getAudioMixer_Out();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_MIXER__CHANNEL = eINSTANCE.getAudioMixer_Channel();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.SpeakerImpl <em>Speaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.SpeakerImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getSpeaker()
		 * @generated
		 */
		EClass SPEAKER = eINSTANCE.getSpeaker();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.InputImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.FMDSPImpl <em>FMDSP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.FMDSPImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getFMDSP()
		 * @generated
		 */
		EClass FMDSP = eINSTANCE.getFMDSP();

		/**
		 * The meta object literal for the '<em><b>Fmodex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMDSP__FMODEX = eINSTANCE.getFMDSP_Fmodex();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMDSP__KIND = eINSTANCE.getFMDSP_Kind();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioChannelGroupImpl <em>Audio Channel Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioChannelGroupImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioChannelGroup()
		 * @generated
		 */
		EClass AUDIO_CHANNEL_GROUP = eINSTANCE.getAudioChannelGroup();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_CHANNEL_GROUP__CHILDREN = eINSTANCE.getAudioChannelGroup_Children();

		/**
		 * The meta object literal for the '<em><b>Fmodex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_CHANNEL_GROUP__FMODEX = eINSTANCE.getAudioChannelGroup_Fmodex();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioSoundImpl <em>Audio Sound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioSoundImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioSound()
		 * @generated
		 */
		EClass AUDIO_SOUND = eINSTANCE.getAudioSound();

		/**
		 * The meta object literal for the '<em><b>Fmodex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_SOUND__FMODEX = eINSTANCE.getAudioSound_Fmodex();

		/**
		 * The meta object literal for the '<em><b>Exinfo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_SOUND__EXINFO = eINSTANCE.getAudioSound_Exinfo();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioReverbImpl <em>Audio Reverb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioReverbImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioReverb()
		 * @generated
		 */
		EClass AUDIO_REVERB = eINSTANCE.getAudioReverb();

		/**
		 * The meta object literal for the '<em><b>Fmodex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_REVERB__FMODEX = eINSTANCE.getAudioReverb_Fmodex();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioSoundGroupImpl <em>Audio Sound Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.AudioSoundGroupImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getAudioSoundGroup()
		 * @generated
		 */
		EClass AUDIO_SOUND_GROUP = eINSTANCE.getAudioSoundGroup();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_SOUND_GROUP__CHILDREN = eINSTANCE.getAudioSoundGroup_Children();

		/**
		 * The meta object literal for the '<em><b>Fmodex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_SOUND_GROUP__FMODEX = eINSTANCE.getAudioSoundGroup_Fmodex();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.ISoundImpl <em>ISound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.ISoundImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getISound()
		 * @generated
		 */
		EClass ISOUND = eINSTANCE.getISound();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.FMGeometryImpl <em>FM Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.FMGeometryImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getFMGeometry()
		 * @generated
		 */
		EClass FM_GEOMETRY = eINSTANCE.getFMGeometry();

		/**
		 * The meta object literal for the '<em><b>Fmodex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FM_GEOMETRY__FMODEX = eINSTANCE.getFMGeometry_Fmodex();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.IChannelImpl <em>IChannel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.IChannelImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getIChannel()
		 * @generated
		 */
		EClass ICHANNEL = eINSTANCE.getIChannel();

		/**
		 * The meta object literal for the '<em><b>Dsp List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICHANNEL__DSP_LIST = eINSTANCE.getIChannel_DspList();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.DeviceImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__ID = eINSTANCE.getDevice_ID();

		/**
		 * The meta object literal for the '<em><b>Track</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__TRACK = eINSTANCE.getDevice_Track();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__CHANNEL = eINSTANCE.getDevice_Channel();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.impl.TimeTagImpl <em>Time Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.TimeTagImpl
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getTimeTag()
		 * @generated
		 */
		EClass TIME_TAG = eINSTANCE.getTimeTag();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TAG__TIME = eINSTANCE.getTimeTag_Time();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TAG__DURATION = eINSTANCE.getTimeTag_Duration();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TAG__STATUS = eINSTANCE.getTimeTag_Status();

		/**
		 * The meta object literal for the '<em>Channel</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jouvieje.fmodex.Channel
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getChannel()
		 * @generated
		 */
		EDataType CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em>Channel Group</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jouvieje.fmodex.ChannelGroup
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getChannelGroup()
		 * @generated
		 */
		EDataType CHANNEL_GROUP = eINSTANCE.getChannelGroup();

		/**
		 * The meta object literal for the '<em>System</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jouvieje.fmodex.System
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getSystem()
		 * @generated
		 */
		EDataType SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK <em>DSP CALLBACK</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.DSP_CALLBACK
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getDSP_CALLBACK()
		 * @generated
		 */
		EEnum DSP_CALLBACK = eINSTANCE.getDSP_CALLBACK();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK <em>FILE CALLBACK</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.FILE_CALLBACK
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getFILE_CALLBACK()
		 * @generated
		 */
		EEnum FILE_CALLBACK = eINSTANCE.getFILE_CALLBACK();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.MEMORY_CALLBACK <em>MEMORY CALLBACK</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.MEMORY_CALLBACK
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getMEMORY_CALLBACK()
		 * @generated
		 */
		EEnum MEMORY_CALLBACK = eINSTANCE.getMEMORY_CALLBACK();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.SOUND_CALLBACK <em>SOUND CALLBACK</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.SOUND_CALLBACK
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getSOUND_CALLBACK()
		 * @generated
		 */
		EEnum SOUND_CALLBACK = eINSTANCE.getSOUND_CALLBACK();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK <em>CODEC CALLBACK</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.CODEC_CALLBACK
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getCODEC_CALLBACK()
		 * @generated
		 */
		EEnum CODEC_CALLBACK = eINSTANCE.getCODEC_CALLBACK();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.DSP_KIND <em>DSP KIND</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.DSP_KIND
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getDSP_KIND()
		 * @generated
		 */
		EEnum DSP_KIND = eINSTANCE.getDSP_KIND();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.OPERATION <em>OPERATION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.OPERATION
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getOPERATION()
		 * @generated
		 */
		EEnum OPERATION = eINSTANCE.getOPERATION();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.STRUCTURES <em>STRUCTURES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.STRUCTURES
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getSTRUCTURES()
		 * @generated
		 */
		EEnum STRUCTURES = eINSTANCE.getSTRUCTURES();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS <em>CLIP STATUS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getCLIP_STATUS()
		 * @generated
		 */
		EEnum CLIP_STATUS = eINSTANCE.getCLIP_STATUS();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em>Sound</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jouvieje.fmodex.Sound
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getSound()
		 * @generated
		 */
		EDataType SOUND = eINSTANCE.getSound();

		/**
		 * The meta object literal for the '<em>DSP</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jouvieje.fmodex.DSP
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getDSP()
		 * @generated
		 */
		EDataType DSP = eINSTANCE.getDSP();

		/**
		 * The meta object literal for the '<em>Grometry</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jouvieje.fmodex.Geometry
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getGrometry()
		 * @generated
		 */
		EDataType GROMETRY = eINSTANCE.getGrometry();

		/**
		 * The meta object literal for the '<em>Reverb</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jouvieje.fmodex.Reverb
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getReverb()
		 * @generated
		 */
		EDataType REVERB = eINSTANCE.getReverb();

		/**
		 * The meta object literal for the '<em>Sound Group</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jouvieje.fmodex.SoundGroup
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getSoundGroup()
		 * @generated
		 */
		EDataType SOUND_GROUP = eINSTANCE.getSoundGroup();

		/**
		 * The meta object literal for the '<em>FMOD CREATESOUNDEXINFO</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jouvieje.fmodex.structures.FMOD_CREATESOUNDEXINFO
		 * @see net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioPackageImpl#getFMOD_CREATESOUNDEXINFO()
		 * @generated
		 */
		EDataType FMOD_CREATESOUNDEXINFO = eINSTANCE.getFMOD_CREATESOUNDEXINFO();

	}

} //EzaudioPackage
