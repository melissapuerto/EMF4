/**
 */
package Education.Education.impl;

import Education.Course;
import Education.DayOfWeek;

import Education.Education.EducationPackage;
import Education.Education.Schedule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Education.Education.impl.ScheduleImpl#getID <em>ID</em>}</li>
 *   <li>{@link Education.Education.impl.ScheduleImpl#getDayOfWeek <em>Day Of Week</em>}</li>
 *   <li>{@link Education.Education.impl.ScheduleImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link Education.Education.impl.ScheduleImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link Education.Education.impl.ScheduleImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleImpl extends MinimalEObjectImpl.Container implements Schedule {
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
	 * The default value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected static final DayOfWeek DAY_OF_WEEK_EDEFAULT = DayOfWeek.MONDAY;

	/**
	 * The cached value of the '{@link #getDayOfWeek() <em>Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected DayOfWeek dayOfWeek = DAY_OF_WEEK_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected String startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourse()
	 * @generated
	 * @ordered
	 */
	protected Course course;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationPackage.Literals.SCHEDULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.SCHEDULE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDayOfWeek(DayOfWeek newDayOfWeek) {
		DayOfWeek oldDayOfWeek = dayOfWeek;
		dayOfWeek = newDayOfWeek == null ? DAY_OF_WEEK_EDEFAULT : newDayOfWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.SCHEDULE__DAY_OF_WEEK, oldDayOfWeek, dayOfWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(String newStartTime) {
		String oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.SCHEDULE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.SCHEDULE__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCourse() {
		if (course != null && course.eIsProxy()) {
			InternalEObject oldCourse = (InternalEObject)course;
			course = (Course)eResolveProxy(oldCourse);
			if (course != oldCourse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EducationPackage.SCHEDULE__COURSE, oldCourse, course));
			}
		}
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course basicGetCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourse(Course newCourse) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.SCHEDULE__COURSE, oldCourse, course));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EducationPackage.SCHEDULE__ID:
				return getID();
			case EducationPackage.SCHEDULE__DAY_OF_WEEK:
				return getDayOfWeek();
			case EducationPackage.SCHEDULE__START_TIME:
				return getStartTime();
			case EducationPackage.SCHEDULE__DURATION:
				return getDuration();
			case EducationPackage.SCHEDULE__COURSE:
				if (resolve) return getCourse();
				return basicGetCourse();
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
			case EducationPackage.SCHEDULE__ID:
				setID((String)newValue);
				return;
			case EducationPackage.SCHEDULE__DAY_OF_WEEK:
				setDayOfWeek((DayOfWeek)newValue);
				return;
			case EducationPackage.SCHEDULE__START_TIME:
				setStartTime((String)newValue);
				return;
			case EducationPackage.SCHEDULE__DURATION:
				setDuration((Integer)newValue);
				return;
			case EducationPackage.SCHEDULE__COURSE:
				setCourse((Course)newValue);
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
			case EducationPackage.SCHEDULE__ID:
				setID(ID_EDEFAULT);
				return;
			case EducationPackage.SCHEDULE__DAY_OF_WEEK:
				setDayOfWeek(DAY_OF_WEEK_EDEFAULT);
				return;
			case EducationPackage.SCHEDULE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case EducationPackage.SCHEDULE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case EducationPackage.SCHEDULE__COURSE:
				setCourse((Course)null);
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
			case EducationPackage.SCHEDULE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EducationPackage.SCHEDULE__DAY_OF_WEEK:
				return dayOfWeek != DAY_OF_WEEK_EDEFAULT;
			case EducationPackage.SCHEDULE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case EducationPackage.SCHEDULE__DURATION:
				return duration != DURATION_EDEFAULT;
			case EducationPackage.SCHEDULE__COURSE:
				return course != null;
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
		result.append(", DayOfWeek: ");
		result.append(dayOfWeek);
		result.append(", StartTime: ");
		result.append(startTime);
		result.append(", Duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //ScheduleImpl
