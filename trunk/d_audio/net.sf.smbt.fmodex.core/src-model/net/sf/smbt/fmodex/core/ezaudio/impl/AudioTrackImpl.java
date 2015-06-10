/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.impl;

import java.util.Collection;

import net.sf.smbt.fmodex.core.ezaudio.AudioClip;
import net.sf.smbt.fmodex.core.ezaudio.AudioTrack;
import net.sf.smbt.fmodex.core.ezaudio.Device;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;
import net.sf.smbt.fmodex.core.ezaudio.IChannel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioTrackImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioTrackImpl#getClips <em>Clips</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioTrackImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioTrackImpl#getDevices <em>Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AudioTrackImpl extends MinimalEObjectImpl.Container implements AudioTrack {
	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected IChannel channel;

	/**
	 * The cached value of the '{@link #getClips() <em>Clips</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClips()
	 * @generated
	 * @ordered
	 */
	protected EList<AudioClip> clips;

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
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' reference list.
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
	protected AudioTrackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzaudioPackage.Literals.AUDIO_TRACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IChannel getChannel() {
		if (channel != null && channel.eIsProxy()) {
			InternalEObject oldChannel = (InternalEObject)channel;
			channel = (IChannel)eResolveProxy(oldChannel);
			if (channel != oldChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzaudioPackage.AUDIO_TRACK__CHANNEL, oldChannel, channel));
			}
		}
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IChannel basicGetChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(IChannel newChannel) {
		IChannel oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_TRACK__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AudioClip> getClips() {
		if (clips == null) {
			clips = new EObjectResolvingEList<AudioClip>(AudioClip.class, this, EzaudioPackage.AUDIO_TRACK__CLIPS);
		}
		return clips;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_TRACK__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectResolvingEList<Device>(Device.class, this, EzaudioPackage.AUDIO_TRACK__DEVICES);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_TRACK__CHANNEL:
				if (resolve) return getChannel();
				return basicGetChannel();
			case EzaudioPackage.AUDIO_TRACK__CLIPS:
				return getClips();
			case EzaudioPackage.AUDIO_TRACK__LABEL:
				return getLabel();
			case EzaudioPackage.AUDIO_TRACK__DEVICES:
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
			case EzaudioPackage.AUDIO_TRACK__CHANNEL:
				setChannel((IChannel)newValue);
				return;
			case EzaudioPackage.AUDIO_TRACK__CLIPS:
				getClips().clear();
				getClips().addAll((Collection<? extends AudioClip>)newValue);
				return;
			case EzaudioPackage.AUDIO_TRACK__LABEL:
				setLabel((String)newValue);
				return;
			case EzaudioPackage.AUDIO_TRACK__DEVICES:
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
			case EzaudioPackage.AUDIO_TRACK__CHANNEL:
				setChannel((IChannel)null);
				return;
			case EzaudioPackage.AUDIO_TRACK__CLIPS:
				getClips().clear();
				return;
			case EzaudioPackage.AUDIO_TRACK__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case EzaudioPackage.AUDIO_TRACK__DEVICES:
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
			case EzaudioPackage.AUDIO_TRACK__CHANNEL:
				return channel != null;
			case EzaudioPackage.AUDIO_TRACK__CLIPS:
				return clips != null && !clips.isEmpty();
			case EzaudioPackage.AUDIO_TRACK__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case EzaudioPackage.AUDIO_TRACK__DEVICES:
				return devices != null && !devices.isEmpty();
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

} //AudioTrackImpl
