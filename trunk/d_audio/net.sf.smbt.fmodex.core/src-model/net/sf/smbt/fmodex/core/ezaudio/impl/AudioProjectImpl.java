/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.impl;

import java.util.Collection;

import net.sf.smbt.fmodex.core.ezaudio.AudioClip;
import net.sf.smbt.fmodex.core.ezaudio.AudioFile;
import net.sf.smbt.fmodex.core.ezaudio.AudioMixer;
import net.sf.smbt.fmodex.core.ezaudio.AudioProject;
import net.sf.smbt.fmodex.core.ezaudio.AudioScene;
import net.sf.smbt.fmodex.core.ezaudio.AudioSystem;
import net.sf.smbt.fmodex.core.ezaudio.AudioTrack;
import net.sf.smbt.fmodex.core.ezaudio.Device;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;
import net.sf.smbt.fmodex.core.ezaudio.FMDSP;
import net.sf.smbt.fmodex.core.ezaudio.IChannel;
import net.sf.smbt.fmodex.core.ezaudio.ISound;
import net.sf.smbt.fmodex.core.ezaudio.Input;
import net.sf.smbt.fmodex.core.ezaudio.Speaker;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl#getScenes <em>Scenes</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl#getClips <em>Clips</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl#getAudioResources <em>Audio Resources</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl#getSystem <em>System</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl#getSpeakers <em>Speakers</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl#getIn <em>In</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl#getSounds <em>Sounds</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl#getDspList <em>Dsp List</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl#getChannels <em>Channels</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioProjectImpl#getDevices <em>Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AudioProjectImpl extends MinimalEObjectImpl.Container implements AudioProject {
	/**
	 * The cached value of the '{@link #getScenes() <em>Scenes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenes()
	 * @generated
	 * @ordered
	 */
	protected EList<AudioScene> scenes;

	/**
	 * The cached value of the '{@link #getTracks() <em>Tracks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<AudioTrack> tracks;

	/**
	 * The cached value of the '{@link #getClips() <em>Clips</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClips()
	 * @generated
	 * @ordered
	 */
	protected EList<AudioClip> clips;

	/**
	 * The cached value of the '{@link #getAudioResources() <em>Audio Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioResources()
	 * @generated
	 * @ordered
	 */
	protected EList<AudioFile> audioResources;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected AudioSystem system;

	/**
	 * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<AudioMixer> effects;

	/**
	 * The cached value of the '{@link #getSpeakers() <em>Speakers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeakers()
	 * @generated
	 * @ordered
	 */
	protected EList<Speaker> speakers;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> in;

	/**
	 * The cached value of the '{@link #getSounds() <em>Sounds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSounds()
	 * @generated
	 * @ordered
	 */
	protected EList<ISound> sounds;

	/**
	 * The cached value of the '{@link #getDspList() <em>Dsp List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDspList()
	 * @generated
	 * @ordered
	 */
	protected EList<FMDSP> dspList;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected EList<IChannel> channels;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzaudioPackage.Literals.AUDIO_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AudioScene> getScenes() {
		if (scenes == null) {
			scenes = new EObjectContainmentEList<AudioScene>(AudioScene.class, this, EzaudioPackage.AUDIO_PROJECT__SCENES);
		}
		return scenes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AudioTrack> getTracks() {
		if (tracks == null) {
			tracks = new EObjectContainmentEList<AudioTrack>(AudioTrack.class, this, EzaudioPackage.AUDIO_PROJECT__TRACKS);
		}
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AudioClip> getClips() {
		if (clips == null) {
			clips = new EObjectContainmentEList<AudioClip>(AudioClip.class, this, EzaudioPackage.AUDIO_PROJECT__CLIPS);
		}
		return clips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AudioFile> getAudioResources() {
		if (audioResources == null) {
			audioResources = new EObjectContainmentEList<AudioFile>(AudioFile.class, this, EzaudioPackage.AUDIO_PROJECT__AUDIO_RESOURCES);
		}
		return audioResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioSystem getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(AudioSystem newSystem, NotificationChain msgs) {
		AudioSystem oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_PROJECT__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(AudioSystem newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EzaudioPackage.AUDIO_PROJECT__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EzaudioPackage.AUDIO_PROJECT__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_PROJECT__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AudioMixer> getEffects() {
		if (effects == null) {
			effects = new EObjectContainmentEList<AudioMixer>(AudioMixer.class, this, EzaudioPackage.AUDIO_PROJECT__EFFECTS);
		}
		return effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Speaker> getSpeakers() {
		if (speakers == null) {
			speakers = new EObjectContainmentEList<Speaker>(Speaker.class, this, EzaudioPackage.AUDIO_PROJECT__SPEAKERS);
		}
		return speakers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Input> getIn() {
		if (in == null) {
			in = new EObjectContainmentEList<Input>(Input.class, this, EzaudioPackage.AUDIO_PROJECT__IN);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISound> getSounds() {
		if (sounds == null) {
			sounds = new EObjectContainmentEList<ISound>(ISound.class, this, EzaudioPackage.AUDIO_PROJECT__SOUNDS);
		}
		return sounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IChannel> getChannels() {
		if (channels == null) {
			channels = new EObjectContainmentEList<IChannel>(IChannel.class, this, EzaudioPackage.AUDIO_PROJECT__CHANNELS);
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentEList<Device>(Device.class, this, EzaudioPackage.AUDIO_PROJECT__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FMDSP> getDspList() {
		if (dspList == null) {
			dspList = new EObjectContainmentEList<FMDSP>(FMDSP.class, this, EzaudioPackage.AUDIO_PROJECT__DSP_LIST);
		}
		return dspList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_PROJECT__SCENES:
				return ((InternalEList<?>)getScenes()).basicRemove(otherEnd, msgs);
			case EzaudioPackage.AUDIO_PROJECT__TRACKS:
				return ((InternalEList<?>)getTracks()).basicRemove(otherEnd, msgs);
			case EzaudioPackage.AUDIO_PROJECT__CLIPS:
				return ((InternalEList<?>)getClips()).basicRemove(otherEnd, msgs);
			case EzaudioPackage.AUDIO_PROJECT__AUDIO_RESOURCES:
				return ((InternalEList<?>)getAudioResources()).basicRemove(otherEnd, msgs);
			case EzaudioPackage.AUDIO_PROJECT__SYSTEM:
				return basicSetSystem(null, msgs);
			case EzaudioPackage.AUDIO_PROJECT__EFFECTS:
				return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
			case EzaudioPackage.AUDIO_PROJECT__SPEAKERS:
				return ((InternalEList<?>)getSpeakers()).basicRemove(otherEnd, msgs);
			case EzaudioPackage.AUDIO_PROJECT__IN:
				return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
			case EzaudioPackage.AUDIO_PROJECT__SOUNDS:
				return ((InternalEList<?>)getSounds()).basicRemove(otherEnd, msgs);
			case EzaudioPackage.AUDIO_PROJECT__DSP_LIST:
				return ((InternalEList<?>)getDspList()).basicRemove(otherEnd, msgs);
			case EzaudioPackage.AUDIO_PROJECT__CHANNELS:
				return ((InternalEList<?>)getChannels()).basicRemove(otherEnd, msgs);
			case EzaudioPackage.AUDIO_PROJECT__DEVICES:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_PROJECT__SCENES:
				return getScenes();
			case EzaudioPackage.AUDIO_PROJECT__TRACKS:
				return getTracks();
			case EzaudioPackage.AUDIO_PROJECT__CLIPS:
				return getClips();
			case EzaudioPackage.AUDIO_PROJECT__AUDIO_RESOURCES:
				return getAudioResources();
			case EzaudioPackage.AUDIO_PROJECT__SYSTEM:
				return getSystem();
			case EzaudioPackage.AUDIO_PROJECT__EFFECTS:
				return getEffects();
			case EzaudioPackage.AUDIO_PROJECT__SPEAKERS:
				return getSpeakers();
			case EzaudioPackage.AUDIO_PROJECT__IN:
				return getIn();
			case EzaudioPackage.AUDIO_PROJECT__SOUNDS:
				return getSounds();
			case EzaudioPackage.AUDIO_PROJECT__DSP_LIST:
				return getDspList();
			case EzaudioPackage.AUDIO_PROJECT__CHANNELS:
				return getChannels();
			case EzaudioPackage.AUDIO_PROJECT__DEVICES:
				return getDevices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_PROJECT__SCENES:
				getScenes().clear();
				getScenes().addAll((Collection<? extends AudioScene>)newValue);
				return;
			case EzaudioPackage.AUDIO_PROJECT__TRACKS:
				getTracks().clear();
				getTracks().addAll((Collection<? extends AudioTrack>)newValue);
				return;
			case EzaudioPackage.AUDIO_PROJECT__CLIPS:
				getClips().clear();
				getClips().addAll((Collection<? extends AudioClip>)newValue);
				return;
			case EzaudioPackage.AUDIO_PROJECT__AUDIO_RESOURCES:
				getAudioResources().clear();
				getAudioResources().addAll((Collection<? extends AudioFile>)newValue);
				return;
			case EzaudioPackage.AUDIO_PROJECT__SYSTEM:
				setSystem((AudioSystem)newValue);
				return;
			case EzaudioPackage.AUDIO_PROJECT__EFFECTS:
				getEffects().clear();
				getEffects().addAll((Collection<? extends AudioMixer>)newValue);
				return;
			case EzaudioPackage.AUDIO_PROJECT__SPEAKERS:
				getSpeakers().clear();
				getSpeakers().addAll((Collection<? extends Speaker>)newValue);
				return;
			case EzaudioPackage.AUDIO_PROJECT__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends Input>)newValue);
				return;
			case EzaudioPackage.AUDIO_PROJECT__SOUNDS:
				getSounds().clear();
				getSounds().addAll((Collection<? extends ISound>)newValue);
				return;
			case EzaudioPackage.AUDIO_PROJECT__DSP_LIST:
				getDspList().clear();
				getDspList().addAll((Collection<? extends FMDSP>)newValue);
				return;
			case EzaudioPackage.AUDIO_PROJECT__CHANNELS:
				getChannels().clear();
				getChannels().addAll((Collection<? extends IChannel>)newValue);
				return;
			case EzaudioPackage.AUDIO_PROJECT__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Device>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_PROJECT__SCENES:
				getScenes().clear();
				return;
			case EzaudioPackage.AUDIO_PROJECT__TRACKS:
				getTracks().clear();
				return;
			case EzaudioPackage.AUDIO_PROJECT__CLIPS:
				getClips().clear();
				return;
			case EzaudioPackage.AUDIO_PROJECT__AUDIO_RESOURCES:
				getAudioResources().clear();
				return;
			case EzaudioPackage.AUDIO_PROJECT__SYSTEM:
				setSystem((AudioSystem)null);
				return;
			case EzaudioPackage.AUDIO_PROJECT__EFFECTS:
				getEffects().clear();
				return;
			case EzaudioPackage.AUDIO_PROJECT__SPEAKERS:
				getSpeakers().clear();
				return;
			case EzaudioPackage.AUDIO_PROJECT__IN:
				getIn().clear();
				return;
			case EzaudioPackage.AUDIO_PROJECT__SOUNDS:
				getSounds().clear();
				return;
			case EzaudioPackage.AUDIO_PROJECT__DSP_LIST:
				getDspList().clear();
				return;
			case EzaudioPackage.AUDIO_PROJECT__CHANNELS:
				getChannels().clear();
				return;
			case EzaudioPackage.AUDIO_PROJECT__DEVICES:
				getDevices().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_PROJECT__SCENES:
				return scenes != null && !scenes.isEmpty();
			case EzaudioPackage.AUDIO_PROJECT__TRACKS:
				return tracks != null && !tracks.isEmpty();
			case EzaudioPackage.AUDIO_PROJECT__CLIPS:
				return clips != null && !clips.isEmpty();
			case EzaudioPackage.AUDIO_PROJECT__AUDIO_RESOURCES:
				return audioResources != null && !audioResources.isEmpty();
			case EzaudioPackage.AUDIO_PROJECT__SYSTEM:
				return system != null;
			case EzaudioPackage.AUDIO_PROJECT__EFFECTS:
				return effects != null && !effects.isEmpty();
			case EzaudioPackage.AUDIO_PROJECT__SPEAKERS:
				return speakers != null && !speakers.isEmpty();
			case EzaudioPackage.AUDIO_PROJECT__IN:
				return in != null && !in.isEmpty();
			case EzaudioPackage.AUDIO_PROJECT__SOUNDS:
				return sounds != null && !sounds.isEmpty();
			case EzaudioPackage.AUDIO_PROJECT__DSP_LIST:
				return dspList != null && !dspList.isEmpty();
			case EzaudioPackage.AUDIO_PROJECT__CHANNELS:
				return channels != null && !channels.isEmpty();
			case EzaudioPackage.AUDIO_PROJECT__DEVICES:
				return devices != null && !devices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AudioProjectImpl
