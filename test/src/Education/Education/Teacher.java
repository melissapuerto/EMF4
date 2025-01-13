/**
 */
package Education.Education;

import Education.User;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Education.Education.Teacher#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link Education.Education.Teacher#getQualification <em>Qualification</em>}</li>
 *   <li>{@link Education.Education.Teacher#getYearsOfExperience <em>Years Of Experience</em>}</li>
 * </ul>
 *
 * @see Education.Education.EducationPackage#getTeacher()
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
	 * @see Education.Education.EducationPackage#getTeacher_Specialization()
	 * @model
	 * @generated
	 */
	String getSpecialization();

	/**
	 * Sets the value of the '{@link Education.Education.Teacher#getSpecialization <em>Specialization</em>}' attribute.
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
	 * @see Education.Education.EducationPackage#getTeacher_Qualification()
	 * @model
	 * @generated
	 */
	String getQualification();

	/**
	 * Sets the value of the '{@link Education.Education.Teacher#getQualification <em>Qualification</em>}' attribute.
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
	 * @see Education.Education.EducationPackage#getTeacher_YearsOfExperience()
	 * @model required="true"
	 * @generated
	 */
	int getYearsOfExperience();

	/**
	 * Sets the value of the '{@link Education.Education.Teacher#getYearsOfExperience <em>Years Of Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Years Of Experience</em>' attribute.
	 * @see #getYearsOfExperience()
	 * @generated
	 */
	void setYearsOfExperience(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.YearsOfExperience &gt; 10'"
	 * @generated
	 */
	boolean isExperiencedTeacher();

} // Teacher
