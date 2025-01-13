/**
 */
package Education.impl;

import Education.Assessment;
import Education.Course;
import Education.CourseMaterial;
import Education.DayOfWeek;
import Education.Department;
import Education.EducationFactory;
import Education.EducationMaterial;
import Education.EducationPackage;
import Education.Enrollment;
import Education.Grade;
import Education.HighSchool;
import Education.MaterialType;
import Education.NamedElement;
import Education.Room;
import Education.Schedule;
import Education.Score;
import Education.Semester;
import Education.SemesterOffered;
import Education.Status;
import Education.Student;
import Education.Teacher;
import Education.Type;
import Education.User;

import Education.util.EducationValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EducationPackageImpl extends EPackageImpl implements EducationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass highSchoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseMaterialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass educationMaterialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enrollmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teacherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dayOfWeekEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum materialTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scoreEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semesterOfferedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Education.EducationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EducationPackageImpl() {
		super(eNS_URI, EducationFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EducationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EducationPackage init() {
		if (isInited) return (EducationPackage)EPackage.Registry.INSTANCE.getEPackage(EducationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEducationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EducationPackageImpl theEducationPackage = registeredEducationPackage instanceof EducationPackageImpl ? (EducationPackageImpl)registeredEducationPackage : new EducationPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Education.Education.EducationPackage.eNS_URI);
		Education.Education.impl.EducationPackageImpl theEducationPackage_1 = (Education.Education.impl.EducationPackageImpl)(registeredPackage instanceof Education.Education.impl.EducationPackageImpl ? registeredPackage : Education.Education.EducationPackage.eINSTANCE);

		// Create package meta-data objects
		theEducationPackage.createPackageContents();
		theEducationPackage_1.createPackageContents();

		// Initialize created meta-data
		theEducationPackage.initializePackageContents();
		theEducationPackage_1.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theEducationPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return EducationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theEducationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EducationPackage.eNS_URI, theEducationPackage);
		return theEducationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHighSchool() {
		return highSchoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHighSchool_ID() {
		return (EAttribute)highSchoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHighSchool_FoundedYear() {
		return (EAttribute)highSchoolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHighSchool_Departments() {
		return (EReference)highSchoolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHighSchool_Courses() {
		return (EReference)highSchoolEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHighSchool_Teachers() {
		return (EReference)highSchoolEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHighSchool_Rooms() {
		return (EReference)highSchoolEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHighSchool_DepartmentCount() {
		return (EAttribute)highSchoolEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHighSchool_TotalCapacity() {
		return (EAttribute)highSchoolEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepartment() {
		return departmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepartment_ID() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepartment_Description() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepartment_FacultyHead() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStudent_YearOfEnrollment() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStudent_GPA() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStudent_Status() {
		return (EAttribute)studentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStudent__IsEligibleForHonors() {
		return studentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStudent__ValidGPA__DiagnosticChain_Map() {
		return studentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessment() {
		return assessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessment_ID() {
		return (EAttribute)assessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessment_Type() {
		return (EAttribute)assessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessment_Weight() {
		return (EAttribute)assessmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessment_Comments() {
		return (EAttribute)assessmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessment_DueDate() {
		return (EAttribute)assessmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessment_Grades() {
		return (EReference)assessmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssessment__ValidWeight__DiagnosticChain_Map() {
		return assessmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_ID() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Description() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourse_Credits() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_CourseMaterial() {
		return (EReference)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Enrollment() {
		return (EReference)courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Departments() {
		return (EReference)courseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Lecturer() {
		return (EReference)courseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Assessment() {
		return (EReference)courseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Room() {
		return (EReference)courseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourse_Semester() {
		return (EReference)courseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCourse__ValidCredits__DiagnosticChain_Map() {
		return courseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourseMaterial() {
		return courseMaterialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseMaterial_Format() {
		return (EAttribute)courseMaterialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseMaterial_FileSize() {
		return (EAttribute)courseMaterialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseMaterial_AccessURL() {
		return (EAttribute)courseMaterialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourseMaterial_LastUpdate() {
		return (EAttribute)courseMaterialEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEducationMaterial() {
		return educationMaterialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducationMaterial_ResourceID() {
		return (EAttribute)educationMaterialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducationMaterial_Title() {
		return (EAttribute)educationMaterialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEducationMaterial_Type() {
		return (EAttribute)educationMaterialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnrollment() {
		return enrollmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnrollment_ID() {
		return (EAttribute)enrollmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnrollment_Students() {
		return (EReference)enrollmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGrade() {
		return gradeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrade_ID() {
		return (EAttribute)gradeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrade_Score() {
		return (EAttribute)gradeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrade_DateAssigned() {
		return (EAttribute)gradeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGrade_MaxScore() {
		return (EAttribute)gradeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGrade_Student() {
		return (EReference)gradeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGrade_Assesment() {
		return (EReference)gradeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoom_ID() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoom_Capacity() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoom_ReservedClassroom() {
		return (EReference)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedule() {
		return scheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchedule_ID() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchedule_DayOfWeek() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchedule_StartTime() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchedule_Duration() {
		return (EAttribute)scheduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchedule_Course() {
		return (EReference)scheduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemester() {
		return semesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemester_ID() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemester_Year() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemester_Term() {
		return (EAttribute)semesterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeacher() {
		return teacherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeacher_Specialization() {
		return (EAttribute)teacherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeacher_Qualification() {
		return (EAttribute)teacherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTeacher_YearsOfExperience() {
		return (EAttribute)teacherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTeacher__IsExperiencedTeacher() {
		return teacherEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Email() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_ID() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDayOfWeek() {
		return dayOfWeekEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMaterialType() {
		return materialTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getScore() {
		return scoreEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSemesterOffered() {
		return semesterOfferedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EducationFactory getEducationFactory() {
		return (EducationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		highSchoolEClass = createEClass(HIGH_SCHOOL);
		createEAttribute(highSchoolEClass, HIGH_SCHOOL__ID);
		createEAttribute(highSchoolEClass, HIGH_SCHOOL__FOUNDED_YEAR);
		createEReference(highSchoolEClass, HIGH_SCHOOL__DEPARTMENTS);
		createEReference(highSchoolEClass, HIGH_SCHOOL__COURSES);
		createEReference(highSchoolEClass, HIGH_SCHOOL__TEACHERS);
		createEReference(highSchoolEClass, HIGH_SCHOOL__ROOMS);
		createEAttribute(highSchoolEClass, HIGH_SCHOOL__DEPARTMENT_COUNT);
		createEAttribute(highSchoolEClass, HIGH_SCHOOL__TOTAL_CAPACITY);

		departmentEClass = createEClass(DEPARTMENT);
		createEAttribute(departmentEClass, DEPARTMENT__ID);
		createEAttribute(departmentEClass, DEPARTMENT__DESCRIPTION);
		createEAttribute(departmentEClass, DEPARTMENT__FACULTY_HEAD);

		studentEClass = createEClass(STUDENT);
		createEAttribute(studentEClass, STUDENT__YEAR_OF_ENROLLMENT);
		createEAttribute(studentEClass, STUDENT__GPA);
		createEAttribute(studentEClass, STUDENT__STATUS);
		createEOperation(studentEClass, STUDENT___IS_ELIGIBLE_FOR_HONORS);
		createEOperation(studentEClass, STUDENT___VALID_GPA__DIAGNOSTICCHAIN_MAP);

		assessmentEClass = createEClass(ASSESSMENT);
		createEAttribute(assessmentEClass, ASSESSMENT__ID);
		createEAttribute(assessmentEClass, ASSESSMENT__TYPE);
		createEAttribute(assessmentEClass, ASSESSMENT__WEIGHT);
		createEAttribute(assessmentEClass, ASSESSMENT__COMMENTS);
		createEAttribute(assessmentEClass, ASSESSMENT__DUE_DATE);
		createEReference(assessmentEClass, ASSESSMENT__GRADES);
		createEOperation(assessmentEClass, ASSESSMENT___VALID_WEIGHT__DIAGNOSTICCHAIN_MAP);

		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__ID);
		createEAttribute(courseEClass, COURSE__DESCRIPTION);
		createEAttribute(courseEClass, COURSE__CREDITS);
		createEReference(courseEClass, COURSE__COURSE_MATERIAL);
		createEReference(courseEClass, COURSE__ENROLLMENT);
		createEReference(courseEClass, COURSE__DEPARTMENTS);
		createEReference(courseEClass, COURSE__LECTURER);
		createEReference(courseEClass, COURSE__ASSESSMENT);
		createEReference(courseEClass, COURSE__ROOM);
		createEReference(courseEClass, COURSE__SEMESTER);
		createEOperation(courseEClass, COURSE___VALID_CREDITS__DIAGNOSTICCHAIN_MAP);

		courseMaterialEClass = createEClass(COURSE_MATERIAL);
		createEAttribute(courseMaterialEClass, COURSE_MATERIAL__FORMAT);
		createEAttribute(courseMaterialEClass, COURSE_MATERIAL__FILE_SIZE);
		createEAttribute(courseMaterialEClass, COURSE_MATERIAL__ACCESS_URL);
		createEAttribute(courseMaterialEClass, COURSE_MATERIAL__LAST_UPDATE);

		educationMaterialEClass = createEClass(EDUCATION_MATERIAL);
		createEAttribute(educationMaterialEClass, EDUCATION_MATERIAL__RESOURCE_ID);
		createEAttribute(educationMaterialEClass, EDUCATION_MATERIAL__TITLE);
		createEAttribute(educationMaterialEClass, EDUCATION_MATERIAL__TYPE);

		enrollmentEClass = createEClass(ENROLLMENT);
		createEAttribute(enrollmentEClass, ENROLLMENT__ID);
		createEReference(enrollmentEClass, ENROLLMENT__STUDENTS);

		gradeEClass = createEClass(GRADE);
		createEAttribute(gradeEClass, GRADE__ID);
		createEAttribute(gradeEClass, GRADE__SCORE);
		createEAttribute(gradeEClass, GRADE__DATE_ASSIGNED);
		createEAttribute(gradeEClass, GRADE__MAX_SCORE);
		createEReference(gradeEClass, GRADE__STUDENT);
		createEReference(gradeEClass, GRADE__ASSESMENT);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__ID);
		createEAttribute(roomEClass, ROOM__CAPACITY);
		createEReference(roomEClass, ROOM__RESERVED_CLASSROOM);

		scheduleEClass = createEClass(SCHEDULE);
		createEAttribute(scheduleEClass, SCHEDULE__ID);
		createEAttribute(scheduleEClass, SCHEDULE__DAY_OF_WEEK);
		createEAttribute(scheduleEClass, SCHEDULE__START_TIME);
		createEAttribute(scheduleEClass, SCHEDULE__DURATION);
		createEReference(scheduleEClass, SCHEDULE__COURSE);

		semesterEClass = createEClass(SEMESTER);
		createEAttribute(semesterEClass, SEMESTER__ID);
		createEAttribute(semesterEClass, SEMESTER__YEAR);
		createEAttribute(semesterEClass, SEMESTER__TERM);

		teacherEClass = createEClass(TEACHER);
		createEAttribute(teacherEClass, TEACHER__SPECIALIZATION);
		createEAttribute(teacherEClass, TEACHER__QUALIFICATION);
		createEAttribute(teacherEClass, TEACHER__YEARS_OF_EXPERIENCE);
		createEOperation(teacherEClass, TEACHER___IS_EXPERIENCED_TEACHER);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__ID);

		// Create enums
		dayOfWeekEEnum = createEEnum(DAY_OF_WEEK);
		materialTypeEEnum = createEEnum(MATERIAL_TYPE);
		scoreEEnum = createEEnum(SCORE);
		semesterOfferedEEnum = createEEnum(SEMESTER_OFFERED);
		statusEEnum = createEEnum(STATUS);
		typeEEnum = createEEnum(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Education.Education.EducationPackage theEducationPackage_1 = (Education.Education.EducationPackage)EPackage.Registry.INSTANCE.getEPackage(Education.Education.EducationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theEducationPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		highSchoolEClass.getESuperTypes().add(this.getNamedElement());
		departmentEClass.getESuperTypes().add(this.getNamedElement());
		studentEClass.getESuperTypes().add(this.getUser());
		courseEClass.getESuperTypes().add(this.getNamedElement());
		roomEClass.getESuperTypes().add(this.getNamedElement());
		teacherEClass.getESuperTypes().add(this.getUser());
		userEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "Name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(highSchoolEClass, HighSchool.class, "HighSchool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHighSchool_ID(), ecorePackage.getEString(), "ID", null, 0, 1, HighSchool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHighSchool_FoundedYear(), ecorePackage.getEInt(), "FoundedYear", null, 1, 1, HighSchool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHighSchool_Departments(), this.getDepartment(), null, "Departments", null, 0, -1, HighSchool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHighSchool_Courses(), this.getCourse(), null, "Courses", null, 0, -1, HighSchool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHighSchool_Teachers(), this.getTeacher(), null, "Teachers", null, 0, -1, HighSchool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHighSchool_Rooms(), this.getRoom(), null, "Rooms", null, 0, -1, HighSchool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHighSchool_DepartmentCount(), ecorePackage.getEInt(), "DepartmentCount", null, 1, 1, HighSchool.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getHighSchool_TotalCapacity(), ecorePackage.getEInt(), "TotalCapacity", null, 1, 1, HighSchool.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepartment_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_FacultyHead(), ecorePackage.getEString(), "FacultyHead", null, 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudent_YearOfEnrollment(), ecorePackage.getEInt(), "YearOfEnrollment", null, 1, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_GPA(), ecorePackage.getEFloat(), "GPA", null, 1, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudent_Status(), this.getStatus(), "Status", null, 0, 1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStudent__IsEligibleForHonors(), ecorePackage.getEBoolean(), "isEligibleForHonors", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getStudent__ValidGPA__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidGPA", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(assessmentEClass, Assessment.class, "Assessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssessment_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssessment_Type(), this.getType(), "Type", null, 0, 1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssessment_Weight(), ecorePackage.getEString(), "Weight", null, 0, 1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssessment_Comments(), ecorePackage.getEString(), "Comments", null, 0, -1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssessment_DueDate(), ecorePackage.getEDate(), "DueDate", null, 0, 1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssessment_Grades(), this.getGrade(), null, "Grades", null, 0, -1, Assessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAssessment__ValidWeight__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidWeight", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Description(), ecorePackage.getEString(), "Description", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credits(), ecorePackage.getEInt(), "Credits", null, 1, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_CourseMaterial(), this.getCourseMaterial(), null, "CourseMaterial", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Enrollment(), this.getEnrollment(), null, "Enrollment", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Departments(), this.getDepartment(), null, "Departments", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Lecturer(), this.getTeacher(), null, "Lecturer", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Assessment(), this.getAssessment(), null, "Assessment", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Room(), this.getRoom(), null, "Room", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_Semester(), this.getSemester(), null, "Semester", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCourse__ValidCredits__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ValidCredits", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(courseMaterialEClass, CourseMaterial.class, "CourseMaterial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseMaterial_Format(), ecorePackage.getEString(), "Format", null, 0, 1, CourseMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseMaterial_FileSize(), ecorePackage.getEInt(), "FileSize", null, 1, 1, CourseMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseMaterial_AccessURL(), ecorePackage.getEString(), "AccessURL", null, 0, 1, CourseMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseMaterial_LastUpdate(), ecorePackage.getEDate(), "LastUpdate", null, 0, 1, CourseMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(educationMaterialEClass, EducationMaterial.class, "EducationMaterial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEducationMaterial_ResourceID(), ecorePackage.getEString(), "ResourceID", null, 0, 1, EducationMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEducationMaterial_Title(), ecorePackage.getEString(), "Title", null, 0, 1, EducationMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEducationMaterial_Type(), this.getMaterialType(), "Type", null, 0, 1, EducationMaterial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enrollmentEClass, Enrollment.class, "Enrollment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnrollment_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Enrollment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnrollment_Students(), this.getStudent(), null, "Students", null, 0, -1, Enrollment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradeEClass, Grade.class, "Grade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrade_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrade_Score(), this.getScore(), "Score", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrade_DateAssigned(), ecorePackage.getEDate(), "DateAssigned", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrade_MaxScore(), ecorePackage.getEFloat(), "MaxScore", null, 1, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrade_Student(), this.getStudent(), null, "Student", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrade_Assesment(), this.getAssessment(), null, "Assesment", null, 0, 1, Grade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_Capacity(), ecorePackage.getEInt(), "Capacity", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_ReservedClassroom(), this.getSchedule(), null, "ReservedClassroom", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scheduleEClass, Schedule.class, "Schedule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchedule_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_DayOfWeek(), this.getDayOfWeek(), "DayOfWeek", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_StartTime(), ecorePackage.getEString(), "StartTime", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSchedule_Duration(), ecorePackage.getEInt(), "Duration", null, 1, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchedule_Course(), this.getCourse(), null, "Course", null, 0, 1, Schedule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semesterEClass, Semester.class, "Semester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemester_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemester_Year(), ecorePackage.getEInt(), "Year", null, 1, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemester_Term(), this.getSemesterOffered(), "Term", null, 0, 1, Semester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(teacherEClass, Teacher.class, "Teacher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTeacher_Specialization(), ecorePackage.getEString(), "Specialization", null, 0, 1, Teacher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeacher_Qualification(), ecorePackage.getEString(), "Qualification", null, 0, 1, Teacher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTeacher_YearsOfExperience(), ecorePackage.getEInt(), "YearsOfExperience", null, 1, 1, Teacher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTeacher__IsExperiencedTeacher(), ecorePackage.getEBoolean(), "isExperiencedTeacher", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "Email", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_ID(), ecorePackage.getEString(), "ID", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dayOfWeekEEnum, DayOfWeek.class, "DayOfWeek");
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.MONDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.TUESDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.WEDNESDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.THURSDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.FRIDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.SATURDAY);
		addEEnumLiteral(dayOfWeekEEnum, DayOfWeek.SUNDAY);

		initEEnum(materialTypeEEnum, MaterialType.class, "MaterialType");
		addEEnumLiteral(materialTypeEEnum, MaterialType.DOCUMENT);
		addEEnumLiteral(materialTypeEEnum, MaterialType.MULTIMEDIA);

		initEEnum(scoreEEnum, Score.class, "Score");
		addEEnumLiteral(scoreEEnum, Score.A);
		addEEnumLiteral(scoreEEnum, Score.B);
		addEEnumLiteral(scoreEEnum, Score.C);
		addEEnumLiteral(scoreEEnum, Score.D);

		initEEnum(semesterOfferedEEnum, SemesterOffered.class, "SemesterOffered");
		addEEnumLiteral(semesterOfferedEEnum, SemesterOffered.WINTER);
		addEEnumLiteral(semesterOfferedEEnum, SemesterOffered.SUMMER);

		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.ACTIVE);
		addEEnumLiteral(statusEEnum, Status.INACTIVE);
		addEEnumLiteral(statusEEnum, Status.GRADUATED);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.ORAL);
		addEEnumLiteral(typeEEnum, Type.QUIZ);
		addEEnumLiteral(typeEEnum, Type.ASSIGNMENT);
		addEEnumLiteral(typeEEnum, Type.WRITTEN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (studentEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (assessmentEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (courseEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getStudent__IsEligibleForHonors(),
		   source,
		   new String[] {
			   "body", "self.GPA > 3.5"
		   });
		addAnnotation
		  (getStudent__ValidGPA__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.GPA >= 0.0 and self.GPA <= 4.0"
		   });
		addAnnotation
		  (getAssessment__ValidWeight__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.Weight.toInteger() >= 1 and self.Weight.toInteger() <= 100"
		   });
		addAnnotation
		  (getCourse__ValidCredits__DiagnosticChain_Map(),
		   source,
		   new String[] {
			   "body", "self.Credits >= 1 and self.Credits <= 6"
		   });
		addAnnotation
		  (getTeacher__IsExperiencedTeacher(),
		   source,
		   new String[] {
			   "body", "self.YearsOfExperience > 10"
		   });
	}

} //EducationPackageImpl
