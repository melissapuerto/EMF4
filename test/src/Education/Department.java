/**
 */
package Education;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Education.Department#getID <em>ID</em>}</li>
 *   <li>{@link Education.Department#getDescription <em>Description</em>}</li>
 *   <li>{@link Education.Department#getFacultyHead <em>Faculty Head</em>}</li>
 * </ul>
 *
 * @see Education.EducationPackage#getDepartment()
 * @model
 * @generated
 */
public interface Department extends NamedElement {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see Education.EducationPackage#getDepartment_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link Education.Department#getID <em>ID</em>}' attribute.
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
	 * @see Education.EducationPackage#getDepartment_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Education.Department#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Faculty Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faculty Head</em>' attribute.
	 * @see #setFacultyHead(String)
	 * @see Education.EducationPackage#getDepartment_FacultyHead()
	 * @model
	 * @generated
	 */
	String getFacultyHead();

	/**
	 * Sets the value of the '{@link Education.Department#getFacultyHead <em>Faculty Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faculty Head</em>' attribute.
	 * @see #getFacultyHead()
	 * @generated
	 */
	void setFacultyHead(String value);

} // Department
