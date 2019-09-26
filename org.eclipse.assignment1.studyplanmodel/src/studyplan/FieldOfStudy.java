/**
 */
package studyplan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Of Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link studyplan.FieldOfStudy#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link studyplan.FieldOfStudy#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link studyplan.FieldOfStudy#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see studyplan.StudyplanPackage#getFieldOfStudy()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxFieldName'"
 * @generated
 */
public interface FieldOfStudy extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see studyplan.StudyplanPackage#getFieldOfStudy_FieldName()
	 * @model required="true"
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link studyplan.FieldOfStudy#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' containment reference.
	 * @see #setSpecialization(Specialization)
	 * @see studyplan.StudyplanPackage#getFieldOfStudy_Specialization()
	 * @model containment="true"
	 * @generated
	 */
	Specialization getSpecialization();

	/**
	 * Sets the value of the '{@link studyplan.FieldOfStudy#getSpecialization <em>Specialization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' containment reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Specialization value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link studyplan.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see studyplan.StudyplanPackage#getFieldOfStudy_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // FieldOfStudy
