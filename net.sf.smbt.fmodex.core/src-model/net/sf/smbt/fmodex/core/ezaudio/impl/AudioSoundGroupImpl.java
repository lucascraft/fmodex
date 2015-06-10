/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.impl;

import java.util.Collection;

import net.sf.smbt.fmodex.core.ezaudio.AudioSoundGroup;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;
import net.sf.smbt.fmodex.core.ezaudio.ISound;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.jouvieje.fmodex.SoundGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio Sound Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioSoundGroupImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioSoundGroupImpl#getFmodex <em>Fmodex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AudioSoundGroupImpl extends ISoundImpl implements AudioSoundGroup {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ISound> children;

	/**
	 * The default value of the '{@link #getFmodex() <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmodex()
	 * @generated
	 * @ordered
	 */
	protected static final SoundGroup FMODEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFmodex() <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmodex()
	 * @generated
	 * @ordered
	 */
	protected SoundGroup fmodex = FMODEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioSoundGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzaudioPackage.Literals.AUDIO_SOUND_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ISound> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ISound>(ISound.class, this, EzaudioPackage.AUDIO_SOUND_GROUP__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoundGroup getFmodex() {
		return fmodex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFmodex(SoundGroup newFmodex) {
		SoundGroup oldFmodex = fmodex;
		fmodex = newFmodex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_SOUND_GROUP__FMODEX, oldFmodex, fmodex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_SOUND_GROUP__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case EzaudioPackage.AUDIO_SOUND_GROUP__CHILDREN:
				return getChildren();
			case EzaudioPackage.AUDIO_SOUND_GROUP__FMODEX:
				return getFmodex();
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
			case EzaudioPackage.AUDIO_SOUND_GROUP__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ISound>)newValue);
				return;
			case EzaudioPackage.AUDIO_SOUND_GROUP__FMODEX:
				setFmodex((SoundGroup)newValue);
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
			case EzaudioPackage.AUDIO_SOUND_GROUP__CHILDREN:
				getChildren().clear();
				return;
			case EzaudioPackage.AUDIO_SOUND_GROUP__FMODEX:
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
			case EzaudioPackage.AUDIO_SOUND_GROUP__CHILDREN:
				return children != null && !children.isEmpty();
			case EzaudioPackage.AUDIO_SOUND_GROUP__FMODEX:
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

} //AudioSoundGroupImpl
