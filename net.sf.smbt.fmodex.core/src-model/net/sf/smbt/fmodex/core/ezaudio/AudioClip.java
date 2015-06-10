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
 * A representation of the model object '<em><b>Audio Clip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getFile <em>File</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getSound <em>Sound</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getTrack <em>Track</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getTimeTag <em>Time Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioClip()
 * @model
 * @generated
 */
public interface AudioClip extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(AudioFile)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioClip_File()
	 * @model
	 * @generated
	 */
	AudioFile getFile();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(AudioFile value);

	/**
	 * Returns the value of the '<em><b>Sound</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sound</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sound</em>' reference.
	 * @see #setSound(AudioSound)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioClip_Sound()
	 * @model
	 * @generated
	 */
	AudioSound getSound();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getSound <em>Sound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sound</em>' reference.
	 * @see #getSound()
	 * @generated
	 */
	void setSound(AudioSound value);

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
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioClip_Track()
	 * @model
	 * @generated
	 */
	AudioTrack getTrack();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getTrack <em>Track</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track</em>' reference.
	 * @see #getTrack()
	 * @generated
	 */
	void setTrack(AudioTrack value);

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
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioClip_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Time Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Tag</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Tag</em>' containment reference.
	 * @see #setTimeTag(TimeTag)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioClip_TimeTag()
	 * @model containment="true"
	 * @generated
	 */
	TimeTag getTimeTag();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioClip#getTimeTag <em>Time Tag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Tag</em>' containment reference.
	 * @see #getTimeTag()
	 * @generated
	 */
	void setTimeTag(TimeTag value);

} // AudioClip
