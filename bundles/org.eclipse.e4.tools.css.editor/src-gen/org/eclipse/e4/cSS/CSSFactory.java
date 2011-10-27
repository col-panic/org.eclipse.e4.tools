/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.e4.cSS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.e4.cSS.CSSPackage
 * @generated
 */
public interface CSSFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CSSFactory eINSTANCE = org.eclipse.e4.cSS.impl.CSSFactoryImpl.init();

  /**
   * Returns a new object of class '<em>stylesheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>stylesheet</em>'.
   * @generated
   */
  stylesheet createstylesheet();

  /**
   * Returns a new object of class '<em>Rules</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rules</em>'.
   * @generated
   */
  Rules createRules();

  /**
   * Returns a new object of class '<em>css import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>css import</em>'.
   * @generated
   */
  css_import createcss_import();

  /**
   * Returns a new object of class '<em>selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>selector</em>'.
   * @generated
   */
  selector createselector();

  /**
   * Returns a new object of class '<em>simple selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>simple selector</em>'.
   * @generated
   */
  simple_selector createsimple_selector();

  /**
   * Returns a new object of class '<em>pseudo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>pseudo</em>'.
   * @generated
   */
  pseudo createpseudo();

  /**
   * Returns a new object of class '<em>element name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>element name</em>'.
   * @generated
   */
  element_name createelement_name();

  /**
   * Returns a new object of class '<em>declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>declaration</em>'.
   * @generated
   */
  declaration createdeclaration();

  /**
   * Returns a new object of class '<em>expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>expr</em>'.
   * @generated
   */
  expr createexpr();

  /**
   * Returns a new object of class '<em>term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>term</em>'.
   * @generated
   */
  term createterm();

  /**
   * Returns a new object of class '<em>function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>function</em>'.
   * @generated
   */
  function createfunction();

  /**
   * Returns a new object of class '<em>URI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>URI</em>'.
   * @generated
   */
  URI createURI();

  /**
   * Returns a new object of class '<em>css hash class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>css hash class</em>'.
   * @generated
   */
  css_hash_class createcss_hash_class();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CSSPackage getCSSPackage();

} //CSSFactory
