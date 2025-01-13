/**
 */
package Education.tests;

import Education.EducationFactory;
import Education.EducationMaterial;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Material</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EducationMaterialTest extends TestCase {

	/**
	 * The fixture for this Material test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EducationMaterial fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EducationMaterialTest.class);
	}

	/**
	 * Constructs a new Material test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EducationMaterialTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Material test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EducationMaterial fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Material test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EducationMaterial getFixture() {
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
		setFixture(EducationFactory.eINSTANCE.createEducationMaterial());
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

} //EducationMaterialTest
