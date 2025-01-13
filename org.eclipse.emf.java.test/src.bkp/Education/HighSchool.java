/**
 */
package Education;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>High School</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Education.HighSchool#getID <em>ID</em>}</li>
 *   <li>{@link Education.HighSchool#getFoundedYear <em>Founded Year</em>}</li>
 *   <li>{@link Education.HighSchool#getDepartments <em>Departments</em>}</li>
 *   <li>{@link Education.HighSchool#getCourses <em>Courses</em>}</li>
 *   <li>{@link Education.HighSchool#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link Education.HighSchool#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @see Education.EducationPackage#getHighSchool()
 * @model
 * @generated
 */
public interface HighSchool extends NamedElement {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see Education.EducationPackage#getHighSchool_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link Education.HighSchool#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Founded Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Founded Year</em>' attribute.
	 * @see #setFoundedYear(int)
	 * @see Education.EducationPackage#getHighSchool_FoundedYear()
	 * @model
	 * @generated
	 */
	int getFoundedYear();

	/**
	 * Sets the value of the '{@link Education.HighSchool#getFoundedYear <em>Founded Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Founded Year</em>' attribute.
	 * @see #getFoundedYear()
	 * @generated
	 */
	void setFoundedYear(int value);

	/**
	 * Returns the value of the '<em><b>Departments</b></em>' containment reference list.
	 * The list contents are of type {@link Education.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departments</em>' containment reference list.
	 * @see Education.EducationPackage#getHighSchool_Departments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Department> getDepartments();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link Education.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see Education.EducationPackage#getHighSchool_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Teachers</b></em>' reference list.
	 * The list contents are of type {@link Education.Teacher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teachers</em>' reference list.
	 * @see Education.EducationPackage#getHighSchool_Teachers()
	 * @model
	 * @generated
	 */
	EList<Teacher> getTeachers();

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link Education.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see Education.EducationPackage#getHighSchool_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

} // HighSchool
