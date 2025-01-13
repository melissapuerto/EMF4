/**
 */
package Education;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Education.Student#getYearOfEnrollment <em>Year Of Enrollment</em>}</li>
 *   <li>{@link Education.Student#getGPA <em>GPA</em>}</li>
 *   <li>{@link Education.Student#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see Education.EducationPackage#getStudent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ValidGPA'"
 * @generated
 */
public interface Student extends User {
	/**
	 * Returns the value of the '<em><b>Year Of Enrollment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year Of Enrollment</em>' attribute.
	 * @see #setYearOfEnrollment(int)
	 * @see Education.EducationPackage#getStudent_YearOfEnrollment()
	 * @model required="true"
	 * @generated
	 */
	int getYearOfEnrollment();

	/**
	 * Sets the value of the '{@link Education.Student#getYearOfEnrollment <em>Year Of Enrollment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year Of Enrollment</em>' attribute.
	 * @see #getYearOfEnrollment()
	 * @generated
	 */
	void setYearOfEnrollment(int value);

	/**
	 * Returns the value of the '<em><b>GPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GPA</em>' attribute.
	 * @see #setGPA(float)
	 * @see Education.EducationPackage#getStudent_GPA()
	 * @model required="true"
	 * @generated
	 */
	float getGPA();

	/**
	 * Sets the value of the '{@link Education.Student#getGPA <em>GPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GPA</em>' attribute.
	 * @see #getGPA()
	 * @generated
	 */
	void setGPA(float value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link Education.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see Education.Status
	 * @see #setStatus(Status)
	 * @see Education.EducationPackage#getStudent_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link Education.Student#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see Education.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.GPA &gt; 3.5'"
	 * @generated
	 */
	boolean isEligibleForHonors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.GPA &gt;= 0.0 and self.GPA &lt;= 4.0'"
	 * @generated
	 */
	boolean ValidGPA(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Student
