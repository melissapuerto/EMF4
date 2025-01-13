/**
 */
package Education.util;

import Education.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Education.EducationPackage
 * @generated
 */
public class EducationValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EducationValidator INSTANCE = new EducationValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Education";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid GPA' of 'Student'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STUDENT__VALID_GPA = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Weight' of 'Assessment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT__VALID_WEIGHT = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Valid Credits' of 'Course'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COURSE__VALID_CREDITS = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 3;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducationValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EducationPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EducationPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case EducationPackage.HIGH_SCHOOL:
				return validateHighSchool((HighSchool)value, diagnostics, context);
			case EducationPackage.DEPARTMENT:
				return validateDepartment((Department)value, diagnostics, context);
			case EducationPackage.STUDENT:
				return validateStudent((Student)value, diagnostics, context);
			case EducationPackage.ASSESSMENT:
				return validateAssessment((Assessment)value, diagnostics, context);
			case EducationPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case EducationPackage.COURSE_MATERIAL:
				return validateCourseMaterial((CourseMaterial)value, diagnostics, context);
			case EducationPackage.EDUCATION_MATERIAL:
				return validateEducationMaterial((EducationMaterial)value, diagnostics, context);
			case EducationPackage.ENROLLMENT:
				return validateEnrollment((Enrollment)value, diagnostics, context);
			case EducationPackage.GRADE:
				return validateGrade((Grade)value, diagnostics, context);
			case EducationPackage.ROOM:
				return validateRoom((Room)value, diagnostics, context);
			case EducationPackage.SCHEDULE:
				return validateSchedule((Schedule)value, diagnostics, context);
			case EducationPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case EducationPackage.TEACHER:
				return validateTeacher((Teacher)value, diagnostics, context);
			case EducationPackage.USER:
				return validateUser((User)value, diagnostics, context);
			case EducationPackage.DAY_OF_WEEK:
				return validateDayOfWeek((DayOfWeek)value, diagnostics, context);
			case EducationPackage.MATERIAL_TYPE:
				return validateMaterialType((MaterialType)value, diagnostics, context);
			case EducationPackage.SCORE:
				return validateScore((Score)value, diagnostics, context);
			case EducationPackage.SEMESTER_OFFERED:
				return validateSemesterOffered((SemesterOffered)value, diagnostics, context);
			case EducationPackage.STATUS:
				return validateStatus((Status)value, diagnostics, context);
			case EducationPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHighSchool(HighSchool highSchool, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(highSchool, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDepartment(Department department, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(department, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(student, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(student, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(student, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudent_ValidGPA(student, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidGPA constraint of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent_ValidGPA(Student student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return student.ValidGPA(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessment(Assessment assessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assessment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assessment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assessment, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessment_ValidWeight(assessment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidWeight constraint of '<em>Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessment_ValidWeight(Assessment assessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessment.ValidWeight(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(course, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(course, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourse_ValidCredits(course, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ValidCredits constraint of '<em>Course</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse_ValidCredits(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return course.ValidCredits(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseMaterial(CourseMaterial courseMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseMaterial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEducationMaterial(EducationMaterial educationMaterial, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(educationMaterial, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnrollment(Enrollment enrollment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enrollment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGrade(Grade grade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(grade, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(room, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchedule(Schedule schedule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schedule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeacher(Teacher teacher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(teacher, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(user, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDayOfWeek(DayOfWeek dayOfWeek, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaterialType(MaterialType materialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScore(Score score, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterOffered(SemesterOffered semesterOffered, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatus(Status status, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EducationValidator
