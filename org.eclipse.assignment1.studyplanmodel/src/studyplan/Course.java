/**
 */
package studyplan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplan.Course#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link studyplan.Course#getCourseId <em>Course Id</em>}</li>
 *   <li>{@link studyplan.Course#getCredit <em>Credit</em>}</li>
 *   <li>{@link studyplan.Course#getStatus <em>Status</em>}</li>
 *   <li>{@link studyplan.Course#getCourseGroup <em>Course Group</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxNameLength maxDigit isDouble'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Name</em>' attribute.
	 * @see #setCourseName(String)
	 * @see studyplan.StudyplanPackage#getCourse_CourseName()
	 * @model
	 * @generated
	 */
	String getCourseName();

	/**
	 * Sets the value of the '{@link studyplan.Course#getCourseName <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Name</em>' attribute.
	 * @see #getCourseName()
	 * @generated
	 */
	void setCourseName(String value);

	/**
	 * Returns the value of the '<em><b>Course Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Id</em>' attribute.
	 * @see studyplan.StudyplanPackage#getCourse_CourseId()
	 * @model changeable="false"
	 * @generated
	 */
	int getCourseId();

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit</em>' attribute.
	 * @see studyplan.StudyplanPackage#getCourse_Credit()
	 * @model changeable="false"
	 * @generated
	 */
	double getCredit();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see studyplan.StudyplanPackage#getCourse_Status()
	 * @model changeable="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Returns the value of the '<em><b>Course Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link studyplan.CourseGroup#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Group</em>' reference.
	 * @see #setCourseGroup(CourseGroup)
	 * @see studyplan.StudyplanPackage#getCourse_CourseGroup()
	 * @see studyplan.CourseGroup#getCourse
	 * @model opposite="course"
	 * @generated
	 */
	CourseGroup getCourseGroup();

	/**
	 * Sets the value of the '{@link studyplan.Course#getCourseGroup <em>Course Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Group</em>' reference.
	 * @see #getCourseGroup()
	 * @generated
	 */
	void setCourseGroup(CourseGroup value);

} // Course
