/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.e4.cSS.util;

import org.eclipse.e4.cSS.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.e4.cSS.CSSPackage
 * @generated
 */
public class CSSSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CSSPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = CSSPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case CSSPackage.STYLESHEET:
      {
        stylesheet stylesheet = (stylesheet)theEObject;
        T result = casestylesheet(stylesheet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSSPackage.RULES:
      {
        Rules rules = (Rules)theEObject;
        T result = caseRules(rules);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSSPackage.CSS_IMPORT:
      {
        css_import css_import = (css_import)theEObject;
        T result = casecss_import(css_import);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSSPackage.SELECTOR:
      {
        selector selector = (selector)theEObject;
        T result = caseselector(selector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSSPackage.SIMPLE_SELECTOR:
      {
        simple_selector simple_selector = (simple_selector)theEObject;
        T result = casesimple_selector(simple_selector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSSPackage.PSEUDO:
      {
        pseudo pseudo = (pseudo)theEObject;
        T result = casepseudo(pseudo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSSPackage.ELEMENT_NAME:
      {
        element_name element_name = (element_name)theEObject;
        T result = caseelement_name(element_name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSSPackage.DECLARATION:
      {
        declaration declaration = (declaration)theEObject;
        T result = casedeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSSPackage.EXPR:
      {
        expr expr = (expr)theEObject;
        T result = caseexpr(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSSPackage.TERM:
      {
        term term = (term)theEObject;
        T result = caseterm(term);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSSPackage.FUNCTION:
      {
        function function = (function)theEObject;
        T result = casefunction(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSSPackage.URI:
      {
        URI uri = (URI)theEObject;
        T result = caseURI(uri);
        if (result == null) result = casecss_import(uri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case CSSPackage.CSS_HASH_CLASS:
      {
        css_hash_class css_hash_class = (css_hash_class)theEObject;
        T result = casecss_hash_class(css_hash_class);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>stylesheet</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>stylesheet</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestylesheet(stylesheet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rules</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rules</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRules(Rules object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>css import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>css import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecss_import(css_import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseselector(selector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>simple selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>simple selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesimple_selector(simple_selector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>pseudo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>pseudo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepseudo(pseudo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>element name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>element name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelement_name(element_name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedeclaration(declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpr(expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseterm(term object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunction(function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>URI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>URI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseURI(URI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>css hash class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>css hash class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecss_hash_class(css_hash_class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //CSSSwitch
