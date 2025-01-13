/**
 */
package Education.tests;

import Education.EducationFactory;
import Education.HighSchool;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>High School</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link Education.HighSchool#getDepartmentCount() <em>Department Count</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class HighSchoolTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HighSchoolTest.class);
	}

	/**
	 * Constructs a new High School test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighSchoolTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this High School test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HighSchool getFixture() {
		return (HighSchool)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EducationFactory.eINSTANCE.createHighSchool());
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
	 * Tests the '{@link Education.HighSchool#getDepartmentCount() <em>Department Count</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.HighSchool#getDepartmentCount()
	 * @generated
	 */
	public void testGetDepartmentCount() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Education.HighSchool#setDepartmentCount(int) <em>Department Count</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Education.HighSchool#setDepartmentCount(int)
	 * @generated
	 */
	public void testSetDepartmentCount() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //HighSchoolTest
