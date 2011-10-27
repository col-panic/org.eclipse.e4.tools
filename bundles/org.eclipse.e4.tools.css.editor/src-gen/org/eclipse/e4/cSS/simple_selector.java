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
 * A representation of the model object '<em><b>simple selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.cSS.simple_selector#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.e4.cSS.simple_selector#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.e4.cSS.simple_selector#getPseudo <em>Pseudo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.cSS.CSSPackage#getsimple_selector()
 * @model
 * @generated
 */
public interface simple_selector extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(element_name)
   * @see org.eclipse.e4.cSS.CSSPackage#getsimple_selector_Element()
   * @model containment="true"
   * @generated
   */
  element_name getElement();

  /**
   * Sets the value of the '{@link org.eclipse.e4.cSS.simple_selector#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(element_name value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.e4.cSS.css_hash_class}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference list.
   * @see org.eclipse.e4.cSS.CSSPackage#getsimple_selector_Id()
   * @model containment="true"
   * @generated
   */
  EList<css_hash_class> getId();

  /**
   * Returns the value of the '<em><b>Pseudo</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.e4.cSS.pseudo}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pseudo</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pseudo</em>' containment reference list.
   * @see org.eclipse.e4.cSS.CSSPackage#getsimple_selector_Pseudo()
   * @model containment="true"
   * @generated
   */
  EList<pseudo> getPseudo();

} // simple_selector
