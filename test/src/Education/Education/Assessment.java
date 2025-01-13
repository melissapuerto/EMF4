/**
 */
package Education.Education;

import Education.Grade;
import Education.Type;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Education.Education.Assessment#getID <em>ID</em>}</li>
 *   <li>{@link Education.Education.Assessment#getType <em>Type</em>}</li>
 *   <li>{@link Education.Education.Assessment#getWeight <em>Weight</em>}</li>
 *   <li>{@link Education.Education.Assessment#getComments <em>Comments</em>}</li>
 *   <li>{@link Education.Education.Assessment#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link Education.Education.Assessment#getGrades <em>Grades</em>}</li>
 * </ul>
 *
 * @see Education.Education.EducationPackage#getAssessment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Assessment extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see Education.Education.EducationPackage#getAssessment_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link Education.Education.Assessment#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Education.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Education.Type
	 * @see #setType(Type)
	 * @see Education.Education.EducationPackage#getAssessment_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link Education.Education.Assessment#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Education.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(String)
	 * @see Education.Education.EducationPackage#getAssessment_Weight()
	 * @model
	 * @generated
	 */
	String getWeight();

	/**
	 * Sets the value of the '{@link Education.Education.Assessment#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(String value);

	/**
	 * Returns the value of the '<em><b>Comments</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments</em>' attribute list.
	 * @see Education.Education.EducationPackage#getAssessment_Comments()
	 * @model
	 * @generated
	 */
	EList<String> getComments();

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see Education.Education.EducationPackage#getAssessment_DueDate()
	 * @model
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link Education.Education.Assessment#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Grades</b></em>' containment reference list.
	 * The list contents are of type {@link Education.Grade}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grades</em>' containment reference list.
	 * @see Education.Education.EducationPackage#getAssessment_Grades()
	 * @model containment="true"
	 * @generated
	 */
	EList<Grade> getGrades();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.Weight.toInteger() &gt;= 1 and self.Weight.toInteger() &lt;= 100'"
	 * @generated
	 */
	boolean ValidWeight(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Assessment
