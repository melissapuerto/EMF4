/**
 */
package Education.impl;

import Education.EducationPackage;
import Education.Status;
import Education.Student;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Education.impl.StudentImpl#getYearOfEnrollment <em>Year Of Enrollment</em>}</li>
 *   <li>{@link Education.impl.StudentImpl#getGPA <em>GPA</em>}</li>
 *   <li>{@link Education.impl.StudentImpl#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends UserImpl implements Student {
	/**
	 * The default value of the '{@link #getYearOfEnrollment() <em>Year Of Enrollment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearOfEnrollment()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_OF_ENROLLMENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearOfEnrollment() <em>Year Of Enrollment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearOfEnrollment()
	 * @generated
	 * @ordered
	 */
	protected int yearOfEnrollment = YEAR_OF_ENROLLMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGPA() <em>GPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPA()
	 * @generated
	 * @ordered
	 */
	protected static final int GPA_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGPA() <em>GPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPA()
	 * @generated
	 * @ordered
	 */
	protected int gpa = GPA_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status STATUS_EDEFAULT = Status.ACTIVE;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYearOfEnrollment() {
		return yearOfEnrollment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearOfEnrollment(int newYearOfEnrollment) {
		int oldYearOfEnrollment = yearOfEnrollment;
		yearOfEnrollment = newYearOfEnrollment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.STUDENT__YEAR_OF_ENROLLMENT, oldYearOfEnrollment, yearOfEnrollment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getGPA() {
		return gpa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGPA(int newGPA) {
		int oldGPA = gpa;
		gpa = newGPA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.STUDENT__GPA, oldGPA, gpa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.STUDENT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EducationPackage.STUDENT__YEAR_OF_ENROLLMENT:
				return getYearOfEnrollment();
			case EducationPackage.STUDENT__GPA:
				return getGPA();
			case EducationPackage.STUDENT__STATUS:
				return getStatus();
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
			case EducationPackage.STUDENT__YEAR_OF_ENROLLMENT:
				setYearOfEnrollment((Integer)newValue);
				return;
			case EducationPackage.STUDENT__GPA:
				setGPA((Integer)newValue);
				return;
			case EducationPackage.STUDENT__STATUS:
				setStatus((Status)newValue);
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
			case EducationPackage.STUDENT__YEAR_OF_ENROLLMENT:
				setYearOfEnrollment(YEAR_OF_ENROLLMENT_EDEFAULT);
				return;
			case EducationPackage.STUDENT__GPA:
				setGPA(GPA_EDEFAULT);
				return;
			case EducationPackage.STUDENT__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case EducationPackage.STUDENT__YEAR_OF_ENROLLMENT:
				return yearOfEnrollment != YEAR_OF_ENROLLMENT_EDEFAULT;
			case EducationPackage.STUDENT__GPA:
				return gpa != GPA_EDEFAULT;
			case EducationPackage.STUDENT__STATUS:
				return status != STATUS_EDEFAULT;
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
		result.append(" (YearOfEnrollment: ");
		result.append(yearOfEnrollment);
		result.append(", GPA: ");
		result.append(gpa);
		result.append(", Status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //StudentImpl
