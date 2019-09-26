/**
 */
package studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplan.CourseGroup#getGroup <em>Group</em>}</li>
 *   <li>{@link studyplan.CourseGroup#getCourseStatus <em>Course Status</em>}</li>
 *   <li>{@link studyplan.CourseGroup#getSemester <em>Semester</em>}</li>
 *   <li>{@link studyplan.CourseGroup#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getCourseGroup()
 * @model
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see studyplan.StudyplanPackage#getCourseGroup_Group()
	 * @model
	 * @generated
	 */
	EList<String> getGroup();

	/**
	 * Returns the value of the '<em><b>Course Status</b></em>' attribute.
	 * The literals are from the enumeration {@link studyplan.CourseStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Status</em>' attribute.
	 * @see studyplan.CourseStatus
	 * @see #setCourseStatus(CourseStatus)
	 * @see studyplan.StudyplanPackage#getCourseGroup_CourseStatus()
	 * @model
	 * @generated
	 */
	CourseStatus getCourseStatus();

	/**
	 * Sets the value of the '{@link studyplan.CourseGroup#getCourseStatus <em>Course Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Status</em>' attribute.
	 * @see studyplan.CourseStatus
	 * @see #getCourseStatus()
	 * @generated
	 */
	void setCourseStatus(CourseStatus value);

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' containment reference.
	 * @see #setSemester(Semester)
	 * @see studyplan.StudyplanPackage#getCourseGroup_Semester()
	 * @model containment="true"
	 * @generated
	 */
	Semester getSemester();

	/**
	 * Sets the value of the '{@link studyplan.CourseGroup#getSemester <em>Semester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' containment reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semester value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference.
	 * @see #setCourse(Course)
	 * @see studyplan.StudyplanPackage#getCourseGroup_Course()
	 * @model containment="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link studyplan.CourseGroup#getCourse <em>Course</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' containment reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

} // CourseGroup
