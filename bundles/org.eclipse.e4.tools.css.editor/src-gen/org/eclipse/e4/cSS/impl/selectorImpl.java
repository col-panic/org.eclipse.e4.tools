/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.e4.cSS.impl;

import org.eclipse.e4.cSS.CSSPackage;
import org.eclipse.e4.cSS.selector;
import org.eclipse.e4.cSS.simple_selector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.e4.cSS.impl.selectorImpl#getSimpleselectors <em>Simpleselectors</em>}</li>
 *   <li>{@link org.eclipse.e4.cSS.impl.selectorImpl#getCombinator <em>Combinator</em>}</li>
 *   <li>{@link org.eclipse.e4.cSS.impl.selectorImpl#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class selectorImpl extends MinimalEObjectImpl.Container implements selector
{
  /**
   * The cached value of the '{@link #getSimpleselectors() <em>Simpleselectors</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleselectors()
   * @generated
   * @ordered
   */
  protected simple_selector simpleselectors;

  /**
   * The default value of the '{@link #getCombinator() <em>Combinator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCombinator()
   * @generated
   * @ordered
   */
  protected static final String COMBINATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCombinator() <em>Combinator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCombinator()
   * @generated
   * @ordered
   */
  protected String combinator = COMBINATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getSelector() <em>Selector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelector()
   * @generated
   * @ordered
   */
  protected selector selector;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected selectorImpl()
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
    return CSSPackage.Literals.SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simple_selector getSimpleselectors()
  {
    return simpleselectors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSimpleselectors(simple_selector newSimpleselectors, NotificationChain msgs)
  {
    simple_selector oldSimpleselectors = simpleselectors;
    simpleselectors = newSimpleselectors;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSSPackage.SELECTOR__SIMPLESELECTORS, oldSimpleselectors, newSimpleselectors);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleselectors(simple_selector newSimpleselectors)
  {
    if (newSimpleselectors != simpleselectors)
    {
      NotificationChain msgs = null;
      if (simpleselectors != null)
        msgs = ((InternalEObject)simpleselectors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSSPackage.SELECTOR__SIMPLESELECTORS, null, msgs);
      if (newSimpleselectors != null)
        msgs = ((InternalEObject)newSimpleselectors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSSPackage.SELECTOR__SIMPLESELECTORS, null, msgs);
      msgs = basicSetSimpleselectors(newSimpleselectors, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSPackage.SELECTOR__SIMPLESELECTORS, newSimpleselectors, newSimpleselectors));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCombinator()
  {
    return combinator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCombinator(String newCombinator)
  {
    String oldCombinator = combinator;
    combinator = newCombinator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSPackage.SELECTOR__COMBINATOR, oldCombinator, combinator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selector getSelector()
  {
    return selector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelector(selector newSelector, NotificationChain msgs)
  {
    selector oldSelector = selector;
    selector = newSelector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSSPackage.SELECTOR__SELECTOR, oldSelector, newSelector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSelector(selector newSelector)
  {
    if (newSelector != selector)
    {
      NotificationChain msgs = null;
      if (selector != null)
        msgs = ((InternalEObject)selector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSSPackage.SELECTOR__SELECTOR, null, msgs);
      if (newSelector != null)
        msgs = ((InternalEObject)newSelector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSSPackage.SELECTOR__SELECTOR, null, msgs);
      msgs = basicSetSelector(newSelector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSPackage.SELECTOR__SELECTOR, newSelector, newSelector));
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
      case CSSPackage.SELECTOR__SIMPLESELECTORS:
        return basicSetSimpleselectors(null, msgs);
      case CSSPackage.SELECTOR__SELECTOR:
        return basicSetSelector(null, msgs);
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
      case CSSPackage.SELECTOR__SIMPLESELECTORS:
        return getSimpleselectors();
      case CSSPackage.SELECTOR__COMBINATOR:
        return getCombinator();
      case CSSPackage.SELECTOR__SELECTOR:
        return getSelector();
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
      case CSSPackage.SELECTOR__SIMPLESELECTORS:
        setSimpleselectors((simple_selector)newValue);
        return;
      case CSSPackage.SELECTOR__COMBINATOR:
        setCombinator((String)newValue);
        return;
      case CSSPackage.SELECTOR__SELECTOR:
        setSelector((selector)newValue);
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
      case CSSPackage.SELECTOR__SIMPLESELECTORS:
        setSimpleselectors((simple_selector)null);
        return;
      case CSSPackage.SELECTOR__COMBINATOR:
        setCombinator(COMBINATOR_EDEFAULT);
        return;
      case CSSPackage.SELECTOR__SELECTOR:
        setSelector((selector)null);
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
      case CSSPackage.SELECTOR__SIMPLESELECTORS:
        return simpleselectors != null;
      case CSSPackage.SELECTOR__COMBINATOR:
        return COMBINATOR_EDEFAULT == null ? combinator != null : !COMBINATOR_EDEFAULT.equals(combinator);
      case CSSPackage.SELECTOR__SELECTOR:
        return selector != null;
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
    result.append(" (combinator: ");
    result.append(combinator);
    result.append(')');
    return result.toString();
  }

} //selectorImpl
