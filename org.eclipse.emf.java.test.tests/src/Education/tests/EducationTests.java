/**
 */
package Education.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Education</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EducationTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new EducationTests("Education Tests");
		suite.addTestSuite(HighSchoolTest.class);
		suite.addTestSuite(StudentTest.class);
		suite.addTestSuite(AssessmentTest.class);
		suite.addTestSuite(CourseTest.class);
		suite.addTestSuite(TeacherTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducationTests(String name) {
		super(name);
	}

} //EducationTests
