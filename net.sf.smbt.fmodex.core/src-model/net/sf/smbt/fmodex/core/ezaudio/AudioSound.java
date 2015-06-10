/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;

import org.jouvieje.fmodex.Sound;
import org.jouvieje.fmodex.structures.FMOD_CREATESOUNDEXINFO;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Sound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioSound#getFmodex <em>Fmodex</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioSound#getExinfo <em>Exinfo</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioSound()
 * @model
 * @generated
 */
public interface AudioSound extends ISound {
	/**
	 * Returns the value of the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fmodex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmodex</em>' attribute.
	 * @see #setFmodex(Sound)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioSound_Fmodex()
	 * @model dataType="net.sf.smbt.fmodex.core.ezaudio.Sound"
	 * @generated
	 */
	Sound getFmodex();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSound#getFmodex <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fmodex</em>' attribute.
	 * @see #getFmodex()
	 * @generated
	 */
	void setFmodex(Sound value);

	/**
	 * Returns the value of the '<em><b>Exinfo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exinfo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exinfo</em>' attribute.
	 * @see #setExinfo(FMOD_CREATESOUNDEXINFO)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioSound_Exinfo()
	 * @model dataType="net.sf.smbt.fmodex.core.ezaudio.FMOD_CREATESOUNDEXINFO"
	 * @generated
	 */
	FMOD_CREATESOUNDEXINFO getExinfo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioSound#getExinfo <em>Exinfo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exinfo</em>' attribute.
	 * @see #getExinfo()
	 * @generated
	 */
	void setExinfo(FMOD_CREATESOUNDEXINFO value);

} // AudioSound
