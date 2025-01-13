/**
 */
package Education.tests;

import Education.EducationFactory;
import Education.Enrollment;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enrollment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnrollmentTest extends TestCase {

	/**
	 * The fixture for this Enrollment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Enrollment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnrollmentTest.class);
	}

	/**
	 * Constructs a new Enrollment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Enrollment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Enrollment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Enrollment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Enrollment getFixture() {
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
		setFixture(EducationFactory.eINSTANCE.createEnrollment());
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

} //EnrollmentTest
