/**
 */
package Education.Education;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Education.Education.EducationPackage#getType()
 * @model
 * @generated
 */
public enum Type implements Enumerator {
	/**
	 * The '<em><b>Oral</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORAL(0, "oral", "oral"),

	/**
	 * The '<em><b>Quiz</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUIZ_VALUE
	 * @generated
	 * @ordered
	 */
	QUIZ(0, "quiz", "quiz"),

	/**
	 * The '<em><b>Assignment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNMENT(0, "assignment", "assignment"),

	/**
	 * The '<em><b>Written</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITTEN_VALUE
	 * @generated
	 * @ordered
	 */
	WRITTEN(0, "written", "written");

	/**
	 * The '<em><b>Oral</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORAL
	 * @model name="oral"
	 * @generated
	 * @ordered
	 */
	public static final int ORAL_VALUE = 0;

	/**
	 * The '<em><b>Quiz</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUIZ
	 * @model name="quiz"
	 * @generated
	 * @ordered
	 */
	public static final int QUIZ_VALUE = 0;

	/**
	 * The '<em><b>Assignment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNMENT
	 * @model name="assignment"
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT_VALUE = 0;

	/**
	 * The '<em><b>Written</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITTEN
	 * @model name="written"
	 * @generated
	 * @ordered
	 */
	public static final int WRITTEN_VALUE = 0;

	/**
	 * An array of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Type[] VALUES_ARRAY =
		new Type[] {
			ORAL,
			QUIZ,
			ASSIGNMENT,
			WRITTEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Type> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Type result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Type get(int value) {
		switch (value) {
			case ORAL_VALUE: return ORAL;
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
	private Type(int value, String name, String literal) {
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
	
} //Type
