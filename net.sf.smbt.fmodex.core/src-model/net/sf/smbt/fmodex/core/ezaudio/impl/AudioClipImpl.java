/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.impl;

import net.sf.smbt.fmodex.core.ezaudio.AudioClip;
import net.sf.smbt.fmodex.core.ezaudio.AudioFile;
import net.sf.smbt.fmodex.core.ezaudio.AudioSound;
import net.sf.smbt.fmodex.core.ezaudio.AudioTrack;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;
import net.sf.smbt.fmodex.core.ezaudio.TimeTag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio Clip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioClipImpl#getFile <em>File</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioClipImpl#getSound <em>Sound</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioClipImpl#getTrack <em>Track</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioClipImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioClipImpl#getTimeTag <em>Time Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AudioClipImpl extends MinimalEObjectImpl.Container implements AudioClip {
	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected AudioFile file;

	/**
	 * The cached value of the '{@link #getSound() <em>Sound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSound()
	 * @generated
	 * @ordered
	 */
	protected AudioSound sound;

	/**
	 * The cached value of the '{@link #getTrack() <em>Track</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrack()
	 * @generated
	 * @ordered
	 */
	protected AudioTrack track;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeTag() <em>Time Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeTag()
	 * @generated
	 * @ordered
	 */
	protected TimeTag timeTag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioClipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzaudioPackage.Literals.AUDIO_CLIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioFile getFile() {
		if (file != null && file.eIsProxy()) {
			InternalEObject oldFile = (InternalEObject)file;
			file = (AudioFile)eResolveProxy(oldFile);
			if (file != oldFile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzaudioPackage.AUDIO_CLIP__FILE, oldFile, file));
			}
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioFile basicGetFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(AudioFile newFile) {
		AudioFile oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_CLIP__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioSound getSound() {
		if (sound != null && sound.eIsProxy()) {
			InternalEObject oldSound = (InternalEObject)sound;
			sound = (AudioSound)eResolveProxy(oldSound);
			if (sound != oldSound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzaudioPackage.AUDIO_CLIP__SOUND, oldSound, sound));
			}
		}
		return sound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioSound basicGetSound() {
		return sound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSound(AudioSound newSound) {
		AudioSound oldSound = sound;
		sound = newSound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_CLIP__SOUND, oldSound, sound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioTrack getTrack() {
		if (track != null && track.eIsProxy()) {
			InternalEObject oldTrack = (InternalEObject)track;
			track = (AudioTrack)eResolveProxy(oldTrack);
			if (track != oldTrack) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzaudioPackage.AUDIO_CLIP__TRACK, oldTrack, track));
			}
		}
		return track;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioTrack basicGetTrack() {
		return track;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrack(AudioTrack newTrack) {
		AudioTrack oldTrack = track;
		track = newTrack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_CLIP__TRACK, oldTrack, track));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_CLIP__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTag getTimeTag() {
		return timeTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeTag(TimeTag newTimeTag, NotificationChain msgs) {
		TimeTag oldTimeTag = timeTag;
		timeTag = newTimeTag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_CLIP__TIME_TAG, oldTimeTag, newTimeTag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeTag(TimeTag newTimeTag) {
		if (newTimeTag != timeTag) {
			NotificationChain msgs = null;
			if (timeTag != null)
				msgs = ((InternalEObject)timeTag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EzaudioPackage.AUDIO_CLIP__TIME_TAG, null, msgs);
			if (newTimeTag != null)
				msgs = ((InternalEObject)newTimeTag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EzaudioPackage.AUDIO_CLIP__TIME_TAG, null, msgs);
			msgs = basicSetTimeTag(newTimeTag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_CLIP__TIME_TAG, newTimeTag, newTimeTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_CLIP__TIME_TAG:
				return basicSetTimeTag(null, msgs);
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
			case EzaudioPackage.AUDIO_CLIP__FILE:
				if (resolve) return getFile();
				return basicGetFile();
			case EzaudioPackage.AUDIO_CLIP__SOUND:
				if (resolve) return getSound();
				return basicGetSound();
			case EzaudioPackage.AUDIO_CLIP__TRACK:
				if (resolve) return getTrack();
				return basicGetTrack();
			case EzaudioPackage.AUDIO_CLIP__LABEL:
				return getLabel();
			case EzaudioPackage.AUDIO_CLIP__TIME_TAG:
				return getTimeTag();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_CLIP__FILE:
				setFile((AudioFile)newValue);
				return;
			case EzaudioPackage.AUDIO_CLIP__SOUND:
				setSound((AudioSound)newValue);
				return;
			case EzaudioPackage.AUDIO_CLIP__TRACK:
				setTrack((AudioTrack)newValue);
				return;
			case EzaudioPackage.AUDIO_CLIP__LABEL:
				setLabel((String)newValue);
				return;
			case EzaudioPackage.AUDIO_CLIP__TIME_TAG:
				setTimeTag((TimeTag)newValue);
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
			case EzaudioPackage.AUDIO_CLIP__FILE:
				setFile((AudioFile)null);
				return;
			case EzaudioPackage.AUDIO_CLIP__SOUND:
				setSound((AudioSound)null);
				return;
			case EzaudioPackage.AUDIO_CLIP__TRACK:
				setTrack((AudioTrack)null);
				return;
			case EzaudioPackage.AUDIO_CLIP__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case EzaudioPackage.AUDIO_CLIP__TIME_TAG:
				setTimeTag((TimeTag)null);
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
			case EzaudioPackage.AUDIO_CLIP__FILE:
				return file != null;
			case EzaudioPackage.AUDIO_CLIP__SOUND:
				return sound != null;
			case EzaudioPackage.AUDIO_CLIP__TRACK:
				return track != null;
			case EzaudioPackage.AUDIO_CLIP__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case EzaudioPackage.AUDIO_CLIP__TIME_TAG:
				return timeTag != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //AudioClipImpl
