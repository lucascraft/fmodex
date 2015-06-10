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
 * A representation of the literals of the enumeration '<em><b>OPERATION</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getOPERATION()
 * @model
 * @generated
 */
public enum OPERATION implements Enumerator {
	/**
	 * The '<em><b>OPEN STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_STATE(0, "OPEN_STATE", "OPEN_STATE"),

	/**
	 * The '<em><b>OUTPUT TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT_TYPE(1, "OUTPUT_TYPE", "OUTPUT_TYPE"),

	/**
	 * The '<em><b>PLUGIN TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLUGIN_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	PLUGIN_TYPE(2, "PLUGIN_TYPE", "PLUGIN_TYPE"),

	/**
	 * The '<em><b>RESULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESULT_VALUE
	 * @generated
	 * @ordered
	 */
	RESULT(3, "RESULT", "RESULT"),

	/**
	 * The '<em><b>SOUND FORMAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	SOUND_FORMAT(4, "SOUND_FORMAT", "SOUND_FORMAT"),

	/**
	 * The '<em><b>SOUND TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	SOUND_TYPE(5, "SOUND_TYPE", "SOUND_TYPE"),

	/**
	 * The '<em><b>SOUNDGROUP BEHAVIOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUNDGROUP_BEHAVIOR_VALUE
	 * @generated
	 * @ordered
	 */
	SOUNDGROUP_BEHAVIOR(6, "SOUNDGROUP_BEHAVIOR", "SOUNDGROUP_BEHAVIOR"),

	/**
	 * The '<em><b>SPEAKER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEAKER_VALUE
	 * @generated
	 * @ordered
	 */
	SPEAKER(7, "SPEAKER", "SPEAKER"),

	/**
	 * The '<em><b>SPEAKER MAP TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEAKER_MAP_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	SPEAKER_MAP_TYPE(8, "SPEAKER_MAP_TYPE", "SPEAKER_MAP_TYPE"),

	/**
	 * The '<em><b>SPEAKER MODE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEAKER_MODE_VALUE
	 * @generated
	 * @ordered
	 */
	SPEAKER_MODE(9, "SPEAKER_MODE", "SPEAKER_MODE"),

	/**
	 * The '<em><b>SYSTEM CALLBACK TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_CALLBACK_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_CALLBACK_TYPE(10, "SYSTEM_CALLBACK_TYPE", "SYSTEM_CALLBACK_TYPE"),

	/**
	 * The '<em><b>TAG DATA TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAG_DATA_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	TAG_DATA_TYPE(11, "TAG_DATA_TYPE", "TAG_DATA_TYPE"),

	/**
	 * The '<em><b>TAG TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAG_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	TAG_TYPE(12, "TAG_TYPE", "TAG_TYPE");

	/**
	 * The '<em><b>OPEN STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPEN STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_STATE_VALUE = 0;

	/**
	 * The '<em><b>OUTPUT TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OUTPUT TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUT_TYPE_VALUE = 1;

	/**
	 * The '<em><b>PLUGIN TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLUGIN TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLUGIN_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLUGIN_TYPE_VALUE = 2;

	/**
	 * The '<em><b>RESULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESULT_VALUE = 3;

	/**
	 * The '<em><b>SOUND FORMAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUND FORMAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUND_FORMAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUND_FORMAT_VALUE = 4;

	/**
	 * The '<em><b>SOUND TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUND TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUND_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUND_TYPE_VALUE = 5;

	/**
	 * The '<em><b>SOUNDGROUP BEHAVIOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUNDGROUP BEHAVIOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUNDGROUP_BEHAVIOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUNDGROUP_BEHAVIOR_VALUE = 6;

	/**
	 * The '<em><b>SPEAKER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEAKER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEAKER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPEAKER_VALUE = 7;

	/**
	 * The '<em><b>SPEAKER MAP TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEAKER MAP TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEAKER_MAP_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPEAKER_MAP_TYPE_VALUE = 8;

	/**
	 * The '<em><b>SPEAKER MODE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPEAKER MODE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEAKER_MODE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPEAKER_MODE_VALUE = 9;

	/**
	 * The '<em><b>SYSTEM CALLBACK TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSTEM CALLBACK TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_CALLBACK_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_CALLBACK_TYPE_VALUE = 10;

	/**
	 * The '<em><b>TAG DATA TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TAG DATA TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAG_DATA_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TAG_DATA_TYPE_VALUE = 11;

	/**
	 * The '<em><b>TAG TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TAG TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAG_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TAG_TYPE_VALUE = 12;

	/**
	 * An array of all the '<em><b>OPERATION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OPERATION[] VALUES_ARRAY =
		new OPERATION[] {
			OPEN_STATE,
			OUTPUT_TYPE,
			PLUGIN_TYPE,
			RESULT,
			SOUND_FORMAT,
			SOUND_TYPE,
			SOUNDGROUP_BEHAVIOR,
			SPEAKER,
			SPEAKER_MAP_TYPE,
			SPEAKER_MODE,
			SYSTEM_CALLBACK_TYPE,
			TAG_DATA_TYPE,
			TAG_TYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>OPERATION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OPERATION> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OPERATION</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OPERATION get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OPERATION result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OPERATION</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OPERATION getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OPERATION result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OPERATION</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OPERATION get(int value) {
		switch (value) {
			case OPEN_STATE_VALUE: return OPEN_STATE;
			case OUTPUT_TYPE_VALUE: return OUTPUT_TYPE;
			case PLUGIN_TYPE_VALUE: return PLUGIN_TYPE;
			case RESULT_VALUE: return RESULT;
			case SOUND_FORMAT_VALUE: return SOUND_FORMAT;
			case SOUND_TYPE_VALUE: return SOUND_TYPE;
			case SOUNDGROUP_BEHAVIOR_VALUE: return SOUNDGROUP_BEHAVIOR;
			case SPEAKER_VALUE: return SPEAKER;
			case SPEAKER_MAP_TYPE_VALUE: return SPEAKER_MAP_TYPE;
			case SPEAKER_MODE_VALUE: return SPEAKER_MODE;
			case SYSTEM_CALLBACK_TYPE_VALUE: return SYSTEM_CALLBACK_TYPE;
			case TAG_DATA_TYPE_VALUE: return TAG_DATA_TYPE;
			case TAG_TYPE_VALUE: return TAG_TYPE;
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
	private OPERATION(int value, String name, String literal) {
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
	
} //OPERATION
