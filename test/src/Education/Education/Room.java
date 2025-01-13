/**
 */
package Education.Education;

import Education.NamedElement;
import Education.Schedule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Education.Education.Room#getID <em>ID</em>}</li>
 *   <li>{@link Education.Education.Room#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link Education.Education.Room#getReservedClassroom <em>Reserved Classroom</em>}</li>
 * </ul>
 *
 * @see Education.Education.EducationPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends NamedElement {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see Education.Education.EducationPackage#getRoom_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link Education.Education.Room#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see Education.Education.EducationPackage#getRoom_Capacity()
	 * @model required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link Education.Education.Room#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Reserved Classroom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved Classroom</em>' containment reference.
	 * @see #setReservedClassroom(Schedule)
	 * @see Education.Education.EducationPackage#getRoom_ReservedClassroom()
	 * @model containment="true"
	 * @generated
	 */
	Schedule getReservedClassroom();

	/**
	 * Sets the value of the '{@link Education.Education.Room#getReservedClassroom <em>Reserved Classroom</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved Classroom</em>' containment reference.
	 * @see #getReservedClassroom()
	 * @generated
	 */
	void setReservedClassroom(Schedule value);

} // Room
