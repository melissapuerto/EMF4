/**
 */
package Education.Education.impl;

import Education.DayOfWeek;

import Education.Education.*;

import Education.MaterialType;
import Education.Score;
import Education.SemesterOffered;
import Education.Status;
import Education.Type;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EducationFactoryImpl extends EFactoryImpl implements EducationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EducationFactory init() {
		try {
			EducationFactory theEducationFactory = (EducationFactory)EPackage.Registry.INSTANCE.getEFactory(EducationPackage.eNS_URI);
			if (theEducationFactory != null) {
				return theEducationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EducationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EducationPackage.HIGH_SCHOOL: return createHighSchool();
			case EducationPackage.DEPARTMENT: return createDepartment();
			case EducationPackage.STUDENT: return createStudent();
			case EducationPackage.ASSESSMENT: return createAssessment();
			case EducationPackage.COURSE: return createCourse();
			case EducationPackage.COURSE_MATERIAL: return createCourseMaterial();
			case EducationPackage.EDUCATION_MATERIAL: return createEducationMaterial();
			case EducationPackage.ENROLLMENT: return createEnrollment();
			case EducationPackage.GRADE: return createGrade();
			case EducationPackage.ROOM: return createRoom();
			case EducationPackage.SCHEDULE: return createSchedule();
			case EducationPackage.SEMESTER: return createSemester();
			case EducationPackage.TEACHER: return createTeacher();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EducationPackage.DAY_OF_WEEK:
				return createDayOfWeekFromString(eDataType, initialValue);
			case EducationPackage.MATERIAL_TYPE:
				return createMaterialTypeFromString(eDataType, initialValue);
			case EducationPackage.SCORE:
				return createScoreFromString(eDataType, initialValue);
			case EducationPackage.SEMESTER_OFFERED:
				return createSemesterOfferedFromString(eDataType, initialValue);
			case EducationPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			case EducationPackage.TYPE:
				return createTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EducationPackage.DAY_OF_WEEK:
				return convertDayOfWeekToString(eDataType, instanceValue);
			case EducationPackage.MATERIAL_TYPE:
				return convertMaterialTypeToString(eDataType, instanceValue);
			case EducationPackage.SCORE:
				return convertScoreToString(eDataType, instanceValue);
			case EducationPackage.SEMESTER_OFFERED:
				return convertSemesterOfferedToString(eDataType, instanceValue);
			case EducationPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			case EducationPackage.TYPE:
				return convertTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HighSchool createHighSchool() {
		HighSchoolImpl highSchool = new HighSchoolImpl();
		return highSchool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department createDepartment() {
		DepartmentImpl department = new DepartmentImpl();
		return department;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student createStudent() {
		StudentImpl student = new StudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assessment createAssessment() {
		AssessmentImpl assessment = new AssessmentImpl();
		return assessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course createCourse() {
		CourseImpl course = new CourseImpl();
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseMaterial createCourseMaterial() {
		CourseMaterialImpl courseMaterial = new CourseMaterialImpl();
		return courseMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EducationMaterial createEducationMaterial() {
		EducationMaterialImpl educationMaterial = new EducationMaterialImpl();
		return educationMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enrollment createEnrollment() {
		EnrollmentImpl enrollment = new EnrollmentImpl();
		return enrollment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Grade createGrade() {
		GradeImpl grade = new GradeImpl();
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Teacher createTeacher() {
		TeacherImpl teacher = new TeacherImpl();
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DayOfWeek createDayOfWeekFromString(EDataType eDataType, String initialValue) {
		Education.Education.DayOfWeek result = Education.Education.DayOfWeek.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDayOfWeekToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialType createMaterialTypeFromString(EDataType eDataType, String initialValue) {
		Education.Education.MaterialType result = Education.Education.MaterialType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaterialTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Score createScoreFromString(EDataType eDataType, String initialValue) {
		Education.Education.Score result = Education.Education.Score.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScoreToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemesterOffered createSemesterOfferedFromString(EDataType eDataType, String initialValue) {
		Education.Education.SemesterOffered result = Education.Education.SemesterOffered.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSemesterOfferedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Education.Education.Status result = Education.Education.Status.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createTypeFromString(EDataType eDataType, String initialValue) {
		Education.Education.Type result = Education.Education.Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EducationPackage getEducationPackage() {
		return (EducationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EducationPackage getPackage() {
		return EducationPackage.eINSTANCE;
	}

} //EducationFactoryImpl
