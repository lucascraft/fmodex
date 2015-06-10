/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.fmodex.core.ezaudio.impl;

import java.io.File;

import net.sf.smbt.fmodex.core.ezaudio.AudioFile;
import net.sf.smbt.fmodex.core.ezaudio.EzaudioPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Audio File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioFileImpl#getFile <em>File</em>}</li>
 *   <li>{@link net.sf.smbt.fmodex.core.ezaudio.impl.AudioFileImpl#getExt <em>Ext</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AudioFileImpl extends MinimalEObjectImpl.Container implements AudioFile {
	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final File FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected File file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExt() <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExt()
	 * @generated
	 * @ordered
	 */
	protected static final String EXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExt() <em>Ext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExt()
	 * @generated
	 * @ordered
	 */
	protected String ext = EXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzaudioPackage.Literals.AUDIO_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(File newFile) {
		File oldFile = file;
		file = newFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_FILE__FILE, oldFile, file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExt() {
		return ext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExt(String newExt) {
		String oldExt = ext;
		ext = newExt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzaudioPackage.AUDIO_FILE__EXT, oldExt, ext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_FILE__FILE:
				return getFile();
			case EzaudioPackage.AUDIO_FILE__EXT:
				return getExt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_FILE__FILE:
				setFile((File)newValue);
				return;
			case EzaudioPackage.AUDIO_FILE__EXT:
				setExt((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_FILE__FILE:
				setFile(FILE_EDEFAULT);
				return;
			case EzaudioPackage.AUDIO_FILE__EXT:
				setExt(EXT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EzaudioPackage.AUDIO_FILE__FILE:
				return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
			case EzaudioPackage.AUDIO_FILE__EXT:
				return EXT_EDEFAULT == null ? ext != null : !EXT_EDEFAULT.equals(ext);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (file: ");
		result.append(file);
		result.append(", ext: ");
		result.append(ext);
		result.append(')');
		return result.toString();
	}

} //AudioFileImpl
