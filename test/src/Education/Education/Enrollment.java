/**
 */
package Education.Education;

import Education.Student;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enrollment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Education.Education.Enrollment#getID <em>ID</em>}</li>
 *   <li>{@link Education.Education.Enrollment#getStudents <em>Students</em>}</li>
 * </ul>
 *
 * @see Education.Education.EducationPackage#getEnrollment()
 * @model
 * @generated
 */
public interface Enrollment extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see Education.Education.EducationPackage#getEnrollment_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link Education.Education.Enrollment#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Students</b></em>' containment reference list.
	 * The list contents are of type {@link Education.Student}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Students</em>' containment reference list.
	 * @see Education.Education.EducationPackage#getEnrollment_Students()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getStudents();

} // Enrollment
