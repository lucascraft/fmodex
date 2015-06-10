/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DSP CALLBACK</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getDSP_CALLBACK()
 * @model
 * @generated
 */
public enum DSP_CALLBACK implements Enumerator {
	/**
	 * The '<em><b>CREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(0, "CREATE", "CREATE"),

	/**
	 * The '<em><b>DIALOG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIALOG_VALUE
	 * @generated
	 * @ordered
	 */
	DIALOG(1, "DIALOG", "DIALOG"),

	/**
	 * The '<em><b>GET PARAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_PARAM_VALUE
	 * @generated
	 * @ordered
	 */
	GET_PARAM(2, "GET_PARAM", "GET_PARAM"),

	/**
	 * The '<em><b>READ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_VALUE
	 * @generated
	 * @ordered
	 */
	READ(3, "READ", "READ"),

	/**
	 * The '<em><b>RELEASE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEASE_VALUE
	 * @generated
	 * @ordered
	 */
	RELEASE(4, "RELEASE", "RELEASE"),

	/**
	 * The '<em><b>RESET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESET_VALUE
	 * @generated
	 * @ordered
	 */
	RESET(5, "RESET", "RESET"),

	/**
	 * The '<em><b>SET PARAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_PARAM_VALUE
	 * @generated
	 * @ordered
	 */
	SET_PARAM(6, "SET_PARAM", "SET_PARAM"),

	/**
	 * The '<em><b>SET POSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_POSITION_VALUE
	 * @generated
	 * @ordered
	 */
	SET_POSITION(7, "SET_POSITION", "SET_POSITION");

	/**
	 * The '<em><b>CREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CREATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 0;

	/**
	 * The '<em><b>DIALOG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIALOG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIALOG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIALOG_VALUE = 1;

	/**
	 * The '<em><b>GET PARAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GET PARAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GET_PARAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_PARAM_VALUE = 2;

	/**
	 * The '<em><b>READ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READ_VALUE = 3;

	/**
	 * The '<em><b>RELEASE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RELEASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELEASE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_VALUE = 4;

	/**
	 * The '<em><b>RESET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESET_VALUE = 5;

	/**
	 * The '<em><b>SET PARAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET PARAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_PARAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_PARAM_VALUE = 6;

	/**
	 * The '<em><b>SET POSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SET POSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_POSITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SET_POSITION_VALUE = 7;

	/**
	 * An array of all the '<em><b>DSP CALLBACK</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DSP_CALLBACK[] VALUES_ARRAY =
		new DSP_CALLBACK[] {
			CREATE,
			DIALOG,
			GET_PARAM,
			READ,
			RELEASE,
			RESET,
			SET_PARAM,
			SET_POSITION,
		};

	/**
	 * A public read-only list of all the '<em><b>DSP CALLBACK</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DSP_CALLBACK> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DSP CALLBACK</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DSP_CALLBACK get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DSP_CALLBACK result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DSP CALLBACK</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DSP_CALLBACK getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DSP_CALLBACK result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DSP CALLBACK</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DSP_CALLBACK get(int value) {
		switch (value) {
			case CREATE_VALUE: return CREATE;
			case DIALOG_VALUE: return DIALOG;
			case GET_PARAM_VALUE: return GET_PARAM;
			case READ_VALUE: return READ;
			case RELEASE_VALUE: return RELEASE;
			case RESET_VALUE: return RESET;
			case SET_PARAM_VALUE: return SET_PARAM;
			case SET_POSITION_VALUE: return SET_POSITION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DSP_CALLBACK(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DSP_CALLBACK
