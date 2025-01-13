/**
 */
package Education.impl;

import Education.Course;
import Education.Department;
import Education.EducationPackage;
import Education.EducationTables;
import Education.HighSchool;
import Education.Room;
import Education.Teacher;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

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
 *   <li>{@link Education.impl.HighSchoolImpl#getDepartmentCount <em>Department Count</em>}</li>
 *   <li>{@link Education.impl.HighSchoolImpl#getTotalCapacity <em>Total Capacity</em>}</li>
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
	 * The cached value of the '{@link #getTeachers() <em>Teachers</em>}' containment reference list.
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
	 * The default value of the '{@link #getDepartmentCount() <em>Department Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartmentCount()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPARTMENT_COUNT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getTotalCapacity() <em>Total Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalCapacity() <em>Total Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalCapacity()
	 * @generated
	 * @ordered
	 */
	protected int totalCapacity = TOTAL_CAPACITY_EDEFAULT;

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
			teachers = new EObjectContainmentEList<Teacher>(Teacher.class, this, EducationPackage.HIGH_SCHOOL__TEACHERS);
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
	public int getDepartmentCount() {
		/**
		 * self.Departments->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Department> Departments = this.getDepartments();
		final /*@NonInvalid*/ OrderedSetValue BOXED_Departments = idResolver.createOrderedSetOfAll(EducationTables.ORD_CLSSid_Department, Departments);
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_Departments);
		final /*@NonInvalid*/ int ECORE_size = ValueUtil.intValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepartmentCount(int newDepartmentCount) {
		// TODO: implement this method to set the 'Department Count' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTotalCapacity() {
		return totalCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalCapacity(int newTotalCapacity) {
		int oldTotalCapacity = totalCapacity;
		totalCapacity = newTotalCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.HIGH_SCHOOL__TOTAL_CAPACITY, oldTotalCapacity, totalCapacity));
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
			case EducationPackage.HIGH_SCHOOL__TEACHERS:
				return ((InternalEList<?>)getTeachers()).basicRemove(otherEnd, msgs);
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
			case EducationPackage.HIGH_SCHOOL__DEPARTMENT_COUNT:
				return getDepartmentCount();
			case EducationPackage.HIGH_SCHOOL__TOTAL_CAPACITY:
				return getTotalCapacity();
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
			case EducationPackage.HIGH_SCHOOL__DEPARTMENT_COUNT:
				setDepartmentCount((Integer)newValue);
				return;
			case EducationPackage.HIGH_SCHOOL__TOTAL_CAPACITY:
				setTotalCapacity((Integer)newValue);
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
			case EducationPackage.HIGH_SCHOOL__DEPARTMENT_COUNT:
				setDepartmentCount(DEPARTMENT_COUNT_EDEFAULT);
				return;
			case EducationPackage.HIGH_SCHOOL__TOTAL_CAPACITY:
				setTotalCapacity(TOTAL_CAPACITY_EDEFAULT);
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
			case EducationPackage.HIGH_SCHOOL__DEPARTMENT_COUNT:
				return getDepartmentCount() != DEPARTMENT_COUNT_EDEFAULT;
			case EducationPackage.HIGH_SCHOOL__TOTAL_CAPACITY:
				return totalCapacity != TOTAL_CAPACITY_EDEFAULT;
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
		result.append(", TotalCapacity: ");
		result.append(totalCapacity);
		result.append(')');
		return result.toString();
	}

} //HighSchoolImpl
