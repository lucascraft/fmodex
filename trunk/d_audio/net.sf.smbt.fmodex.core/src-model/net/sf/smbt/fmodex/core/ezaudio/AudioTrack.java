/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getChannel <em>Channel</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getClips <em>Clips</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getDevices <em>Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioTrack()
 * @model
 * @generated
 */
public interface AudioTrack extends EObject {
	/**
	 * Returns the value of the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' reference.
	 * @see #setChannel(IChannel)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioTrack_Channel()
	 * @model
	 * @generated
	 */
	IChannel getChannel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getChannel <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' reference.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(IChannel value);

	/**
	 * Returns the value of the '<em><b>Clips</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.AudioClip}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clips</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clips</em>' reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioTrack_Clips()
	 * @model
	 * @generated
	 */
	EList<AudioClip> getClips();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioTrack_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioTrack_Label()
	 * @model
	 * @generated
	 */

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioTrack#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioTrack_Devices()
	 * @model
	 * @generated
	 */
	EList<Device> getDevices();

} // AudioTrack
