/**
 */
package Education.impl;

import Education.Education.EducationTables;
import Education.EducationPackage;
import Education.Teacher;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Education.impl.TeacherImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link Education.impl.TeacherImpl#getQualification <em>Qualification</em>}</li>
 *   <li>{@link Education.impl.TeacherImpl#getYearsOfExperience <em>Years Of Experience</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeacherImpl extends UserImpl implements Teacher {
	/**
	 * The default value of the '{@link #getSpecialization() <em>Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIALIZATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected String specialization = SPECIALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected String qualification = QUALIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearsOfExperience() <em>Years Of Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsOfExperience()
	 * @generated
	 * @ordered
	 */
	protected static final int YEARS_OF_EXPERIENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYearsOfExperience() <em>Years Of Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearsOfExperience()
	 * @generated
	 * @ordered
	 */
	protected int yearsOfExperience = YEARS_OF_EXPERIENCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeacherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationPackage.Literals.TEACHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecialization() {
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialization(String newSpecialization) {
		String oldSpecialization = specialization;
		specialization = newSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.TEACHER__SPECIALIZATION, oldSpecialization, specialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualification() {
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualification(String newQualification) {
		String oldQualification = qualification;
		qualification = newQualification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.TEACHER__QUALIFICATION, oldQualification, qualification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearsOfExperience(int newYearsOfExperience) {
		int oldYearsOfExperience = yearsOfExperience;
		yearsOfExperience = newYearsOfExperience;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.TEACHER__YEARS_OF_EXPERIENCE, oldYearsOfExperience, yearsOfExperience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExperiencedTeacher() {
		/**
		 * self.YearsOfExperience > 10
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ int YearsOfExperience = this.getYearsOfExperience();
		final /*@NonInvalid*/ IntegerValue BOXED_YearsOfExperience = ValueUtil.integerValueOf(YearsOfExperience);
		final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_YearsOfExperience, EducationTables.INT_10).booleanValue();
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EducationPackage.TEACHER__SPECIALIZATION:
				return getSpecialization();
			case EducationPackage.TEACHER__QUALIFICATION:
				return getQualification();
			case EducationPackage.TEACHER__YEARS_OF_EXPERIENCE:
				return getYearsOfExperience();
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
			case EducationPackage.TEACHER__SPECIALIZATION:
				setSpecialization((String)newValue);
				return;
			case EducationPackage.TEACHER__QUALIFICATION:
				setQualification((String)newValue);
				return;
			case EducationPackage.TEACHER__YEARS_OF_EXPERIENCE:
				setYearsOfExperience((Integer)newValue);
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
			case EducationPackage.TEACHER__SPECIALIZATION:
				setSpecialization(SPECIALIZATION_EDEFAULT);
				return;
			case EducationPackage.TEACHER__QUALIFICATION:
				setQualification(QUALIFICATION_EDEFAULT);
				return;
			case EducationPackage.TEACHER__YEARS_OF_EXPERIENCE:
				setYearsOfExperience(YEARS_OF_EXPERIENCE_EDEFAULT);
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
			case EducationPackage.TEACHER__SPECIALIZATION:
				return SPECIALIZATION_EDEFAULT == null ? specialization != null : !SPECIALIZATION_EDEFAULT.equals(specialization);
			case EducationPackage.TEACHER__QUALIFICATION:
				return QUALIFICATION_EDEFAULT == null ? qualification != null : !QUALIFICATION_EDEFAULT.equals(qualification);
			case EducationPackage.TEACHER__YEARS_OF_EXPERIENCE:
				return yearsOfExperience != YEARS_OF_EXPERIENCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EducationPackage.TEACHER___IS_EXPERIENCED_TEACHER:
				return isExperiencedTeacher();
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
		result.append(" (Specialization: ");
		result.append(specialization);
		result.append(", Qualification: ");
		result.append(qualification);
		result.append(", YearsOfExperience: ");
		result.append(yearsOfExperience);
		result.append(')');
		return result.toString();
	}

} //TeacherImpl
