/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage
 * @generated
 */
public interface EzaudioFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzaudioFactory eINSTANCE = net.sf.smbt.fmodex.core.ezaudio.impl.EzaudioFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Audio System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio System</em>'.
	 * @generated
	 */
	AudioSystem createAudioSystem();

	/**
	 * Returns a new object of class '<em>Audio File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio File</em>'.
	 * @generated
	 */
	AudioFile createAudioFile();

	/**
	 * Returns a new object of class '<em>Audio MP3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio MP3</em>'.
	 * @generated
	 */
	AudioMP3 createAudioMP3();

	/**
	 * Returns a new object of class '<em>Audio WAV</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio WAV</em>'.
	 * @generated
	 */
	AudioWAV createAudioWAV();

	/**
	 * Returns a new object of class '<em>Audio OGG</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio OGG</em>'.
	 * @generated
	 */
	AudioOGG createAudioOGG();

	/**
	 * Returns a new object of class '<em>Audio Scene</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Scene</em>'.
	 * @generated
	 */
	AudioScene createAudioScene();

	/**
	 * Returns a new object of class '<em>Audio Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Project</em>'.
	 * @generated
	 */
	AudioProject createAudioProject();

	/**
	 * Returns a new object of class '<em>Audio Track</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Track</em>'.
	 * @generated
	 */
	AudioTrack createAudioTrack();

	/**
	 * Returns a new object of class '<em>Audio Clip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Clip</em>'.
	 * @generated
	 */
	AudioClip createAudioClip();

	/**
	 * Returns a new object of class '<em>Audio MIDI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio MIDI</em>'.
	 * @generated
	 */
	AudioMIDI createAudioMIDI();

	/**
	 * Returns a new object of class '<em>Audio Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Channel</em>'.
	 * @generated
	 */
	AudioChannel createAudioChannel();

	/**
	 * Returns a new object of class '<em>Audio Mixer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Mixer</em>'.
	 * @generated
	 */
	AudioMixer createAudioMixer();

	/**
	 * Returns a new object of class '<em>Speaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speaker</em>'.
	 * @generated
	 */
	Speaker createSpeaker();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>FMDSP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FMDSP</em>'.
	 * @generated
	 */
	FMDSP createFMDSP();

	/**
	 * Returns a new object of class '<em>Audio Channel Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Channel Group</em>'.
	 * @generated
	 */
	AudioChannelGroup createAudioChannelGroup();

	/**
	 * Returns a new object of class '<em>Audio Sound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Sound</em>'.
	 * @generated
	 */
	AudioSound createAudioSound();

	/**
	 * Returns a new object of class '<em>Audio Reverb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Reverb</em>'.
	 * @generated
	 */
	AudioReverb createAudioReverb();

	/**
	 * Returns a new object of class '<em>Audio Sound Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Sound Group</em>'.
	 * @generated
	 */
	AudioSoundGroup createAudioSoundGroup();

	/**
	 * Returns a new object of class '<em>ISound</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISound</em>'.
	 * @generated
	 */
	ISound createISound();

	/**
	 * Returns a new object of class '<em>FM Geometry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FM Geometry</em>'.
	 * @generated
	 */
	FMGeometry createFMGeometry();

	/**
	 * Returns a new object of class '<em>IChannel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IChannel</em>'.
	 * @generated
	 */
	IChannel createIChannel();

	/**
	 * Returns a new object of class '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device</em>'.
	 * @generated
	 */
	Device createDevice();

	/**
	 * Returns a new object of class '<em>Time Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Tag</em>'.
	 * @generated
	 */
	TimeTag createTimeTag();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EzaudioPackage getEzaudioPackage();

} //EzaudioFactory
