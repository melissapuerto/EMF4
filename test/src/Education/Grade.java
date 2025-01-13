/**
 */
package Education;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Education.Grade#getID <em>ID</em>}</li>
 *   <li>{@link Education.Grade#getScore <em>Score</em>}</li>
 *   <li>{@link Education.Grade#getDateAssigned <em>Date Assigned</em>}</li>
 *   <li>{@link Education.Grade#getMaxScore <em>Max Score</em>}</li>
 *   <li>{@link Education.Grade#getStudent <em>Student</em>}</li>
 *   <li>{@link Education.Grade#getAssesment <em>Assesment</em>}</li>
 * </ul>
 *
 * @see Education.EducationPackage#getGrade()
 * @model
 * @generated
 */
public interface Grade extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see Education.EducationPackage#getGrade_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link Education.Grade#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Score</b></em>' attribute.
	 * The literals are from the enumeration {@link Education.Score}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Score</em>' attribute.
	 * @see Education.Score
	 * @see #setScore(Score)
	 * @see Education.EducationPackage#getGrade_Score()
	 * @model
	 * @generated
	 */
	Score getScore();

	/**
	 * Sets the value of the '{@link Education.Grade#getScore <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Score</em>' attribute.
	 * @see Education.Score
	 * @see #getScore()
	 * @generated
	 */
	void setScore(Score value);

	/**
	 * Returns the value of the '<em><b>Date Assigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Assigned</em>' attribute.
	 * @see #setDateAssigned(Date)
	 * @see Education.EducationPackage#getGrade_DateAssigned()
	 * @model
	 * @generated
	 */
	Date getDateAssigned();

	/**
	 * Sets the value of the '{@link Education.Grade#getDateAssigned <em>Date Assigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Assigned</em>' attribute.
	 * @see #getDateAssigned()
	 * @generated
	 */
	void setDateAssigned(Date value);

	/**
	 * Returns the value of the '<em><b>Max Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Score</em>' attribute.
	 * @see #setMaxScore(float)
	 * @see Education.EducationPackage#getGrade_MaxScore()
	 * @model required="true"
	 * @generated
	 */
	float getMaxScore();

	/**
	 * Sets the value of the '{@link Education.Grade#getMaxScore <em>Max Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Score</em>' attribute.
	 * @see #getMaxScore()
	 * @generated
	 */
	void setMaxScore(float value);

	/**
	 * Returns the value of the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Student</em>' reference.
	 * @see #setStudent(Student)
	 * @see Education.EducationPackage#getGrade_Student()
	 * @model
	 * @generated
	 */
	Student getStudent();

	/**
	 * Sets the value of the '{@link Education.Grade#getStudent <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Student</em>' reference.
	 * @see #getStudent()
	 * @generated
	 */
	void setStudent(Student value);

	/**
	 * Returns the value of the '<em><b>Assesment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assesment</em>' reference.
	 * @see #setAssesment(Assessment)
	 * @see Education.EducationPackage#getGrade_Assesment()
	 * @model
	 * @generated
	 */
	Assessment getAssesment();

	/**
	 * Sets the value of the '{@link Education.Grade#getAssesment <em>Assesment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assesment</em>' reference.
	 * @see #getAssesment()
	 * @generated
	 */
	void setAssesment(Assessment value);

} // Grade
