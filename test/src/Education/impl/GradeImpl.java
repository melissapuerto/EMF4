/**
 */
package Education.impl;

import Education.Assessment;
import Education.EducationPackage;
import Education.Grade;
import Education.Score;
import Education.Student;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Education.impl.GradeImpl#getID <em>ID</em>}</li>
 *   <li>{@link Education.impl.GradeImpl#getScore <em>Score</em>}</li>
 *   <li>{@link Education.impl.GradeImpl#getDateAssigned <em>Date Assigned</em>}</li>
 *   <li>{@link Education.impl.GradeImpl#getMaxScore <em>Max Score</em>}</li>
 *   <li>{@link Education.impl.GradeImpl#getStudent <em>Student</em>}</li>
 *   <li>{@link Education.impl.GradeImpl#getAssesment <em>Assesment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GradeImpl extends MinimalEObjectImpl.Container implements Grade {
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
	 * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected static final Score SCORE_EDEFAULT = Score.A;

	/**
	 * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScore()
	 * @generated
	 * @ordered
	 */
	protected Score score = SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateAssigned() <em>Date Assigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAssigned()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_ASSIGNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateAssigned() <em>Date Assigned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAssigned()
	 * @generated
	 * @ordered
	 */
	protected Date dateAssigned = DATE_ASSIGNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxScore() <em>Max Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScore()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_SCORE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxScore() <em>Max Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScore()
	 * @generated
	 * @ordered
	 */
	protected float maxScore = MAX_SCORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudent() <em>Student</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudent()
	 * @generated
	 * @ordered
	 */
	protected Student student;

	/**
	 * The cached value of the '{@link #getAssesment() <em>Assesment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssesment()
	 * @generated
	 * @ordered
	 */
	protected Assessment assesment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GradeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationPackage.Literals.GRADE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.GRADE__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Score getScore() {
		return score;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScore(Score newScore) {
		Score oldScore = score;
		score = newScore == null ? SCORE_EDEFAULT : newScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.GRADE__SCORE, oldScore, score));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateAssigned() {
		return dateAssigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateAssigned(Date newDateAssigned) {
		Date oldDateAssigned = dateAssigned;
		dateAssigned = newDateAssigned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.GRADE__DATE_ASSIGNED, oldDateAssigned, dateAssigned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMaxScore() {
		return maxScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxScore(float newMaxScore) {
		float oldMaxScore = maxScore;
		maxScore = newMaxScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.GRADE__MAX_SCORE, oldMaxScore, maxScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Student getStudent() {
		if (student != null && student.eIsProxy()) {
			InternalEObject oldStudent = (InternalEObject)student;
			student = (Student)eResolveProxy(oldStudent);
			if (student != oldStudent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EducationPackage.GRADE__STUDENT, oldStudent, student));
			}
		}
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Student basicGetStudent() {
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudent(Student newStudent) {
		Student oldStudent = student;
		student = newStudent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.GRADE__STUDENT, oldStudent, student));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Assessment getAssesment() {
		if (assesment != null && assesment.eIsProxy()) {
			InternalEObject oldAssesment = (InternalEObject)assesment;
			assesment = (Assessment)eResolveProxy(oldAssesment);
			if (assesment != oldAssesment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EducationPackage.GRADE__ASSESMENT, oldAssesment, assesment));
			}
		}
		return assesment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assessment basicGetAssesment() {
		return assesment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssesment(Assessment newAssesment) {
		Assessment oldAssesment = assesment;
		assesment = newAssesment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.GRADE__ASSESMENT, oldAssesment, assesment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EducationPackage.GRADE__ID:
				return getID();
			case EducationPackage.GRADE__SCORE:
				return getScore();
			case EducationPackage.GRADE__DATE_ASSIGNED:
				return getDateAssigned();
			case EducationPackage.GRADE__MAX_SCORE:
				return getMaxScore();
			case EducationPackage.GRADE__STUDENT:
				if (resolve) return getStudent();
				return basicGetStudent();
			case EducationPackage.GRADE__ASSESMENT:
				if (resolve) return getAssesment();
				return basicGetAssesment();
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
			case EducationPackage.GRADE__ID:
				setID((String)newValue);
				return;
			case EducationPackage.GRADE__SCORE:
				setScore((Score)newValue);
				return;
			case EducationPackage.GRADE__DATE_ASSIGNED:
				setDateAssigned((Date)newValue);
				return;
			case EducationPackage.GRADE__MAX_SCORE:
				setMaxScore((Float)newValue);
				return;
			case EducationPackage.GRADE__STUDENT:
				setStudent((Student)newValue);
				return;
			case EducationPackage.GRADE__ASSESMENT:
				setAssesment((Assessment)newValue);
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
			case EducationPackage.GRADE__ID:
				setID(ID_EDEFAULT);
				return;
			case EducationPackage.GRADE__SCORE:
				setScore(SCORE_EDEFAULT);
				return;
			case EducationPackage.GRADE__DATE_ASSIGNED:
				setDateAssigned(DATE_ASSIGNED_EDEFAULT);
				return;
			case EducationPackage.GRADE__MAX_SCORE:
				setMaxScore(MAX_SCORE_EDEFAULT);
				return;
			case EducationPackage.GRADE__STUDENT:
				setStudent((Student)null);
				return;
			case EducationPackage.GRADE__ASSESMENT:
				setAssesment((Assessment)null);
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
			case EducationPackage.GRADE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EducationPackage.GRADE__SCORE:
				return score != SCORE_EDEFAULT;
			case EducationPackage.GRADE__DATE_ASSIGNED:
				return DATE_ASSIGNED_EDEFAULT == null ? dateAssigned != null : !DATE_ASSIGNED_EDEFAULT.equals(dateAssigned);
			case EducationPackage.GRADE__MAX_SCORE:
				return maxScore != MAX_SCORE_EDEFAULT;
			case EducationPackage.GRADE__STUDENT:
				return student != null;
			case EducationPackage.GRADE__ASSESMENT:
				return assesment != null;
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
		result.append(", Score: ");
		result.append(score);
		result.append(", DateAssigned: ");
		result.append(dateAssigned);
		result.append(", MaxScore: ");
		result.append(maxScore);
		result.append(')');
		return result.toString();
	}

} //GradeImpl
