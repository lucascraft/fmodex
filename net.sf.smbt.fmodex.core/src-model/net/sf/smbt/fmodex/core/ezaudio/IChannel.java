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
 * A representation of the model object '<em><b>IChannel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.IChannel#getDspList <em>Dsp List</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getIChannel()
 * @model
 * @generated
 */
public interface IChannel extends EObject {
	/**
	 * Returns the value of the '<em><b>Dsp List</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.FMDSP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsp List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsp List</em>' reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getIChannel_DspList()
	 * @model
	 * @generated
	 */
	EList<FMDSP> getDspList();

} // IChannel
