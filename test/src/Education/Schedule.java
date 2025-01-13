/**
 */
package Education;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Education.Schedule#getID <em>ID</em>}</li>
 *   <li>{@link Education.Schedule#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link Education.Schedule#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link Education.Schedule#getDuration <em>Duration</em>}</li>
 *   <li>{@link Education.Schedule#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see Education.EducationPackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see Education.EducationPackage#getSchedule_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link Education.Schedule#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Day Of Week</b></em>' attribute.
	 * The literals are from the enumeration {@link Education.DayOfWeek}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day Of Week</em>' attribute.
	 * @see Education.DayOfWeek
	 * @see #setDayOfWeek(DayOfWeek)
	 * @see Education.EducationPackage#getSchedule_DayOfWeek()
	 * @model
	 * @generated
	 */
	DayOfWeek getDayOfWeek();

	/**
	 * Sets the value of the '{@link Education.Schedule#getDayOfWeek <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day Of Week</em>' attribute.
	 * @see Education.DayOfWeek
	 * @see #getDayOfWeek()
	 * @generated
	 */
	void setDayOfWeek(DayOfWeek value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see Education.EducationPackage#getSchedule_StartTime()
	 * @model
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link Education.Schedule#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see Education.EducationPackage#getSchedule_Duration()
	 * @model required="true"
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link Education.Schedule#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Course)
	 * @see Education.EducationPackage#getSchedule_Course()
	 * @model
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link Education.Schedule#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // Schedule
