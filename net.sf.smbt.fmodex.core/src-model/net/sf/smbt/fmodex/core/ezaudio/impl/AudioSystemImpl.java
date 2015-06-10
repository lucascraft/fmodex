/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.impl;

import net.sf.smbt.fmodex.core.ezaudio.AudioSystem;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioSystemImpl#getFmodex <em>Fmodex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AudioSystemImpl extends MinimalEObjectImpl.Container implements AudioSystem {
	/**
	 * The default value of the '{@link #getFmodex() <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmodex()
	 * @generated
	 * @ordered
	 */
	protected static final org.jouvieje.fmodex.System FMODEX_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFmodex() <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmodex()
	 * @generated
	 * @ordered
	 */
	protected org.jouvieje.fmodex.System fmodex = FMODEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzaudioPackage.Literals.AUDIO_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.jouvieje.fmodex.System getFmodex() {
		return fmodex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFmodex(org.jouvieje.fmodex.System newFmodex) {
		org.jouvieje.fmodex.System oldFmodex = fmodex;
		fmodex = newFmodex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_SYSTEM__FMODEX, oldFmodex, fmodex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_SYSTEM__FMODEX:
				return getFmodex();
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
			case EzaudioPackage.AUDIO_SYSTEM__FMODEX:
				setFmodex((org.jouvieje.fmodex.System)newValue);
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
			case EzaudioPackage.AUDIO_SYSTEM__FMODEX:
				setFmodex(FMODEX_EDEFAULT);
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
			case EzaudioPackage.AUDIO_SYSTEM__FMODEX:
				return FMODEX_EDEFAULT == null ? fmodex != null : !FMODEX_EDEFAULT.equals(fmodex);
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
		result.append(" (fmodex: ");
		result.append(fmodex);
		result.append(')');
		return result.toString();
	}

} //AudioSystemImpl
