/**
 */
package Education;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Education.CourseMaterial#getFormat <em>Format</em>}</li>
 *   <li>{@link Education.CourseMaterial#getFileSize <em>File Size</em>}</li>
 *   <li>{@link Education.CourseMaterial#getAccessURL <em>Access URL</em>}</li>
 *   <li>{@link Education.CourseMaterial#getLastUpdate <em>Last Update</em>}</li>
 * </ul>
 *
 * @see Education.EducationPackage#getCourseMaterial()
 * @model
 * @generated
 */
public interface CourseMaterial extends EObject {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see Education.EducationPackage#getCourseMaterial_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link Education.CourseMaterial#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Size</em>' attribute.
	 * @see #setFileSize(int)
	 * @see Education.EducationPackage#getCourseMaterial_FileSize()
	 * @model
	 * @generated
	 */
	int getFileSize();

	/**
	 * Sets the value of the '{@link Education.CourseMaterial#getFileSize <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Size</em>' attribute.
	 * @see #getFileSize()
	 * @generated
	 */
	void setFileSize(int value);

	/**
	 * Returns the value of the '<em><b>Access URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access URL</em>' attribute.
	 * @see #setAccessURL(String)
	 * @see Education.EducationPackage#getCourseMaterial_AccessURL()
	 * @model
	 * @generated
	 */
	String getAccessURL();

	/**
	 * Sets the value of the '{@link Education.CourseMaterial#getAccessURL <em>Access URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access URL</em>' attribute.
	 * @see #getAccessURL()
	 * @generated
	 */
	void setAccessURL(String value);

	/**
	 * Returns the value of the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Update</em>' attribute.
	 * @see #setLastUpdate(Date)
	 * @see Education.EducationPackage#getCourseMaterial_LastUpdate()
	 * @model
	 * @generated
	 */
	Date getLastUpdate();

	/**
	 * Sets the value of the '{@link Education.CourseMaterial#getLastUpdate <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Update</em>' attribute.
	 * @see #getLastUpdate()
	 * @generated
	 */
	void setLastUpdate(Date value);

} // CourseMaterial
