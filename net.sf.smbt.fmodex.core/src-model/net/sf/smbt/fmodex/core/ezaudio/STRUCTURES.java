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
 * A representation of the literals of the enumeration '<em><b>STRUCTURES</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getSTRUCTURES()
 * @model
 * @generated
 */
public enum STRUCTURES implements Enumerator {
	/**
	 * The '<em><b>ADVANCED SETTINGS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVANCED_SETTINGS_VALUE
	 * @generated
	 * @ordered
	 */
	ADVANCED_SETTINGS(0, "ADVANCED_SETTINGS", "ADVANCED_SETTINGS"),

	/**
	 * The '<em><b>ASYNC READ INFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNC_READ_INFO_VALUE
	 * @generated
	 * @ordered
	 */
	ASYNC_READ_INFO(1, "ASYNC_READ_INFO", "ASYNC_READ_INFO"),

	/**
	 * The '<em><b>CD TOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CD_TOC_VALUE
	 * @generated
	 * @ordered
	 */
	CD_TOC(2, "CD_TOC", "CD_TOC"),

	/**
	 * The '<em><b>CODEC DESCRIPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODEC_DESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	CODEC_DESCRIPTION(3, "CODEC_DESCRIPTION", "CODEC_DESCRIPTION"),

	/**
	 * The '<em><b>CODEC STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODEC_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	CODEC_STATE(4, "CODEC_STATE", "CODEC_STATE"),

	/**
	 * The '<em><b>CODEC WAVE FORMAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODEC_WAVE_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	CODEC_WAVE_FORMAT(5, "CODEC_WAVE_FORMAT", "CODEC_WAVE_FORMAT"),

	/**
	 * The '<em><b>CREATE SOUND INFO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_SOUND_INFO_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE_SOUND_INFO(6, "CREATE_SOUND_INFO", "CREATE_SOUND_INFO"),

	/**
	 * The '<em><b>DSP DESCRIPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DSP_DESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	DSP_DESCRIPTION(7, "DSP_DESCRIPTION", "DSP_DESCRIPTION"),

	/**
	 * The '<em><b>DSP PARAMETER DESC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DSP_PARAMETER_DESC_VALUE
	 * @generated
	 * @ordered
	 */
	DSP_PARAMETER_DESC(8, "DSP_PARAMETER_DESC", "DSP_PARAMETER_DESC"),

	/**
	 * The '<em><b>DSP STATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DSP_STATE_VALUE
	 * @generated
	 * @ordered
	 */
	DSP_STATE(9, "DSP_STATE", "DSP_STATE"),

	/**
	 * The '<em><b>GUID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUID_VALUE
	 * @generated
	 * @ordered
	 */
	GUID(10, "GUID", "GUID"),

	/**
	 * The '<em><b>MEMORY USAGE DETAILS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMORY_USAGE_DETAILS_VALUE
	 * @generated
	 * @ordered
	 */
	MEMORY_USAGE_DETAILS(11, "MEMORY_USAGE_DETAILS", "MEMORY_USAGE_DETAILS"),

	/**
	 * The '<em><b>REVERB CHANNEL PROPERTIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVERB_CHANNEL_PROPERTIES_VALUE
	 * @generated
	 * @ordered
	 */
	REVERB_CHANNEL_PROPERTIES(12, "REVERB_CHANNEL_PROPERTIES", "REVERB_CHANNEL_PROPERTIES"),

	/**
	 * The '<em><b>REVERB PROPERTIES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVERB_PROPERTIES_VALUE
	 * @generated
	 * @ordered
	 */
	REVERB_PROPERTIES(13, "REVERB_PROPERTIES", "REVERB_PROPERTIES"),

	/**
	 * The '<em><b>SYNC POINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNC_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	SYNC_POINT(14, "SYNC_POINT", "SYNC_POINT"),

	/**
	 * The '<em><b>TAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAG_VALUE
	 * @generated
	 * @ordered
	 */
	TAG(15, "TAG", "TAG"),

	/**
	 * The '<em><b>VECTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTOR_VALUE
	 * @generated
	 * @ordered
	 */
	VECTOR(16, "VECTOR", "VECTOR");

