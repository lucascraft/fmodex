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
 * A representation of the model object '<em><b>Audio Mixer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioMixer#getOut <em>Out</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioMixer#getChannel <em>Channel</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioMixer()
 * @model
 * @generated
 */
public interface AudioMixer extends EObject {
	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference.
	 * @see #setOut(Speaker)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioMixer_Out()
	 * @model
	 * @generated
	 */
	Speaker getOut();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioMixer#getOut <em>Out</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(Speaker value);

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.IChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioMixer_Channel()
	 * @model
	 * @generated
	 */
	EList<IChannel> getChannel();

} // AudioMixer
