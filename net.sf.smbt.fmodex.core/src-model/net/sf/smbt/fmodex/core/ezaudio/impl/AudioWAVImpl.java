/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.impl;

import net.sf.smbt.fmodex.core.ezaudio.AudioWAV;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio WAV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioWAVImpl#getSamplingRate <em>Sampling Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AudioWAVImpl extends AudioFileImpl implements AudioWAV {
	/**
	 * The default value of the '{@link #getSamplingRate() <em>Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingRate()
	 * @generated
	 * @ordered
	 */
	protected static final float SAMPLING_RATE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSamplingRate() <em>Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSamplingRate()
	 * @generated
	 * @ordered
	 */
	protected float samplingRate = SAMPLING_RATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioWAVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzaudioPackage.Literals.AUDIO_WAV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSamplingRate() {
		return samplingRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSamplingRate(float newSamplingRate) {
		float oldSamplingRate = samplingRate;
		samplingRate = newSamplingRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_WAV__SAMPLING_RATE, oldSamplingRate, samplingRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_WAV__SAMPLING_RATE:
				return getSamplingRate();
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
			case EzaudioPackage.AUDIO_WAV__SAMPLING_RATE:
				setSamplingRate((Float)newValue);
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
			case EzaudioPackage.AUDIO_WAV__SAMPLING_RATE:
				setSamplingRate(SAMPLING_RATE_EDEFAULT);
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
			case EzaudioPackage.AUDIO_WAV__SAMPLING_RATE:
				return samplingRate != SAMPLING_RATE_EDEFAULT;
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
		result.append(" (samplingRate: ");
		result.append(samplingRate);
		result.append(')');
		return result.toString();
	}

} //AudioWAVImpl
