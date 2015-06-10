/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.impl;

import java.util.Collection;

import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;
import net.sf.smbt.fmodex.core.ezaudio.FMDSP;
import net.sf.smbt.fmodex.core.ezaudio.IChannel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IChannel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.IChannelImpl#getDspList <em>Dsp List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IChannelImpl extends MinimalEObjectImpl.Container implements IChannel {
	/**
	 * The cached value of the '{@link #getDspList() <em>Dsp List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDspList()
	 * @generated
	 * @ordered
	 */
	protected EList<FMDSP> dspList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzaudioPackage.Literals.ICHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FMDSP> getDspList() {
		if (dspList == null) {
			dspList = new EObjectResolvingEList<FMDSP>(FMDSP.class, this, EzaudioPackage.ICHANNEL__DSP_LIST);
		}
		return dspList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzaudioPackage.ICHANNEL__DSP_LIST:
				return getDspList();
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
			case EzaudioPackage.ICHANNEL__DSP_LIST:
				getDspList().clear();
				getDspList().addAll((Collection<? extends FMDSP>)newValue);
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
			case EzaudioPackage.ICHANNEL__DSP_LIST:
				getDspList().clear();
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
			case EzaudioPackage.ICHANNEL__DSP_LIST:
				return dspList != null && !dspList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IChannelImpl
