/**
 */
package Education;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Education.Course#getID <em>ID</em>}</li>
 *   <li>{@link Education.Course#getDescription <em>Description</em>}</li>
 *   <li>{@link Education.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link Education.Course#getCourseMaterial <em>Course Material</em>}</li>
 *   <li>{@link Education.Course#getEnrollment <em>Enrollment</em>}</li>
 *   <li>{@link Education.Course#getDepartments <em>Departments</em>}</li>
 *   <li>{@link Education.Course#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link Education.Course#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link Education.Course#getRoom <em>Room</em>}</li>
 *   <li>{@link Education.Course#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see Education.EducationPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends NamedElement {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see Education.EducationPackage#getCourse_ID()
	 * @model ordered="false"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link Education.Course#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Education.EducationPackage#getCourse_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Education.Course#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(int)
	 * @see Education.EducationPackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	int getCredits();

	/**
	 * Sets the value of the '{@link Education.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(int value);

	/**
	 * Returns the value of the '<em><b>Course Material</b></em>' containment reference list.
	 * The list contents are of type {@link Education.CourseMaterial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Material</em>' containment reference list.
	 * @see Education.EducationPackage#getCourse_CourseMaterial()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseMaterial> getCourseMaterial();

	/**
	 * Returns the value of the '<em><b>Enrollment</b></em>' containment reference list.
	 * The list contents are of type {@link Education.Enrollment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enrollment</em>' containment reference list.
	 * @see Education.EducationPackage#getCourse_Enrollment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enrollment> getEnrollment();

	/**
	 * Returns the value of the '<em><b>Departments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departments</em>' containment reference.
	 * @see #setDepartments(Department)
	 * @see Education.EducationPackage#getCourse_Departments()
	 * @model containment="true"
	 * @generated
	 */
	Department getDepartments();

	/**
	 * Sets the value of the '{@link Education.Course#getDepartments <em>Departments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departments</em>' containment reference.
	 * @see #getDepartments()
	 * @generated
	 */
	void setDepartments(Department value);

	/**
	 * Returns the value of the '<em><b>Lecturer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lecturer</em>' reference.
	 * @see #setLecturer(Teacher)
	 * @see Education.EducationPackage#getCourse_Lecturer()
	 * @model
	 * @generated
	 */
	Teacher getLecturer();

	/**
	 * Sets the value of the '{@link Education.Course#getLecturer <em>Lecturer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lecturer</em>' reference.
	 * @see #getLecturer()
	 * @generated
	 */
	void setLecturer(Teacher value);

	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' containment reference list.
	 * The list contents are of type {@link Education.Assessment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment</em>' containment reference list.
	 * @see Education.EducationPackage#getCourse_Assessment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Assessment> getAssessment();

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see Education.EducationPackage#getCourse_Room()
	 * @model
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link Education.Course#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' containment reference.
	 * @see #setSemester(Semester)
	 * @see Education.EducationPackage#getCourse_Semester()
	 * @model containment="true"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link Education.Course#getSemester <em>Semester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' containment reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

} // Course
