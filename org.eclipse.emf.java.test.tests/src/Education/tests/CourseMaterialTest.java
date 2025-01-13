/**
 */
package Education.tests;

import Education.CourseMaterial;
import Education.EducationFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Course Material</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseMaterialTest extends TestCase {

	/**
	 * The fixture for this Course Material test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseMaterial fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CourseMaterialTest.class);
	}

	/**
	 * Constructs a new Course Material test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseMaterialTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Course Material test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CourseMaterial fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Course Material test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseMaterial getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EducationFactory.eINSTANCE.createCourseMaterial());
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

} //CourseMaterialTest
