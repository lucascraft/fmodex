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
 * A representation of the literals of the enumeration '<em><b>DSP KIND</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getDSP_KIND()
 * @model
 * @generated
 */
public enum DSP_KIND implements Enumerator {
	/**
	 * The '<em><b>CHORUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHORUS_VALUE
	 * @generated
	 * @ordered
	 */
	CHORUS(0, "CHORUS", "CHORUS"),

	/**
	 * The '<em><b>COMPRESSOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPRESSOR_VALUE
	 * @generated
	 * @ordered
	 */
	COMPRESSOR(1, "COMPRESSOR", "COMPRESSOR"),

	/**
	 * The '<em><b>DELAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELAY_VALUE
	 * @generated
	 * @ordered
	 */
	DELAY(2, "DELAY", "DELAY"),

	/**
	 * The '<em><b>DISTORTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTORTION_VALUE
	 * @generated
	 * @ordered
	 */
	DISTORTION(3, "DISTORTION", "DISTORTION"),

	/**
	 * The '<em><b>ECHO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECHO_VALUE
	 * @generated
	 * @ordered
	 */
	ECHO(4, "ECHO", "ECHO"),

	/**
	 * The '<em><b>FFT WINDOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FFT_WINDOW_VALUE
	 * @generated
	 * @ordered
	 */
	FFT_WINDOW(5, "FFT_WINDOW", "FFT_WINDOW"),

	/**
	 * The '<em><b>FLANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLANGE_VALUE
	 * @generated
	 * @ordered
	 */
	FLANGE(6, "FLANGE", "FLANGE"),

	/**
	 * The '<em><b>HIGH PASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_PASS_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH_PASS(7, "HIGH_PASS", "HIGH_PASS"),

	/**
	 * The '<em><b>IT ECHO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IT_ECHO_VALUE
	 * @generated
	 * @ordered
	 */
	IT_ECHO(8, "IT_ECHO", "IT_ECHO"),

	/**
	 * The '<em><b>IT LOW PASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IT_LOW_PASS_VALUE
	 * @generated
	 * @ordered
	 */
	IT_LOW_PASS(9, "IT_LOW_PASS", "IT_LOW_PASS"),

	/**
	 * The '<em><b>LOW PASS SIMPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_PASS_SIMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	LOW_PASS_SIMPLE(10, "LOW_PASS_SIMPLE", "LOW_PASS_SIMPLE"),

	/**
	 * The '<em><b>LOW PASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_PASS_VALUE
	 * @generated
	 * @ordered
	 */
	LOW_PASS(11, "LOW_PASS", "LOW_PASS"),

	/**
	 * The '<em><b>NORMALIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMALIZE_VALUE
	 * @generated
	 * @ordered
	 */
	NORMALIZE(12, "NORMALIZE", "NORMALIZE"),

	/**
	 * The '<em><b>OSCILLATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OSCILLATOR_VALUE
	 * @generated
	 * @ordered
	 */
	OSCILLATOR(13, "OSCILLATOR", "OSCILLATOR"),

	/**
	 * The '<em><b>PARAM EQ</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAM_EQ_VALUE
	 * @generated
	 * @ordered
	 */
	PARAM_EQ(14, "PARAM_EQ", "PARAM_EQ"),

	/**
	 * The '<em><b>PITCH SHIFFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PITCH_SHIFFT_VALUE
	 * @generated
	 * @ordered
	 */
	PITCH_SHIFFT(15, "PITCH_SHIFFT", "PITCH_SHIFFT"),

	/**
	 * The '<em><b>RESAMPLER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESAMPLER_VALUE
	 * @generated
	 * @ordered
	 */
	RESAMPLER(16, "RESAMPLER", "RESAMPLER"),

	/**
	 * The '<em><b>REVERB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVERB_VALUE
	 * @generated
	 * @ordered
	 */
	REVERB(17, "REVERB", "REVERB"),

	/**
	 * The '<em><b>SFX REVERB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SFX_REVERB_VALUE
	 * @generated
	 * @ordered
	 */
	SFX_REVERB(18, "SFX_REVERB", "SFX_REVERB"),

	/**
	 * The '<em><b>TREMOLO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREMOLO_VALUE
	 * @generated
	 * @ordered
	 */
	TREMOLO(19, "TREMOLO", "TREMOLO"),

