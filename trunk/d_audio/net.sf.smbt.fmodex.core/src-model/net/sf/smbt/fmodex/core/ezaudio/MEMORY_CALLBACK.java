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
 * A representation of the literals of the enumeration '<em><b>MEMORY CALLBACK</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getMEMORY_CALLBACK()
 * @model
 * @generated
 */
public enum MEMORY_CALLBACK implements Enumerator {
	/**
	 * The '<em><b>ALLOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOC_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOC(0, "ALLOC", "ALLOC"),

	/**
	 * The '<em><b>FREE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREE_VALUE
	 * @generated
	 * @ordered
	 */
	FREE(1, "FREE", "FREE"),

	/**
	 * The '<em><b>REALLOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REALLOC_VALUE
	 * @generated
	 * @ordered
	 */
	REALLOC(2, "REALLOC", "REALLOC");

	/**
	 * The '<em><b>ALLOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALLOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALLOC_VALUE = 0;

	/**
	 * The '<em><b>FREE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FREE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FREE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FREE_VALUE = 1;

	/**
	 * The '<em><b>REALLOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REALLOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REALLOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REALLOC_VALUE = 2;

	/**
	 * An array of all the '<em><b>MEMORY CALLBACK</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MEMORY_CALLBACK[] VALUES_ARRAY =
		new MEMORY_CALLBACK[] {
			ALLOC,
			FREE,
			REALLOC,
		};

	/**
	 * A public read-only list of all the '<em><b>MEMORY CALLBACK</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MEMORY_CALLBACK> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MEMORY CALLBACK</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MEMORY_CALLBACK get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MEMORY_CALLBACK result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MEMORY CALLBACK</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MEMORY_CALLBACK getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MEMORY_CALLBACK result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MEMORY CALLBACK</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MEMORY_CALLBACK get(int value) {
		switch (value) {
			case ALLOC_VALUE: return ALLOC;
			case FREE_VALUE: return FREE;
			case REALLOC_VALUE: return REALLOC;
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
	private MEMORY_CALLBACK(int value, String name, String literal) {
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
	
} //MEMORY_CALLBACK
