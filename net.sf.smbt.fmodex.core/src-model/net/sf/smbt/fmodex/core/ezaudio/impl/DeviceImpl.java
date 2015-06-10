/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.impl;

import net.sf.smbt.fmodex.core.ezaudio.AudioChannel;
import net.sf.smbt.fmodex.core.ezaudio.AudioTrack;
import net.sf.smbt.fmodex.core.ezaudio.Device;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.DeviceImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.DeviceImpl#getTrack <em>Track</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.DeviceImpl#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;
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
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected AudioChannel channel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzaudioPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.DEVICE__ID, oldID, id));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzaudioPackage.DEVICE__TRACK, oldTrack, track));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.DEVICE__TRACK, oldTrack, track));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioChannel getChannel() {
		if (channel != null && channel.eIsProxy()) {
			InternalEObject oldChannel = (InternalEObject)channel;
			channel = (AudioChannel)eResolveProxy(oldChannel);
			if (channel != oldChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzaudioPackage.DEVICE__CHANNEL, oldChannel, channel));
			}
		}
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioChannel basicGetChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(AudioChannel newChannel) {
		AudioChannel oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.DEVICE__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzaudioPackage.DEVICE__ID:
				return getID();
			case EzaudioPackage.DEVICE__TRACK:
				if (resolve) return getTrack();
				return basicGetTrack();
			case EzaudioPackage.DEVICE__CHANNEL:
				if (resolve) return getChannel();
				return basicGetChannel();
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
			case EzaudioPackage.DEVICE__ID:
				setID((String)newValue);
				return;
			case EzaudioPackage.DEVICE__TRACK:
				setTrack((AudioTrack)newValue);
				return;
			case EzaudioPackage.DEVICE__CHANNEL:
				setChannel((AudioChannel)newValue);
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
			case EzaudioPackage.DEVICE__ID:
				setID(ID_EDEFAULT);
				return;
			case EzaudioPackage.DEVICE__TRACK:
				setTrack((AudioTrack)null);
				return;
			case EzaudioPackage.DEVICE__CHANNEL:
				setChannel((AudioChannel)null);
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
			case EzaudioPackage.DEVICE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EzaudioPackage.DEVICE__TRACK:
				return track != null;
			case EzaudioPackage.DEVICE__CHANNEL:
				return channel != null;
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
