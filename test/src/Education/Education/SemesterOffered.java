/**
 */
package Education.Education;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Semester Offered</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Education.Education.EducationPackage#getSemesterOffered()
 * @model
 * @generated
 */
public enum SemesterOffered implements Enumerator {
	/**
	 * The '<em><b>Winter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINTER_VALUE
	 * @generated
	 * @ordered
	 */
	WINTER(0, "Winter", "Winter"),

	/**
	 * The '<em><b>Summer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUMMER_VALUE
	 * @generated
	 * @ordered
	 */
	SUMMER(1, "Summer", "Summer");

	/**
	 * The '<em><b>Winter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINTER
	 * @model name="Winter"
	 * @generated
	 * @ordered
	 */
	public static final int WINTER_VALUE = 0;

	/**
	 * The '<em><b>Summer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUMMER
	 * @model name="Summer"
	 * @generated
	 * @ordered
	 */
	public static final int SUMMER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Semester Offered</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SemesterOffered[] VALUES_ARRAY =
		new SemesterOffered[] {
			WINTER,
			SUMMER,
		};

	/**
	 * A public read-only list of all the '<em><b>Semester Offered</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SemesterOffered> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Semester Offered</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SemesterOffered get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SemesterOffered result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Semester Offered</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SemesterOffered getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SemesterOffered result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Semester Offered</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SemesterOffered get(int value) {
		switch (value) {
			case WINTER_VALUE: return WINTER;
			case SUMMER_VALUE: return SUMMER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SemesterOffered(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //SemesterOffered