	/**
	 * The '<em><b>TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE(20, "TYPE", "TYPE");

	/**
	 * The '<em><b>CHORUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHORUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHORUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHORUS_VALUE = 0;

	/**
	 * The '<em><b>COMPRESSOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPRESSOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPRESSOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPRESSOR_VALUE = 1;

	/**
	 * The '<em><b>DELAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELAY_VALUE = 2;

	/**
	 * The '<em><b>DISTORTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISTORTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTORTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTORTION_VALUE = 3;

	/**
	 * The '<em><b>ECHO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ECHO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ECHO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ECHO_VALUE = 4;

	/**
	 * The '<em><b>FFT WINDOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FFT WINDOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FFT_WINDOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FFT_WINDOW_VALUE = 5;

	/**
	 * The '<em><b>FLANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLANGE_VALUE = 6;

	/**
	 * The '<em><b>HIGH PASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGH PASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH_PASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_PASS_VALUE = 7;

	/**
	 * The '<em><b>IT ECHO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IT ECHO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IT_ECHO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IT_ECHO_VALUE = 8;

	/**
	 * The '<em><b>IT LOW PASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IT LOW PASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IT_LOW_PASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IT_LOW_PASS_VALUE = 9;

	/**
	 * The '<em><b>LOW PASS SIMPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOW PASS SIMPLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW_PASS_SIMPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOW_PASS_SIMPLE_VALUE = 10;

	/**
	 * The '<em><b>LOW PASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOW PASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW_PASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOW_PASS_VALUE = 11;

	/**
	 * The '<em><b>NORMALIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMALIZE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMALIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORMALIZE_VALUE = 12;

	/**
	 * The '<em><b>OSCILLATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OSCILLATOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OSCILLATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OSCILLATOR_VALUE = 13;

	/**
	 * The '<em><b>PARAM EQ</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PARAM EQ</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAM_EQ
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARAM_EQ_VALUE = 14;

	/**
	 * The '<em><b>PITCH SHIFFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PITCH SHIFFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PITCH_SHIFFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PITCH_SHIFFT_VALUE = 15;

	/**
	 * The '<em><b>RESAMPLER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESAMPLER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESAMPLER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESAMPLER_VALUE = 16;

	/**
	 * The '<em><b>REVERB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REVERB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVERB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REVERB_VALUE = 17;

	/**
	 * The '<em><b>SFX REVERB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SFX REVERB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SFX_REVERB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SFX_REVERB_VALUE = 18;

	/**
	 * The '<em><b>TREMOLO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TREMOLO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TREMOLO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TREMOLO_VALUE = 19;

	/**
	 * The '<em><b>TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TYPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_VALUE = 20;

	/**
	 * An array of all the '<em><b>DSP KIND</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DSP_KIND[] VALUES_ARRAY =
		new DSP_KIND[] {
			CHORUS,
			COMPRESSOR,
			DELAY,
			DISTORTION,
			ECHO,
			FFT_WINDOW,
			FLANGE,
			HIGH_PASS,
			IT_ECHO,
			IT_LOW_PASS,
			LOW_PASS_SIMPLE,
			LOW_PASS,
			NORMALIZE,
			OSCILLATOR,
			PARAM_EQ,
			PITCH_SHIFFT,
			RESAMPLER,
			REVERB,
			SFX_REVERB,
			TREMOLO,
			TYPE,
		};

	/**
	 * A public read-only list of all the '<em><b>DSP KIND</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DSP_KIND> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DSP KIND</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DSP_KIND get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DSP_KIND result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DSP KIND</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DSP_KIND getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DSP_KIND result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DSP KIND</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DSP_KIND get(int value) {
		switch (value) {
			case CHORUS_VALUE: return CHORUS;
			case COMPRESSOR_VALUE: return COMPRESSOR;
			case DELAY_VALUE: return DELAY;
			case DISTORTION_VALUE: return DISTORTION;
			case ECHO_VALUE: return ECHO;
			case FFT_WINDOW_VALUE: return FFT_WINDOW;
			case FLANGE_VALUE: return FLANGE;
			case HIGH_PASS_VALUE: return HIGH_PASS;
			case IT_ECHO_VALUE: return IT_ECHO;
			case IT_LOW_PASS_VALUE: return IT_LOW_PASS;
			case LOW_PASS_SIMPLE_VALUE: return LOW_PASS_SIMPLE;
			case LOW_PASS_VALUE: return LOW_PASS;
			case NORMALIZE_VALUE: return NORMALIZE;
			case OSCILLATOR_VALUE: return OSCILLATOR;
			case PARAM_EQ_VALUE: return PARAM_EQ;
			case PITCH_SHIFFT_VALUE: return PITCH_SHIFFT;
			case RESAMPLER_VALUE: return RESAMPLER;
			case REVERB_VALUE: return REVERB;
			case SFX_REVERB_VALUE: return SFX_REVERB;
			case TREMOLO_VALUE: return TREMOLO;
			case TYPE_VALUE: return TYPE;
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
	private DSP_KIND(int value, String name, String literal) {
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
	
} //DSP_KIND
