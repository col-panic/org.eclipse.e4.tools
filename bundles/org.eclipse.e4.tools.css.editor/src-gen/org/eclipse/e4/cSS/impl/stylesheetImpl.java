/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.e4.cSS.impl;

import java.util.Collection;

import org.eclipse.e4.cSS.CSSPackage;
import org.eclipse.e4.cSS.Rules;
import org.eclipse.e4.cSS.css_import;
import org.eclipse.e4.cSS.stylesheet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>stylesheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.e4.cSS.impl.stylesheetImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.e4.cSS.impl.stylesheetImpl#getImportName <em>Import Name</em>}</li>
 *   <li>{@link org.eclipse.e4.cSS.impl.stylesheetImpl#getRuleset <em>Ruleset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class stylesheetImpl extends MinimalEObjectImpl.Container implements stylesheet
{
  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getImportName() <em>Import Name</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportName()
   * @generated
   * @ordered
   */
  protected EList<css_import> importName;

  /**
   * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleset()
   * @generated
   * @ordered
   */
  protected EList<Rules> ruleset;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected stylesheetImpl()
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
    return CSSPackage.Literals.STYLESHEET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSPackage.STYLESHEET__LOCATION, oldLocation, location));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<css_import> getImportName()
  {
    if (importName == null)
    {
      importName = new EObjectContainmentEList<css_import>(css_import.class, this, CSSPackage.STYLESHEET__IMPORT_NAME);
    }
    return importName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Rules> getRuleset()
  {
    if (ruleset == null)
    {
      ruleset = new EObjectContainmentEList<Rules>(Rules.class, this, CSSPackage.STYLESHEET__RULESET);
    }
    return ruleset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CSSPackage.STYLESHEET__IMPORT_NAME:
        return ((InternalEList<?>)getImportName()).basicRemove(otherEnd, msgs);
      case CSSPackage.STYLESHEET__RULESET:
        return ((InternalEList<?>)getRuleset()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case CSSPackage.STYLESHEET__LOCATION:
        return getLocation();
      case CSSPackage.STYLESHEET__IMPORT_NAME:
        return getImportName();
      case CSSPackage.STYLESHEET__RULESET:
        return getRuleset();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CSSPackage.STYLESHEET__LOCATION:
        setLocation((String)newValue);
        return;
      case CSSPackage.STYLESHEET__IMPORT_NAME:
        getImportName().clear();
        getImportName().addAll((Collection<? extends css_import>)newValue);
        return;
      case CSSPackage.STYLESHEET__RULESET:
        getRuleset().clear();
        getRuleset().addAll((Collection<? extends Rules>)newValue);
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
      case CSSPackage.STYLESHEET__LOCATION:
        setLocation(LOCATION_EDEFAULT);
        return;
      case CSSPackage.STYLESHEET__IMPORT_NAME:
        getImportName().clear();
        return;
      case CSSPackage.STYLESHEET__RULESET:
        getRuleset().clear();
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
      case CSSPackage.STYLESHEET__LOCATION:
        return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
      case CSSPackage.STYLESHEET__IMPORT_NAME:
        return importName != null && !importName.isEmpty();
      case CSSPackage.STYLESHEET__RULESET:
        return ruleset != null && !ruleset.isEmpty();
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
    result.append(" (location: ");
    result.append(location);
    result.append(')');
    return result.toString();
  }

} //stylesheetImpl
