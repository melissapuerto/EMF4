/**
 */
package Education.impl;

import Education.Course;
import Education.Department;
import Education.EducationPackage;
import Education.HighSchool;
import Education.Room;
import Education.Teacher;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>High School</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Education.impl.HighSchoolImpl#getID <em>ID</em>}</li>
 *   <li>{@link Education.impl.HighSchoolImpl#getFoundedYear <em>Founded Year</em>}</li>
 *   <li>{@link Education.impl.HighSchoolImpl#getDepartments <em>Departments</em>}</li>
 *   <li>{@link Education.impl.HighSchoolImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link Education.impl.HighSchoolImpl#getTeachers <em>Teachers</em>}</li>
 *   <li>{@link Education.impl.HighSchoolImpl#getRooms <em>Rooms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HighSchoolImpl extends NamedElementImpl implements HighSchool {
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
	 * The default value of the '{@link #getFoundedYear() <em>Founded Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoundedYear()
	 * @generated
	 * @ordered
	 */
	protected static final int FOUNDED_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFoundedYear() <em>Founded Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoundedYear()
	 * @generated
	 * @ordered
	 */
	protected int foundedYear = FOUNDED_YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDepartments() <em>Departments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartments()
	 * @generated
	 * @ordered
	 */
	protected EList<Department> departments;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getTeachers() <em>Teachers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeachers()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> teachers;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HighSchoolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationPackage.Literals.HIGH_SCHOOL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.HIGH_SCHOOL__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFoundedYear() {
		return foundedYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFoundedYear(int newFoundedYear) {
		int oldFoundedYear = foundedYear;
		foundedYear = newFoundedYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.HIGH_SCHOOL__FOUNDED_YEAR, oldFoundedYear, foundedYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Department> getDepartments() {
		if (departments == null) {
			departments = new EObjectContainmentEList<Department>(Department.class, this, EducationPackage.HIGH_SCHOOL__DEPARTMENTS);
		}
		return departments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<Course>(Course.class, this, EducationPackage.HIGH_SCHOOL__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Teacher> getTeachers() {
		if (teachers == null) {
			teachers = new EObjectResolvingEList<Teacher>(Teacher.class, this, EducationPackage.HIGH_SCHOOL__TEACHERS);
		}
		return teachers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, EducationPackage.HIGH_SCHOOL__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EducationPackage.HIGH_SCHOOL__DEPARTMENTS:
				return ((InternalEList<?>)getDepartments()).basicRemove(otherEnd, msgs);
			case EducationPackage.HIGH_SCHOOL__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case EducationPackage.HIGH_SCHOOL__ROOMS:
				return ((InternalEList<?>)getRooms()).basicRemove(otherEnd, msgs);
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
			case EducationPackage.HIGH_SCHOOL__ID:
				return getID();
			case EducationPackage.HIGH_SCHOOL__FOUNDED_YEAR:
				return getFoundedYear();
			case EducationPackage.HIGH_SCHOOL__DEPARTMENTS:
				return getDepartments();
			case EducationPackage.HIGH_SCHOOL__COURSES:
				return getCourses();
			case EducationPackage.HIGH_SCHOOL__TEACHERS:
				return getTeachers();
			case EducationPackage.HIGH_SCHOOL__ROOMS:
				return getRooms();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EducationPackage.HIGH_SCHOOL__ID:
				setID((String)newValue);
				return;
			case EducationPackage.HIGH_SCHOOL__FOUNDED_YEAR:
				setFoundedYear((Integer)newValue);
				return;
			case EducationPackage.HIGH_SCHOOL__DEPARTMENTS:
				getDepartments().clear();
				getDepartments().addAll((Collection<? extends Department>)newValue);
				return;
			case EducationPackage.HIGH_SCHOOL__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case EducationPackage.HIGH_SCHOOL__TEACHERS:
				getTeachers().clear();
				getTeachers().addAll((Collection<? extends Teacher>)newValue);
				return;
			case EducationPackage.HIGH_SCHOOL__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
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
			case EducationPackage.HIGH_SCHOOL__ID:
				setID(ID_EDEFAULT);
				return;
			case EducationPackage.HIGH_SCHOOL__FOUNDED_YEAR:
				setFoundedYear(FOUNDED_YEAR_EDEFAULT);
				return;
			case EducationPackage.HIGH_SCHOOL__DEPARTMENTS:
				getDepartments().clear();
				return;
			case EducationPackage.HIGH_SCHOOL__COURSES:
				getCourses().clear();
				return;
			case EducationPackage.HIGH_SCHOOL__TEACHERS:
				getTeachers().clear();
				return;
			case EducationPackage.HIGH_SCHOOL__ROOMS:
				getRooms().clear();
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
			case EducationPackage.HIGH_SCHOOL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EducationPackage.HIGH_SCHOOL__FOUNDED_YEAR:
				return foundedYear != FOUNDED_YEAR_EDEFAULT;
			case EducationPackage.HIGH_SCHOOL__DEPARTMENTS:
				return departments != null && !departments.isEmpty();
			case EducationPackage.HIGH_SCHOOL__COURSES:
				return courses != null && !courses.isEmpty();
			case EducationPackage.HIGH_SCHOOL__TEACHERS:
				return teachers != null && !teachers.isEmpty();
			case EducationPackage.HIGH_SCHOOL__ROOMS:
				return rooms != null && !rooms.isEmpty();
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
		result.append(", FoundedYear: ");
		result.append(foundedYear);
		result.append(')');
		return result.toString();
	}

} //HighSchoolImpl
