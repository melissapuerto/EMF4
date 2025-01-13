/**
 */
package Education.Education.impl;

import Education.Education.EducationMaterial;
import Education.Education.EducationPackage;

import Education.MaterialType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Education.Education.impl.EducationMaterialImpl#getResourceID <em>Resource ID</em>}</li>
 *   <li>{@link Education.Education.impl.EducationMaterialImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link Education.Education.impl.EducationMaterialImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EducationMaterialImpl extends MinimalEObjectImpl.Container implements EducationMaterial {
	/**
	 * The default value of the '{@link #getResourceID() <em>Resource ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceID()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceID() <em>Resource ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceID()
	 * @generated
	 * @ordered
	 */
	protected String resourceID = RESOURCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final MaterialType TYPE_EDEFAULT = MaterialType.DOCUMENT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MaterialType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EducationMaterialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationPackage.Literals.EDUCATION_MATERIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResourceID() {
		return resourceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourceID(String newResourceID) {
		String oldResourceID = resourceID;
		resourceID = newResourceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.EDUCATION_MATERIAL__RESOURCE_ID, oldResourceID, resourceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.EDUCATION_MATERIAL__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(MaterialType newType) {
		MaterialType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.EDUCATION_MATERIAL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EducationPackage.EDUCATION_MATERIAL__RESOURCE_ID:
				return getResourceID();
			case EducationPackage.EDUCATION_MATERIAL__TITLE:
				return getTitle();
			case EducationPackage.EDUCATION_MATERIAL__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EducationPackage.EDUCATION_MATERIAL__RESOURCE_ID:
				setResourceID((String)newValue);
				return;
			case EducationPackage.EDUCATION_MATERIAL__TITLE:
				setTitle((String)newValue);
				return;
			case EducationPackage.EDUCATION_MATERIAL__TYPE:
				setType((MaterialType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EducationPackage.EDUCATION_MATERIAL__RESOURCE_ID:
				setResourceID(RESOURCE_ID_EDEFAULT);
				return;
			case EducationPackage.EDUCATION_MATERIAL__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case EducationPackage.EDUCATION_MATERIAL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EducationPackage.EDUCATION_MATERIAL__RESOURCE_ID:
				return RESOURCE_ID_EDEFAULT == null ? resourceID != null : !RESOURCE_ID_EDEFAULT.equals(resourceID);
			case EducationPackage.EDUCATION_MATERIAL__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case EducationPackage.EDUCATION_MATERIAL__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ResourceID: ");
		result.append(resourceID);
		result.append(", Title: ");
		result.append(title);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //EducationMaterialImpl
