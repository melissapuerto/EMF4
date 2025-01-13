/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /org.eclipse.emf.java.test/model/Education.ecore
 * using:
 *   /org.eclipse.emf.java.test/model/Education.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package Education;

// import Education.EducationPackage;
// import Education.EducationTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.RealValue;

/**
 * EducationTables provides the dispatch tables for the Education for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class EducationTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(EducationPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS = IdManager.getNsURIPackageId("http://it.univaq.disim.mde.course./EMS", null, EducationPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Assessment = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getClassId("Assessment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Course = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getClassId("Course", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CourseMaterial = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getClassId("CourseMaterial", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Department = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getClassId("Department", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Enrollment = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getClassId("Enrollment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Grade = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getClassId("Grade", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_HighSchool = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getClassId("HighSchool", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Room = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getClassId("Room", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Schedule = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getClassId("Schedule", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Semester = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getClassId("Semester", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Student = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getClassId("Student", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Teacher = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getClassId("Teacher", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = EducationTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = EducationTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = EducationTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_DayOfWeek = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getEnumerationId("DayOfWeek");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_MaterialType = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getEnumerationId("MaterialType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Score = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getEnumerationId("Score");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_SemesterOffered = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getEnumerationId("SemesterOffered");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Status = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getEnumerationId("Status");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Type = EducationTables.PACKid_http_c_s_s_it_univaq_disim_mde_course_s_EMS.getEnumerationId("Type");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ IntegerValue INT_10 = ValueUtil.integerValueOf("10");
	public static final /*@NonInvalid*/ IntegerValue INT_100 = ValueUtil.integerValueOf("100");
	public static final /*@NonInvalid*/ IntegerValue INT_6 = ValueUtil.integerValueOf("6");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ RealValue REA_0_0 = ValueUtil.realValueOf("0.0");
	public static final /*@NonInvalid*/ RealValue REA_3_5 = ValueUtil.realValueOf("3.5");
	public static final /*@NonInvalid*/ RealValue REA_4_0 = ValueUtil.realValueOf("4.0");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Grade = TypeId.BAG.getSpecializedId(EducationTables.CLSSid_Grade, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Schedule = TypeId.BAG.getSpecializedId(EducationTables.CLSSid_Schedule, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Assessment = TypeId.ORDERED_SET.getSpecializedId(EducationTables.CLSSid_Assessment, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Course = TypeId.ORDERED_SET.getSpecializedId(EducationTables.CLSSid_Course, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_CourseMaterial = TypeId.ORDERED_SET.getSpecializedId(EducationTables.CLSSid_CourseMaterial, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Department = TypeId.ORDERED_SET.getSpecializedId(EducationTables.CLSSid_Department, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Enrollment = TypeId.ORDERED_SET.getSpecializedId(EducationTables.CLSSid_Enrollment, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Grade = TypeId.ORDERED_SET.getSpecializedId(EducationTables.CLSSid_Grade, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Room = TypeId.ORDERED_SET.getSpecializedId(EducationTables.CLSSid_Room, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Student = TypeId.ORDERED_SET.getSpecializedId(EducationTables.CLSSid_Student, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Teacher = TypeId.ORDERED_SET.getSpecializedId(EducationTables.CLSSid_Teacher, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			EducationTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EducationTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Assessment = new EcoreExecutorType(EducationPackage.Literals.ASSESSMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Course = new EcoreExecutorType(EducationPackage.Literals.COURSE, PACKAGE, 0);
		public static final EcoreExecutorType _CourseMaterial = new EcoreExecutorType(EducationPackage.Literals.COURSE_MATERIAL, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _DayOfWeek = new EcoreExecutorEnumeration(EducationPackage.Literals.DAY_OF_WEEK, PACKAGE, 0);
		public static final EcoreExecutorType _Department = new EcoreExecutorType(EducationPackage.Literals.DEPARTMENT, PACKAGE, 0);
		public static final EcoreExecutorType _EducationMaterial = new EcoreExecutorType(EducationPackage.Literals.EDUCATION_MATERIAL, PACKAGE, 0);
		public static final EcoreExecutorType _Enrollment = new EcoreExecutorType(EducationPackage.Literals.ENROLLMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Grade = new EcoreExecutorType(EducationPackage.Literals.GRADE, PACKAGE, 0);
		public static final EcoreExecutorType _HighSchool = new EcoreExecutorType(EducationPackage.Literals.HIGH_SCHOOL, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _MaterialType = new EcoreExecutorEnumeration(EducationPackage.Literals.MATERIAL_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(EducationPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Room = new EcoreExecutorType(EducationPackage.Literals.ROOM, PACKAGE, 0);
		public static final EcoreExecutorType _Schedule = new EcoreExecutorType(EducationPackage.Literals.SCHEDULE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Score = new EcoreExecutorEnumeration(EducationPackage.Literals.SCORE, PACKAGE, 0);
		public static final EcoreExecutorType _Semester = new EcoreExecutorType(EducationPackage.Literals.SEMESTER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _SemesterOffered = new EcoreExecutorEnumeration(EducationPackage.Literals.SEMESTER_OFFERED, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Status = new EcoreExecutorEnumeration(EducationPackage.Literals.STATUS, PACKAGE, 0);
		public static final EcoreExecutorType _Student = new EcoreExecutorType(EducationPackage.Literals.STUDENT, PACKAGE, 0);
		public static final EcoreExecutorType _Teacher = new EcoreExecutorType(EducationPackage.Literals.TEACHER, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Type = new EcoreExecutorEnumeration(EducationPackage.Literals.TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _User = new EcoreExecutorType(EducationPackage.Literals.USER, PACKAGE, 0 | ExecutorType.ABSTRACT);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Assessment,
			_Course,
			_CourseMaterial,
			_DayOfWeek,
			_Department,
			_EducationMaterial,
			_Enrollment,
			_Grade,
			_HighSchool,
			_MaterialType,
			_NamedElement,
			_Room,
			_Schedule,
			_Score,
			_Semester,
			_SemesterOffered,
			_Status,
			_Student,
			_Teacher,
			_Type,
			_User
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EducationTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Assessment__Assessment = new ExecutorFragment(Types._Assessment, EducationTables.Types._Assessment);
		private static final ExecutorFragment _Assessment__OclAny = new ExecutorFragment(Types._Assessment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Assessment__OclElement = new ExecutorFragment(Types._Assessment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Course__Course = new ExecutorFragment(Types._Course, EducationTables.Types._Course);
		private static final ExecutorFragment _Course__NamedElement = new ExecutorFragment(Types._Course, EducationTables.Types._NamedElement);
		private static final ExecutorFragment _Course__OclAny = new ExecutorFragment(Types._Course, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Course__OclElement = new ExecutorFragment(Types._Course, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CourseMaterial__CourseMaterial = new ExecutorFragment(Types._CourseMaterial, EducationTables.Types._CourseMaterial);
		private static final ExecutorFragment _CourseMaterial__OclAny = new ExecutorFragment(Types._CourseMaterial, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CourseMaterial__OclElement = new ExecutorFragment(Types._CourseMaterial, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DayOfWeek__DayOfWeek = new ExecutorFragment(Types._DayOfWeek, EducationTables.Types._DayOfWeek);
		private static final ExecutorFragment _DayOfWeek__OclAny = new ExecutorFragment(Types._DayOfWeek, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DayOfWeek__OclElement = new ExecutorFragment(Types._DayOfWeek, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DayOfWeek__OclEnumeration = new ExecutorFragment(Types._DayOfWeek, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _DayOfWeek__OclType = new ExecutorFragment(Types._DayOfWeek, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Department__Department = new ExecutorFragment(Types._Department, EducationTables.Types._Department);
		private static final ExecutorFragment _Department__NamedElement = new ExecutorFragment(Types._Department, EducationTables.Types._NamedElement);
		private static final ExecutorFragment _Department__OclAny = new ExecutorFragment(Types._Department, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Department__OclElement = new ExecutorFragment(Types._Department, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _EducationMaterial__EducationMaterial = new ExecutorFragment(Types._EducationMaterial, EducationTables.Types._EducationMaterial);
		private static final ExecutorFragment _EducationMaterial__OclAny = new ExecutorFragment(Types._EducationMaterial, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _EducationMaterial__OclElement = new ExecutorFragment(Types._EducationMaterial, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Enrollment__Enrollment = new ExecutorFragment(Types._Enrollment, EducationTables.Types._Enrollment);
		private static final ExecutorFragment _Enrollment__OclAny = new ExecutorFragment(Types._Enrollment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Enrollment__OclElement = new ExecutorFragment(Types._Enrollment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Grade__Grade = new ExecutorFragment(Types._Grade, EducationTables.Types._Grade);
		private static final ExecutorFragment _Grade__OclAny = new ExecutorFragment(Types._Grade, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Grade__OclElement = new ExecutorFragment(Types._Grade, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _HighSchool__HighSchool = new ExecutorFragment(Types._HighSchool, EducationTables.Types._HighSchool);
		private static final ExecutorFragment _HighSchool__NamedElement = new ExecutorFragment(Types._HighSchool, EducationTables.Types._NamedElement);
		private static final ExecutorFragment _HighSchool__OclAny = new ExecutorFragment(Types._HighSchool, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _HighSchool__OclElement = new ExecutorFragment(Types._HighSchool, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _MaterialType__MaterialType = new ExecutorFragment(Types._MaterialType, EducationTables.Types._MaterialType);
		private static final ExecutorFragment _MaterialType__OclAny = new ExecutorFragment(Types._MaterialType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _MaterialType__OclElement = new ExecutorFragment(Types._MaterialType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _MaterialType__OclEnumeration = new ExecutorFragment(Types._MaterialType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _MaterialType__OclType = new ExecutorFragment(Types._MaterialType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, EducationTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Room__NamedElement = new ExecutorFragment(Types._Room, EducationTables.Types._NamedElement);
		private static final ExecutorFragment _Room__OclAny = new ExecutorFragment(Types._Room, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Room__OclElement = new ExecutorFragment(Types._Room, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Room__Room = new ExecutorFragment(Types._Room, EducationTables.Types._Room);

		private static final ExecutorFragment _Schedule__OclAny = new ExecutorFragment(Types._Schedule, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Schedule__OclElement = new ExecutorFragment(Types._Schedule, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Schedule__Schedule = new ExecutorFragment(Types._Schedule, EducationTables.Types._Schedule);

		private static final ExecutorFragment _Score__OclAny = new ExecutorFragment(Types._Score, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Score__OclElement = new ExecutorFragment(Types._Score, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Score__OclEnumeration = new ExecutorFragment(Types._Score, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Score__OclType = new ExecutorFragment(Types._Score, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Score__Score = new ExecutorFragment(Types._Score, EducationTables.Types._Score);

		private static final ExecutorFragment _Semester__OclAny = new ExecutorFragment(Types._Semester, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Semester__OclElement = new ExecutorFragment(Types._Semester, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Semester__Semester = new ExecutorFragment(Types._Semester, EducationTables.Types._Semester);

		private static final ExecutorFragment _SemesterOffered__OclAny = new ExecutorFragment(Types._SemesterOffered, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SemesterOffered__OclElement = new ExecutorFragment(Types._SemesterOffered, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SemesterOffered__OclEnumeration = new ExecutorFragment(Types._SemesterOffered, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _SemesterOffered__OclType = new ExecutorFragment(Types._SemesterOffered, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _SemesterOffered__SemesterOffered = new ExecutorFragment(Types._SemesterOffered, EducationTables.Types._SemesterOffered);

		private static final ExecutorFragment _Status__OclAny = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Status__OclElement = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Status__OclEnumeration = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Status__OclType = new ExecutorFragment(Types._Status, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Status__Status = new ExecutorFragment(Types._Status, EducationTables.Types._Status);

		private static final ExecutorFragment _Student__NamedElement = new ExecutorFragment(Types._Student, EducationTables.Types._NamedElement);
		private static final ExecutorFragment _Student__OclAny = new ExecutorFragment(Types._Student, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Student__OclElement = new ExecutorFragment(Types._Student, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Student__Student = new ExecutorFragment(Types._Student, EducationTables.Types._Student);
		private static final ExecutorFragment _Student__User = new ExecutorFragment(Types._Student, EducationTables.Types._User);

		private static final ExecutorFragment _Teacher__NamedElement = new ExecutorFragment(Types._Teacher, EducationTables.Types._NamedElement);
		private static final ExecutorFragment _Teacher__OclAny = new ExecutorFragment(Types._Teacher, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Teacher__OclElement = new ExecutorFragment(Types._Teacher, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Teacher__Teacher = new ExecutorFragment(Types._Teacher, EducationTables.Types._Teacher);
		private static final ExecutorFragment _Teacher__User = new ExecutorFragment(Types._Teacher, EducationTables.Types._User);

		private static final ExecutorFragment _Type__OclAny = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Type__OclElement = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Type__OclEnumeration = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Type__OclType = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Type__Type = new ExecutorFragment(Types._Type, EducationTables.Types._Type);

		private static final ExecutorFragment _User__NamedElement = new ExecutorFragment(Types._User, EducationTables.Types._NamedElement);
		private static final ExecutorFragment _User__OclAny = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _User__OclElement = new ExecutorFragment(Types._User, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _User__User = new ExecutorFragment(Types._User, EducationTables.Types._User);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EducationTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EducationTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Student__isEligibleForHonors = new ExecutorOperation("isEligibleForHonors", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Student,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Teacher__isExperiencedTeacher = new ExecutorOperation("isExperiencedTeacher", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Teacher,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EducationTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Assessment__Comments = new EcoreExecutorProperty(EducationPackage.Literals.ASSESSMENT__COMMENTS, Types._Assessment, 0);
		public static final ExecutorProperty _Assessment__DueDate = new EcoreExecutorProperty(EducationPackage.Literals.ASSESSMENT__DUE_DATE, Types._Assessment, 1);
		public static final ExecutorProperty _Assessment__Grades = new EcoreExecutorProperty(EducationPackage.Literals.ASSESSMENT__GRADES, Types._Assessment, 2);
		public static final ExecutorProperty _Assessment__ID = new EcoreExecutorProperty(EducationPackage.Literals.ASSESSMENT__ID, Types._Assessment, 3);
		public static final ExecutorProperty _Assessment__Type = new EcoreExecutorProperty(EducationPackage.Literals.ASSESSMENT__TYPE, Types._Assessment, 4);
		public static final ExecutorProperty _Assessment__Weight = new EcoreExecutorProperty(EducationPackage.Literals.ASSESSMENT__WEIGHT, Types._Assessment, 5);
		public static final ExecutorProperty _Assessment__Course__Assessment = new ExecutorPropertyWithImplementation("Course", Types._Assessment, 6, new EcoreLibraryOppositeProperty(EducationPackage.Literals.COURSE__ASSESSMENT));
		public static final ExecutorProperty _Assessment__Grade__Assesment = new ExecutorPropertyWithImplementation("Grade", Types._Assessment, 7, new EcoreLibraryOppositeProperty(EducationPackage.Literals.GRADE__ASSESMENT));

		public static final ExecutorProperty _Course__Assessment = new EcoreExecutorProperty(EducationPackage.Literals.COURSE__ASSESSMENT, Types._Course, 0);
		public static final ExecutorProperty _Course__CourseMaterial = new EcoreExecutorProperty(EducationPackage.Literals.COURSE__COURSE_MATERIAL, Types._Course, 1);
		public static final ExecutorProperty _Course__Credits = new EcoreExecutorProperty(EducationPackage.Literals.COURSE__CREDITS, Types._Course, 2);
		public static final ExecutorProperty _Course__Departments = new EcoreExecutorProperty(EducationPackage.Literals.COURSE__DEPARTMENTS, Types._Course, 3);
		public static final ExecutorProperty _Course__Description = new EcoreExecutorProperty(EducationPackage.Literals.COURSE__DESCRIPTION, Types._Course, 4);
		public static final ExecutorProperty _Course__Enrollment = new EcoreExecutorProperty(EducationPackage.Literals.COURSE__ENROLLMENT, Types._Course, 5);
		public static final ExecutorProperty _Course__ID = new EcoreExecutorProperty(EducationPackage.Literals.COURSE__ID, Types._Course, 6);
		public static final ExecutorProperty _Course__Lecturer = new EcoreExecutorProperty(EducationPackage.Literals.COURSE__LECTURER, Types._Course, 7);
		public static final ExecutorProperty _Course__Room = new EcoreExecutorProperty(EducationPackage.Literals.COURSE__ROOM, Types._Course, 8);
		public static final ExecutorProperty _Course__Semester = new EcoreExecutorProperty(EducationPackage.Literals.COURSE__SEMESTER, Types._Course, 9);
		public static final ExecutorProperty _Course__HighSchool__Courses = new ExecutorPropertyWithImplementation("HighSchool", Types._Course, 10, new EcoreLibraryOppositeProperty(EducationPackage.Literals.HIGH_SCHOOL__COURSES));
		public static final ExecutorProperty _Course__Schedule__Course = new ExecutorPropertyWithImplementation("Schedule", Types._Course, 11, new EcoreLibraryOppositeProperty(EducationPackage.Literals.SCHEDULE__COURSE));

		public static final ExecutorProperty _CourseMaterial__AccessURL = new EcoreExecutorProperty(EducationPackage.Literals.COURSE_MATERIAL__ACCESS_URL, Types._CourseMaterial, 0);
		public static final ExecutorProperty _CourseMaterial__FileSize = new EcoreExecutorProperty(EducationPackage.Literals.COURSE_MATERIAL__FILE_SIZE, Types._CourseMaterial, 1);
		public static final ExecutorProperty _CourseMaterial__Format = new EcoreExecutorProperty(EducationPackage.Literals.COURSE_MATERIAL__FORMAT, Types._CourseMaterial, 2);
		public static final ExecutorProperty _CourseMaterial__LastUpdate = new EcoreExecutorProperty(EducationPackage.Literals.COURSE_MATERIAL__LAST_UPDATE, Types._CourseMaterial, 3);
		public static final ExecutorProperty _CourseMaterial__Course__CourseMaterial = new ExecutorPropertyWithImplementation("Course", Types._CourseMaterial, 4, new EcoreLibraryOppositeProperty(EducationPackage.Literals.COURSE__COURSE_MATERIAL));

		public static final ExecutorProperty _Department__Description = new EcoreExecutorProperty(EducationPackage.Literals.DEPARTMENT__DESCRIPTION, Types._Department, 0);
		public static final ExecutorProperty _Department__FacultyHead = new EcoreExecutorProperty(EducationPackage.Literals.DEPARTMENT__FACULTY_HEAD, Types._Department, 1);
		public static final ExecutorProperty _Department__ID = new EcoreExecutorProperty(EducationPackage.Literals.DEPARTMENT__ID, Types._Department, 2);
		public static final ExecutorProperty _Department__Course__Departments = new ExecutorPropertyWithImplementation("Course", Types._Department, 3, new EcoreLibraryOppositeProperty(EducationPackage.Literals.COURSE__DEPARTMENTS));
		public static final ExecutorProperty _Department__HighSchool__Departments = new ExecutorPropertyWithImplementation("HighSchool", Types._Department, 4, new EcoreLibraryOppositeProperty(EducationPackage.Literals.HIGH_SCHOOL__DEPARTMENTS));

		public static final ExecutorProperty _EducationMaterial__ResourceID = new EcoreExecutorProperty(EducationPackage.Literals.EDUCATION_MATERIAL__RESOURCE_ID, Types._EducationMaterial, 0);
		public static final ExecutorProperty _EducationMaterial__Title = new EcoreExecutorProperty(EducationPackage.Literals.EDUCATION_MATERIAL__TITLE, Types._EducationMaterial, 1);
		public static final ExecutorProperty _EducationMaterial__Type = new EcoreExecutorProperty(EducationPackage.Literals.EDUCATION_MATERIAL__TYPE, Types._EducationMaterial, 2);

		public static final ExecutorProperty _Enrollment__ID = new EcoreExecutorProperty(EducationPackage.Literals.ENROLLMENT__ID, Types._Enrollment, 0);
		public static final ExecutorProperty _Enrollment__Students = new EcoreExecutorProperty(EducationPackage.Literals.ENROLLMENT__STUDENTS, Types._Enrollment, 1);
		public static final ExecutorProperty _Enrollment__Course__Enrollment = new ExecutorPropertyWithImplementation("Course", Types._Enrollment, 2, new EcoreLibraryOppositeProperty(EducationPackage.Literals.COURSE__ENROLLMENT));

		public static final ExecutorProperty _Grade__Assesment = new EcoreExecutorProperty(EducationPackage.Literals.GRADE__ASSESMENT, Types._Grade, 0);
		public static final ExecutorProperty _Grade__DateAssigned = new EcoreExecutorProperty(EducationPackage.Literals.GRADE__DATE_ASSIGNED, Types._Grade, 1);
		public static final ExecutorProperty _Grade__ID = new EcoreExecutorProperty(EducationPackage.Literals.GRADE__ID, Types._Grade, 2);
		public static final ExecutorProperty _Grade__MaxScore = new EcoreExecutorProperty(EducationPackage.Literals.GRADE__MAX_SCORE, Types._Grade, 3);
		public static final ExecutorProperty _Grade__Score = new EcoreExecutorProperty(EducationPackage.Literals.GRADE__SCORE, Types._Grade, 4);
		public static final ExecutorProperty _Grade__Student = new EcoreExecutorProperty(EducationPackage.Literals.GRADE__STUDENT, Types._Grade, 5);
		public static final ExecutorProperty _Grade__Assessment__Grades = new ExecutorPropertyWithImplementation("Assessment", Types._Grade, 6, new EcoreLibraryOppositeProperty(EducationPackage.Literals.ASSESSMENT__GRADES));

		public static final ExecutorProperty _HighSchool__Courses = new EcoreExecutorProperty(EducationPackage.Literals.HIGH_SCHOOL__COURSES, Types._HighSchool, 0);
		public static final ExecutorProperty _HighSchool__DepartmentCount = new EcoreExecutorProperty(EducationPackage.Literals.HIGH_SCHOOL__DEPARTMENT_COUNT, Types._HighSchool, 1);
		public static final ExecutorProperty _HighSchool__Departments = new EcoreExecutorProperty(EducationPackage.Literals.HIGH_SCHOOL__DEPARTMENTS, Types._HighSchool, 2);
		public static final ExecutorProperty _HighSchool__FoundedYear = new EcoreExecutorProperty(EducationPackage.Literals.HIGH_SCHOOL__FOUNDED_YEAR, Types._HighSchool, 3);
		public static final ExecutorProperty _HighSchool__ID = new EcoreExecutorProperty(EducationPackage.Literals.HIGH_SCHOOL__ID, Types._HighSchool, 4);
		public static final ExecutorProperty _HighSchool__Rooms = new EcoreExecutorProperty(EducationPackage.Literals.HIGH_SCHOOL__ROOMS, Types._HighSchool, 5);
		public static final ExecutorProperty _HighSchool__Teachers = new EcoreExecutorProperty(EducationPackage.Literals.HIGH_SCHOOL__TEACHERS, Types._HighSchool, 6);
		public static final ExecutorProperty _HighSchool__TotalCapacity = new EcoreExecutorProperty(EducationPackage.Literals.HIGH_SCHOOL__TOTAL_CAPACITY, Types._HighSchool, 7);

		public static final ExecutorProperty _NamedElement__Name = new EcoreExecutorProperty(EducationPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Room__Capacity = new EcoreExecutorProperty(EducationPackage.Literals.ROOM__CAPACITY, Types._Room, 0);
		public static final ExecutorProperty _Room__ID = new EcoreExecutorProperty(EducationPackage.Literals.ROOM__ID, Types._Room, 1);
		public static final ExecutorProperty _Room__ReservedClassroom = new EcoreExecutorProperty(EducationPackage.Literals.ROOM__RESERVED_CLASSROOM, Types._Room, 2);
		public static final ExecutorProperty _Room__Course__Room = new ExecutorPropertyWithImplementation("Course", Types._Room, 3, new EcoreLibraryOppositeProperty(EducationPackage.Literals.COURSE__ROOM));
		public static final ExecutorProperty _Room__HighSchool__Rooms = new ExecutorPropertyWithImplementation("HighSchool", Types._Room, 4, new EcoreLibraryOppositeProperty(EducationPackage.Literals.HIGH_SCHOOL__ROOMS));

		public static final ExecutorProperty _Schedule__Course = new EcoreExecutorProperty(EducationPackage.Literals.SCHEDULE__COURSE, Types._Schedule, 0);
		public static final ExecutorProperty _Schedule__DayOfWeek = new EcoreExecutorProperty(EducationPackage.Literals.SCHEDULE__DAY_OF_WEEK, Types._Schedule, 1);
		public static final ExecutorProperty _Schedule__Duration = new EcoreExecutorProperty(EducationPackage.Literals.SCHEDULE__DURATION, Types._Schedule, 2);
		public static final ExecutorProperty _Schedule__ID = new EcoreExecutorProperty(EducationPackage.Literals.SCHEDULE__ID, Types._Schedule, 3);
		public static final ExecutorProperty _Schedule__StartTime = new EcoreExecutorProperty(EducationPackage.Literals.SCHEDULE__START_TIME, Types._Schedule, 4);
		public static final ExecutorProperty _Schedule__Room__ReservedClassroom = new ExecutorPropertyWithImplementation("Room", Types._Schedule, 5, new EcoreLibraryOppositeProperty(EducationPackage.Literals.ROOM__RESERVED_CLASSROOM));

		public static final ExecutorProperty _Semester__ID = new EcoreExecutorProperty(EducationPackage.Literals.SEMESTER__ID, Types._Semester, 0);
		public static final ExecutorProperty _Semester__Term = new EcoreExecutorProperty(EducationPackage.Literals.SEMESTER__TERM, Types._Semester, 1);
		public static final ExecutorProperty _Semester__Year = new EcoreExecutorProperty(EducationPackage.Literals.SEMESTER__YEAR, Types._Semester, 2);
		public static final ExecutorProperty _Semester__Course__Semester = new ExecutorPropertyWithImplementation("Course", Types._Semester, 3, new EcoreLibraryOppositeProperty(EducationPackage.Literals.COURSE__SEMESTER));

		public static final ExecutorProperty _Student__GPA = new EcoreExecutorProperty(EducationPackage.Literals.STUDENT__GPA, Types._Student, 0);
		public static final ExecutorProperty _Student__Status = new EcoreExecutorProperty(EducationPackage.Literals.STUDENT__STATUS, Types._Student, 1);
		public static final ExecutorProperty _Student__YearOfEnrollment = new EcoreExecutorProperty(EducationPackage.Literals.STUDENT__YEAR_OF_ENROLLMENT, Types._Student, 2);
		public static final ExecutorProperty _Student__Enrollment__Students = new ExecutorPropertyWithImplementation("Enrollment", Types._Student, 3, new EcoreLibraryOppositeProperty(EducationPackage.Literals.ENROLLMENT__STUDENTS));
		public static final ExecutorProperty _Student__Grade__Student = new ExecutorPropertyWithImplementation("Grade", Types._Student, 4, new EcoreLibraryOppositeProperty(EducationPackage.Literals.GRADE__STUDENT));

		public static final ExecutorProperty _Teacher__Qualification = new EcoreExecutorProperty(EducationPackage.Literals.TEACHER__QUALIFICATION, Types._Teacher, 0);
		public static final ExecutorProperty _Teacher__Specialization = new EcoreExecutorProperty(EducationPackage.Literals.TEACHER__SPECIALIZATION, Types._Teacher, 1);
		public static final ExecutorProperty _Teacher__YearsOfExperience = new EcoreExecutorProperty(EducationPackage.Literals.TEACHER__YEARS_OF_EXPERIENCE, Types._Teacher, 2);
		public static final ExecutorProperty _Teacher__Course__Lecturer = new ExecutorPropertyWithImplementation("Course", Types._Teacher, 3, new EcoreLibraryOppositeProperty(EducationPackage.Literals.COURSE__LECTURER));
		public static final ExecutorProperty _Teacher__HighSchool__Teachers = new ExecutorPropertyWithImplementation("HighSchool", Types._Teacher, 4, new EcoreLibraryOppositeProperty(EducationPackage.Literals.HIGH_SCHOOL__TEACHERS));

		public static final ExecutorProperty _User__Email = new EcoreExecutorProperty(EducationPackage.Literals.USER__EMAIL, Types._User, 0);
		public static final ExecutorProperty _User__ID = new EcoreExecutorProperty(EducationPackage.Literals.USER__ID, Types._User, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EducationTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Assessment =
			{
				Fragments._Assessment__OclAny /* 0 */,
				Fragments._Assessment__OclElement /* 1 */,
				Fragments._Assessment__Assessment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Assessment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Course =
			{
				Fragments._Course__OclAny /* 0 */,
				Fragments._Course__OclElement /* 1 */,
				Fragments._Course__NamedElement /* 2 */,
				Fragments._Course__Course /* 3 */
			};
		private static final int /*@NonNull*/ [] __Course = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CourseMaterial =
			{
				Fragments._CourseMaterial__OclAny /* 0 */,
				Fragments._CourseMaterial__OclElement /* 1 */,
				Fragments._CourseMaterial__CourseMaterial /* 2 */
			};
		private static final int /*@NonNull*/ [] __CourseMaterial = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DayOfWeek =
			{
				Fragments._DayOfWeek__OclAny /* 0 */,
				Fragments._DayOfWeek__OclElement /* 1 */,
				Fragments._DayOfWeek__OclType /* 2 */,
				Fragments._DayOfWeek__OclEnumeration /* 3 */,
				Fragments._DayOfWeek__DayOfWeek /* 4 */
			};
		private static final int /*@NonNull*/ [] __DayOfWeek = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Department =
			{
				Fragments._Department__OclAny /* 0 */,
				Fragments._Department__OclElement /* 1 */,
				Fragments._Department__NamedElement /* 2 */,
				Fragments._Department__Department /* 3 */
			};
		private static final int /*@NonNull*/ [] __Department = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _EducationMaterial =
			{
				Fragments._EducationMaterial__OclAny /* 0 */,
				Fragments._EducationMaterial__OclElement /* 1 */,
				Fragments._EducationMaterial__EducationMaterial /* 2 */
			};
		private static final int /*@NonNull*/ [] __EducationMaterial = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Enrollment =
			{
				Fragments._Enrollment__OclAny /* 0 */,
				Fragments._Enrollment__OclElement /* 1 */,
				Fragments._Enrollment__Enrollment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Enrollment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Grade =
			{
				Fragments._Grade__OclAny /* 0 */,
				Fragments._Grade__OclElement /* 1 */,
				Fragments._Grade__Grade /* 2 */
			};
		private static final int /*@NonNull*/ [] __Grade = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _HighSchool =
			{
				Fragments._HighSchool__OclAny /* 0 */,
				Fragments._HighSchool__OclElement /* 1 */,
				Fragments._HighSchool__NamedElement /* 2 */,
				Fragments._HighSchool__HighSchool /* 3 */
			};
		private static final int /*@NonNull*/ [] __HighSchool = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _MaterialType =
			{
				Fragments._MaterialType__OclAny /* 0 */,
				Fragments._MaterialType__OclElement /* 1 */,
				Fragments._MaterialType__OclType /* 2 */,
				Fragments._MaterialType__OclEnumeration /* 3 */,
				Fragments._MaterialType__MaterialType /* 4 */
			};
		private static final int /*@NonNull*/ [] __MaterialType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Room =
			{
				Fragments._Room__OclAny /* 0 */,
				Fragments._Room__OclElement /* 1 */,
				Fragments._Room__NamedElement /* 2 */,
				Fragments._Room__Room /* 3 */
			};
		private static final int /*@NonNull*/ [] __Room = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Schedule =
			{
				Fragments._Schedule__OclAny /* 0 */,
				Fragments._Schedule__OclElement /* 1 */,
				Fragments._Schedule__Schedule /* 2 */
			};
		private static final int /*@NonNull*/ [] __Schedule = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Score =
			{
				Fragments._Score__OclAny /* 0 */,
				Fragments._Score__OclElement /* 1 */,
				Fragments._Score__OclType /* 2 */,
				Fragments._Score__OclEnumeration /* 3 */,
				Fragments._Score__Score /* 4 */
			};
		private static final int /*@NonNull*/ [] __Score = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Semester =
			{
				Fragments._Semester__OclAny /* 0 */,
				Fragments._Semester__OclElement /* 1 */,
				Fragments._Semester__Semester /* 2 */
			};
		private static final int /*@NonNull*/ [] __Semester = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SemesterOffered =
			{
				Fragments._SemesterOffered__OclAny /* 0 */,
				Fragments._SemesterOffered__OclElement /* 1 */,
				Fragments._SemesterOffered__OclType /* 2 */,
				Fragments._SemesterOffered__OclEnumeration /* 3 */,
				Fragments._SemesterOffered__SemesterOffered /* 4 */
			};
		private static final int /*@NonNull*/ [] __SemesterOffered = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Status =
			{
				Fragments._Status__OclAny /* 0 */,
				Fragments._Status__OclElement /* 1 */,
				Fragments._Status__OclType /* 2 */,
				Fragments._Status__OclEnumeration /* 3 */,
				Fragments._Status__Status /* 4 */
			};
		private static final int /*@NonNull*/ [] __Status = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Student =
			{
				Fragments._Student__OclAny /* 0 */,
				Fragments._Student__OclElement /* 1 */,
				Fragments._Student__NamedElement /* 2 */,
				Fragments._Student__User /* 3 */,
				Fragments._Student__Student /* 4 */
			};
		private static final int /*@NonNull*/ [] __Student = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Teacher =
			{
				Fragments._Teacher__OclAny /* 0 */,
				Fragments._Teacher__OclElement /* 1 */,
				Fragments._Teacher__NamedElement /* 2 */,
				Fragments._Teacher__User /* 3 */,
				Fragments._Teacher__Teacher /* 4 */
			};
		private static final int /*@NonNull*/ [] __Teacher = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Type =
			{
				Fragments._Type__OclAny /* 0 */,
				Fragments._Type__OclElement /* 1 */,
				Fragments._Type__OclType /* 2 */,
				Fragments._Type__OclEnumeration /* 3 */,
				Fragments._Type__Type /* 4 */
			};
		private static final int /*@NonNull*/ [] __Type = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _User =
			{
				Fragments._User__OclAny /* 0 */,
				Fragments._User__OclElement /* 1 */,
				Fragments._User__NamedElement /* 2 */,
				Fragments._User__User /* 3 */
			};
		private static final int /*@NonNull*/ [] __User = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Assessment.initFragments(_Assessment, __Assessment);
			Types._Course.initFragments(_Course, __Course);
			Types._CourseMaterial.initFragments(_CourseMaterial, __CourseMaterial);
			Types._DayOfWeek.initFragments(_DayOfWeek, __DayOfWeek);
			Types._Department.initFragments(_Department, __Department);
			Types._EducationMaterial.initFragments(_EducationMaterial, __EducationMaterial);
			Types._Enrollment.initFragments(_Enrollment, __Enrollment);
			Types._Grade.initFragments(_Grade, __Grade);
			Types._HighSchool.initFragments(_HighSchool, __HighSchool);
			Types._MaterialType.initFragments(_MaterialType, __MaterialType);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Room.initFragments(_Room, __Room);
			Types._Schedule.initFragments(_Schedule, __Schedule);
			Types._Score.initFragments(_Score, __Score);
			Types._Semester.initFragments(_Semester, __Semester);
			Types._SemesterOffered.initFragments(_SemesterOffered, __SemesterOffered);
			Types._Status.initFragments(_Status, __Status);
			Types._Student.initFragments(_Student, __Student);
			Types._Teacher.initFragments(_Teacher, __Teacher);
			Types._Type.initFragments(_Type, __Type);
			Types._User.initFragments(_User, __User);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EducationTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Assessment__Assessment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Assessment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Assessment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Course__Course = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Course__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Course__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Course__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CourseMaterial__CourseMaterial = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CourseMaterial__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CourseMaterial__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DayOfWeek__DayOfWeek = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DayOfWeek__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DayOfWeek__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DayOfWeek__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DayOfWeek__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Department__Department = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Department__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Department__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Department__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _EducationMaterial__EducationMaterial = {};
		private static final ExecutorOperation /*@NonNull*/ [] _EducationMaterial__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _EducationMaterial__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Enrollment__Enrollment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Enrollment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Enrollment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Grade__Grade = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Grade__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Grade__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _HighSchool__HighSchool = {};
		private static final ExecutorOperation /*@NonNull*/ [] _HighSchool__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _HighSchool__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _HighSchool__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _MaterialType__MaterialType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _MaterialType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MaterialType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MaterialType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _MaterialType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Room__Room = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Room__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Room__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Room__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Schedule__Schedule = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Schedule__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Schedule__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Score__Score = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Score__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Score__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Score__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Score__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Semester__Semester = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Semester__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Semester__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SemesterOffered__SemesterOffered = {};
		private static final ExecutorOperation /*@NonNull*/ [] _SemesterOffered__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SemesterOffered__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SemesterOffered__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SemesterOffered__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Status__Status = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Status__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Student__Student = {
			EducationTables.Operations._Student__isEligibleForHonors /* isEligibleForHonors() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Student__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Student__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Student__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Student__User = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Teacher__Teacher = {
			EducationTables.Operations._Teacher__isExperiencedTeacher /* isExperiencedTeacher() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Teacher__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Teacher__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Teacher__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Teacher__User = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Type__Type = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Type__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Type__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Type__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Type__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _User__User = {};
		private static final ExecutorOperation /*@NonNull*/ [] _User__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _User__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Assessment__Assessment.initOperations(_Assessment__Assessment);
			Fragments._Assessment__OclAny.initOperations(_Assessment__OclAny);
			Fragments._Assessment__OclElement.initOperations(_Assessment__OclElement);

			Fragments._Course__Course.initOperations(_Course__Course);
			Fragments._Course__NamedElement.initOperations(_Course__NamedElement);
			Fragments._Course__OclAny.initOperations(_Course__OclAny);
			Fragments._Course__OclElement.initOperations(_Course__OclElement);

			Fragments._CourseMaterial__CourseMaterial.initOperations(_CourseMaterial__CourseMaterial);
			Fragments._CourseMaterial__OclAny.initOperations(_CourseMaterial__OclAny);
			Fragments._CourseMaterial__OclElement.initOperations(_CourseMaterial__OclElement);

			Fragments._DayOfWeek__DayOfWeek.initOperations(_DayOfWeek__DayOfWeek);
			Fragments._DayOfWeek__OclAny.initOperations(_DayOfWeek__OclAny);
			Fragments._DayOfWeek__OclElement.initOperations(_DayOfWeek__OclElement);
			Fragments._DayOfWeek__OclEnumeration.initOperations(_DayOfWeek__OclEnumeration);
			Fragments._DayOfWeek__OclType.initOperations(_DayOfWeek__OclType);

			Fragments._Department__Department.initOperations(_Department__Department);
			Fragments._Department__NamedElement.initOperations(_Department__NamedElement);
			Fragments._Department__OclAny.initOperations(_Department__OclAny);
			Fragments._Department__OclElement.initOperations(_Department__OclElement);

			Fragments._EducationMaterial__EducationMaterial.initOperations(_EducationMaterial__EducationMaterial);
			Fragments._EducationMaterial__OclAny.initOperations(_EducationMaterial__OclAny);
			Fragments._EducationMaterial__OclElement.initOperations(_EducationMaterial__OclElement);

			Fragments._Enrollment__Enrollment.initOperations(_Enrollment__Enrollment);
			Fragments._Enrollment__OclAny.initOperations(_Enrollment__OclAny);
			Fragments._Enrollment__OclElement.initOperations(_Enrollment__OclElement);

			Fragments._Grade__Grade.initOperations(_Grade__Grade);
			Fragments._Grade__OclAny.initOperations(_Grade__OclAny);
			Fragments._Grade__OclElement.initOperations(_Grade__OclElement);

			Fragments._HighSchool__HighSchool.initOperations(_HighSchool__HighSchool);
			Fragments._HighSchool__NamedElement.initOperations(_HighSchool__NamedElement);
			Fragments._HighSchool__OclAny.initOperations(_HighSchool__OclAny);
			Fragments._HighSchool__OclElement.initOperations(_HighSchool__OclElement);

			Fragments._MaterialType__MaterialType.initOperations(_MaterialType__MaterialType);
			Fragments._MaterialType__OclAny.initOperations(_MaterialType__OclAny);
			Fragments._MaterialType__OclElement.initOperations(_MaterialType__OclElement);
			Fragments._MaterialType__OclEnumeration.initOperations(_MaterialType__OclEnumeration);
			Fragments._MaterialType__OclType.initOperations(_MaterialType__OclType);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Room__NamedElement.initOperations(_Room__NamedElement);
			Fragments._Room__OclAny.initOperations(_Room__OclAny);
			Fragments._Room__OclElement.initOperations(_Room__OclElement);
			Fragments._Room__Room.initOperations(_Room__Room);

			Fragments._Schedule__OclAny.initOperations(_Schedule__OclAny);
			Fragments._Schedule__OclElement.initOperations(_Schedule__OclElement);
			Fragments._Schedule__Schedule.initOperations(_Schedule__Schedule);

			Fragments._Score__OclAny.initOperations(_Score__OclAny);
			Fragments._Score__OclElement.initOperations(_Score__OclElement);
			Fragments._Score__OclEnumeration.initOperations(_Score__OclEnumeration);
			Fragments._Score__OclType.initOperations(_Score__OclType);
			Fragments._Score__Score.initOperations(_Score__Score);

			Fragments._Semester__OclAny.initOperations(_Semester__OclAny);
			Fragments._Semester__OclElement.initOperations(_Semester__OclElement);
			Fragments._Semester__Semester.initOperations(_Semester__Semester);

			Fragments._SemesterOffered__OclAny.initOperations(_SemesterOffered__OclAny);
			Fragments._SemesterOffered__OclElement.initOperations(_SemesterOffered__OclElement);
			Fragments._SemesterOffered__OclEnumeration.initOperations(_SemesterOffered__OclEnumeration);
			Fragments._SemesterOffered__OclType.initOperations(_SemesterOffered__OclType);
			Fragments._SemesterOffered__SemesterOffered.initOperations(_SemesterOffered__SemesterOffered);

			Fragments._Status__OclAny.initOperations(_Status__OclAny);
			Fragments._Status__OclElement.initOperations(_Status__OclElement);
			Fragments._Status__OclEnumeration.initOperations(_Status__OclEnumeration);
			Fragments._Status__OclType.initOperations(_Status__OclType);
			Fragments._Status__Status.initOperations(_Status__Status);

			Fragments._Student__NamedElement.initOperations(_Student__NamedElement);
			Fragments._Student__OclAny.initOperations(_Student__OclAny);
			Fragments._Student__OclElement.initOperations(_Student__OclElement);
			Fragments._Student__Student.initOperations(_Student__Student);
			Fragments._Student__User.initOperations(_Student__User);

			Fragments._Teacher__NamedElement.initOperations(_Teacher__NamedElement);
			Fragments._Teacher__OclAny.initOperations(_Teacher__OclAny);
			Fragments._Teacher__OclElement.initOperations(_Teacher__OclElement);
			Fragments._Teacher__Teacher.initOperations(_Teacher__Teacher);
			Fragments._Teacher__User.initOperations(_Teacher__User);

			Fragments._Type__OclAny.initOperations(_Type__OclAny);
			Fragments._Type__OclElement.initOperations(_Type__OclElement);
			Fragments._Type__OclEnumeration.initOperations(_Type__OclEnumeration);
			Fragments._Type__OclType.initOperations(_Type__OclType);
			Fragments._Type__Type.initOperations(_Type__Type);

			Fragments._User__NamedElement.initOperations(_User__NamedElement);
			Fragments._User__OclAny.initOperations(_User__OclAny);
			Fragments._User__OclElement.initOperations(_User__OclElement);
			Fragments._User__User.initOperations(_User__User);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EducationTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Assessment = {
			EducationTables.Properties._Assessment__Comments,
			EducationTables.Properties._Assessment__DueDate,
			EducationTables.Properties._Assessment__Grades,
			EducationTables.Properties._Assessment__ID,
			EducationTables.Properties._Assessment__Type,
			EducationTables.Properties._Assessment__Weight,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Course = {
			EducationTables.Properties._Course__Assessment,
			EducationTables.Properties._Course__CourseMaterial,
			EducationTables.Properties._Course__Credits,
			EducationTables.Properties._Course__Departments,
			EducationTables.Properties._Course__Description,
			EducationTables.Properties._Course__Enrollment,
			EducationTables.Properties._Course__ID,
			EducationTables.Properties._Course__Lecturer,
			EducationTables.Properties._NamedElement__Name,
			EducationTables.Properties._Course__Room,
			EducationTables.Properties._Course__Semester,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CourseMaterial = {
			EducationTables.Properties._CourseMaterial__AccessURL,
			EducationTables.Properties._CourseMaterial__FileSize,
			EducationTables.Properties._CourseMaterial__Format,
			EducationTables.Properties._CourseMaterial__LastUpdate,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DayOfWeek = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Department = {
			EducationTables.Properties._Department__Description,
			EducationTables.Properties._Department__FacultyHead,
			EducationTables.Properties._Department__ID,
			EducationTables.Properties._NamedElement__Name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _EducationMaterial = {
			EducationTables.Properties._EducationMaterial__ResourceID,
			EducationTables.Properties._EducationMaterial__Title,
			EducationTables.Properties._EducationMaterial__Type,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Enrollment = {
			EducationTables.Properties._Enrollment__ID,
			EducationTables.Properties._Enrollment__Students,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Grade = {
			EducationTables.Properties._Grade__Assesment,
			EducationTables.Properties._Grade__DateAssigned,
			EducationTables.Properties._Grade__ID,
			EducationTables.Properties._Grade__MaxScore,
			EducationTables.Properties._Grade__Score,
			EducationTables.Properties._Grade__Student,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _HighSchool = {
			EducationTables.Properties._HighSchool__Courses,
			EducationTables.Properties._HighSchool__DepartmentCount,
			EducationTables.Properties._HighSchool__Departments,
			EducationTables.Properties._HighSchool__FoundedYear,
			EducationTables.Properties._HighSchool__ID,
			EducationTables.Properties._NamedElement__Name,
			EducationTables.Properties._HighSchool__Rooms,
			EducationTables.Properties._HighSchool__Teachers,
			EducationTables.Properties._HighSchool__TotalCapacity,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _MaterialType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			EducationTables.Properties._NamedElement__Name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Room = {
			EducationTables.Properties._Room__Capacity,
			EducationTables.Properties._Room__ID,
			EducationTables.Properties._NamedElement__Name,
			EducationTables.Properties._Room__ReservedClassroom,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Schedule = {
			EducationTables.Properties._Schedule__Course,
			EducationTables.Properties._Schedule__DayOfWeek,
			EducationTables.Properties._Schedule__Duration,
			EducationTables.Properties._Schedule__ID,
			EducationTables.Properties._Schedule__StartTime,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Score = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Semester = {
			EducationTables.Properties._Semester__ID,
			EducationTables.Properties._Semester__Term,
			EducationTables.Properties._Semester__Year,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SemesterOffered = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Status = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Student = {
			EducationTables.Properties._User__Email,
			EducationTables.Properties._Student__GPA,
			EducationTables.Properties._User__ID,
			EducationTables.Properties._NamedElement__Name,
			EducationTables.Properties._Student__Status,
			EducationTables.Properties._Student__YearOfEnrollment,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Teacher = {
			EducationTables.Properties._User__Email,
			EducationTables.Properties._User__ID,
			EducationTables.Properties._NamedElement__Name,
			EducationTables.Properties._Teacher__Qualification,
			EducationTables.Properties._Teacher__Specialization,
			EducationTables.Properties._Teacher__YearsOfExperience,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Type = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _User = {
			EducationTables.Properties._User__Email,
			EducationTables.Properties._User__ID,
			EducationTables.Properties._NamedElement__Name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Assessment__Assessment.initProperties(_Assessment);
			Fragments._Course__Course.initProperties(_Course);
			Fragments._CourseMaterial__CourseMaterial.initProperties(_CourseMaterial);
			Fragments._DayOfWeek__DayOfWeek.initProperties(_DayOfWeek);
			Fragments._Department__Department.initProperties(_Department);
			Fragments._EducationMaterial__EducationMaterial.initProperties(_EducationMaterial);
			Fragments._Enrollment__Enrollment.initProperties(_Enrollment);
			Fragments._Grade__Grade.initProperties(_Grade);
			Fragments._HighSchool__HighSchool.initProperties(_HighSchool);
			Fragments._MaterialType__MaterialType.initProperties(_MaterialType);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Room__Room.initProperties(_Room);
			Fragments._Schedule__Schedule.initProperties(_Schedule);
			Fragments._Score__Score.initProperties(_Score);
			Fragments._Semester__Semester.initProperties(_Semester);
			Fragments._SemesterOffered__SemesterOffered.initProperties(_SemesterOffered);
			Fragments._Status__Status.initProperties(_Status);
			Fragments._Student__Student.initProperties(_Student);
			Fragments._Teacher__Teacher.initProperties(_Teacher);
			Fragments._Type__Type.initProperties(_Type);
			Fragments._User__User.initProperties(_User);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EducationTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _DayOfWeek__Monday = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.DAY_OF_WEEK.getEEnumLiteral("Monday"), Types._DayOfWeek, 0);
		public static final EcoreExecutorEnumerationLiteral _DayOfWeek__Tuesday = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.DAY_OF_WEEK.getEEnumLiteral("Tuesday"), Types._DayOfWeek, 1);
		public static final EcoreExecutorEnumerationLiteral _DayOfWeek__Wednesday = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.DAY_OF_WEEK.getEEnumLiteral("Wednesday"), Types._DayOfWeek, 2);
		public static final EcoreExecutorEnumerationLiteral _DayOfWeek__Thursday = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.DAY_OF_WEEK.getEEnumLiteral("Thursday"), Types._DayOfWeek, 3);
		public static final EcoreExecutorEnumerationLiteral _DayOfWeek__Friday = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.DAY_OF_WEEK.getEEnumLiteral("Friday"), Types._DayOfWeek, 4);
		public static final EcoreExecutorEnumerationLiteral _DayOfWeek__Saturday = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.DAY_OF_WEEK.getEEnumLiteral("Saturday"), Types._DayOfWeek, 5);
		public static final EcoreExecutorEnumerationLiteral _DayOfWeek__Sunday = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.DAY_OF_WEEK.getEEnumLiteral("Sunday"), Types._DayOfWeek, 6);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _DayOfWeek = {
			_DayOfWeek__Monday,
			_DayOfWeek__Tuesday,
			_DayOfWeek__Wednesday,
			_DayOfWeek__Thursday,
			_DayOfWeek__Friday,
			_DayOfWeek__Saturday,
			_DayOfWeek__Sunday
		};

		public static final EcoreExecutorEnumerationLiteral _MaterialType__Document = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.MATERIAL_TYPE.getEEnumLiteral("Document"), Types._MaterialType, 0);
		public static final EcoreExecutorEnumerationLiteral _MaterialType__Multimedia = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.MATERIAL_TYPE.getEEnumLiteral("Multimedia"), Types._MaterialType, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _MaterialType = {
			_MaterialType__Document,
			_MaterialType__Multimedia
		};

		public static final EcoreExecutorEnumerationLiteral _Score__A = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.SCORE.getEEnumLiteral("A"), Types._Score, 0);
		public static final EcoreExecutorEnumerationLiteral _Score__B = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.SCORE.getEEnumLiteral("B"), Types._Score, 1);
		public static final EcoreExecutorEnumerationLiteral _Score__C = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.SCORE.getEEnumLiteral("C"), Types._Score, 2);
		public static final EcoreExecutorEnumerationLiteral _Score__D = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.SCORE.getEEnumLiteral("D"), Types._Score, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Score = {
			_Score__A,
			_Score__B,
			_Score__C,
			_Score__D
		};

		public static final EcoreExecutorEnumerationLiteral _SemesterOffered__Winter = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.SEMESTER_OFFERED.getEEnumLiteral("Winter"), Types._SemesterOffered, 0);
		public static final EcoreExecutorEnumerationLiteral _SemesterOffered__Summer = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.SEMESTER_OFFERED.getEEnumLiteral("Summer"), Types._SemesterOffered, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _SemesterOffered = {
			_SemesterOffered__Winter,
			_SemesterOffered__Summer
		};

		public static final EcoreExecutorEnumerationLiteral _Status__Active = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.STATUS.getEEnumLiteral("Active"), Types._Status, 0);
		public static final EcoreExecutorEnumerationLiteral _Status__Inactive = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.STATUS.getEEnumLiteral("Inactive"), Types._Status, 1);
		public static final EcoreExecutorEnumerationLiteral _Status__Graduated = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.STATUS.getEEnumLiteral("Graduated"), Types._Status, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Status = {
			_Status__Active,
			_Status__Inactive,
			_Status__Graduated
		};

		public static final EcoreExecutorEnumerationLiteral _Type__oral = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.TYPE.getEEnumLiteral("oral"), Types._Type, 0);
		public static final EcoreExecutorEnumerationLiteral _Type__quiz = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.TYPE.getEEnumLiteral("quiz"), Types._Type, 1);
		public static final EcoreExecutorEnumerationLiteral _Type__assignment = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.TYPE.getEEnumLiteral("assignment"), Types._Type, 2);
		public static final EcoreExecutorEnumerationLiteral _Type__written = new EcoreExecutorEnumerationLiteral(EducationPackage.Literals.TYPE.getEEnumLiteral("written"), Types._Type, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Type = {
			_Type__oral,
			_Type__quiz,
			_Type__assignment,
			_Type__written
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._DayOfWeek.initLiterals(_DayOfWeek);
			Types._MaterialType.initLiterals(_MaterialType);
			Types._Score.initLiterals(_Score);
			Types._SemesterOffered.initLiterals(_SemesterOffered);
			Types._Status.initLiterals(_Status);
			Types._Type.initLiterals(_Type);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of EducationTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new EducationTables();
	}

	private EducationTables() {
		super(EducationPackage.eNS_URI);
	}
}
