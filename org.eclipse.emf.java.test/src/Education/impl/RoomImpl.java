/**
 */
package Education.impl;

import Education.EducationPackage;
import Education.Room;
import Education.Schedule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Education.impl.RoomImpl#getID <em>ID</em>}</li>
 *   <li>{@link Education.impl.RoomImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link Education.impl.RoomImpl#getReservedClassroom <em>Reserved Classroom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoomImpl extends NamedElementImpl implements Room {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReservedClassroom() <em>Reserved Classroom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedClassroom()
	 * @generated
	 * @ordered
	 */
	protected Schedule reservedClassroom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.ROOM__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.ROOM__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schedule getReservedClassroom() {
		if (reservedClassroom != null && reservedClassroom.eIsProxy()) {
			InternalEObject oldReservedClassroom = (InternalEObject)reservedClassroom;
			reservedClassroom = (Schedule)eResolveProxy(oldReservedClassroom);
			if (reservedClassroom != oldReservedClassroom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EducationPackage.ROOM__RESERVED_CLASSROOM, oldReservedClassroom, reservedClassroom));
			}
		}
		return reservedClassroom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule basicGetReservedClassroom() {
		return reservedClassroom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservedClassroom(Schedule newReservedClassroom) {
		Schedule oldReservedClassroom = reservedClassroom;
		reservedClassroom = newReservedClassroom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.ROOM__RESERVED_CLASSROOM, oldReservedClassroom, reservedClassroom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EducationPackage.ROOM__ID:
				return getID();
			case EducationPackage.ROOM__CAPACITY:
				return getCapacity();
			case EducationPackage.ROOM__RESERVED_CLASSROOM:
				if (resolve) return getReservedClassroom();
				return basicGetReservedClassroom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EducationPackage.ROOM__ID:
				setID((String)newValue);
				return;
			case EducationPackage.ROOM__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case EducationPackage.ROOM__RESERVED_CLASSROOM:
				setReservedClassroom((Schedule)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EducationPackage.ROOM__ID:
				setID(ID_EDEFAULT);
				return;
			case EducationPackage.ROOM__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case EducationPackage.ROOM__RESERVED_CLASSROOM:
				setReservedClassroom((Schedule)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EducationPackage.ROOM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EducationPackage.ROOM__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case EducationPackage.ROOM__RESERVED_CLASSROOM:
				return reservedClassroom != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (ID: ");
		result.append(id);
		result.append(", Capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
