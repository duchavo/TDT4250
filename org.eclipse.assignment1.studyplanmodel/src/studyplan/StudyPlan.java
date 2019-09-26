/**
 */
package studyplan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplan.StudyPlan#getProgram <em>Program</em>}</li>
 *   <li>{@link studyplan.StudyPlan#getCourses <em>Courses</em>}</li>
 *   <li>{@link studyplan.StudyPlan#getSemester <em>Semester</em>}</li>
 *   <li>{@link studyplan.StudyPlan#getPlanName <em>Plan Name</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Program</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' containment reference.
	 * @see #setProgram(FieldOfStudy)
	 * @see studyplan.StudyplanPackage#getStudyPlan_Program()
	 * @model containment="true"
	 * @generated
	 */
	FieldOfStudy getProgram();

	/**
	 * Sets the value of the '{@link studyplan.StudyPlan#getProgram <em>Program</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' containment reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(FieldOfStudy value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference.
	 * @see #setCourses(Course)
	 * @see studyplan.StudyplanPackage#getStudyPlan_Courses()
	 * @model containment="true"
	 * @generated
	 */
	Course getCourses();

	/**
	 * Sets the value of the '{@link studyplan.StudyPlan#getCourses <em>Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Courses</em>' containment reference.
	 * @see #getCourses()
	 * @generated
	 */
	void setCourses(Course value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' containment reference.
	 * @see #setSemester(Semester)
	 * @see studyplan.StudyplanPackage#getStudyPlan_Semester()
	 * @model containment="true"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link studyplan.StudyPlan#getSemester <em>Semester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' containment reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Plan Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Name</em>' attribute.
	 * @see #setPlanName(String)
	 * @see studyplan.StudyplanPackage#getStudyPlan_PlanName()
	 * @model
	 * @generated
	 */
	String getPlanName();

	/**
	 * Sets the value of the '{@link studyplan.StudyPlan#getPlanName <em>Plan Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Name</em>' attribute.
	 * @see #getPlanName()
	 * @generated
	 */
	void setPlanName(String value);

} // StudyPlan
