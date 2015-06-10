/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.impl;

import net.sf.smbt.fmodex.core.ezaudio.DSP_KIND;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;
import net.sf.smbt.fmodex.core.ezaudio.FMDSP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.jouvieje.fmodex.DSP;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMDSP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.FMDSPImpl#getFmodex <em>Fmodex</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.FMDSPImpl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FMDSPImpl extends MinimalEObjectImpl.Container implements FMDSP {
	/**
	 * The default value of the '{@link #getFmodex() <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmodex()
	 * @generated
	 * @ordered
	 */
	protected static final DSP FMODEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFmodex() <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmodex()
	 * @generated
	 * @ordered
	 */
	protected DSP fmodex = FMODEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final DSP_KIND KIND_EDEFAULT = DSP_KIND.CHORUS;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected DSP_KIND kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMDSPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzaudioPackage.Literals.FMDSP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSP getFmodex() {
		return fmodex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFmodex(DSP newFmodex) {
		DSP oldFmodex = fmodex;
		fmodex = newFmodex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.FMDSP__FMODEX, oldFmodex, fmodex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSP_KIND getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(DSP_KIND newKind) {
		DSP_KIND oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.FMDSP__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzaudioPackage.FMDSP__FMODEX:
				return getFmodex();
			case EzaudioPackage.FMDSP__KIND:
				return getKind();
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
			case EzaudioPackage.FMDSP__FMODEX:
				setFmodex((DSP)newValue);
				return;
			case EzaudioPackage.FMDSP__KIND:
				setKind((DSP_KIND)newValue);
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
			case EzaudioPackage.FMDSP__FMODEX:
				setFmodex(FMODEX_EDEFAULT);
				return;
			case EzaudioPackage.FMDSP__KIND:
				setKind(KIND_EDEFAULT);
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
			case EzaudioPackage.FMDSP__FMODEX:
				return FMODEX_EDEFAULT == null ? fmodex != null : !FMODEX_EDEFAULT.equals(fmodex);
			case EzaudioPackage.FMDSP__KIND:
				return kind != KIND_EDEFAULT;
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
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //FMDSPImpl
