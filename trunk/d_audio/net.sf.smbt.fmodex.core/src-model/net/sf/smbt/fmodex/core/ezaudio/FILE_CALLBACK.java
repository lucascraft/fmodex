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
 * A representation of the literals of the enumeration '<em><b>FILE CALLBACK</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getFILE_CALLBACK()
 * @model
 * @generated
 */
public enum FILE_CALLBACK implements Enumerator {
	/**
	 * The '<em><b>ASYNC CANCEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNC_CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	ASYNC_CANCEL(0, "ASYNC_CANCEL", "ASYNC_CANCEL"),

	/**
	 * The '<em><b>ASYNC READ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNC_READ_VALUE
	 * @generated
	 * @ordered
	 */
	ASYNC_READ(1, "ASYNC_READ", "ASYNC_READ"),

	/**
	 * The '<em><b>CLOSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSE_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSE(2, "CLOSE", "CLOSE"),

	/**
	 * The '<em><b>OPEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN(3, "OPEN", "OPEN"),

	/**
	 * The '<em><b>READ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_VALUE
	 * @generated
	 * @ordered
	 */
	READ(4, "READ", "READ"),

	/**
	 * The '<em><b>SEEK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEEK_VALUE
	 * @generated
	 * @ordered
	 */
	SEEK(5, "SEEK", "SEEK");

	/**
	 * The '<em><b>ASYNC CANCEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASYNC CANCEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASYNC_CANCEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASYNC_CANCEL_VALUE = 0;

	/**
	 * The '<em><b>ASYNC READ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASYNC READ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASYNC_READ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASYNC_READ_VALUE = 1;

	/**
	 * The '<em><b>CLOSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOSE_VALUE = 2;

	/**
	 * The '<em><b>OPEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VALUE = 3;

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
	public static final int READ_VALUE = 4;

	/**
	 * The '<em><b>SEEK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEEK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEEK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEEK_VALUE = 5;

	/**
	 * An array of all the '<em><b>FILE CALLBACK</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FILE_CALLBACK[] VALUES_ARRAY =
		new FILE_CALLBACK[] {
			ASYNC_CANCEL,
			ASYNC_READ,
			CLOSE,
			OPEN,
			READ,
			SEEK,
		};

	/**
	 * A public read-only list of all the '<em><b>FILE CALLBACK</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FILE_CALLBACK> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FILE CALLBACK</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FILE_CALLBACK get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FILE_CALLBACK result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FILE CALLBACK</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FILE_CALLBACK getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FILE_CALLBACK result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FILE CALLBACK</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FILE_CALLBACK get(int value) {
		switch (value) {
			case ASYNC_CANCEL_VALUE: return ASYNC_CANCEL;
			case ASYNC_READ_VALUE: return ASYNC_READ;
			case CLOSE_VALUE: return CLOSE;
			case OPEN_VALUE: return OPEN;
			case READ_VALUE: return READ;
			case SEEK_VALUE: return SEEK;
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
	private FILE_CALLBACK(int value, String name, String literal) {
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
	
} //FILE_CALLBACK
