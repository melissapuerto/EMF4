/**
 */
package Education.Education.impl;

import Education.Education.Department;
import Education.Education.EducationPackage;

import Education.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Education.Education.impl.DepartmentImpl#getID <em>ID</em>}</li>
 *   <li>{@link Education.Education.impl.DepartmentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Education.Education.impl.DepartmentImpl#getFacultyHead <em>Faculty Head</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends NamedElementImpl implements Department {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFacultyHead() <em>Faculty Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacultyHead()
	 * @generated
	 * @ordered
	 */
	protected static final String FACULTY_HEAD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFacultyHead() <em>Faculty Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacultyHead()
	 * @generated
	 * @ordered
	 */
	protected String facultyHead = FACULTY_HEAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationPackage.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.DEPARTMENT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.DEPARTMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFacultyHead() {
		return facultyHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacultyHead(String newFacultyHead) {
		String oldFacultyHead = facultyHead;
		facultyHead = newFacultyHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.DEPARTMENT__FACULTY_HEAD, oldFacultyHead, facultyHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EducationPackage.DEPARTMENT__ID:
				return getID();
			case EducationPackage.DEPARTMENT__DESCRIPTION:
				return getDescription();
			case EducationPackage.DEPARTMENT__FACULTY_HEAD:
				return getFacultyHead();
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
			case EducationPackage.DEPARTMENT__ID:
				setID((String)newValue);
				return;
			case EducationPackage.DEPARTMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EducationPackage.DEPARTMENT__FACULTY_HEAD:
				setFacultyHead((String)newValue);
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
			case EducationPackage.DEPARTMENT__ID:
				setID(ID_EDEFAULT);
				return;
			case EducationPackage.DEPARTMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EducationPackage.DEPARTMENT__FACULTY_HEAD:
				setFacultyHead(FACULTY_HEAD_EDEFAULT);
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
			case EducationPackage.DEPARTMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EducationPackage.DEPARTMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EducationPackage.DEPARTMENT__FACULTY_HEAD:
				return FACULTY_HEAD_EDEFAULT == null ? facultyHead != null : !FACULTY_HEAD_EDEFAULT.equals(facultyHead);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", Description: ");
		result.append(description);
		result.append(", FacultyHead: ");
		result.append(facultyHead);
		result.append(')');
		return result.toString();
	}

} //DepartmentImpl
