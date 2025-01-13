/**
 */
package Education;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Education.EducationMaterial#getResourceID <em>Resource ID</em>}</li>
 *   <li>{@link Education.EducationMaterial#getTitle <em>Title</em>}</li>
 *   <li>{@link Education.EducationMaterial#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see Education.EducationPackage#getEducationMaterial()
 * @model
 * @generated
 */
public interface EducationMaterial extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource ID</em>' attribute.
	 * @see #setResourceID(String)
	 * @see Education.EducationPackage#getEducationMaterial_ResourceID()
	 * @model
	 * @generated
	 */
	String getResourceID();

	/**
	 * Sets the value of the '{@link Education.EducationMaterial#getResourceID <em>Resource ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource ID</em>' attribute.
	 * @see #getResourceID()
	 * @generated
	 */
	void setResourceID(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see Education.EducationPackage#getEducationMaterial_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link Education.EducationMaterial#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Education.MaterialType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Education.MaterialType
	 * @see #setType(MaterialType)
	 * @see Education.EducationPackage#getEducationMaterial_Type()
	 * @model
	 * @generated
	 */
	MaterialType getType();

	/**
	 * Sets the value of the '{@link Education.EducationMaterial#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Education.MaterialType
	 * @see #getType()
	 * @generated
	 */
	void setType(MaterialType value);

} // EducationMaterial
