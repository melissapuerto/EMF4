/**
 */
package Education.impl;

import Education.Assessment;
import Education.Course;
import Education.CourseMaterial;
import Education.Department;
import Education.EducationPackage;
import Education.Enrollment;
import Education.Room;
import Education.Semester;
import Education.Teacher;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Education.impl.CourseImpl#getID <em>ID</em>}</li>
 *   <li>{@link Education.impl.CourseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Education.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link Education.impl.CourseImpl#getCourseMaterial <em>Course Material</em>}</li>
 *   <li>{@link Education.impl.CourseImpl#getEnrollment <em>Enrollment</em>}</li>
 *   <li>{@link Education.impl.CourseImpl#getDepartments <em>Departments</em>}</li>
 *   <li>{@link Education.impl.CourseImpl#getLecturer <em>Lecturer</em>}</li>
 *   <li>{@link Education.impl.CourseImpl#getAssessment <em>Assessment</em>}</li>
 *   <li>{@link Education.impl.CourseImpl#getRoom <em>Room</em>}</li>
 *   <li>{@link Education.impl.CourseImpl#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends NamedElementImpl implements Course {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected int credits = CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseMaterial() <em>Course Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseMaterial()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseMaterial> courseMaterial;

	/**
	 * The cached value of the '{@link #getEnrollment() <em>Enrollment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrollment()
	 * @generated
	 * @ordered
	 */
	protected EList<Enrollment> enrollment;

	/**
	 * The cached value of the '{@link #getDepartments() <em>Departments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepartments()
	 * @generated
	 * @ordered
	 */
	protected Department departments;

	/**
	 * The cached value of the '{@link #getLecturer() <em>Lecturer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLecturer()
	 * @generated
	 * @ordered
	 */
	protected Teacher lecturer;

	/**
	 * The cached value of the '{@link #getAssessment() <em>Assessment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessment()
	 * @generated
	 * @ordered
	 */
	protected EList<Assessment> assessment;

	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected Semester semester;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationPackage.Literals.COURSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.COURSE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.COURSE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredits(int newCredits) {
		int oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseMaterial> getCourseMaterial() {
		if (courseMaterial == null) {
			courseMaterial = new EObjectContainmentEList<CourseMaterial>(CourseMaterial.class, this, EducationPackage.COURSE__COURSE_MATERIAL);
		}
		return courseMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Enrollment> getEnrollment() {
		if (enrollment == null) {
			enrollment = new EObjectContainmentEList<Enrollment>(Enrollment.class, this, EducationPackage.COURSE__ENROLLMENT);
		}
		return enrollment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Department getDepartments() {
		return departments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartments(Department newDepartments, NotificationChain msgs) {
		Department oldDepartments = departments;
		departments = newDepartments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EducationPackage.COURSE__DEPARTMENTS, oldDepartments, newDepartments);
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
	public void setDepartments(Department newDepartments) {
		if (newDepartments != departments) {
			NotificationChain msgs = null;
			if (departments != null)
				msgs = ((InternalEObject)departments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EducationPackage.COURSE__DEPARTMENTS, null, msgs);
			if (newDepartments != null)
				msgs = ((InternalEObject)newDepartments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EducationPackage.COURSE__DEPARTMENTS, null, msgs);
			msgs = basicSetDepartments(newDepartments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.COURSE__DEPARTMENTS, newDepartments, newDepartments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Teacher getLecturer() {
		if (lecturer != null && lecturer.eIsProxy()) {
			InternalEObject oldLecturer = (InternalEObject)lecturer;
			lecturer = (Teacher)eResolveProxy(oldLecturer);
			if (lecturer != oldLecturer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EducationPackage.COURSE__LECTURER, oldLecturer, lecturer));
			}
		}
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Teacher basicGetLecturer() {
		return lecturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLecturer(Teacher newLecturer) {
		Teacher oldLecturer = lecturer;
		lecturer = newLecturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.COURSE__LECTURER, oldLecturer, lecturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Assessment> getAssessment() {
		if (assessment == null) {
			assessment = new EObjectContainmentEList<Assessment>(Assessment.class, this, EducationPackage.COURSE__ASSESSMENT);
		}
		return assessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject)room;
			room = (Room)eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EducationPackage.COURSE__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.COURSE__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semester getSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemester(Semester newSemester, NotificationChain msgs) {
		Semester oldSemester = semester;
		semester = newSemester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EducationPackage.COURSE__SEMESTER, oldSemester, newSemester);
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
	public void setSemester(Semester newSemester) {
		if (newSemester != semester) {
			NotificationChain msgs = null;
			if (semester != null)
				msgs = ((InternalEObject)semester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EducationPackage.COURSE__SEMESTER, null, msgs);
			if (newSemester != null)
				msgs = ((InternalEObject)newSemester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EducationPackage.COURSE__SEMESTER, null, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.COURSE__SEMESTER, newSemester, newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EducationPackage.COURSE__COURSE_MATERIAL:
				return ((InternalEList<?>)getCourseMaterial()).basicRemove(otherEnd, msgs);
			case EducationPackage.COURSE__ENROLLMENT:
				return ((InternalEList<?>)getEnrollment()).basicRemove(otherEnd, msgs);
			case EducationPackage.COURSE__DEPARTMENTS:
				return basicSetDepartments(null, msgs);
			case EducationPackage.COURSE__ASSESSMENT:
				return ((InternalEList<?>)getAssessment()).basicRemove(otherEnd, msgs);
			case EducationPackage.COURSE__SEMESTER:
				return basicSetSemester(null, msgs);
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
			case EducationPackage.COURSE__ID:
				return getID();
			case EducationPackage.COURSE__DESCRIPTION:
				return getDescription();
			case EducationPackage.COURSE__CREDITS:
				return getCredits();
			case EducationPackage.COURSE__COURSE_MATERIAL:
				return getCourseMaterial();
			case EducationPackage.COURSE__ENROLLMENT:
				return getEnrollment();
			case EducationPackage.COURSE__DEPARTMENTS:
				return getDepartments();
			case EducationPackage.COURSE__LECTURER:
				if (resolve) return getLecturer();
				return basicGetLecturer();
			case EducationPackage.COURSE__ASSESSMENT:
				return getAssessment();
			case EducationPackage.COURSE__ROOM:
				if (resolve) return getRoom();
				return basicGetRoom();
			case EducationPackage.COURSE__SEMESTER:
				return getSemester();
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
			case EducationPackage.COURSE__ID:
				setID((String)newValue);
				return;
			case EducationPackage.COURSE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case EducationPackage.COURSE__CREDITS:
				setCredits((Integer)newValue);
				return;
			case EducationPackage.COURSE__COURSE_MATERIAL:
				getCourseMaterial().clear();
				getCourseMaterial().addAll((Collection<? extends CourseMaterial>)newValue);
				return;
			case EducationPackage.COURSE__ENROLLMENT:
				getEnrollment().clear();
				getEnrollment().addAll((Collection<? extends Enrollment>)newValue);
				return;
			case EducationPackage.COURSE__DEPARTMENTS:
				setDepartments((Department)newValue);
				return;
			case EducationPackage.COURSE__LECTURER:
				setLecturer((Teacher)newValue);
				return;
			case EducationPackage.COURSE__ASSESSMENT:
				getAssessment().clear();
				getAssessment().addAll((Collection<? extends Assessment>)newValue);
				return;
			case EducationPackage.COURSE__ROOM:
				setRoom((Room)newValue);
				return;
			case EducationPackage.COURSE__SEMESTER:
				setSemester((Semester)newValue);
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
			case EducationPackage.COURSE__ID:
				setID(ID_EDEFAULT);
				return;
			case EducationPackage.COURSE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case EducationPackage.COURSE__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case EducationPackage.COURSE__COURSE_MATERIAL:
				getCourseMaterial().clear();
				return;
			case EducationPackage.COURSE__ENROLLMENT:
				getEnrollment().clear();
				return;
			case EducationPackage.COURSE__DEPARTMENTS:
				setDepartments((Department)null);
				return;
			case EducationPackage.COURSE__LECTURER:
				setLecturer((Teacher)null);
				return;
			case EducationPackage.COURSE__ASSESSMENT:
				getAssessment().clear();
				return;
			case EducationPackage.COURSE__ROOM:
				setRoom((Room)null);
				return;
			case EducationPackage.COURSE__SEMESTER:
				setSemester((Semester)null);
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
			case EducationPackage.COURSE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EducationPackage.COURSE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case EducationPackage.COURSE__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case EducationPackage.COURSE__COURSE_MATERIAL:
				return courseMaterial != null && !courseMaterial.isEmpty();
			case EducationPackage.COURSE__ENROLLMENT:
				return enrollment != null && !enrollment.isEmpty();
			case EducationPackage.COURSE__DEPARTMENTS:
				return departments != null;
			case EducationPackage.COURSE__LECTURER:
				return lecturer != null;
			case EducationPackage.COURSE__ASSESSMENT:
				return assessment != null && !assessment.isEmpty();
			case EducationPackage.COURSE__ROOM:
				return room != null;
			case EducationPackage.COURSE__SEMESTER:
				return semester != null;
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
		result.append(", Description: ");
		result.append(description);
		result.append(", Credits: ");
		result.append(credits);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
