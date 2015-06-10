/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.impl;

import net.sf.smbt.fmodex.core.ezaudio.AudioSound;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.jouvieje.fmodex.Sound;
import org.jouvieje.fmodex.structures.FMOD_CREATESOUNDEXINFO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio Sound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioSoundImpl#getFmodex <em>Fmodex</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioSoundImpl#getExinfo <em>Exinfo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AudioSoundImpl extends ISoundImpl implements AudioSound {
	/**
	 * The default value of the '{@link #getFmodex() <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmodex()
	 * @generated
	 * @ordered
	 */
	protected static final Sound FMODEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFmodex() <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmodex()
	 * @generated
	 * @ordered
	 */
	protected Sound fmodex = FMODEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getExinfo() <em>Exinfo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExinfo()
	 * @generated
	 * @ordered
	 */
	protected static final FMOD_CREATESOUNDEXINFO EXINFO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExinfo() <em>Exinfo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExinfo()
	 * @generated
	 * @ordered
	 */
	protected FMOD_CREATESOUNDEXINFO exinfo = EXINFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioSoundImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzaudioPackage.Literals.AUDIO_SOUND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sound getFmodex() {
		return fmodex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFmodex(Sound newFmodex) {
		Sound oldFmodex = fmodex;
		fmodex = newFmodex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_SOUND__FMODEX, oldFmodex, fmodex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMOD_CREATESOUNDEXINFO getExinfo() {
		return exinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExinfo(FMOD_CREATESOUNDEXINFO newExinfo) {
		FMOD_CREATESOUNDEXINFO oldExinfo = exinfo;
		exinfo = newExinfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_SOUND__EXINFO, oldExinfo, exinfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_SOUND__FMODEX:
				return getFmodex();
			case EzaudioPackage.AUDIO_SOUND__EXINFO:
				return getExinfo();
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
			case EzaudioPackage.AUDIO_SOUND__FMODEX:
				setFmodex((Sound)newValue);
				return;
			case EzaudioPackage.AUDIO_SOUND__EXINFO:
				setExinfo((FMOD_CREATESOUNDEXINFO)newValue);
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
			case EzaudioPackage.AUDIO_SOUND__FMODEX:
				setFmodex(FMODEX_EDEFAULT);
				return;
			case EzaudioPackage.AUDIO_SOUND__EXINFO:
				setExinfo(EXINFO_EDEFAULT);
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
			case EzaudioPackage.AUDIO_SOUND__FMODEX:
				return FMODEX_EDEFAULT == null ? fmodex != null : !FMODEX_EDEFAULT.equals(fmodex);
			case EzaudioPackage.AUDIO_SOUND__EXINFO:
				return EXINFO_EDEFAULT == null ? exinfo != null : !EXINFO_EDEFAULT.equals(exinfo);
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
		result.append(", exinfo: ");
		result.append(exinfo);
		result.append(')');
		return result.toString();
	}

} //AudioSoundImpl
