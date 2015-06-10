/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;

import org.eclipse.emf.ecore.EObject;
import org.jouvieje.fmodex.Reverb;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Reverb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioReverb#getFmodex <em>Fmodex</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioReverb()
 * @model
 * @generated
 */
public interface AudioReverb extends EObject {
	/**
	 * Returns the value of the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fmodex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmodex</em>' attribute.
	 * @see #setFmodex(Reverb)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioReverb_Fmodex()
	 * @model dataType="net.sf.smbt.fmodex.core.ezaudio.Reverb"
	 * @generated
	 */
	Reverb getFmodex();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioReverb#getFmodex <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fmodex</em>' attribute.
	 * @see #getFmodex()
	 * @generated
	 */
	void setFmodex(Reverb value);

} // AudioReverb
