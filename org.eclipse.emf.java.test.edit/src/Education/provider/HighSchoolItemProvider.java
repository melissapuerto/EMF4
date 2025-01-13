/**
 */
package Education.provider;


import Education.EducationFactory;
import Education.EducationPackage;
import Education.HighSchool;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Education.HighSchool} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HighSchoolItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HighSchoolItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIDPropertyDescriptor(object);
			addFoundedYearPropertyDescriptor(object);
			addDepartmentCountPropertyDescriptor(object);
			addTotalCapacityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HighSchool_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HighSchool_ID_feature", "_UI_HighSchool_type"),
				 EducationPackage.Literals.HIGH_SCHOOL__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Founded Year feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFoundedYearPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HighSchool_FoundedYear_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HighSchool_FoundedYear_feature", "_UI_HighSchool_type"),
				 EducationPackage.Literals.HIGH_SCHOOL__FOUNDED_YEAR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Department Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDepartmentCountPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HighSchool_DepartmentCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HighSchool_DepartmentCount_feature", "_UI_HighSchool_type"),
				 EducationPackage.Literals.HIGH_SCHOOL__DEPARTMENT_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalCapacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HighSchool_TotalCapacity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HighSchool_TotalCapacity_feature", "_UI_HighSchool_type"),
				 EducationPackage.Literals.HIGH_SCHOOL__TOTAL_CAPACITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EducationPackage.Literals.HIGH_SCHOOL__DEPARTMENTS);
			childrenFeatures.add(EducationPackage.Literals.HIGH_SCHOOL__COURSES);
			childrenFeatures.add(EducationPackage.Literals.HIGH_SCHOOL__TEACHERS);
			childrenFeatures.add(EducationPackage.Literals.HIGH_SCHOOL__ROOMS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns HighSchool.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/HighSchool"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((HighSchool)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_HighSchool_type") :
			getString("_UI_HighSchool_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(HighSchool.class)) {
			case EducationPackage.HIGH_SCHOOL__ID:
			case EducationPackage.HIGH_SCHOOL__FOUNDED_YEAR:
			case EducationPackage.HIGH_SCHOOL__DEPARTMENT_COUNT:
			case EducationPackage.HIGH_SCHOOL__TOTAL_CAPACITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EducationPackage.HIGH_SCHOOL__DEPARTMENTS:
			case EducationPackage.HIGH_SCHOOL__COURSES:
			case EducationPackage.HIGH_SCHOOL__TEACHERS:
			case EducationPackage.HIGH_SCHOOL__ROOMS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EducationPackage.Literals.HIGH_SCHOOL__DEPARTMENTS,
				 EducationFactory.eINSTANCE.createDepartment()));

		newChildDescriptors.add
			(createChildParameter
				(EducationPackage.Literals.HIGH_SCHOOL__COURSES,
				 EducationFactory.eINSTANCE.createCourse()));

		newChildDescriptors.add
			(createChildParameter
				(EducationPackage.Literals.HIGH_SCHOOL__TEACHERS,
				 EducationFactory.eINSTANCE.createTeacher()));

		newChildDescriptors.add
			(createChildParameter
				(EducationPackage.Literals.HIGH_SCHOOL__ROOMS,
				 EducationFactory.eINSTANCE.createRoom()));
	}

}
