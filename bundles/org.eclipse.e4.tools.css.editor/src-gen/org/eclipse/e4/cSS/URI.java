/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.e4.cSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.e4.cSS.URI#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.e4.cSS.URI#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.e4.cSS.CSSPackage#getURI()
 * @model
 * @generated
 */
public interface URI extends css_import
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see org.eclipse.e4.cSS.CSSPackage#getURI_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute list.
   * @see org.eclipse.e4.cSS.CSSPackage#getURI_Id()
   * @model unique="false"
   * @generated
   */
  EList<String> getId();

} // URI
