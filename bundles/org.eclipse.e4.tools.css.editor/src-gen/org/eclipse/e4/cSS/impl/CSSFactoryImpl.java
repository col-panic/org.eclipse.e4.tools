/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.e4.cSS.impl;

import org.eclipse.e4.cSS.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSSFactoryImpl extends EFactoryImpl implements CSSFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CSSFactory init()
  {
    try
    {
      CSSFactory theCSSFactory = (CSSFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/e4/CSS"); 
      if (theCSSFactory != null)
      {
        return theCSSFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CSSFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CSSPackage.STYLESHEET: return createstylesheet();
      case CSSPackage.RULES: return createRules();
      case CSSPackage.CSS_IMPORT: return createcss_import();
      case CSSPackage.SELECTOR: return createselector();
      case CSSPackage.SIMPLE_SELECTOR: return createsimple_selector();
      case CSSPackage.PSEUDO: return createpseudo();
      case CSSPackage.ELEMENT_NAME: return createelement_name();
      case CSSPackage.DECLARATION: return createdeclaration();
      case CSSPackage.EXPR: return createexpr();
      case CSSPackage.TERM: return createterm();
      case CSSPackage.FUNCTION: return createfunction();
      case CSSPackage.URI: return createURI();
      case CSSPackage.CSS_HASH_CLASS: return createcss_hash_class();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public stylesheet createstylesheet()
  {
    stylesheetImpl stylesheet = new stylesheetImpl();
    return stylesheet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rules createRules()
  {
    RulesImpl rules = new RulesImpl();
    return rules;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public css_import createcss_import()
  {
    css_importImpl css_import = new css_importImpl();
    return css_import;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selector createselector()
  {
    selectorImpl selector = new selectorImpl();
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_selector createsimple_selector()
  {
    simple_selectorImpl simple_selector = new simple_selectorImpl();
    return simple_selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pseudo createpseudo()
  {
    pseudoImpl pseudo = new pseudoImpl();
    return pseudo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element_name createelement_name()
  {
    element_nameImpl element_name = new element_nameImpl();
    return element_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration createdeclaration()
  {
    declarationImpl declaration = new declarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr createexpr()
  {
    exprImpl expr = new exprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public term createterm()
  {
    termImpl term = new termImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function createfunction()
  {
    functionImpl function = new functionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public URI createURI()
  {
    URIImpl uri = new URIImpl();
    return uri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public css_hash_class createcss_hash_class()
  {
    css_hash_classImpl css_hash_class = new css_hash_classImpl();
    return css_hash_class;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSPackage getCSSPackage()
  {
    return (CSSPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CSSPackage getPackage()
  {
    return CSSPackage.eINSTANCE;
  }

} //CSSFactoryImpl
