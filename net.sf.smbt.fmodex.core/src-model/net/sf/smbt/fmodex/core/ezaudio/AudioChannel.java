/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;

import org.jouvieje.fmodex.Channel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioChannel#getFmodex <em>Fmodex</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioChannel()
 * @model
 * @generated
 */
public interface AudioChannel extends IChannel {

	/**
	 * Returns the value of the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fmodex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmodex</em>' attribute.
	 * @see #setFmodex(Channel)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioChannel_Fmodex()
	 * @model dataType="net.sf.smbt.fmodex.core.ezaudio.Channel"
	 * @generated
	 */
	Channel getFmodex();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioChannel#getFmodex <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fmodex</em>' attribute.
	 * @see #getFmodex()
	 * @generated
	 */
	void setFmodex(Channel value);
} // AudioChannel