	/**
	 * The '<em><b>ADVANCED SETTINGS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADVANCED SETTINGS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADVANCED_SETTINGS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADVANCED_SETTINGS_VALUE = 0;

	/**
	 * The '<em><b>ASYNC READ INFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASYNC READ INFO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASYNC_READ_INFO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASYNC_READ_INFO_VALUE = 1;

	/**
	 * The '<em><b>CD TOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CD TOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CD_TOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CD_TOC_VALUE = 2;

	/**
	 * The '<em><b>CODEC DESCRIPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CODEC DESCRIPTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODEC_DESCRIPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CODEC_DESCRIPTION_VALUE = 3;

	/**
	 * The '<em><b>CODEC STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CODEC STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODEC_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CODEC_STATE_VALUE = 4;

	/**
	 * The '<em><b>CODEC WAVE FORMAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CODEC WAVE FORMAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODEC_WAVE_FORMAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CODEC_WAVE_FORMAT_VALUE = 5;

	/**
	 * The '<em><b>CREATE SOUND INFO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CREATE SOUND INFO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE_SOUND_INFO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_SOUND_INFO_VALUE = 6;

	/**
	 * The '<em><b>DSP DESCRIPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DSP DESCRIPTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DSP_DESCRIPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DSP_DESCRIPTION_VALUE = 7;

	/**
	 * The '<em><b>DSP PARAMETER DESC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DSP PARAMETER DESC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DSP_PARAMETER_DESC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DSP_PARAMETER_DESC_VALUE = 8;

	/**
	 * The '<em><b>DSP STATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DSP STATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DSP_STATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DSP_STATE_VALUE = 9;

	/**
	 * The '<em><b>GUID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GUID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GUID_VALUE = 10;

	/**
	 * The '<em><b>MEMORY USAGE DETAILS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEMORY USAGE DETAILS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMORY_USAGE_DETAILS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEMORY_USAGE_DETAILS_VALUE = 11;

	/**
	 * The '<em><b>REVERB CHANNEL PROPERTIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REVERB CHANNEL PROPERTIES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVERB_CHANNEL_PROPERTIES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REVERB_CHANNEL_PROPERTIES_VALUE = 12;

	/**
	 * The '<em><b>REVERB PROPERTIES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REVERB PROPERTIES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVERB_PROPERTIES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REVERB_PROPERTIES_VALUE = 13;

	/**
	 * The '<em><b>SYNC POINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYNC POINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNC_POINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYNC_POINT_VALUE = 14;

	/**
	 * The '<em><b>TAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TAG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TAG_VALUE = 15;

	/**
	 * The '<em><b>VECTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VECTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VECTOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VECTOR_VALUE = 16;

	/**
	 * An array of all the '<em><b>STRUCTURES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final STRUCTURES[] VALUES_ARRAY =
		new STRUCTURES[] {
			ADVANCED_SETTINGS,
			ASYNC_READ_INFO,
			CD_TOC,
			CODEC_DESCRIPTION,
			CODEC_STATE,
			CODEC_WAVE_FORMAT,
			CREATE_SOUND_INFO,
			DSP_DESCRIPTION,
			DSP_PARAMETER_DESC,
			DSP_STATE,
			GUID,
			MEMORY_USAGE_DETAILS,
			REVERB_CHANNEL_PROPERTIES,
			REVERB_PROPERTIES,
			SYNC_POINT,
			TAG,
			VECTOR,
		};

	/**
	 * A public read-only list of all the '<em><b>STRUCTURES</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<STRUCTURES> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>STRUCTURES</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static STRUCTURES get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			STRUCTURES result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>STRUCTURES</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static STRUCTURES getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			STRUCTURES result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>STRUCTURES</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static STRUCTURES get(int value) {
		switch (value) {
			case ADVANCED_SETTINGS_VALUE: return ADVANCED_SETTINGS;
			case ASYNC_READ_INFO_VALUE: return ASYNC_READ_INFO;
			case CD_TOC_VALUE: return CD_TOC;
			case CODEC_DESCRIPTION_VALUE: return CODEC_DESCRIPTION;
			case CODEC_STATE_VALUE: return CODEC_STATE;
			case CODEC_WAVE_FORMAT_VALUE: return CODEC_WAVE_FORMAT;
			case CREATE_SOUND_INFO_VALUE: return CREATE_SOUND_INFO;
			case DSP_DESCRIPTION_VALUE: return DSP_DESCRIPTION;
			case DSP_PARAMETER_DESC_VALUE: return DSP_PARAMETER_DESC;
			case DSP_STATE_VALUE: return DSP_STATE;
			case GUID_VALUE: return GUID;
			case MEMORY_USAGE_DETAILS_VALUE: return MEMORY_USAGE_DETAILS;
			case REVERB_CHANNEL_PROPERTIES_VALUE: return REVERB_CHANNEL_PROPERTIES;
			case REVERB_PROPERTIES_VALUE: return REVERB_PROPERTIES;
			case SYNC_POINT_VALUE: return SYNC_POINT;
			case TAG_VALUE: return TAG;
			case VECTOR_VALUE: return VECTOR;
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
	private STRUCTURES(int value, String name, String literal) {
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
	
} //STRUCTURES
