/**
 */
package studyplan.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import studyplan.FieldOfStudy;
import studyplan.StudyplanFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Field Of Study</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldOfStudyTest extends TestCase {

	/**
	 * The fixture for this Field Of Study test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldOfStudy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FieldOfStudyTest.class);
	}

	/**
	 * Constructs a new Field Of Study test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldOfStudyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Field Of Study test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FieldOfStudy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Field Of Study test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldOfStudy getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StudyplanFactory.eINSTANCE.createFieldOfStudy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FieldOfStudyTest
