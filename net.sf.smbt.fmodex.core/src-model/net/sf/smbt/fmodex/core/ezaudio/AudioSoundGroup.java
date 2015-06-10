/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;

import org.eclipse.emf.common.util.EList;
import org.jouvieje.fmodex.SoundGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Sound Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioSoundGroup#getChildren <em>Children</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioSoundGroup#getFmodex <em>Fmodex</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioSoundGroup()
 * @model
 * @generated
 */
public interface AudioSoundGroup extends ISound {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.ISound}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioSoundGroup_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISound> getChildren();

	/**
	 * Returns the value of the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fmodex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmodex</em>' attribute.
	 * @see #setFmodex(SoundGroup)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioSoundGroup_Fmodex()
	 * @model dataType="net.sf.smbt.fmodex.core.ezaudio.SoundGroup"
	 * @generated
	 */
	SoundGroup getFmodex();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSoundGroup#getFmodex <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fmodex</em>' attribute.
	 * @see #getFmodex()
	 * @generated
	 */
	void setFmodex(SoundGroup value);

} // AudioSoundGroup
