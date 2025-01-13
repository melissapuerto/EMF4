/**
 */
package Education.Education.impl;

import Education.Education.EducationPackage;
import Education.Education.EducationTables;
import Education.Education.Student;

import Education.Status;

import Education.impl.UserImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Education.Education.impl.StudentImpl#getYearOfEnrollment <em>Year Of Enrollment</em>}</li>
 *   <li>{@link Education.Education.impl.StudentImpl#getGPA <em>GPA</em>}</li>
 *   <li>{@link Education.Education.impl.StudentImpl#getStatus <em>Status</em>}</li>
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
	protected static final float GPA_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getGPA() <em>GPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPA()
	 * @generated
	 * @ordered
	 */
	protected float gpa = GPA_EDEFAULT;

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
	public float getGPA() {
		return gpa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGPA(float newGPA) {
		float oldGPA = gpa;
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
	public boolean isEligibleForHonors() {
		/**
		 * self.GPA > 3.5
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ float GPA = this.getGPA();
		final /*@NonInvalid*/ RealValue BOXED_GPA = ValueUtil.realValueOf(GPA);
		final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_GPA, EducationTables.REA_3_5).booleanValue();
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidGPA(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Student::ValidGPA";
		try {
			/**
			 *
			 * inv ValidGPA:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.GPA >= 0.0 and self.GPA <= 4.0
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, EducationPackage.Literals.STUDENT___VALID_GPA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, EducationTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ float GPA_0 = this.getGPA();
				final /*@NonInvalid*/ RealValue BOXED_GPA_0 = ValueUtil.realValueOf(GPA_0);
				final /*@NonInvalid*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_GPA_0, EducationTables.REA_0_0).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!ge) {
					result = ValueUtil.FALSE_VALUE;
				}
				else {
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_GPA_0, EducationTables.REA_4_0).booleanValue();
					if (!le_0) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						result = ValueUtil.TRUE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, EducationTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
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
				setGPA((Float)newValue);
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EducationPackage.STUDENT___IS_ELIGIBLE_FOR_HONORS:
				return isEligibleForHonors();
			case EducationPackage.STUDENT___VALID_GPA__DIAGNOSTICCHAIN_MAP:
				return ValidGPA((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
