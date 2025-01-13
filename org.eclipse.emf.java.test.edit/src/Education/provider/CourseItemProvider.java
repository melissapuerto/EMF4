/**
 */
package Education.provider;


import Education.Course;
import Education.EducationFactory;
import Education.EducationPackage;

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
 * This is the item provider adapter for a {@link Education.Course} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CourseItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseItemProvider(AdapterFactory adapterFactory) {
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
			addDescriptionPropertyDescriptor(object);
			addCreditsPropertyDescriptor(object);
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
				 getString("_UI_Course_ID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_ID_feature", "_UI_Course_type"),
				 EducationPackage.Literals.COURSE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_Description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_Description_feature", "_UI_Course_type"),
				 EducationPackage.Literals.COURSE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Credits feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreditsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Course_Credits_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Course_Credits_feature", "_UI_Course_type"),
				 EducationPackage.Literals.COURSE__CREDITS,
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
			childrenFeatures.add(EducationPackage.Literals.COURSE__COURSE_MATERIAL);
			childrenFeatures.add(EducationPackage.Literals.COURSE__ENROLLMENT);
			childrenFeatures.add(EducationPackage.Literals.COURSE__DEPARTMENTS);
			childrenFeatures.add(EducationPackage.Literals.COURSE__LECTURER);
			childrenFeatures.add(EducationPackage.Literals.COURSE__ASSESSMENT);
			childrenFeatures.add(EducationPackage.Literals.COURSE__ROOM);
			childrenFeatures.add(EducationPackage.Literals.COURSE__SEMESTER);
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
	 * This returns Course.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Course"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Course)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Course_type") :
			getString("_UI_Course_type") + " " + label;
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

		switch (notification.getFeatureID(Course.class)) {
			case EducationPackage.COURSE__ID:
			case EducationPackage.COURSE__DESCRIPTION:
			case EducationPackage.COURSE__CREDITS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EducationPackage.COURSE__COURSE_MATERIAL:
			case EducationPackage.COURSE__ENROLLMENT:
			case EducationPackage.COURSE__DEPARTMENTS:
			case EducationPackage.COURSE__LECTURER:
			case EducationPackage.COURSE__ASSESSMENT:
			case EducationPackage.COURSE__ROOM:
			case EducationPackage.COURSE__SEMESTER:
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
				(EducationPackage.Literals.COURSE__COURSE_MATERIAL,
				 EducationFactory.eINSTANCE.createCourseMaterial()));

		newChildDescriptors.add
			(createChildParameter
				(EducationPackage.Literals.COURSE__ENROLLMENT,
				 EducationFactory.eINSTANCE.createEnrollment()));

		newChildDescriptors.add
			(createChildParameter
				(EducationPackage.Literals.COURSE__DEPARTMENTS,
				 EducationFactory.eINSTANCE.createDepartment()));

		newChildDescriptors.add
			(createChildParameter
				(EducationPackage.Literals.COURSE__LECTURER,
				 EducationFactory.eINSTANCE.createTeacher()));

		newChildDescriptors.add
			(createChildParameter
				(EducationPackage.Literals.COURSE__ASSESSMENT,
				 EducationFactory.eINSTANCE.createAssessment()));

		newChildDescriptors.add
			(createChildParameter
				(EducationPackage.Literals.COURSE__ROOM,
				 EducationFactory.eINSTANCE.createRoom()));

		newChildDescriptors.add
			(createChildParameter
				(EducationPackage.Literals.COURSE__SEMESTER,
				 EducationFactory.eINSTANCE.createSemester()));
	}

}
