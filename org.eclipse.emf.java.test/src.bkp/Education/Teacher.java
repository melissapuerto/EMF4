/**
 */
package Education;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Education.Teacher#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link Education.Teacher#getQualification <em>Qualification</em>}</li>
 *   <li>{@link Education.Teacher#getYearsOfExperience <em>Years Of Experience</em>}</li>
 * </ul>
 *
 * @see Education.EducationPackage#getTeacher()
 * @model
 * @generated
 */
public interface Teacher extends User {
	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' attribute.
	 * @see #setSpecialization(String)
	 * @see Education.EducationPackage#getTeacher_Specialization()
	 * @model
	 * @generated
	 */
	String getSpecialization();

	/**
	 * Sets the value of the '{@link Education.Teacher#getSpecialization <em>Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' attribute.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(String value);

	/**
	 * Returns the value of the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualification</em>' attribute.
	 * @see #setQualification(String)
	 * @see Education.EducationPackage#getTeacher_Qualification()
	 * @model
	 * @generated
	 */
	String getQualification();

	/**
	 * Sets the value of the '{@link Education.Teacher#getQualification <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualification</em>' attribute.
	 * @see #getQualification()
	 * @generated
	 */
	void setQualification(String value);

	/**
	 * Returns the value of the '<em><b>Years Of Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Years Of Experience</em>' attribute.
	 * @see #setYearsOfExperience(int)
	 * @see Education.EducationPackage#getTeacher_YearsOfExperience()
	 * @model
	 * @generated
	 */
	int getYearsOfExperience();

	/**
	 * Sets the value of the '{@link Education.Teacher#getYearsOfExperience <em>Years Of Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Years Of Experience</em>' attribute.
	 * @see #getYearsOfExperience()
	 * @generated
	 */
	void setYearsOfExperience(int value);

} // Teacher
