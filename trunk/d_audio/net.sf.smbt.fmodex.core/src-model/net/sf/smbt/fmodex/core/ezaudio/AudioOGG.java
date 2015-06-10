/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio OGG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioOGG#getSamplingRate <em>Sampling Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioOGG()
 * @model
 * @generated
 */
public interface AudioOGG extends AudioFile {
	/**
	 * Returns the value of the '<em><b>Sampling Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampling Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sampling Rate</em>' attribute.
	 * @see #setSamplingRate(float)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioOGG_SamplingRate()
	 * @model
	 * @generated
	 */
	float getSamplingRate();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioOGG#getSamplingRate <em>Sampling Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sampling Rate</em>' attribute.
	 * @see #getSamplingRate()
	 * @generated
	 */
	void setSamplingRate(float value);

} // AudioOGG
