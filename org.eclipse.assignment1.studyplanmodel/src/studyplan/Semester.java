/**
 */
package studyplan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplan.Semester#getSpring <em>Spring</em>}</li>
 *   <li>{@link studyplan.Semester#getFall <em>Fall</em>}</li>
 *   <li>{@link studyplan.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link studyplan.Semester#getCourseGroup <em>Course Group</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Spring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spring</em>' attribute.
	 * @see #setSpring(String)
	 * @see studyplan.StudyplanPackage#getSemester_Spring()
	 * @model
	 * @generated
	 */
	String getSpring();

	/**
	 * Sets the value of the '{@link studyplan.Semester#getSpring <em>Spring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spring</em>' attribute.
	 * @see #getSpring()
	 * @generated
	 */
	void setSpring(String value);

	/**
	 * Returns the value of the '<em><b>Fall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fall</em>' attribute.
	 * @see #setFall(String)
	 * @see studyplan.StudyplanPackage#getSemester_Fall()
	 * @model
	 * @generated
	 */
	String getFall();

	/**
	 * Sets the value of the '{@link studyplan.Semester#getFall <em>Fall</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fall</em>' attribute.
	 * @see #getFall()
	 * @generated
	 */
	void setFall(String value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see studyplan.StudyplanPackage#getSemester_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link studyplan.Semester#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Course Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Group</em>' containment reference.
	 * @see #setCourseGroup(CourseGroup)
	 * @see studyplan.StudyplanPackage#getSemester_CourseGroup()
	 * @model containment="true"
	 * @generated
	 */
	CourseGroup getCourseGroup();

	/**
	 * Sets the value of the '{@link studyplan.Semester#getCourseGroup <em>Course Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Group</em>' containment reference.
	 * @see #getCourseGroup()
	 * @generated
	 */
	void setCourseGroup(CourseGroup value);

} // Semester
