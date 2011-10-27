/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.e4.cSS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>stylesheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.cSS.stylesheet#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.e4.cSS.stylesheet#getImportName <em>Import Name</em>}</li>
 *   <li>{@link org.eclipse.e4.cSS.stylesheet#getRuleset <em>Ruleset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.cSS.CSSPackage#getstylesheet()
 * @model
 * @generated
 */
public interface stylesheet extends EObject
{
  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see org.eclipse.e4.cSS.CSSPackage#getstylesheet_Location()
   * @model
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link org.eclipse.e4.cSS.stylesheet#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Import Name</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.e4.cSS.css_import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Name</em>' containment reference list.
   * @see org.eclipse.e4.cSS.CSSPackage#getstylesheet_ImportName()
   * @model containment="true"
   * @generated
   */
  EList<css_import> getImportName();

  /**
   * Returns the value of the '<em><b>Ruleset</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.e4.cSS.Rules}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ruleset</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ruleset</em>' containment reference list.
   * @see org.eclipse.e4.cSS.CSSPackage#getstylesheet_Ruleset()
   * @model containment="true"
   * @generated
   */
  EList<Rules> getRuleset();

} // stylesheet
