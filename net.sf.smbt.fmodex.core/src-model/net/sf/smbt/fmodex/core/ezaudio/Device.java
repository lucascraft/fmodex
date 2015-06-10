/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.Device#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.Device#getTrack <em>Track</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.Device#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject {

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getDevice_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.Device#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Track</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track</em>' reference.
	 * @see #setTrack(AudioTrack)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getDevice_Track()
	 * @model
	 * @generated
	 */
	AudioTrack getTrack();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.Device#getTrack <em>Track</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track</em>' reference.
	 * @see #getTrack()
	 * @generated
	 */
	void setTrack(AudioTrack value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' reference.
	 * @see #setChannel(AudioChannel)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getDevice_Channel()
	 * @model
	 * @generated
	 */
	AudioChannel getChannel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.Device#getChannel <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' reference.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(AudioChannel value);
} // Device
