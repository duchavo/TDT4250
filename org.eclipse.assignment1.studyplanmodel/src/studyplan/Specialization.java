/**
 */
package studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplan.Specialization#getSpecName <em>Spec Name</em>}</li>
 *   <li>{@link studyplan.Specialization#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link studyplan.Specialization#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link studyplan.Specialization#getCourseGroup <em>Course Group</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getSpecialization()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxSpecLength'"
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Spec Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Name</em>' attribute.
	 * @see #setSpecName(String)
	 * @see studyplan.StudyplanPackage#getSpecialization_SpecName()
	 * @model required="true"
	 * @generated
	 */
	String getSpecName();

	/**
	 * Sets the value of the '{@link studyplan.Specialization#getSpecName <em>Spec Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Name</em>' attribute.
	 * @see #getSpecName()
	 * @generated
	 */
	void setSpecName(String value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getSpecialization_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getSpecialization_Specialization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecialization();

	/**
	 * Returns the value of the '<em><b>Course Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Group</em>' reference.
	 * @see #setCourseGroup(CourseGroup)
	 * @see studyplan.StudyplanPackage#getSpecialization_CourseGroup()
	 * @model required="true"
	 * @generated
	 */
	CourseGroup getCourseGroup();

	/**
	 * Sets the value of the '{@link studyplan.Specialization#getCourseGroup <em>Course Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Group</em>' reference.
	 * @see #getCourseGroup()
	 * @generated
	 */
	void setCourseGroup(CourseGroup value);

} // Specialization
