/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;

import org.eclipse.emf.common.util.EList;
import org.jouvieje.fmodex.ChannelGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Channel Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioChannelGroup#getChildren <em>Children</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioChannelGroup#getFmodex <em>Fmodex</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioChannelGroup()
 * @model
 * @generated
 */
public interface AudioChannelGroup extends IChannel {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.IChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioChannelGroup_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<IChannel> getChildren();

	/**
	 * Returns the value of the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fmodex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmodex</em>' attribute.
	 * @see #setFmodex(ChannelGroup)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioChannelGroup_Fmodex()
	 * @model dataType="net.sf.smbt.fmodex.core.ezaudio.ChannelGroup"
	 * @generated
	 */
	ChannelGroup getFmodex();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioChannelGroup#getFmodex <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fmodex</em>' attribute.
	 * @see #getFmodex()
	 * @generated
	 */
	void setFmodex(ChannelGroup value);

} // AudioChannelGroup
