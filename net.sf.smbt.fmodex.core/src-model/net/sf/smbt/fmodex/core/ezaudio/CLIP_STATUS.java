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
 * A representation of the literals of the enumeration '<em><b>CLIP STATUS</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getCLIP_STATUS()
 * @model
 * @generated
 */
public enum CLIP_STATUS implements Enumerator {
	/**
	 * The '<em><b>PLAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAY_VALUE
	 * @generated
	 * @ordered
	 */
	PLAY(0, "PLAY", "PLAY"),

	/**
	 * The '<em><b>PAUSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	PAUSE(1, "PAUSE", "PAUSE"),

	/**
	 * The '<em><b>STOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_VALUE
	 * @generated
	 * @ordered
	 */
	STOP(2, "STOP", "STOP");

	/**
	 * The '<em><b>PLAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLAY_VALUE = 0;

	/**
	 * The '<em><b>PAUSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAUSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAUSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAUSE_VALUE = 1;

	/**
	 * The '<em><b>STOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STOP_VALUE = 2;

	/**
	 * An array of all the '<em><b>CLIP STATUS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CLIP_STATUS[] VALUES_ARRAY =
		new CLIP_STATUS[] {
			PLAY,
			PAUSE,
			STOP,
		};

	/**
	 * A public read-only list of all the '<em><b>CLIP STATUS</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CLIP_STATUS> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CLIP STATUS</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CLIP_STATUS get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CLIP_STATUS result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CLIP STATUS</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CLIP_STATUS getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CLIP_STATUS result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CLIP STATUS</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CLIP_STATUS get(int value) {
		switch (value) {
			case PLAY_VALUE: return PLAY;
			case PAUSE_VALUE: return PAUSE;
			case STOP_VALUE: return STOP;
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
	private CLIP_STATUS(int value, String name, String literal) {
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
	
} //CLIP_STATUS
