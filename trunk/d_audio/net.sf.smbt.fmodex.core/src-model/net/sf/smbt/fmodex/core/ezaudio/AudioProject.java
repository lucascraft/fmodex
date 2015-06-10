/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getScenes <em>Scenes</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getTracks <em>Tracks</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getClips <em>Clips</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getAudioResources <em>Audio Resources</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getSystem <em>System</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getEffects <em>Effects</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getSpeakers <em>Speakers</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getIn <em>In</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getSounds <em>Sounds</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getDspList <em>Dsp List</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getChannels <em>Channels</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getDevices <em>Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioProject()
 * @model
 * @generated
 */
public interface AudioProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Scenes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.AudioScene}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenes</em>' containment reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioProject_Scenes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AudioScene> getScenes();

	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.AudioTrack}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' containment reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioProject_Tracks()
	 * @model containment="true"
	 * @generated
	 */
	EList<AudioTrack> getTracks();

	/**
	 * Returns the value of the '<em><b>Clips</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.AudioClip}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clips</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clips</em>' containment reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioProject_Clips()
	 * @model containment="true"
	 * @generated
	 */
	EList<AudioClip> getClips();

	/**
	 * Returns the value of the '<em><b>Audio Resources</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.AudioFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio Resources</em>' containment reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioProject_AudioResources()
	 * @model containment="true"
	 * @generated
	 */
	EList<AudioFile> getAudioResources();

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(AudioSystem)
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioProject_System()
	 * @model containment="true"
	 * @generated
	 */
	AudioSystem getSystem();

	/**
	 * Sets the value of the '{@link net.sf.smbt.fmodex.core.ezaudio.AudioProject#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(AudioSystem value);

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.AudioMixer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' containment reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioProject_Effects()
	 * @model containment="true"
	 * @generated
	 */
	EList<AudioMixer> getEffects();

	/**
	 * Returns the value of the '<em><b>Speakers</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.Speaker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speakers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speakers</em>' containment reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioProject_Speakers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Speaker> getSpeakers();

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.Input}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioProject_In()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getIn();

	/**
	 * Returns the value of the '<em><b>Sounds</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.ISound}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sounds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sounds</em>' containment reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioProject_Sounds()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISound> getSounds();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.IChannel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioProject_Channels()
	 * @model containment="true"
	 * @generated
	 */
	EList<IChannel> getChannels();

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.Device}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Devices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioProject_Devices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevices();

	/**
	 * Returns the value of the '<em><b>Dsp List</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.fmodex.core.ezaudio.FMDSP}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dsp List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dsp List</em>' containment reference list.
	 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage#getAudioProject_DspList()
	 * @model containment="true"
	 * @generated
	 */
	EList<FMDSP> getDspList();

} // AudioProject
