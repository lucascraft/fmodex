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
 * A representation of the literals of the enumeration '<em><b>SOUND CALLBACK</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getSOUND_CALLBACK()
 * @model
 * @generated
 */
public enum SOUND_CALLBACK implements Enumerator {
	/**
	 * The '<em><b>NON BLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	NON_BLOCK(0, "NON_BLOCK", "NON_BLOCK"),

	/**
	 * The '<em><b>PCM READ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PCM_READ_VALUE
	 * @generated
	 * @ordered
	 */
	PCM_READ(1, "PCM_READ", "PCM_READ"),

	/**
	 * The '<em><b>PCM SET POS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PCM_SET_POS_VALUE
	 * @generated
	 * @ordered
	 */
	PCM_SET_POS(2, "PCM_SET_POS", "PCM_SET_POS");

	/**
	 * The '<em><b>NON BLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NON BLOCK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_BLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NON_BLOCK_VALUE = 0;

	/**
	 * The '<em><b>PCM READ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PCM READ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PCM_READ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PCM_READ_VALUE = 1;

	/**
	 * The '<em><b>PCM SET POS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PCM SET POS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PCM_SET_POS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PCM_SET_POS_VALUE = 2;

	/**
	 * An array of all the '<em><b>SOUND CALLBACK</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SOUND_CALLBACK[] VALUES_ARRAY =
		new SOUND_CALLBACK[] {
			NON_BLOCK,
			PCM_READ,
			PCM_SET_POS,
		};

	/**
	 * A public read-only list of all the '<em><b>SOUND CALLBACK</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SOUND_CALLBACK> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SOUND CALLBACK</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SOUND_CALLBACK get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SOUND_CALLBACK result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SOUND CALLBACK</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SOUND_CALLBACK getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SOUND_CALLBACK result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SOUND CALLBACK</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SOUND_CALLBACK get(int value) {
		switch (value) {
			case NON_BLOCK_VALUE: return NON_BLOCK;
			case PCM_READ_VALUE: return PCM_READ;
			case PCM_SET_POS_VALUE: return PCM_SET_POS;
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
	private SOUND_CALLBACK(int value, String name, String literal) {
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
	
} //SOUND_CALLBACK
