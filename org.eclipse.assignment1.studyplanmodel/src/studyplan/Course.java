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
 *   <li>{@link studyplan.Course#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link studyplan.Course#getCredit <em>Credit</em>}</li>
 *   <li>{@link studyplan.Course#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxNameLength correctStatus isValidCredit isValidCode'"
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
	 * Returns the value of the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Code</em>' attribute.
	 * @see #setCourseCode(int)
	 * @see studyplan.StudyplanPackage#getCourse_CourseCode()
	 * @model
	 * @generated
	 */
	int getCourseCode();

	/**
	 * Sets the value of the '{@link studyplan.Course#getCourseCode <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Code</em>' attribute.
	 * @see #getCourseCode()
	 * @generated
	 */
	void setCourseCode(int value);

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

} // Course
