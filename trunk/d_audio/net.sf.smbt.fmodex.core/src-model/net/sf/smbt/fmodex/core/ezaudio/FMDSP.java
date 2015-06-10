/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;

import org.eclipse.emf.ecore.EObject;
import org.jouvieje.fmodex.DSP;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMDSP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.FMDSP#getFmodex <em>Fmodex</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.FMDSP#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getFMDSP()
 * @model
 * @generated
 */
public interface FMDSP extends EObject {
	/**
	 * Returns the value of the '<em><b>Fmodex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fmodex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmodex</em>' attribute.
	 * @see #setFmodex(DSP)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getFMDSP_Fmodex()
	 * @model dataType="net.sf.smbt.fmodex.core.ezaudio.DSP"
	 * @generated
	 */
	DSP getFmodex();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.FMDSP#getFmodex <em>Fmodex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fmodex</em>' attribute.
	 * @see #getFmodex()
	 * @generated
	 */
	void setFmodex(DSP value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.fmodex.core.ezaudio.DSP_KIND}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.fmodex.core.ezaudio.DSP_KIND
	 * @see #setKind(DSP_KIND)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getFMDSP_Kind()
	 * @model
	 * @generated
	 */
	DSP_KIND getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.FMDSP#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.fmodex.core.ezaudio.DSP_KIND
	 * @see #getKind()
	 * @generated
	 */
	void setKind(DSP_KIND value);

} // FMDSP
