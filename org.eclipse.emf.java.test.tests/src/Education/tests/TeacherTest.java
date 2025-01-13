/**
 */
package Education.tests;

import Education.EducationFactory;
import Education.Teacher;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Teacher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link Education.Teacher#isExperiencedTeacher() <em>Is Experienced Teacher</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TeacherTest extends UserTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TeacherTest.class);
	}

	/**
	 * Constructs a new Teacher test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeacherTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Teacher test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Teacher getFixture() {
		return (Teacher)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EducationFactory.eINSTANCE.createTeacher());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link Education.Teacher#isExperiencedTeacher() <em>Is Experienced Teacher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.Teacher#isExperiencedTeacher()
	 * @generated
	 */
	public void testIsExperiencedTeacher() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //TeacherTest
