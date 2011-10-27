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
 * A representation of the model object '<em><b>expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.cSS.expr#getTerm <em>Term</em>}</li>
 *   <li>{@link org.eclipse.e4.cSS.expr#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.cSS.CSSPackage#getexpr()
 * @model
 * @generated
 */
public interface expr extends EObject
{
  /**
   * Returns the value of the '<em><b>Term</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.e4.cSS.term}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Term</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Term</em>' containment reference list.
   * @see org.eclipse.e4.cSS.CSSPackage#getexpr_Term()
   * @model containment="true"
   * @generated
   */
  EList<term> getTerm();

  /**
   * Returns the value of the '<em><b>Operators</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operators</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operators</em>' attribute list.
   * @see org.eclipse.e4.cSS.CSSPackage#getexpr_Operators()
   * @model unique="false"
   * @generated
   */
  EList<String> getOperators();

} // expr
