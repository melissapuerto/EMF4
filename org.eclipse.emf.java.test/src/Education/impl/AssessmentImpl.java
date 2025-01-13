/**
 */
package Education.impl;

import Education.Assessment;
import Education.EducationPackage;
import Education.EducationTables;
import Education.Grade;
import Education.Type;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringToIntegerOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Education.impl.AssessmentImpl#getID <em>ID</em>}</li>
 *   <li>{@link Education.impl.AssessmentImpl#getType <em>Type</em>}</li>
 *   <li>{@link Education.impl.AssessmentImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link Education.impl.AssessmentImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link Education.impl.AssessmentImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link Education.impl.AssessmentImpl#getGrades <em>Grades</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssessmentImpl extends MinimalEObjectImpl.Container implements Assessment {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.ORAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected String weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> comments;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Date dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGrades() <em>Grades</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrades()
	 * @generated
	 * @ordered
	 */
	protected EList<Grade> grades;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EducationPackage.Literals.ASSESSMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.ASSESSMENT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.ASSESSMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(String newWeight) {
		String oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.ASSESSMENT__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getComments() {
		if (comments == null) {
			comments = new EDataTypeUniqueEList<String>(String.class, this, EducationPackage.ASSESSMENT__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(Date newDueDate) {
		Date oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EducationPackage.ASSESSMENT__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Grade> getGrades() {
		if (grades == null) {
			grades = new EObjectContainmentEList<Grade>(Grade.class, this, EducationPackage.ASSESSMENT__GRADES);
		}
		return grades;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ValidWeight(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Assessment::ValidWeight";
		try {
			/**
			 *
			 * inv ValidWeight:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.Weight.toInteger() >= 1 and
			 *         self.Weight.toInteger() <= 100
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, EducationPackage.Literals.ASSESSMENT___VALID_WEIGHT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, EducationTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_ge;
					try {
						final /*@NonInvalid*/ String Weight = this.getWeight();
						if (Weight == null) {
							throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ IntegerValue toInteger = StringToIntegerOperation.INSTANCE.evaluate(Weight);
						if (toInteger == null) {
							throw new InvalidValueException("Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
						}
						final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, toInteger, EducationTables.INT_1).booleanValue();
						CAUGHT_ge = ge;
					}
					catch (Exception e) {
						CAUGHT_ge = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_ge == ValueUtil.FALSE_VALUE) {
						result = ValueUtil.FALSE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_le_0;
						try {
							final /*@NonInvalid*/ String Weight_0 = this.getWeight();
							if (Weight_0 == null) {
								throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@Thrown*/ IntegerValue toInteger_0 = StringToIntegerOperation.INSTANCE.evaluate(Weight_0);
							if (toInteger_0 == null) {
								throw new InvalidValueException("Null \'\'OclComparable\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@Thrown*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, toInteger_0, EducationTables.INT_100).booleanValue();
							CAUGHT_le_0 = le_0;
						}
						catch (Exception e) {
							CAUGHT_le_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_le_0 == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						}
						else {
							if (CAUGHT_ge instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_ge;
							}
							if (CAUGHT_le_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_le_0;
							}
							result = ValueUtil.TRUE_VALUE;
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, EducationTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EducationPackage.ASSESSMENT__GRADES:
				return ((InternalEList<?>)getGrades()).basicRemove(otherEnd, msgs);
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
			case EducationPackage.ASSESSMENT__ID:
				return getID();
			case EducationPackage.ASSESSMENT__TYPE:
				return getType();
			case EducationPackage.ASSESSMENT__WEIGHT:
				return getWeight();
			case EducationPackage.ASSESSMENT__COMMENTS:
				return getComments();
			case EducationPackage.ASSESSMENT__DUE_DATE:
				return getDueDate();
			case EducationPackage.ASSESSMENT__GRADES:
				return getGrades();
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
			case EducationPackage.ASSESSMENT__ID:
				setID((String)newValue);
				return;
			case EducationPackage.ASSESSMENT__TYPE:
				setType((Type)newValue);
				return;
			case EducationPackage.ASSESSMENT__WEIGHT:
				setWeight((String)newValue);
				return;
			case EducationPackage.ASSESSMENT__COMMENTS:
				getComments().clear();
				getComments().addAll((Collection<? extends String>)newValue);
				return;
			case EducationPackage.ASSESSMENT__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case EducationPackage.ASSESSMENT__GRADES:
				getGrades().clear();
				getGrades().addAll((Collection<? extends Grade>)newValue);
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
			case EducationPackage.ASSESSMENT__ID:
				setID(ID_EDEFAULT);
				return;
			case EducationPackage.ASSESSMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case EducationPackage.ASSESSMENT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case EducationPackage.ASSESSMENT__COMMENTS:
				getComments().clear();
				return;
			case EducationPackage.ASSESSMENT__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case EducationPackage.ASSESSMENT__GRADES:
				getGrades().clear();
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
			case EducationPackage.ASSESSMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case EducationPackage.ASSESSMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case EducationPackage.ASSESSMENT__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case EducationPackage.ASSESSMENT__COMMENTS:
				return comments != null && !comments.isEmpty();
			case EducationPackage.ASSESSMENT__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case EducationPackage.ASSESSMENT__GRADES:
				return grades != null && !grades.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EducationPackage.ASSESSMENT___VALID_WEIGHT__DIAGNOSTICCHAIN_MAP:
				return ValidWeight((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(", Type: ");
		result.append(type);
		result.append(", Weight: ");
		result.append(weight);
		result.append(", Comments: ");
		result.append(comments);
		result.append(", DueDate: ");
		result.append(dueDate);
		result.append(')');
		return result.toString();
	}

} //AssessmentImpl
