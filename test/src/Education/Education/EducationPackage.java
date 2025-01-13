/**
 */
package Education.Education;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Education.Education.EducationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface EducationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Education";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.univaq.disim.mde.course./EMS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EMS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EducationPackage eINSTANCE = Education.Education.impl.EducationPackageImpl.init();

	/**
	 * The meta object id for the '{@link Education.Education.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.NamedElementImpl
	 * @see Education.Education.impl.EducationPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Education.Education.impl.HighSchoolImpl <em>High School</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.HighSchoolImpl
	 * @see Education.Education.impl.EducationPackageImpl#getHighSchool()
	 * @generated
	 */
	int HIGH_SCHOOL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_SCHOOL__NAME = Education.EducationPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_SCHOOL__ID = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Founded Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_SCHOOL__FOUNDED_YEAR = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Departments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_SCHOOL__DEPARTMENTS = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_SCHOOL__COURSES = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Teachers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_SCHOOL__TEACHERS = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_SCHOOL__ROOMS = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Department Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_SCHOOL__DEPARTMENT_COUNT = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Total Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_SCHOOL__TOTAL_CAPACITY = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>High School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_SCHOOL_FEATURE_COUNT = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>High School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGH_SCHOOL_OPERATION_COUNT = Education.EducationPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Education.Education.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.DepartmentImpl
	 * @see Education.Education.impl.EducationPackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__NAME = Education.EducationPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__ID = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__DESCRIPTION = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Faculty Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__FACULTY_HEAD = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = Education.EducationPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Education.Education.impl.StudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.StudentImpl
	 * @see Education.Education.impl.EducationPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = Education.EducationPackage.USER__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__EMAIL = Education.EducationPackage.USER__EMAIL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__ID = Education.EducationPackage.USER__ID;

	/**
	 * The feature id for the '<em><b>Year Of Enrollment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__YEAR_OF_ENROLLMENT = Education.EducationPackage.USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>GPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__GPA = Education.EducationPackage.USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__STATUS = Education.EducationPackage.USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = Education.EducationPackage.USER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Eligible For Honors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___IS_ELIGIBLE_FOR_HONORS = Education.EducationPackage.USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Valid GPA</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT___VALID_GPA__DIAGNOSTICCHAIN_MAP = Education.EducationPackage.USER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = Education.EducationPackage.USER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Education.Education.impl.AssessmentImpl <em>Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.AssessmentImpl
	 * @see Education.Education.impl.EducationPackageImpl#getAssessment()
	 * @generated
	 */
	int ASSESSMENT = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__WEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__COMMENTS = 3;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__DUE_DATE = 4;

	/**
	 * The feature id for the '<em><b>Grades</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT__GRADES = 5;

	/**
	 * The number of structural features of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Valid Weight</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT___VALID_WEIGHT__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSESSMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Education.Education.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.CourseImpl
	 * @see Education.Education.impl.EducationPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = Education.EducationPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ID = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DESCRIPTION = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Course Material</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_MATERIAL = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Enrollment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ENROLLMENT = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Departments</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__DEPARTMENTS = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lecturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LECTURER = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Assessment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ASSESSMENT = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Room</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__ROOM = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__SEMESTER = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Valid Credits</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE___VALID_CREDITS__DIAGNOSTICCHAIN_MAP = Education.EducationPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = Education.EducationPackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Education.Education.impl.CourseMaterialImpl <em>Course Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.CourseMaterialImpl
	 * @see Education.Education.impl.EducationPackageImpl#getCourseMaterial()
	 * @generated
	 */
	int COURSE_MATERIAL = 6;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_MATERIAL__FORMAT = 0;

	/**
	 * The feature id for the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_MATERIAL__FILE_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Access URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_MATERIAL__ACCESS_URL = 2;

	/**
	 * The feature id for the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_MATERIAL__LAST_UPDATE = 3;

	/**
	 * The number of structural features of the '<em>Course Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_MATERIAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_MATERIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Education.Education.impl.EducationMaterialImpl <em>Material</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.EducationMaterialImpl
	 * @see Education.Education.impl.EducationPackageImpl#getEducationMaterial()
	 * @generated
	 */
	int EDUCATION_MATERIAL = 7;

	/**
	 * The feature id for the '<em><b>Resource ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_MATERIAL__RESOURCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_MATERIAL__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_MATERIAL__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_MATERIAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Material</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDUCATION_MATERIAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Education.Education.impl.EnrollmentImpl <em>Enrollment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.EnrollmentImpl
	 * @see Education.Education.impl.EducationPackageImpl#getEnrollment()
	 * @generated
	 */
	int ENROLLMENT = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Students</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT__STUDENTS = 1;

	/**
	 * The number of structural features of the '<em>Enrollment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enrollment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENROLLMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Education.Education.impl.GradeImpl <em>Grade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.GradeImpl
	 * @see Education.Education.impl.EducationPackageImpl#getGrade()
	 * @generated
	 */
	int GRADE = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__ID = 0;

	/**
	 * The feature id for the '<em><b>Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__SCORE = 1;

	/**
	 * The feature id for the '<em><b>Date Assigned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__DATE_ASSIGNED = 2;

	/**
	 * The feature id for the '<em><b>Max Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__MAX_SCORE = 3;

	/**
	 * The feature id for the '<em><b>Student</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__STUDENT = 4;

	/**
	 * The feature id for the '<em><b>Assesment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE__ASSESMENT = 5;

	/**
	 * The number of structural features of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Grade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRADE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Education.Education.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.RoomImpl
	 * @see Education.Education.impl.EducationPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = Education.EducationPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ID = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__CAPACITY = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reserved Classroom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__RESERVED_CLASSROOM = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = Education.EducationPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Education.Education.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.ScheduleImpl
	 * @see Education.Education.impl.EducationPackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__ID = 0;

	/**
	 * The feature id for the '<em><b>Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__DAY_OF_WEEK = 1;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__START_TIME = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__DURATION = 3;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__COURSE = 4;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Education.Education.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.SemesterImpl
	 * @see Education.Education.impl.EducationPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 12;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__ID = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__TERM = 2;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Education.Education.impl.TeacherImpl <em>Teacher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.TeacherImpl
	 * @see Education.Education.impl.EducationPackageImpl#getTeacher()
	 * @generated
	 */
	int TEACHER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__NAME = Education.EducationPackage.USER__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__EMAIL = Education.EducationPackage.USER__EMAIL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__ID = Education.EducationPackage.USER__ID;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__SPECIALIZATION = Education.EducationPackage.USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__QUALIFICATION = Education.EducationPackage.USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Years Of Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__YEARS_OF_EXPERIENCE = Education.EducationPackage.USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_FEATURE_COUNT = Education.EducationPackage.USER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Experienced Teacher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER___IS_EXPERIENCED_TEACHER = Education.EducationPackage.USER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_OPERATION_COUNT = Education.EducationPackage.USER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link Education.Education.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.impl.UserImpl
	 * @see Education.Education.impl.EducationPackageImpl#getUser()
	 * @generated
	 */
	int USER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = Education.EducationPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = Education.EducationPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = Education.EducationPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Education.Education.DayOfWeek <em>Day Of Week</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.DayOfWeek
	 * @see Education.Education.impl.EducationPackageImpl#getDayOfWeek()
	 * @generated
	 */
	int DAY_OF_WEEK = 15;

	/**
	 * The meta object id for the '{@link Education.Education.MaterialType <em>Material Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.MaterialType
	 * @see Education.Education.impl.EducationPackageImpl#getMaterialType()
	 * @generated
	 */
	int MATERIAL_TYPE = 16;

	/**
	 * The meta object id for the '{@link Education.Education.Score <em>Score</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.Score
	 * @see Education.Education.impl.EducationPackageImpl#getScore()
	 * @generated
	 */
	int SCORE = 17;

	/**
	 * The meta object id for the '{@link Education.Education.SemesterOffered <em>Semester Offered</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.SemesterOffered
	 * @see Education.Education.impl.EducationPackageImpl#getSemesterOffered()
	 * @generated
	 */
	int SEMESTER_OFFERED = 18;

	/**
	 * The meta object id for the '{@link Education.Education.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.Status
	 * @see Education.Education.impl.EducationPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 19;

	/**
	 * The meta object id for the '{@link Education.Education.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Education.Type
	 * @see Education.Education.impl.EducationPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 20;


	/**
	 * Returns the meta object for class '{@link Education.Education.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see Education.Education.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Education.Education.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link Education.Education.HighSchool <em>High School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>High School</em>'.
	 * @see Education.Education.HighSchool
	 * @generated
	 */
	EClass getHighSchool();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.HighSchool#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Education.Education.HighSchool#getID()
	 * @see #getHighSchool()
	 * @generated
	 */
	EAttribute getHighSchool_ID();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.HighSchool#getFoundedYear <em>Founded Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Founded Year</em>'.
	 * @see Education.Education.HighSchool#getFoundedYear()
	 * @see #getHighSchool()
	 * @generated
	 */
	EAttribute getHighSchool_FoundedYear();

	/**
	 * Returns the meta object for the containment reference list '{@link Education.Education.HighSchool#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Departments</em>'.
	 * @see Education.Education.HighSchool#getDepartments()
	 * @see #getHighSchool()
	 * @generated
	 */
	EReference getHighSchool_Departments();

	/**
	 * Returns the meta object for the containment reference list '{@link Education.Education.HighSchool#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see Education.Education.HighSchool#getCourses()
	 * @see #getHighSchool()
	 * @generated
	 */
	EReference getHighSchool_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link Education.Education.HighSchool#getTeachers <em>Teachers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teachers</em>'.
	 * @see Education.Education.HighSchool#getTeachers()
	 * @see #getHighSchool()
	 * @generated
	 */
	EReference getHighSchool_Teachers();

	/**
	 * Returns the meta object for the containment reference list '{@link Education.Education.HighSchool#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see Education.Education.HighSchool#getRooms()
	 * @see #getHighSchool()
	 * @generated
	 */
	EReference getHighSchool_Rooms();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.HighSchool#getDepartmentCount <em>Department Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department Count</em>'.
	 * @see Education.Education.HighSchool#getDepartmentCount()
	 * @see #getHighSchool()
	 * @generated
	 */
	EAttribute getHighSchool_DepartmentCount();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.HighSchool#getTotalCapacity <em>Total Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Capacity</em>'.
	 * @see Education.Education.HighSchool#getTotalCapacity()
	 * @see #getHighSchool()
	 * @generated
	 */
	EAttribute getHighSchool_TotalCapacity();

	/**
	 * Returns the meta object for class '{@link Education.Education.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see Education.Education.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Department#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Education.Education.Department#getID()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_ID();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Department#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Education.Education.Department#getDescription()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_Description();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Department#getFacultyHead <em>Faculty Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Faculty Head</em>'.
	 * @see Education.Education.Department#getFacultyHead()
	 * @see #getDepartment()
	 * @generated
	 */
	EAttribute getDepartment_FacultyHead();

	/**
	 * Returns the meta object for class '{@link Education.Education.Student <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see Education.Education.Student
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Student#getYearOfEnrollment <em>Year Of Enrollment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year Of Enrollment</em>'.
	 * @see Education.Education.Student#getYearOfEnrollment()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_YearOfEnrollment();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Student#getGPA <em>GPA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GPA</em>'.
	 * @see Education.Education.Student#getGPA()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_GPA();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Student#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see Education.Education.Student#getStatus()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Status();

	/**
	 * Returns the meta object for the '{@link Education.Education.Student#isEligibleForHonors() <em>Is Eligible For Honors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Eligible For Honors</em>' operation.
	 * @see Education.Education.Student#isEligibleForHonors()
	 * @generated
	 */
	EOperation getStudent__IsEligibleForHonors();

	/**
	 * Returns the meta object for the '{@link Education.Education.Student#ValidGPA(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid GPA</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid GPA</em>' operation.
	 * @see Education.Education.Student#ValidGPA(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getStudent__ValidGPA__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Education.Education.Assessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assessment</em>'.
	 * @see Education.Education.Assessment
	 * @generated
	 */
	EClass getAssessment();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Assessment#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Education.Education.Assessment#getID()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_ID();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Assessment#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Education.Education.Assessment#getType()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_Type();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Assessment#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see Education.Education.Assessment#getWeight()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_Weight();

	/**
	 * Returns the meta object for the attribute list '{@link Education.Education.Assessment#getComments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comments</em>'.
	 * @see Education.Education.Assessment#getComments()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_Comments();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Assessment#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see Education.Education.Assessment#getDueDate()
	 * @see #getAssessment()
	 * @generated
	 */
	EAttribute getAssessment_DueDate();

	/**
	 * Returns the meta object for the containment reference list '{@link Education.Education.Assessment#getGrades <em>Grades</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grades</em>'.
	 * @see Education.Education.Assessment#getGrades()
	 * @see #getAssessment()
	 * @generated
	 */
	EReference getAssessment_Grades();

	/**
	 * Returns the meta object for the '{@link Education.Education.Assessment#ValidWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Weight</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Weight</em>' operation.
	 * @see Education.Education.Assessment#ValidWeight(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAssessment__ValidWeight__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Education.Education.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see Education.Education.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Course#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Education.Education.Course#getID()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_ID();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Course#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Education.Education.Course#getDescription()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Description();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see Education.Education.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the containment reference list '{@link Education.Education.Course#getCourseMaterial <em>Course Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Course Material</em>'.
	 * @see Education.Education.Course#getCourseMaterial()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_CourseMaterial();

	/**
	 * Returns the meta object for the containment reference list '{@link Education.Education.Course#getEnrollment <em>Enrollment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enrollment</em>'.
	 * @see Education.Education.Course#getEnrollment()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Enrollment();

	/**
	 * Returns the meta object for the containment reference '{@link Education.Education.Course#getDepartments <em>Departments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Departments</em>'.
	 * @see Education.Education.Course#getDepartments()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Departments();

	/**
	 * Returns the meta object for the containment reference '{@link Education.Education.Course#getLecturer <em>Lecturer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lecturer</em>'.
	 * @see Education.Education.Course#getLecturer()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Lecturer();

	/**
	 * Returns the meta object for the containment reference list '{@link Education.Education.Course#getAssessment <em>Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assessment</em>'.
	 * @see Education.Education.Course#getAssessment()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Assessment();

	/**
	 * Returns the meta object for the containment reference '{@link Education.Education.Course#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Room</em>'.
	 * @see Education.Education.Course#getRoom()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Room();

	/**
	 * Returns the meta object for the containment reference '{@link Education.Education.Course#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Semester</em>'.
	 * @see Education.Education.Course#getSemester()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Semester();

	/**
	 * Returns the meta object for the '{@link Education.Education.Course#ValidCredits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Valid Credits</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Valid Credits</em>' operation.
	 * @see Education.Education.Course#ValidCredits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCourse__ValidCredits__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link Education.Education.CourseMaterial <em>Course Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Material</em>'.
	 * @see Education.Education.CourseMaterial
	 * @generated
	 */
	EClass getCourseMaterial();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.CourseMaterial#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see Education.Education.CourseMaterial#getFormat()
	 * @see #getCourseMaterial()
	 * @generated
	 */
	EAttribute getCourseMaterial_Format();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.CourseMaterial#getFileSize <em>File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Size</em>'.
	 * @see Education.Education.CourseMaterial#getFileSize()
	 * @see #getCourseMaterial()
	 * @generated
	 */
	EAttribute getCourseMaterial_FileSize();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.CourseMaterial#getAccessURL <em>Access URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access URL</em>'.
	 * @see Education.Education.CourseMaterial#getAccessURL()
	 * @see #getCourseMaterial()
	 * @generated
	 */
	EAttribute getCourseMaterial_AccessURL();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.CourseMaterial#getLastUpdate <em>Last Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Update</em>'.
	 * @see Education.Education.CourseMaterial#getLastUpdate()
	 * @see #getCourseMaterial()
	 * @generated
	 */
	EAttribute getCourseMaterial_LastUpdate();

	/**
	 * Returns the meta object for class '{@link Education.Education.EducationMaterial <em>Material</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material</em>'.
	 * @see Education.Education.EducationMaterial
	 * @generated
	 */
	EClass getEducationMaterial();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.EducationMaterial#getResourceID <em>Resource ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource ID</em>'.
	 * @see Education.Education.EducationMaterial#getResourceID()
	 * @see #getEducationMaterial()
	 * @generated
	 */
	EAttribute getEducationMaterial_ResourceID();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.EducationMaterial#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Education.Education.EducationMaterial#getTitle()
	 * @see #getEducationMaterial()
	 * @generated
	 */
	EAttribute getEducationMaterial_Title();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.EducationMaterial#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Education.Education.EducationMaterial#getType()
	 * @see #getEducationMaterial()
	 * @generated
	 */
	EAttribute getEducationMaterial_Type();

	/**
	 * Returns the meta object for class '{@link Education.Education.Enrollment <em>Enrollment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enrollment</em>'.
	 * @see Education.Education.Enrollment
	 * @generated
	 */
	EClass getEnrollment();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Enrollment#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Education.Education.Enrollment#getID()
	 * @see #getEnrollment()
	 * @generated
	 */
	EAttribute getEnrollment_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link Education.Education.Enrollment#getStudents <em>Students</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Students</em>'.
	 * @see Education.Education.Enrollment#getStudents()
	 * @see #getEnrollment()
	 * @generated
	 */
	EReference getEnrollment_Students();

	/**
	 * Returns the meta object for class '{@link Education.Education.Grade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grade</em>'.
	 * @see Education.Education.Grade
	 * @generated
	 */
	EClass getGrade();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Grade#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Education.Education.Grade#getID()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_ID();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Grade#getScore <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Score</em>'.
	 * @see Education.Education.Grade#getScore()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_Score();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Grade#getDateAssigned <em>Date Assigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Assigned</em>'.
	 * @see Education.Education.Grade#getDateAssigned()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_DateAssigned();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Grade#getMaxScore <em>Max Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Score</em>'.
	 * @see Education.Education.Grade#getMaxScore()
	 * @see #getGrade()
	 * @generated
	 */
	EAttribute getGrade_MaxScore();

	/**
	 * Returns the meta object for the reference '{@link Education.Education.Grade#getStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Student</em>'.
	 * @see Education.Education.Grade#getStudent()
	 * @see #getGrade()
	 * @generated
	 */
	EReference getGrade_Student();

	/**
	 * Returns the meta object for the reference '{@link Education.Education.Grade#getAssesment <em>Assesment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assesment</em>'.
	 * @see Education.Education.Grade#getAssesment()
	 * @see #getGrade()
	 * @generated
	 */
	EReference getGrade_Assesment();

	/**
	 * Returns the meta object for class '{@link Education.Education.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see Education.Education.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Room#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Education.Education.Room#getID()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_ID();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Room#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see Education.Education.Room#getCapacity()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Capacity();

	/**
	 * Returns the meta object for the containment reference '{@link Education.Education.Room#getReservedClassroom <em>Reserved Classroom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reserved Classroom</em>'.
	 * @see Education.Education.Room#getReservedClassroom()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_ReservedClassroom();

	/**
	 * Returns the meta object for class '{@link Education.Education.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see Education.Education.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Schedule#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Education.Education.Schedule#getID()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_ID();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Schedule#getDayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day Of Week</em>'.
	 * @see Education.Education.Schedule#getDayOfWeek()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_DayOfWeek();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Schedule#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see Education.Education.Schedule#getStartTime()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Schedule#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see Education.Education.Schedule#getDuration()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Duration();

	/**
	 * Returns the meta object for the reference '{@link Education.Education.Schedule#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see Education.Education.Schedule#getCourse()
	 * @see #getSchedule()
	 * @generated
	 */
	EReference getSchedule_Course();

	/**
	 * Returns the meta object for class '{@link Education.Education.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see Education.Education.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Semester#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Education.Education.Semester#getID()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_ID();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Semester#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see Education.Education.Semester#getYear()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Year();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Semester#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see Education.Education.Semester#getTerm()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Term();

	/**
	 * Returns the meta object for class '{@link Education.Education.Teacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teacher</em>'.
	 * @see Education.Education.Teacher
	 * @generated
	 */
	EClass getTeacher();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Teacher#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specialization</em>'.
	 * @see Education.Education.Teacher#getSpecialization()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Specialization();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Teacher#getQualification <em>Qualification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualification</em>'.
	 * @see Education.Education.Teacher#getQualification()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Qualification();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.Teacher#getYearsOfExperience <em>Years Of Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Years Of Experience</em>'.
	 * @see Education.Education.Teacher#getYearsOfExperience()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_YearsOfExperience();

	/**
	 * Returns the meta object for the '{@link Education.Education.Teacher#isExperiencedTeacher() <em>Is Experienced Teacher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Experienced Teacher</em>' operation.
	 * @see Education.Education.Teacher#isExperiencedTeacher()
	 * @generated
	 */
	EOperation getTeacher__IsExperiencedTeacher();

	/**
	 * Returns the meta object for class '{@link Education.Education.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see Education.Education.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Education.Education.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link Education.Education.User#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Education.Education.User#getID()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_ID();

	/**
	 * Returns the meta object for enum '{@link Education.Education.DayOfWeek <em>Day Of Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Day Of Week</em>'.
	 * @see Education.Education.DayOfWeek
	 * @generated
	 */
	EEnum getDayOfWeek();

	/**
	 * Returns the meta object for enum '{@link Education.Education.MaterialType <em>Material Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Material Type</em>'.
	 * @see Education.Education.MaterialType
	 * @generated
	 */
	EEnum getMaterialType();

	/**
	 * Returns the meta object for enum '{@link Education.Education.Score <em>Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Score</em>'.
	 * @see Education.Education.Score
	 * @generated
	 */
	EEnum getScore();

	/**
	 * Returns the meta object for enum '{@link Education.Education.SemesterOffered <em>Semester Offered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Semester Offered</em>'.
	 * @see Education.Education.SemesterOffered
	 * @generated
	 */
	EEnum getSemesterOffered();

	/**
	 * Returns the meta object for enum '{@link Education.Education.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see Education.Education.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link Education.Education.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see Education.Education.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EducationFactory getEducationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Education.Education.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.NamedElementImpl
		 * @see Education.Education.impl.EducationPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.HighSchoolImpl <em>High School</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.HighSchoolImpl
		 * @see Education.Education.impl.EducationPackageImpl#getHighSchool()
		 * @generated
		 */
		EClass HIGH_SCHOOL = eINSTANCE.getHighSchool();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGH_SCHOOL__ID = eINSTANCE.getHighSchool_ID();

		/**
		 * The meta object literal for the '<em><b>Founded Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGH_SCHOOL__FOUNDED_YEAR = eINSTANCE.getHighSchool_FoundedYear();

		/**
		 * The meta object literal for the '<em><b>Departments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGH_SCHOOL__DEPARTMENTS = eINSTANCE.getHighSchool_Departments();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGH_SCHOOL__COURSES = eINSTANCE.getHighSchool_Courses();

		/**
		 * The meta object literal for the '<em><b>Teachers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGH_SCHOOL__TEACHERS = eINSTANCE.getHighSchool_Teachers();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGH_SCHOOL__ROOMS = eINSTANCE.getHighSchool_Rooms();

		/**
		 * The meta object literal for the '<em><b>Department Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGH_SCHOOL__DEPARTMENT_COUNT = eINSTANCE.getHighSchool_DepartmentCount();

		/**
		 * The meta object literal for the '<em><b>Total Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIGH_SCHOOL__TOTAL_CAPACITY = eINSTANCE.getHighSchool_TotalCapacity();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.DepartmentImpl
		 * @see Education.Education.impl.EducationPackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__ID = eINSTANCE.getDepartment_ID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__DESCRIPTION = eINSTANCE.getDepartment_Description();

		/**
		 * The meta object literal for the '<em><b>Faculty Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPARTMENT__FACULTY_HEAD = eINSTANCE.getDepartment_FacultyHead();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.StudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.StudentImpl
		 * @see Education.Education.impl.EducationPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Year Of Enrollment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__YEAR_OF_ENROLLMENT = eINSTANCE.getStudent_YearOfEnrollment();

		/**
		 * The meta object literal for the '<em><b>GPA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__GPA = eINSTANCE.getStudent_GPA();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__STATUS = eINSTANCE.getStudent_Status();

		/**
		 * The meta object literal for the '<em><b>Is Eligible For Honors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___IS_ELIGIBLE_FOR_HONORS = eINSTANCE.getStudent__IsEligibleForHonors();

		/**
		 * The meta object literal for the '<em><b>Valid GPA</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STUDENT___VALID_GPA__DIAGNOSTICCHAIN_MAP = eINSTANCE.getStudent__ValidGPA__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.AssessmentImpl <em>Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.AssessmentImpl
		 * @see Education.Education.impl.EducationPackageImpl#getAssessment()
		 * @generated
		 */
		EClass ASSESSMENT = eINSTANCE.getAssessment();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__ID = eINSTANCE.getAssessment_ID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__TYPE = eINSTANCE.getAssessment_Type();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__WEIGHT = eINSTANCE.getAssessment_Weight();

		/**
		 * The meta object literal for the '<em><b>Comments</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__COMMENTS = eINSTANCE.getAssessment_Comments();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSESSMENT__DUE_DATE = eINSTANCE.getAssessment_DueDate();

		/**
		 * The meta object literal for the '<em><b>Grades</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSESSMENT__GRADES = eINSTANCE.getAssessment_Grades();

		/**
		 * The meta object literal for the '<em><b>Valid Weight</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSESSMENT___VALID_WEIGHT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getAssessment__ValidWeight__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.CourseImpl
		 * @see Education.Education.impl.EducationPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__ID = eINSTANCE.getCourse_ID();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__DESCRIPTION = eINSTANCE.getCourse_Description();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Course Material</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__COURSE_MATERIAL = eINSTANCE.getCourse_CourseMaterial();

		/**
		 * The meta object literal for the '<em><b>Enrollment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__ENROLLMENT = eINSTANCE.getCourse_Enrollment();

		/**
		 * The meta object literal for the '<em><b>Departments</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__DEPARTMENTS = eINSTANCE.getCourse_Departments();

		/**
		 * The meta object literal for the '<em><b>Lecturer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__LECTURER = eINSTANCE.getCourse_Lecturer();

		/**
		 * The meta object literal for the '<em><b>Assessment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__ASSESSMENT = eINSTANCE.getCourse_Assessment();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__ROOM = eINSTANCE.getCourse_Room();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__SEMESTER = eINSTANCE.getCourse_Semester();

		/**
		 * The meta object literal for the '<em><b>Valid Credits</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COURSE___VALID_CREDITS__DIAGNOSTICCHAIN_MAP = eINSTANCE.getCourse__ValidCredits__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.CourseMaterialImpl <em>Course Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.CourseMaterialImpl
		 * @see Education.Education.impl.EducationPackageImpl#getCourseMaterial()
		 * @generated
		 */
		EClass COURSE_MATERIAL = eINSTANCE.getCourseMaterial();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_MATERIAL__FORMAT = eINSTANCE.getCourseMaterial_Format();

		/**
		 * The meta object literal for the '<em><b>File Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_MATERIAL__FILE_SIZE = eINSTANCE.getCourseMaterial_FileSize();

		/**
		 * The meta object literal for the '<em><b>Access URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_MATERIAL__ACCESS_URL = eINSTANCE.getCourseMaterial_AccessURL();

		/**
		 * The meta object literal for the '<em><b>Last Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_MATERIAL__LAST_UPDATE = eINSTANCE.getCourseMaterial_LastUpdate();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.EducationMaterialImpl <em>Material</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.EducationMaterialImpl
		 * @see Education.Education.impl.EducationPackageImpl#getEducationMaterial()
		 * @generated
		 */
		EClass EDUCATION_MATERIAL = eINSTANCE.getEducationMaterial();

		/**
		 * The meta object literal for the '<em><b>Resource ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION_MATERIAL__RESOURCE_ID = eINSTANCE.getEducationMaterial_ResourceID();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION_MATERIAL__TITLE = eINSTANCE.getEducationMaterial_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDUCATION_MATERIAL__TYPE = eINSTANCE.getEducationMaterial_Type();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.EnrollmentImpl <em>Enrollment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.EnrollmentImpl
		 * @see Education.Education.impl.EducationPackageImpl#getEnrollment()
		 * @generated
		 */
		EClass ENROLLMENT = eINSTANCE.getEnrollment();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENROLLMENT__ID = eINSTANCE.getEnrollment_ID();

		/**
		 * The meta object literal for the '<em><b>Students</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENROLLMENT__STUDENTS = eINSTANCE.getEnrollment_Students();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.GradeImpl <em>Grade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.GradeImpl
		 * @see Education.Education.impl.EducationPackageImpl#getGrade()
		 * @generated
		 */
		EClass GRADE = eINSTANCE.getGrade();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__ID = eINSTANCE.getGrade_ID();

		/**
		 * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__SCORE = eINSTANCE.getGrade_Score();

		/**
		 * The meta object literal for the '<em><b>Date Assigned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__DATE_ASSIGNED = eINSTANCE.getGrade_DateAssigned();

		/**
		 * The meta object literal for the '<em><b>Max Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRADE__MAX_SCORE = eINSTANCE.getGrade_MaxScore();

		/**
		 * The meta object literal for the '<em><b>Student</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADE__STUDENT = eINSTANCE.getGrade_Student();

		/**
		 * The meta object literal for the '<em><b>Assesment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRADE__ASSESMENT = eINSTANCE.getGrade_Assesment();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.RoomImpl
		 * @see Education.Education.impl.EducationPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ID = eINSTANCE.getRoom_ID();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__CAPACITY = eINSTANCE.getRoom_Capacity();

		/**
		 * The meta object literal for the '<em><b>Reserved Classroom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__RESERVED_CLASSROOM = eINSTANCE.getRoom_ReservedClassroom();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.ScheduleImpl
		 * @see Education.Education.impl.EducationPackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__ID = eINSTANCE.getSchedule_ID();

		/**
		 * The meta object literal for the '<em><b>Day Of Week</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__DAY_OF_WEEK = eINSTANCE.getSchedule_DayOfWeek();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__START_TIME = eINSTANCE.getSchedule_StartTime();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__DURATION = eINSTANCE.getSchedule_Duration();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEDULE__COURSE = eINSTANCE.getSchedule_Course();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.SemesterImpl
		 * @see Education.Education.impl.EducationPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__ID = eINSTANCE.getSemester_ID();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__YEAR = eINSTANCE.getSemester_Year();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__TERM = eINSTANCE.getSemester_Term();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.TeacherImpl <em>Teacher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.TeacherImpl
		 * @see Education.Education.impl.EducationPackageImpl#getTeacher()
		 * @generated
		 */
		EClass TEACHER = eINSTANCE.getTeacher();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__SPECIALIZATION = eINSTANCE.getTeacher_Specialization();

		/**
		 * The meta object literal for the '<em><b>Qualification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__QUALIFICATION = eINSTANCE.getTeacher_Qualification();

		/**
		 * The meta object literal for the '<em><b>Years Of Experience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__YEARS_OF_EXPERIENCE = eINSTANCE.getTeacher_YearsOfExperience();

		/**
		 * The meta object literal for the '<em><b>Is Experienced Teacher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEACHER___IS_EXPERIENCED_TEACHER = eINSTANCE.getTeacher__IsExperiencedTeacher();

		/**
		 * The meta object literal for the '{@link Education.Education.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.impl.UserImpl
		 * @see Education.Education.impl.EducationPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_ID();

		/**
		 * The meta object literal for the '{@link Education.Education.DayOfWeek <em>Day Of Week</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.DayOfWeek
		 * @see Education.Education.impl.EducationPackageImpl#getDayOfWeek()
		 * @generated
		 */
		EEnum DAY_OF_WEEK = eINSTANCE.getDayOfWeek();

		/**
		 * The meta object literal for the '{@link Education.Education.MaterialType <em>Material Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.MaterialType
		 * @see Education.Education.impl.EducationPackageImpl#getMaterialType()
		 * @generated
		 */
		EEnum MATERIAL_TYPE = eINSTANCE.getMaterialType();

		/**
		 * The meta object literal for the '{@link Education.Education.Score <em>Score</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.Score
		 * @see Education.Education.impl.EducationPackageImpl#getScore()
		 * @generated
		 */
		EEnum SCORE = eINSTANCE.getScore();

		/**
		 * The meta object literal for the '{@link Education.Education.SemesterOffered <em>Semester Offered</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.SemesterOffered
		 * @see Education.Education.impl.EducationPackageImpl#getSemesterOffered()
		 * @generated
		 */
		EEnum SEMESTER_OFFERED = eINSTANCE.getSemesterOffered();

		/**
		 * The meta object literal for the '{@link Education.Education.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.Status
		 * @see Education.Education.impl.EducationPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link Education.Education.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Education.Education.Type
		 * @see Education.Education.impl.EducationPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //EducationPackage
