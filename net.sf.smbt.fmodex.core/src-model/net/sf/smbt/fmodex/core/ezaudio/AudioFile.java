/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;

import java.io.File;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioFile#getFile <em>File</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioFile#getExt <em>Ext</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioFile()
 * @model
 * @generated
 */
public interface AudioFile extends EObject {
	/**
	 * Returns the value of the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' attribute.
	 * @see #setFile(File)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioFile_File()
	 * @model dataType="net.sf.smbt.fmodex.core.ezaudio.File"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioFile#getFile <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

	/**
	 * Returns the value of the '<em><b>Ext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext</em>' attribute.
	 * @see #setExt(String)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioFile_Ext()
	 * @model
	 * @generated
	 */
	String getExt();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioFile#getExt <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext</em>' attribute.
	 * @see #getExt()
	 * @generated
	 */
	void setExt(String value);

} // AudioFile
