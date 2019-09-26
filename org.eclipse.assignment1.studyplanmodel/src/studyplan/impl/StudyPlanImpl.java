/**
 */
package studyplan.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import studyplan.Course;
import studyplan.FieldOfStudy;
import studyplan.Semester;
import studyplan.StudyPlan;
import studyplan.StudyplanPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link studyplan.impl.StudyPlanImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link studyplan.impl.StudyPlanImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyplan.impl.StudyPlanImpl#getSemester <em>Semester</em>}</li>
 *   <li>{@link studyplan.impl.StudyPlanImpl#getPlanName <em>Plan Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanImpl extends MinimalEObjectImpl.Container implements StudyPlan {
	/**
	 * The cached value of the '{@link #getProgram() <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgram()
	 * @generated
	 * @ordered
	 */
	protected FieldOfStudy program;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected Course courses;

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
	 * The default value of the '{@link #getPlanName() <em>Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanName()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanName() <em>Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanName()
	 * @generated
	 * @ordered
	 */
	protected String planName = PLAN_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StudyplanPackage.Literals.STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FieldOfStudy getProgram() {
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(FieldOfStudy newProgram, NotificationChain msgs) {
		FieldOfStudy oldProgram = program;
		program = newProgram;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyplanPackage.STUDY_PLAN__PROGRAM, oldProgram, newProgram);
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
	public void setProgram(FieldOfStudy newProgram) {
		if (newProgram != program) {
			NotificationChain msgs = null;
			if (program != null)
				msgs = ((InternalEObject)program).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.STUDY_PLAN__PROGRAM, null, msgs);
			if (newProgram != null)
				msgs = ((InternalEObject)newProgram).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.STUDY_PLAN__PROGRAM, null, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.STUDY_PLAN__PROGRAM, newProgram, newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCourses() {
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourses(Course newCourses, NotificationChain msgs) {
		Course oldCourses = courses;
		courses = newCourses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyplanPackage.STUDY_PLAN__COURSES, oldCourses, newCourses);
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
	public void setCourses(Course newCourses) {
		if (newCourses != courses) {
			NotificationChain msgs = null;
			if (courses != null)
				msgs = ((InternalEObject)courses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.STUDY_PLAN__COURSES, null, msgs);
			if (newCourses != null)
				msgs = ((InternalEObject)newCourses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.STUDY_PLAN__COURSES, null, msgs);
			msgs = basicSetCourses(newCourses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.STUDY_PLAN__COURSES, newCourses, newCourses));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StudyplanPackage.STUDY_PLAN__SEMESTER, oldSemester, newSemester);
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
				msgs = ((InternalEObject)semester).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.STUDY_PLAN__SEMESTER, null, msgs);
			if (newSemester != null)
				msgs = ((InternalEObject)newSemester).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StudyplanPackage.STUDY_PLAN__SEMESTER, null, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.STUDY_PLAN__SEMESTER, newSemester, newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlanName() {
		return planName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanName(String newPlanName) {
		String oldPlanName = planName;
		planName = newPlanName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StudyplanPackage.STUDY_PLAN__PLAN_NAME, oldPlanName, planName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StudyplanPackage.STUDY_PLAN__PROGRAM:
				return basicSetProgram(null, msgs);
			case StudyplanPackage.STUDY_PLAN__COURSES:
				return basicSetCourses(null, msgs);
			case StudyplanPackage.STUDY_PLAN__SEMESTER:
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
			case StudyplanPackage.STUDY_PLAN__PROGRAM:
				return getProgram();
			case StudyplanPackage.STUDY_PLAN__COURSES:
				return getCourses();
			case StudyplanPackage.STUDY_PLAN__SEMESTER:
				return getSemester();
			case StudyplanPackage.STUDY_PLAN__PLAN_NAME:
				return getPlanName();
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
			case StudyplanPackage.STUDY_PLAN__PROGRAM:
				setProgram((FieldOfStudy)newValue);
				return;
			case StudyplanPackage.STUDY_PLAN__COURSES:
				setCourses((Course)newValue);
				return;
			case StudyplanPackage.STUDY_PLAN__SEMESTER:
				setSemester((Semester)newValue);
				return;
			case StudyplanPackage.STUDY_PLAN__PLAN_NAME:
				setPlanName((String)newValue);
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
			case StudyplanPackage.STUDY_PLAN__PROGRAM:
				setProgram((FieldOfStudy)null);
				return;
			case StudyplanPackage.STUDY_PLAN__COURSES:
				setCourses((Course)null);
				return;
			case StudyplanPackage.STUDY_PLAN__SEMESTER:
				setSemester((Semester)null);
				return;
			case StudyplanPackage.STUDY_PLAN__PLAN_NAME:
				setPlanName(PLAN_NAME_EDEFAULT);
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
			case StudyplanPackage.STUDY_PLAN__PROGRAM:
				return program != null;
			case StudyplanPackage.STUDY_PLAN__COURSES:
				return courses != null;
			case StudyplanPackage.STUDY_PLAN__SEMESTER:
				return semester != null;
			case StudyplanPackage.STUDY_PLAN__PLAN_NAME:
				return PLAN_NAME_EDEFAULT == null ? planName != null : !PLAN_NAME_EDEFAULT.equals(planName);
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
		result.append(" (planName: ");
		result.append(planName);
		result.append(')');
		return result.toString();
	}

} //StudyPlanImpl
