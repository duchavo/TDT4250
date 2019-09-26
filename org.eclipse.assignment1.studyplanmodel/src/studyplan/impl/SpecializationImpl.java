/**
 */
package studyplan.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import studyplan.CourseGroup;
import studyplan.Semester;
import studyplan.Specialization;
import studyplan.StudyplanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyplan.impl.SpecializationImpl#getSpecName <em>Spec Name</em>}</li>
 *   <li>{@link studyplan.impl.SpecializationImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyplan.impl.SpecializationImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link studyplan.impl.SpecializationImpl#getCourseGroup <em>Course Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
	/**
	 * The default value of the '{@link #getSpecName() <em>Spec Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecName()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecName() <em>Spec Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecName()
	 * @generated
	 * @ordered
	 */
	protected String specName = SPEC_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specialization;

	/**
	 * The cached value of the '{@link #getCourseGroup() <em>Course Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroup()
	 * @generated
	 * @ordered
	 */
	protected CourseGroup courseGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyplanPackage.Literals.SPECIALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecName() {
		return specName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecName(String newSpecName) {
		String oldSpecName = specName;
		specName = newSpecName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SPECIALIZATION__SPEC_NAME, oldSpecName, specName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semester>(Semester.class, this, StudyplanPackage.SPECIALIZATION__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getSpecialization() {
		if (specialization == null) {
			specialization = new EObjectContainmentEList<Specialization>(Specialization.class, this, StudyplanPackage.SPECIALIZATION__SPECIALIZATION);
		}
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseGroup getCourseGroup() {
		if (courseGroup != null && courseGroup.eIsProxy()) {
			InternalEObject oldCourseGroup = (InternalEObject)courseGroup;
			courseGroup = (CourseGroup)eResolveProxy(oldCourseGroup);
			if (courseGroup != oldCourseGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StudyplanPackage.SPECIALIZATION__COURSE_GROUP, oldCourseGroup, courseGroup));
			}
		}
		return courseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CourseGroup basicGetCourseGroup() {
		return courseGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseGroup(CourseGroup newCourseGroup) {
		CourseGroup oldCourseGroup = courseGroup;
		courseGroup = newCourseGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.SPECIALIZATION__COURSE_GROUP, oldCourseGroup, courseGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.SPECIALIZATION__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case StudyplanPackage.SPECIALIZATION__SPECIALIZATION:
				return ((InternalEList<?>)getSpecialization()).basicRemove(otherEnd, msgs);
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
			case StudyplanPackage.SPECIALIZATION__SPEC_NAME:
				return getSpecName();
			case StudyplanPackage.SPECIALIZATION__SEMESTERS:
				return getSemesters();
			case StudyplanPackage.SPECIALIZATION__SPECIALIZATION:
				return getSpecialization();
			case StudyplanPackage.SPECIALIZATION__COURSE_GROUP:
				if (resolve) return getCourseGroup();
				return basicGetCourseGroup();
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
			case StudyplanPackage.SPECIALIZATION__SPEC_NAME:
				setSpecName((String)newValue);
				return;
			case StudyplanPackage.SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case StudyplanPackage.SPECIALIZATION__SPECIALIZATION:
				getSpecialization().clear();
				getSpecialization().addAll((Collection<? extends Specialization>)newValue);
				return;
			case StudyplanPackage.SPECIALIZATION__COURSE_GROUP:
				setCourseGroup((CourseGroup)newValue);
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
			case StudyplanPackage.SPECIALIZATION__SPEC_NAME:
				setSpecName(SPEC_NAME_EDEFAULT);
				return;
			case StudyplanPackage.SPECIALIZATION__SEMESTERS:
				getSemesters().clear();
				return;
			case StudyplanPackage.SPECIALIZATION__SPECIALIZATION:
				getSpecialization().clear();
				return;
			case StudyplanPackage.SPECIALIZATION__COURSE_GROUP:
				setCourseGroup((CourseGroup)null);
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
			case StudyplanPackage.SPECIALIZATION__SPEC_NAME:
				return SPEC_NAME_EDEFAULT == null ? specName != null : !SPEC_NAME_EDEFAULT.equals(specName);
			case StudyplanPackage.SPECIALIZATION__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case StudyplanPackage.SPECIALIZATION__SPECIALIZATION:
				return specialization != null && !specialization.isEmpty();
			case StudyplanPackage.SPECIALIZATION__COURSE_GROUP:
				return courseGroup != null;
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
		result.append(" (specName: ");
		result.append(specName);
		result.append(')');
		return result.toString();
	}

} //SpecializationImpl
