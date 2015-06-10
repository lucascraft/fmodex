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
 * A representation of the model object '<em><b>Time Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.TimeTag#getTime <em>Time</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.TimeTag#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.TimeTag#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getTimeTag()
 * @model
 * @generated
 */
public interface TimeTag extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(long)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getTimeTag_Time()
	 * @model
	 * @generated
	 */
	long getTime();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.TimeTag#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(long value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(long)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getTimeTag_Duration()
	 * @model
	 * @generated
	 */
	long getDuration();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.TimeTag#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(long value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS
	 * @see #setStatus(CLIP_STATUS)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getTimeTag_Status()
	 * @model
	 * @generated
	 */
	CLIP_STATUS getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.TimeTag#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.fmodex.core.ezaudio.CLIP_STATUS
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CLIP_STATUS value);

} // TimeTag
