/**
 */
package Education.Education.impl;

import Education.Education.CourseMaterial;
import Education.Education.EducationPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Education.Education.impl.CourseMaterialImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link Education.Education.impl.CourseMaterialImpl#getFileSize <em>File Size</em>}</li>
 *   <li>{@link Education.Education.impl.CourseMaterialImpl#getAccessURL <em>Access URL</em>}</li>
 *   <li>{@link Education.Education.impl.CourseMaterialImpl#getLastUpdate <em>Last Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseMaterialImpl extends MinimalEObjectImpl.Container implements CourseMaterial {
	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FILE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected int fileSize = FILE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccessURL() <em>Access URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccessURL() <em>Access URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessURL()
	 * @generated
	 * @ordered
	 */
	protected String accessURL = ACCESS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastUpdate() <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdate()
	 * @generated
	 * @ordered
	 */
	protected Date lastUpdate = LAST_UPDATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationPackage.Literals.COURSE_MATERIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.COURSE_MATERIAL__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFileSize() {
		return fileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileSize(int newFileSize) {
		int oldFileSize = fileSize;
		fileSize = newFileSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.COURSE_MATERIAL__FILE_SIZE, oldFileSize, fileSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessURL() {
		return accessURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessURL(String newAccessURL) {
		String oldAccessURL = accessURL;
		accessURL = newAccessURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.COURSE_MATERIAL__ACCESS_URL, oldAccessURL, accessURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastUpdate(Date newLastUpdate) {
		Date oldLastUpdate = lastUpdate;
		lastUpdate = newLastUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.COURSE_MATERIAL__LAST_UPDATE, oldLastUpdate, lastUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EducationPackage.COURSE_MATERIAL__FORMAT:
				return getFormat();
			case EducationPackage.COURSE_MATERIAL__FILE_SIZE:
				return getFileSize();
			case EducationPackage.COURSE_MATERIAL__ACCESS_URL:
				return getAccessURL();
			case EducationPackage.COURSE_MATERIAL__LAST_UPDATE:
				return getLastUpdate();
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
			case EducationPackage.COURSE_MATERIAL__FORMAT:
				setFormat((String)newValue);
				return;
			case EducationPackage.COURSE_MATERIAL__FILE_SIZE:
				setFileSize((Integer)newValue);
				return;
			case EducationPackage.COURSE_MATERIAL__ACCESS_URL:
				setAccessURL((String)newValue);
				return;
			case EducationPackage.COURSE_MATERIAL__LAST_UPDATE:
				setLastUpdate((Date)newValue);
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
			case EducationPackage.COURSE_MATERIAL__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case EducationPackage.COURSE_MATERIAL__FILE_SIZE:
				setFileSize(FILE_SIZE_EDEFAULT);
				return;
			case EducationPackage.COURSE_MATERIAL__ACCESS_URL:
				setAccessURL(ACCESS_URL_EDEFAULT);
				return;
			case EducationPackage.COURSE_MATERIAL__LAST_UPDATE:
				setLastUpdate(LAST_UPDATE_EDEFAULT);
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
			case EducationPackage.COURSE_MATERIAL__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case EducationPackage.COURSE_MATERIAL__FILE_SIZE:
				return fileSize != FILE_SIZE_EDEFAULT;
			case EducationPackage.COURSE_MATERIAL__ACCESS_URL:
				return ACCESS_URL_EDEFAULT == null ? accessURL != null : !ACCESS_URL_EDEFAULT.equals(accessURL);
			case EducationPackage.COURSE_MATERIAL__LAST_UPDATE:
				return LAST_UPDATE_EDEFAULT == null ? lastUpdate != null : !LAST_UPDATE_EDEFAULT.equals(lastUpdate);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Format: ");
		result.append(format);
		result.append(", FileSize: ");
		result.append(fileSize);
		result.append(", AccessURL: ");
		result.append(accessURL);
		result.append(", LastUpdate: ");
		result.append(lastUpdate);
		result.append(')');
		return result.toString();
	}

} //CourseMaterialImpl
