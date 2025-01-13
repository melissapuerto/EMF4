/**
 */
package Education.Education.impl;

import Education.Education.EducationPackage;
import Education.Education.Room;

import Education.Schedule;

import Education.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

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
 *   <li>{@link Education.Education.impl.RoomImpl#getID <em>ID</em>}</li>
 *   <li>{@link Education.Education.impl.RoomImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link Education.Education.impl.RoomImpl#getReservedClassroom <em>Reserved Classroom</em>}</li>
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
	 * The cached value of the '{@link #getReservedClassroom() <em>Reserved Classroom</em>}' containment reference.
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
		return reservedClassroom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservedClassroom(Schedule newReservedClassroom, NotificationChain msgs) {
		Schedule oldReservedClassroom = reservedClassroom;
		reservedClassroom = newReservedClassroom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EducationPackage.ROOM__RESERVED_CLASSROOM, oldReservedClassroom, newReservedClassroom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReservedClassroom(Schedule newReservedClassroom) {
		if (newReservedClassroom != reservedClassroom) {
			NotificationChain msgs = null;
			if (reservedClassroom != null)
				msgs = ((InternalEObject)reservedClassroom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EducationPackage.ROOM__RESERVED_CLASSROOM, null, msgs);
			if (newReservedClassroom != null)
				msgs = ((InternalEObject)newReservedClassroom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EducationPackage.ROOM__RESERVED_CLASSROOM, null, msgs);
			msgs = basicSetReservedClassroom(newReservedClassroom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.ROOM__RESERVED_CLASSROOM, newReservedClassroom, newReservedClassroom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EducationPackage.ROOM__RESERVED_CLASSROOM:
				return basicSetReservedClassroom(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
				return getReservedClassroom();
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
