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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage
 * @generated
 */
public class EzaudioAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzaudioPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzaudioAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzaudioPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzaudioSwitch<Adapter> modelSwitch =
		new EzaudioSwitch<Adapter>() {
			@Override
			public Adapter caseAudioSystem(AudioSystem object) {
				return createAudioSystemAdapter();
			}
			@Override
			public Adapter caseAudioFile(AudioFile object) {
				return createAudioFileAdapter();
			}
			@Override
			public Adapter caseAudioMP3(AudioMP3 object) {
				return createAudioMP3Adapter();
			}
			@Override
			public Adapter caseAudioWAV(AudioWAV object) {
				return createAudioWAVAdapter();
			}
			@Override
			public Adapter caseAudioOGG(AudioOGG object) {
				return createAudioOGGAdapter();
			}
			@Override
			public Adapter caseAudioScene(AudioScene object) {
				return createAudioSceneAdapter();
			}
			@Override
			public Adapter caseAudioProject(AudioProject object) {
				return createAudioProjectAdapter();
			}
			@Override
			public Adapter caseAudioTrack(AudioTrack object) {
				return createAudioTrackAdapter();
			}
			@Override
			public Adapter caseAudioClip(AudioClip object) {
				return createAudioClipAdapter();
			}
			@Override
			public Adapter caseAudioMIDI(AudioMIDI object) {
				return createAudioMIDIAdapter();
			}
			@Override
			public Adapter caseAudioChannel(AudioChannel object) {
				return createAudioChannelAdapter();
			}
			@Override
			public Adapter caseAudioMixer(AudioMixer object) {
				return createAudioMixerAdapter();
			}
			@Override
			public Adapter caseSpeaker(Speaker object) {
				return createSpeakerAdapter();
			}
			@Override
			public Adapter caseInput(Input object) {
				return createInputAdapter();
			}
			@Override
			public Adapter caseFMDSP(FMDSP object) {
				return createFMDSPAdapter();
			}
			@Override
			public Adapter caseAudioChannelGroup(AudioChannelGroup object) {
				return createAudioChannelGroupAdapter();
			}
			@Override
			public Adapter caseAudioSound(AudioSound object) {
				return createAudioSoundAdapter();
			}
			@Override
			public Adapter caseAudioReverb(AudioReverb object) {
				return createAudioReverbAdapter();
			}
			@Override
			public Adapter caseAudioSoundGroup(AudioSoundGroup object) {
				return createAudioSoundGroupAdapter();
			}
			@Override
			public Adapter caseISound(ISound object) {
				return createISoundAdapter();
			}
			@Override
			public Adapter caseFMGeometry(FMGeometry object) {
				return createFMGeometryAdapter();
			}
			@Override
			public Adapter caseIChannel(IChannel object) {
				return createIChannelAdapter();
			}
			@Override
			public Adapter caseDevice(Device object) {
				return createDeviceAdapter();
			}
			@Override
			public Adapter caseTimeTag(TimeTag object) {
				return createTimeTagAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSystem <em>Audio System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioSystem
	 * @generated
	 */
	public Adapter createAudioSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioFile <em>Audio File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioFile
	 * @generated
	 */
	public Adapter createAudioFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioMP3 <em>Audio MP3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioMP3
	 * @generated
	 */
	public Adapter createAudioMP3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioWAV <em>Audio WAV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioWAV
	 * @generated
	 */
	public Adapter createAudioWAVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioOGG <em>Audio OGG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioOGG
	 * @generated
	 */
	public Adapter createAudioOGGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioScene <em>Audio Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioScene
	 * @generated
	 */
	public Adapter createAudioSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject <em>Audio Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioProject
	 * @generated
	 */
	public Adapter createAudioProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioTrack <em>Audio Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioTrack
	 * @generated
	 */
	public Adapter createAudioTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip <em>Audio Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioClip
	 * @generated
	 */
	public Adapter createAudioClipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioMIDI <em>Audio MIDI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioMIDI
	 * @generated
	 */
	public Adapter createAudioMIDIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioChannel <em>Audio Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioChannel
	 * @generated
	 */
	public Adapter createAudioChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioMixer <em>Audio Mixer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioMixer
	 * @generated
	 */
	public Adapter createAudioMixerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.Speaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.Speaker
	 * @generated
	 */
	public Adapter createSpeakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.FMDSP <em>FMDSP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.FMDSP
	 * @generated
	 */
	public Adapter createFMDSPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioChannelGroup <em>Audio Channel Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioChannelGroup
	 * @generated
	 */
	public Adapter createAudioChannelGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSound <em>Audio Sound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioSound
	 * @generated
	 */
	public Adapter createAudioSoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioReverb <em>Audio Reverb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioReverb
	 * @generated
	 */
	public Adapter createAudioReverbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSoundGroup <em>Audio Sound Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.AudioSoundGroup
	 * @generated
	 */
	public Adapter createAudioSoundGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.ISound <em>ISound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.ISound
	 * @generated
	 */
	public Adapter createISoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.FMGeometry <em>FM Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.FMGeometry
	 * @generated
	 */
	public Adapter createFMGeometryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.IChannel <em>IChannel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.IChannel
	 * @generated
	 */
	public Adapter createIChannelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.fmodex.core.ezaudio.TimeTag <em>Time Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.fmodex.core.ezaudio.TimeTag
	 * @generated
	 */
	public Adapter createTimeTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzaudioAdapterFactory
