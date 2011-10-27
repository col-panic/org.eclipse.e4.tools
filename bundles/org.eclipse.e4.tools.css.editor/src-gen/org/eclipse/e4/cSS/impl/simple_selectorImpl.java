/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.e4.cSS.impl;

import java.util.Collection;

import org.eclipse.e4.cSS.CSSPackage;
import org.eclipse.e4.cSS.css_hash_class;
import org.eclipse.e4.cSS.element_name;
import org.eclipse.e4.cSS.pseudo;
import org.eclipse.e4.cSS.simple_selector;

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
 * An implementation of the model object '<em><b>simple selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.e4.cSS.impl.simple_selectorImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.eclipse.e4.cSS.impl.simple_selectorImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.e4.cSS.impl.simple_selectorImpl#getPseudo <em>Pseudo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class simple_selectorImpl extends MinimalEObjectImpl.Container implements simple_selector
{
  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected element_name element;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected EList<css_hash_class> id;

  /**
   * The cached value of the '{@link #getPseudo() <em>Pseudo</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPseudo()
   * @generated
   * @ordered
   */
  protected EList<pseudo> pseudo;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simple_selectorImpl()
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
    return CSSPackage.Literals.SIMPLE_SELECTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element_name getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElement(element_name newElement, NotificationChain msgs)
  {
    element_name oldElement = element;
    element = newElement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSSPackage.SIMPLE_SELECTOR__ELEMENT, oldElement, newElement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(element_name newElement)
  {
    if (newElement != element)
    {
      NotificationChain msgs = null;
      if (element != null)
        msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSSPackage.SIMPLE_SELECTOR__ELEMENT, null, msgs);
      if (newElement != null)
        msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSSPackage.SIMPLE_SELECTOR__ELEMENT, null, msgs);
      msgs = basicSetElement(newElement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSPackage.SIMPLE_SELECTOR__ELEMENT, newElement, newElement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<css_hash_class> getId()
  {
    if (id == null)
    {
      id = new EObjectContainmentEList<css_hash_class>(css_hash_class.class, this, CSSPackage.SIMPLE_SELECTOR__ID);
    }
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<pseudo> getPseudo()
  {
    if (pseudo == null)
    {
      pseudo = new EObjectContainmentEList<pseudo>(pseudo.class, this, CSSPackage.SIMPLE_SELECTOR__PSEUDO);
    }
    return pseudo;
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
      case CSSPackage.SIMPLE_SELECTOR__ELEMENT:
        return basicSetElement(null, msgs);
      case CSSPackage.SIMPLE_SELECTOR__ID:
        return ((InternalEList<?>)getId()).basicRemove(otherEnd, msgs);
      case CSSPackage.SIMPLE_SELECTOR__PSEUDO:
        return ((InternalEList<?>)getPseudo()).basicRemove(otherEnd, msgs);
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
      case CSSPackage.SIMPLE_SELECTOR__ELEMENT:
        return getElement();
      case CSSPackage.SIMPLE_SELECTOR__ID:
        return getId();
      case CSSPackage.SIMPLE_SELECTOR__PSEUDO:
        return getPseudo();
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
      case CSSPackage.SIMPLE_SELECTOR__ELEMENT:
        setElement((element_name)newValue);
        return;
      case CSSPackage.SIMPLE_SELECTOR__ID:
        getId().clear();
        getId().addAll((Collection<? extends css_hash_class>)newValue);
        return;
      case CSSPackage.SIMPLE_SELECTOR__PSEUDO:
        getPseudo().clear();
        getPseudo().addAll((Collection<? extends pseudo>)newValue);
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
      case CSSPackage.SIMPLE_SELECTOR__ELEMENT:
        setElement((element_name)null);
        return;
      case CSSPackage.SIMPLE_SELECTOR__ID:
        getId().clear();
        return;
      case CSSPackage.SIMPLE_SELECTOR__PSEUDO:
        getPseudo().clear();
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
      case CSSPackage.SIMPLE_SELECTOR__ELEMENT:
        return element != null;
      case CSSPackage.SIMPLE_SELECTOR__ID:
        return id != null && !id.isEmpty();
      case CSSPackage.SIMPLE_SELECTOR__PSEUDO:
        return pseudo != null && !pseudo.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //simple_selectorImpl
