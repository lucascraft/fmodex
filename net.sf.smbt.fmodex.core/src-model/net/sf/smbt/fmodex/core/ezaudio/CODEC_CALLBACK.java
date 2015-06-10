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
 * A representation of the literals of the enumeration '<em><b>CODEC CALLBACK</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getCODEC_CALLBACK()
 * @model
 * @generated
 */
public enum CODEC_CALLBACK implements Enumerator {
	/**
	 * The '<em><b>CLOSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSE_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSE(0, "CLOSE", "CLOSE"),

	/**
	 * The '<em><b>GET LENGTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	GET_LENGTH(1, "GET_LENGTH", "GET_LENGTH"),

	/**
	 * The '<em><b>GET POSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_POSITION_VALUE
	 * @generated
	 * @ordered
	 */
	GET_POSITION(2, "GET_POSITION", "GET_POSITION"),

	/**
	 * The '<em><b>GET WAVE FORMAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_WAVE_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	GET_WAVE_FORMAT(3, "GET_WAVE_FORMAT", "GET_WAVE_FORMAT"),

	/**
	 * The '<em><b>META DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #META_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	META_DATA(4, "META_DATA", "META_DATA"),

	/**
	 * The '<em><b>OPEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN(5, "OPEN", "OPEN"),

	/**
	 * The '<em><b>READ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_VALUE
	 * @generated
	 * @ordered
	 */
	READ(6, "READ", "READ"),

	/**
	 * The '<em><b>SET POSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_POSITION_VALUE
	 * @generated
	 * @ordered
	 */
	SET_POSITION(7, "SET_POSITION", "SET_POSITION"),

	/**
	 * The '<em><b>SOUND CREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND_CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	SOUND_CREATE(8, "SOUND_CREATE", "SOUND_CREATE");

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
	public static final int CLOSE_VALUE = 0;

	/**
	 * The '<em><b>GET LENGTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GET LENGTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GET_LENGTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_LENGTH_VALUE = 1;

	/**
	 * The '<em><b>GET POSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GET POSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GET_POSITION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_POSITION_VALUE = 2;

	/**
	 * The '<em><b>GET WAVE FORMAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GET WAVE FORMAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GET_WAVE_FORMAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GET_WAVE_FORMAT_VALUE = 3;

	/**
	 * The '<em><b>META DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>META DATA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #META_DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int META_DATA_VALUE = 4;

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
	public static final int OPEN_VALUE = 5;

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
	public static final int READ_VALUE = 6;

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
	 * The '<em><b>SOUND CREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOUND CREATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOUND_CREATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOUND_CREATE_VALUE = 8;

	/**
	 * An array of all the '<em><b>CODEC CALLBACK</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CODEC_CALLBACK[] VALUES_ARRAY =
		new CODEC_CALLBACK[] {
			CLOSE,
			GET_LENGTH,
			GET_POSITION,
			GET_WAVE_FORMAT,
			META_DATA,
			OPEN,
			READ,
			SET_POSITION,
			SOUND_CREATE,
		};

	/**
	 * A public read-only list of all the '<em><b>CODEC CALLBACK</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CODEC_CALLBACK> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CODEC CALLBACK</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CODEC_CALLBACK get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CODEC_CALLBACK result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CODEC CALLBACK</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CODEC_CALLBACK getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CODEC_CALLBACK result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CODEC CALLBACK</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CODEC_CALLBACK get(int value) {
		switch (value) {
			case CLOSE_VALUE: return CLOSE;
			case GET_LENGTH_VALUE: return GET_LENGTH;
			case GET_POSITION_VALUE: return GET_POSITION;
			case GET_WAVE_FORMAT_VALUE: return GET_WAVE_FORMAT;
			case META_DATA_VALUE: return META_DATA;
			case OPEN_VALUE: return OPEN;
			case READ_VALUE: return READ;
			case SET_POSITION_VALUE: return SET_POSITION;
			case SOUND_CREATE_VALUE: return SOUND_CREATE;
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
	private CODEC_CALLBACK(int value, String name, String literal) {
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
	
} //CODEC_CALLBACK
