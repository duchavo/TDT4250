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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import studyplan.Course;
import studyplan.CourseGroup;
import studyplan.CourseStatus;
import studyplan.Semester;
import studyplan.StudyplanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyplan.impl.CourseGroupImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link studyplan.impl.CourseGroupImpl#getCourseStatus <em>Course Status</em>}</li>
 *   <li>{@link studyplan.impl.CourseGroupImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link studyplan.impl.CourseGroupImpl#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseGroupImpl extends MinimalEObjectImpl.Container implements CourseGroup {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<String> group;

	/**
	 * The default value of the '{@link #getCourseStatus() <em>Course Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CourseStatus COURSE_STATUS_EDEFAULT = CourseStatus.MANDATORY;

	/**
	 * The cached value of the '{@link #getCourseStatus() <em>Course Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseStatus()
	 * @generated
	 * @ordered
	 */
	protected CourseStatus courseStatus = COURSE_STATUS_EDEFAULT;

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
	 * The cached value of the '{@link #getCourse() <em>Course</em>}' containment reference.
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
	protected CourseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyplanPackage.Literals.COURSE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getGroup() {
		if (group == null) {
			group = new EDataTypeUniqueEList<String>(String.class, this, StudyplanPackage.COURSE_GROUP__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseStatus getCourseStatus() {
		return courseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourseStatus(CourseStatus newCourseStatus) {
		CourseStatus oldCourseStatus = courseStatus;
		courseStatus = newCourseStatus == null ? COURSE_STATUS_EDEFAULT : newCourseStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE_GROUP__COURSE_STATUS, oldCourseStatus, courseStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE_GROUP__SEMESTER, oldSemester, newSemester);
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
				msgs = ((InternalEObject)semester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.COURSE_GROUP__SEMESTER, null, msgs);
			if (newSemester != null)
				msgs = ((InternalEObject)newSemester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.COURSE_GROUP__SEMESTER, null, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE_GROUP__SEMESTER, newSemester, newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCourse() {
		return course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourse(Course newCourse, NotificationChain msgs) {
		Course oldCourse = course;
		course = newCourse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE_GROUP__COURSE, oldCourse, newCourse);
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
	public void setCourse(Course newCourse) {
		if (newCourse != course) {
			NotificationChain msgs = null;
			if (course != null)
				msgs = ((InternalEObject)course).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.COURSE_GROUP__COURSE, null, msgs);
			if (newCourse != null)
				msgs = ((InternalEObject)newCourse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.COURSE_GROUP__COURSE, null, msgs);
			msgs = basicSetCourse(newCourse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.COURSE_GROUP__COURSE, newCourse, newCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.COURSE_GROUP__SEMESTER:
				return basicSetSemester(null, msgs);
			case StudyplanPackage.COURSE_GROUP__COURSE:
				return basicSetCourse(null, msgs);
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
			case StudyplanPackage.COURSE_GROUP__GROUP:
				return getGroup();
			case StudyplanPackage.COURSE_GROUP__COURSE_STATUS:
				return getCourseStatus();
			case StudyplanPackage.COURSE_GROUP__SEMESTER:
				return getSemester();
			case StudyplanPackage.COURSE_GROUP__COURSE:
				return getCourse();
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
			case StudyplanPackage.COURSE_GROUP__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends String>)newValue);
				return;
			case StudyplanPackage.COURSE_GROUP__COURSE_STATUS:
				setCourseStatus((CourseStatus)newValue);
				return;
			case StudyplanPackage.COURSE_GROUP__SEMESTER:
				setSemester((Semester)newValue);
				return;
			case StudyplanPackage.COURSE_GROUP__COURSE:
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
			case StudyplanPackage.COURSE_GROUP__GROUP:
				getGroup().clear();
				return;
			case StudyplanPackage.COURSE_GROUP__COURSE_STATUS:
				setCourseStatus(COURSE_STATUS_EDEFAULT);
				return;
			case StudyplanPackage.COURSE_GROUP__SEMESTER:
				setSemester((Semester)null);
				return;
			case StudyplanPackage.COURSE_GROUP__COURSE:
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
			case StudyplanPackage.COURSE_GROUP__GROUP:
				return group != null && !group.isEmpty();
			case StudyplanPackage.COURSE_GROUP__COURSE_STATUS:
				return courseStatus != COURSE_STATUS_EDEFAULT;
			case StudyplanPackage.COURSE_GROUP__SEMESTER:
				return semester != null;
			case StudyplanPackage.COURSE_GROUP__COURSE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", courseStatus: ");
		result.append(courseStatus);
		result.append(')');
		return result.toString();
	}

} //CourseGroupImpl
