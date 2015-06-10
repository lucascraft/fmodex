/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.util;

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
import net.sf.smbt.fmodex.core.ezaudio.Device;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;
import net.sf.smbt.fmodex.core.ezaudio.FMDSP;
import net.sf.smbt.fmodex.core.ezaudio.FMGeometry;
import net.sf.smbt.fmodex.core.ezaudio.IChannel;
import net.sf.smbt.fmodex.core.ezaudio.ISound;
import net.sf.smbt.fmodex.core.ezaudio.Input;
import net.sf.smbt.fmodex.core.ezaudio.Speaker;
import net.sf.smbt.fmodex.core.ezaudio.TimeTag;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage
 * @generated
 */
public class EzaudioSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzaudioPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzaudioSwitch() {
		if (modelPackage == null) {
			modelPackage = EzaudioPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EzaudioPackage.AUDIO_SYSTEM: {
				AudioSystem audioSystem = (AudioSystem)theEObject;
				T result = caseAudioSystem(audioSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_FILE: {
				AudioFile audioFile = (AudioFile)theEObject;
				T result = caseAudioFile(audioFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_MP3: {
				AudioMP3 audioMP3 = (AudioMP3)theEObject;
				T result = caseAudioMP3(audioMP3);
				if (result == null) result = caseAudioFile(audioMP3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_WAV: {
				AudioWAV audioWAV = (AudioWAV)theEObject;
				T result = caseAudioWAV(audioWAV);
				if (result == null) result = caseAudioFile(audioWAV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_OGG: {
				AudioOGG audioOGG = (AudioOGG)theEObject;
				T result = caseAudioOGG(audioOGG);
				if (result == null) result = caseAudioFile(audioOGG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_SCENE: {
				AudioScene audioScene = (AudioScene)theEObject;
				T result = caseAudioScene(audioScene);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_PROJECT: {
				AudioProject audioProject = (AudioProject)theEObject;
				T result = caseAudioProject(audioProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_TRACK: {
				AudioTrack audioTrack = (AudioTrack)theEObject;
				T result = caseAudioTrack(audioTrack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_CLIP: {
				AudioClip audioClip = (AudioClip)theEObject;
				T result = caseAudioClip(audioClip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_MIDI: {
				AudioMIDI audioMIDI = (AudioMIDI)theEObject;
				T result = caseAudioMIDI(audioMIDI);
				if (result == null) result = caseAudioFile(audioMIDI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_CHANNEL: {
				AudioChannel audioChannel = (AudioChannel)theEObject;
				T result = caseAudioChannel(audioChannel);
				if (result == null) result = caseIChannel(audioChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_MIXER: {
				AudioMixer audioMixer = (AudioMixer)theEObject;
				T result = caseAudioMixer(audioMixer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.SPEAKER: {
				Speaker speaker = (Speaker)theEObject;
				T result = caseSpeaker(speaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.FMDSP: {
				FMDSP fmdsp = (FMDSP)theEObject;
				T result = caseFMDSP(fmdsp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_CHANNEL_GROUP: {
				AudioChannelGroup audioChannelGroup = (AudioChannelGroup)theEObject;
				T result = caseAudioChannelGroup(audioChannelGroup);
				if (result == null) result = caseIChannel(audioChannelGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_SOUND: {
				AudioSound audioSound = (AudioSound)theEObject;
				T result = caseAudioSound(audioSound);
				if (result == null) result = caseISound(audioSound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_REVERB: {
				AudioReverb audioReverb = (AudioReverb)theEObject;
				T result = caseAudioReverb(audioReverb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.AUDIO_SOUND_GROUP: {
				AudioSoundGroup audioSoundGroup = (AudioSoundGroup)theEObject;
				T result = caseAudioSoundGroup(audioSoundGroup);
				if (result == null) result = caseISound(audioSoundGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.ISOUND: {
				ISound iSound = (ISound)theEObject;
				T result = caseISound(iSound);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.FM_GEOMETRY: {
				FMGeometry fmGeometry = (FMGeometry)theEObject;
				T result = caseFMGeometry(fmGeometry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.ICHANNEL: {
				IChannel iChannel = (IChannel)theEObject;
				T result = caseIChannel(iChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.DEVICE: {
				Device device = (Device)theEObject;
				T result = caseDevice(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EzaudioPackage.TIME_TAG: {
				TimeTag timeTag = (TimeTag)theEObject;
				T result = caseTimeTag(timeTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioSystem(AudioSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioFile(AudioFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio MP3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio MP3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioMP3(AudioMP3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio WAV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio WAV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioWAV(AudioWAV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio OGG</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio OGG</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioOGG(AudioOGG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Scene</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Scene</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioScene(AudioScene object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioProject(AudioProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Track</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Track</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioTrack(AudioTrack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Clip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Clip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioClip(AudioClip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio MIDI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio MIDI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioMIDI(AudioMIDI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioChannel(AudioChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Mixer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Mixer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioMixer(AudioMixer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speaker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speaker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeaker(Speaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMDSP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMDSP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMDSP(FMDSP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Channel Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Channel Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioChannelGroup(AudioChannelGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Sound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Sound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioSound(AudioSound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Reverb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Reverb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioReverb(AudioReverb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio Sound Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio Sound Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudioSoundGroup(AudioSoundGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISound</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISound</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISound(ISound object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FM Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FM Geometry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMGeometry(FMGeometry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IChannel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IChannel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIChannel(IChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeTag(TimeTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EzaudioSwitch
