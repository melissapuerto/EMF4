/**
 */
package Education.Education;

import Education.Course;
import Education.Department;
import Education.NamedElement;
import Education.Room;
import Education.Teacher;

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
 *   <li>{@link Education.Education.HighSchool#getID <em>ID</em>}</li>
 *   <li>{@link Education.Education.HighSchool#getFoundedYear <em>Founded Year</em>}</li>
 *   <li>{@link Education.Education.HighSchool#getDepartments <em>Departments</em>}</li>
 *   <li>{@link Education.Education.HighSchool#getCourses <em>Courses</em>}</li>
 *   <li>{@link Education.Education.HighSchool#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link Education.Education.HighSchool#getRooms <em>Rooms</em>}</li>
 *   <li>{@link Education.Education.HighSchool#getDepartmentCount <em>Department Count</em>}</li>
 *   <li>{@link Education.Education.HighSchool#getTotalCapacity <em>Total Capacity</em>}</li>
 * </ul>
 *
 * @see Education.Education.EducationPackage#getHighSchool()
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
	 * @see Education.Education.EducationPackage#getHighSchool_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link Education.Education.HighSchool#getID <em>ID</em>}' attribute.
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
	 * @see Education.Education.EducationPackage#getHighSchool_FoundedYear()
	 * @model required="true"
	 * @generated
	 */
	int getFoundedYear();

	/**
	 * Sets the value of the '{@link Education.Education.HighSchool#getFoundedYear <em>Founded Year</em>}' attribute.
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
	 * @see Education.Education.EducationPackage#getHighSchool_Departments()
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
	 * @see Education.Education.EducationPackage#getHighSchool_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Teachers</b></em>' containment reference list.
	 * The list contents are of type {@link Education.Teacher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teachers</em>' containment reference list.
	 * @see Education.Education.EducationPackage#getHighSchool_Teachers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Teacher> getTeachers();

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link Education.Room}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see Education.Education.EducationPackage#getHighSchool_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Department Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Department Count</em>' attribute.
	 * @see #setDepartmentCount(int)
	 * @see Education.Education.EducationPackage#getHighSchool_DepartmentCount()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	int getDepartmentCount();

	/**
	 * Sets the value of the '{@link Education.Education.HighSchool#getDepartmentCount <em>Department Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Department Count</em>' attribute.
	 * @see #getDepartmentCount()
	 * @generated
	 */
	void setDepartmentCount(int value);

	/**
	 * Returns the value of the '<em><b>Total Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Capacity</em>' attribute.
	 * @see #setTotalCapacity(int)
	 * @see Education.Education.EducationPackage#getHighSchool_TotalCapacity()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	int getTotalCapacity();

	/**
	 * Sets the value of the '{@link Education.Education.HighSchool#getTotalCapacity <em>Total Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Capacity</em>' attribute.
	 * @see #getTotalCapacity()
	 * @generated
	 */
	void setTotalCapacity(int value);

} // HighSchool
