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
 * A representation of the model object '<em><b>Audio Scene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioScene#getClips <em>Clips</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioScene#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioScene()
 * @model
 * @generated
 */
public interface AudioScene extends EObject {
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
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioScene_Clips()
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
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioScene_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioScene#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // AudioScene
