/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.e4.cSS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>css import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.cSS.css_import#getString_name <em>String name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.cSS.CSSPackage#getcss_import()
 * @model
 * @generated
 */
public interface css_import extends EObject
{
  /**
   * Returns the value of the '<em><b>String name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String name</em>' attribute.
   * @see #setString_name(String)
   * @see org.eclipse.e4.cSS.CSSPackage#getcss_import_String_name()
   * @model
   * @generated
   */
  String getString_name();

  /**
   * Sets the value of the '{@link org.eclipse.e4.cSS.css_import#getString_name <em>String name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String name</em>' attribute.
   * @see #getString_name()
   * @generated
   */
  void setString_name(String value);

} // css_import
