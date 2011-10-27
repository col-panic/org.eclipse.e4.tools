/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.e4.cSS.impl;

import org.eclipse.e4.cSS.CSSPackage;
import org.eclipse.e4.cSS.css_import;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>css import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.e4.cSS.impl.css_importImpl#getString_name <em>String name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class css_importImpl extends MinimalEObjectImpl.Container implements css_import
{
  /**
   * The default value of the '{@link #getString_name() <em>String name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString_name()
   * @generated
   * @ordered
   */
  protected static final String STRING_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString_name() <em>String name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString_name()
   * @generated
   * @ordered
   */
  protected String string_name = STRING_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected css_importImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CSSPackage.Literals.CSS_IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString_name()
  {
    return string_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString_name(String newString_name)
  {
    String oldString_name = string_name;
    string_name = newString_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSPackage.CSS_IMPORT__STRING_NAME, oldString_name, string_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CSSPackage.CSS_IMPORT__STRING_NAME:
        return getString_name();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CSSPackage.CSS_IMPORT__STRING_NAME:
        setString_name((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CSSPackage.CSS_IMPORT__STRING_NAME:
        setString_name(STRING_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CSSPackage.CSS_IMPORT__STRING_NAME:
        return STRING_NAME_EDEFAULT == null ? string_name != null : !STRING_NAME_EDEFAULT.equals(string_name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (string_name: ");
    result.append(string_name);
    result.append(')');
    return result.toString();
  }

} //css_importImpl
