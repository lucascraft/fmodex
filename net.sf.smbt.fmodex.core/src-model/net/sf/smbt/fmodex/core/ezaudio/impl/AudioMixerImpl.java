/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.impl;

import java.util.Collection;

import net.sf.smbt.fmodex.core.ezaudio.AudioMixer;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;
import net.sf.smbt.fmodex.core.ezaudio.IChannel;
import net.sf.smbt.fmodex.core.ezaudio.Speaker;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio Mixer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioMixerImpl#getOut <em>Out</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioMixerImpl#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AudioMixerImpl extends MinimalEObjectImpl.Container implements AudioMixer {
	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected Speaker out;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected EList<IChannel> channel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioMixerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzaudioPackage.Literals.AUDIO_MIXER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speaker getOut() {
		if (out != null && out.eIsProxy()) {
			InternalEObject oldOut = (InternalEObject)out;
			out = (Speaker)eResolveProxy(oldOut);
			if (out != oldOut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzaudioPackage.AUDIO_MIXER__OUT, oldOut, out));
			}
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speaker basicGetOut() {
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut(Speaker newOut) {
		Speaker oldOut = out;
		out = newOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_MIXER__OUT, oldOut, out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IChannel> getChannel() {
		if (channel == null) {
			channel = new EObjectResolvingEList<IChannel>(IChannel.class, this, EzaudioPackage.AUDIO_MIXER__CHANNEL);
		}
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_MIXER__OUT:
				if (resolve) return getOut();
				return basicGetOut();
			case EzaudioPackage.AUDIO_MIXER__CHANNEL:
				return getChannel();
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
			case EzaudioPackage.AUDIO_MIXER__OUT:
				setOut((Speaker)newValue);
				return;
			case EzaudioPackage.AUDIO_MIXER__CHANNEL:
				getChannel().clear();
				getChannel().addAll((Collection<? extends IChannel>)newValue);
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
			case EzaudioPackage.AUDIO_MIXER__OUT:
				setOut((Speaker)null);
				return;
			case EzaudioPackage.AUDIO_MIXER__CHANNEL:
				getChannel().clear();
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
			case EzaudioPackage.AUDIO_MIXER__OUT:
				return out != null;
			case EzaudioPackage.AUDIO_MIXER__CHANNEL:
				return channel != null && !channel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AudioMixerImpl
