/**
 * <copyright>
 * </copyright>
 *

 */
package org.eclipse.e4.cSS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.e4.cSS.CSSFactory
 * @model kind="package"
 * @generated
 */
public interface CSSPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cSS";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/e4/CSS";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cSS";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CSSPackage eINSTANCE = org.eclipse.e4.cSS.impl.CSSPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.e4.cSS.impl.stylesheetImpl <em>stylesheet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.e4.cSS.impl.stylesheetImpl
   * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getstylesheet()
   * @generated
   */
  int STYLESHEET = 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__LOCATION = 0;

  /**
   * The feature id for the '<em><b>Import Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__IMPORT_NAME = 1;

  /**
   * The feature id for the '<em><b>Ruleset</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET__RULESET = 2;

  /**
   * The number of structural features of the '<em>stylesheet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLESHEET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.e4.cSS.impl.RulesImpl <em>Rules</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.e4.cSS.impl.RulesImpl
   * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getRules()
   * @generated
   */
  int RULES = 1;

  /**
   * The feature id for the '<em><b>Selectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES__SELECTORS = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES__DECLARATIONS = 1;

  /**
   * The number of structural features of the '<em>Rules</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.e4.cSS.impl.css_importImpl <em>css import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.e4.cSS.impl.css_importImpl
   * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getcss_import()
   * @generated
   */
  int CSS_IMPORT = 2;

  /**
   * The feature id for the '<em><b>String name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_IMPORT__STRING_NAME = 0;

  /**
   * The number of structural features of the '<em>css import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.e4.cSS.impl.selectorImpl <em>selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.e4.cSS.impl.selectorImpl
   * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getselector()
   * @generated
   */
  int SELECTOR = 3;

  /**
   * The feature id for the '<em><b>Simpleselectors</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__SIMPLESELECTORS = 0;

  /**
   * The feature id for the '<em><b>Combinator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__COMBINATOR = 1;

  /**
   * The feature id for the '<em><b>Selector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR__SELECTOR = 2;

  /**
   * The number of structural features of the '<em>selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.e4.cSS.impl.simple_selectorImpl <em>simple selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.e4.cSS.impl.simple_selectorImpl
   * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getsimple_selector()
   * @generated
   */
  int SIMPLE_SELECTOR = 4;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__ID = 1;

  /**
   * The feature id for the '<em><b>Pseudo</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR__PSEUDO = 2;

  /**
   * The number of structural features of the '<em>simple selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_SELECTOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.e4.cSS.impl.pseudoImpl <em>pseudo</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.e4.cSS.impl.pseudoImpl
   * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getpseudo()
   * @generated
   */
  int PSEUDO = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO__NAME = 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO__FUNCTION = 1;

  /**
   * The number of structural features of the '<em>pseudo</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PSEUDO_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.e4.cSS.impl.element_nameImpl <em>element name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.e4.cSS.impl.element_nameImpl
   * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getelement_name()
   * @generated
   */
  int ELEMENT_NAME = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>element name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.e4.cSS.impl.declarationImpl <em>declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.e4.cSS.impl.declarationImpl
   * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getdeclaration()
   * @generated
   */
  int DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Property</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__PROPERTY = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__EXPR = 1;

  /**
   * The feature id for the '<em><b>Priority</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__PRIORITY = 2;

  /**
   * The number of structural features of the '<em>declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.e4.cSS.impl.exprImpl <em>expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.e4.cSS.impl.exprImpl
   * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getexpr()
   * @generated
   */
  int EXPR = 8;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__TERM = 0;

  /**
   * The feature id for the '<em><b>Operators</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__OPERATORS = 1;

  /**
   * The number of structural features of the '<em>expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.e4.cSS.impl.termImpl <em>term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.e4.cSS.impl.termImpl
   * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getterm()
   * @generated
   */
  int TERM = 9;

  /**
   * The feature id for the '<em><b>Unary</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__UNARY = 0;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__NUMBER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__NAME = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__ID = 3;

  /**
   * The feature id for the '<em><b>Uri</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__URI = 4;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__COLOR = 5;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__FUNCTION = 6;

  /**
   * The number of structural features of the '<em>term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.eclipse.e4.cSS.impl.functionImpl <em>function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.e4.cSS.impl.functionImpl
   * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getfunction()
   * @generated
   */
  int FUNCTION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__EXPR = 1;

  /**
   * The number of structural features of the '<em>function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.e4.cSS.impl.URIImpl <em>URI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.e4.cSS.impl.URIImpl
   * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getURI()
   * @generated
   */
  int URI = 11;

  /**
   * The feature id for the '<em><b>String name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__STRING_NAME = CSS_IMPORT__STRING_NAME;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__NAME = CSS_IMPORT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI__ID = CSS_IMPORT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>URI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int URI_FEATURE_COUNT = CSS_IMPORT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.e4.cSS.impl.css_hash_classImpl <em>css hash class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.e4.cSS.impl.css_hash_classImpl
   * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getcss_hash_class()
   * @generated
   */
  int CSS_HASH_CLASS = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_HASH_CLASS__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_HASH_CLASS__NAME = 1;

  /**
   * The number of structural features of the '<em>css hash class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_HASH_CLASS_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.e4.cSS.stylesheet <em>stylesheet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>stylesheet</em>'.
   * @see org.eclipse.e4.cSS.stylesheet
   * @generated
   */
  EClass getstylesheet();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.stylesheet#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see org.eclipse.e4.cSS.stylesheet#getLocation()
   * @see #getstylesheet()
   * @generated
   */
  EAttribute getstylesheet_Location();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.e4.cSS.stylesheet#getImportName <em>Import Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Import Name</em>'.
   * @see org.eclipse.e4.cSS.stylesheet#getImportName()
   * @see #getstylesheet()
   * @generated
   */
  EReference getstylesheet_ImportName();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.e4.cSS.stylesheet#getRuleset <em>Ruleset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ruleset</em>'.
   * @see org.eclipse.e4.cSS.stylesheet#getRuleset()
   * @see #getstylesheet()
   * @generated
   */
  EReference getstylesheet_Ruleset();

  /**
   * Returns the meta object for class '{@link org.eclipse.e4.cSS.Rules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rules</em>'.
   * @see org.eclipse.e4.cSS.Rules
   * @generated
   */
  EClass getRules();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.e4.cSS.Rules#getSelectors <em>Selectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selectors</em>'.
   * @see org.eclipse.e4.cSS.Rules#getSelectors()
   * @see #getRules()
   * @generated
   */
  EReference getRules_Selectors();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.e4.cSS.Rules#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see org.eclipse.e4.cSS.Rules#getDeclarations()
   * @see #getRules()
   * @generated
   */
  EReference getRules_Declarations();

  /**
   * Returns the meta object for class '{@link org.eclipse.e4.cSS.css_import <em>css import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>css import</em>'.
   * @see org.eclipse.e4.cSS.css_import
   * @generated
   */
  EClass getcss_import();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.css_import#getString_name <em>String name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String name</em>'.
   * @see org.eclipse.e4.cSS.css_import#getString_name()
   * @see #getcss_import()
   * @generated
   */
  EAttribute getcss_import_String_name();

  /**
   * Returns the meta object for class '{@link org.eclipse.e4.cSS.selector <em>selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>selector</em>'.
   * @see org.eclipse.e4.cSS.selector
   * @generated
   */
  EClass getselector();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.e4.cSS.selector#getSimpleselectors <em>Simpleselectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Simpleselectors</em>'.
   * @see org.eclipse.e4.cSS.selector#getSimpleselectors()
   * @see #getselector()
   * @generated
   */
  EReference getselector_Simpleselectors();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.selector#getCombinator <em>Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Combinator</em>'.
   * @see org.eclipse.e4.cSS.selector#getCombinator()
   * @see #getselector()
   * @generated
   */
  EAttribute getselector_Combinator();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.e4.cSS.selector#getSelector <em>Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Selector</em>'.
   * @see org.eclipse.e4.cSS.selector#getSelector()
   * @see #getselector()
   * @generated
   */
  EReference getselector_Selector();

  /**
   * Returns the meta object for class '{@link org.eclipse.e4.cSS.simple_selector <em>simple selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>simple selector</em>'.
   * @see org.eclipse.e4.cSS.simple_selector
   * @generated
   */
  EClass getsimple_selector();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.e4.cSS.simple_selector#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.eclipse.e4.cSS.simple_selector#getElement()
   * @see #getsimple_selector()
   * @generated
   */
  EReference getsimple_selector_Element();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.e4.cSS.simple_selector#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see org.eclipse.e4.cSS.simple_selector#getId()
   * @see #getsimple_selector()
   * @generated
   */
  EReference getsimple_selector_Id();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.e4.cSS.simple_selector#getPseudo <em>Pseudo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pseudo</em>'.
   * @see org.eclipse.e4.cSS.simple_selector#getPseudo()
   * @see #getsimple_selector()
   * @generated
   */
  EReference getsimple_selector_Pseudo();

  /**
   * Returns the meta object for class '{@link org.eclipse.e4.cSS.pseudo <em>pseudo</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>pseudo</em>'.
   * @see org.eclipse.e4.cSS.pseudo
   * @generated
   */
  EClass getpseudo();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.pseudo#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.e4.cSS.pseudo#getName()
   * @see #getpseudo()
   * @generated
   */
  EAttribute getpseudo_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.e4.cSS.pseudo#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.eclipse.e4.cSS.pseudo#getFunction()
   * @see #getpseudo()
   * @generated
   */
  EReference getpseudo_Function();

  /**
   * Returns the meta object for class '{@link org.eclipse.e4.cSS.element_name <em>element name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>element name</em>'.
   * @see org.eclipse.e4.cSS.element_name
   * @generated
   */
  EClass getelement_name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.element_name#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.e4.cSS.element_name#getName()
   * @see #getelement_name()
   * @generated
   */
  EAttribute getelement_name_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.e4.cSS.declaration <em>declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>declaration</em>'.
   * @see org.eclipse.e4.cSS.declaration
   * @generated
   */
  EClass getdeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.declaration#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Property</em>'.
   * @see org.eclipse.e4.cSS.declaration#getProperty()
   * @see #getdeclaration()
   * @generated
   */
  EAttribute getdeclaration_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.e4.cSS.declaration#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipse.e4.cSS.declaration#getExpr()
   * @see #getdeclaration()
   * @generated
   */
  EReference getdeclaration_Expr();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.declaration#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priority</em>'.
   * @see org.eclipse.e4.cSS.declaration#getPriority()
   * @see #getdeclaration()
   * @generated
   */
  EAttribute getdeclaration_Priority();

  /**
   * Returns the meta object for class '{@link org.eclipse.e4.cSS.expr <em>expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expr</em>'.
   * @see org.eclipse.e4.cSS.expr
   * @generated
   */
  EClass getexpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.e4.cSS.expr#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Term</em>'.
   * @see org.eclipse.e4.cSS.expr#getTerm()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Term();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.e4.cSS.expr#getOperators <em>Operators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operators</em>'.
   * @see org.eclipse.e4.cSS.expr#getOperators()
   * @see #getexpr()
   * @generated
   */
  EAttribute getexpr_Operators();

  /**
   * Returns the meta object for class '{@link org.eclipse.e4.cSS.term <em>term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>term</em>'.
   * @see org.eclipse.e4.cSS.term
   * @generated
   */
  EClass getterm();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.term#getUnary <em>Unary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unary</em>'.
   * @see org.eclipse.e4.cSS.term#getUnary()
   * @see #getterm()
   * @generated
   */
  EAttribute getterm_Unary();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.term#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see org.eclipse.e4.cSS.term#getNumber()
   * @see #getterm()
   * @generated
   */
  EAttribute getterm_Number();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.term#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.e4.cSS.term#getName()
   * @see #getterm()
   * @generated
   */
  EAttribute getterm_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.term#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.eclipse.e4.cSS.term#getId()
   * @see #getterm()
   * @generated
   */
  EAttribute getterm_Id();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.e4.cSS.term#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uri</em>'.
   * @see org.eclipse.e4.cSS.term#getUri()
   * @see #getterm()
   * @generated
   */
  EReference getterm_Uri();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.term#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see org.eclipse.e4.cSS.term#getColor()
   * @see #getterm()
   * @generated
   */
  EAttribute getterm_Color();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.e4.cSS.term#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see org.eclipse.e4.cSS.term#getFunction()
   * @see #getterm()
   * @generated
   */
  EReference getterm_Function();

  /**
   * Returns the meta object for class '{@link org.eclipse.e4.cSS.function <em>function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function</em>'.
   * @see org.eclipse.e4.cSS.function
   * @generated
   */
  EClass getfunction();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.e4.cSS.function#getName()
   * @see #getfunction()
   * @generated
   */
  EAttribute getfunction_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.e4.cSS.function#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.eclipse.e4.cSS.function#getExpr()
   * @see #getfunction()
   * @generated
   */
  EReference getfunction_Expr();

  /**
   * Returns the meta object for class '{@link org.eclipse.e4.cSS.URI <em>URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>URI</em>'.
   * @see org.eclipse.e4.cSS.URI
   * @generated
   */
  EClass getURI();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.e4.cSS.URI#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see org.eclipse.e4.cSS.URI#getName()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_Name();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.e4.cSS.URI#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Id</em>'.
   * @see org.eclipse.e4.cSS.URI#getId()
   * @see #getURI()
   * @generated
   */
  EAttribute getURI_Id();

  /**
   * Returns the meta object for class '{@link org.eclipse.e4.cSS.css_hash_class <em>css hash class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>css hash class</em>'.
   * @see org.eclipse.e4.cSS.css_hash_class
   * @generated
   */
  EClass getcss_hash_class();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.css_hash_class#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.e4.cSS.css_hash_class#getType()
   * @see #getcss_hash_class()
   * @generated
   */
  EAttribute getcss_hash_class_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.e4.cSS.css_hash_class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.e4.cSS.css_hash_class#getName()
   * @see #getcss_hash_class()
   * @generated
   */
  EAttribute getcss_hash_class_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CSSFactory getCSSFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.e4.cSS.impl.stylesheetImpl <em>stylesheet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.e4.cSS.impl.stylesheetImpl
     * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getstylesheet()
     * @generated
     */
    EClass STYLESHEET = eINSTANCE.getstylesheet();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STYLESHEET__LOCATION = eINSTANCE.getstylesheet_Location();

    /**
     * The meta object literal for the '<em><b>Import Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLESHEET__IMPORT_NAME = eINSTANCE.getstylesheet_ImportName();

    /**
     * The meta object literal for the '<em><b>Ruleset</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLESHEET__RULESET = eINSTANCE.getstylesheet_Ruleset();

    /**
     * The meta object literal for the '{@link org.eclipse.e4.cSS.impl.RulesImpl <em>Rules</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.e4.cSS.impl.RulesImpl
     * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getRules()
     * @generated
     */
    EClass RULES = eINSTANCE.getRules();

    /**
     * The meta object literal for the '<em><b>Selectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULES__SELECTORS = eINSTANCE.getRules_Selectors();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULES__DECLARATIONS = eINSTANCE.getRules_Declarations();

    /**
     * The meta object literal for the '{@link org.eclipse.e4.cSS.impl.css_importImpl <em>css import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.e4.cSS.impl.css_importImpl
     * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getcss_import()
     * @generated
     */
    EClass CSS_IMPORT = eINSTANCE.getcss_import();

    /**
     * The meta object literal for the '<em><b>String name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_IMPORT__STRING_NAME = eINSTANCE.getcss_import_String_name();

    /**
     * The meta object literal for the '{@link org.eclipse.e4.cSS.impl.selectorImpl <em>selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.e4.cSS.impl.selectorImpl
     * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getselector()
     * @generated
     */
    EClass SELECTOR = eINSTANCE.getselector();

    /**
     * The meta object literal for the '<em><b>Simpleselectors</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTOR__SIMPLESELECTORS = eINSTANCE.getselector_Simpleselectors();

    /**
     * The meta object literal for the '<em><b>Combinator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECTOR__COMBINATOR = eINSTANCE.getselector_Combinator();

    /**
     * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECTOR__SELECTOR = eINSTANCE.getselector_Selector();

    /**
     * The meta object literal for the '{@link org.eclipse.e4.cSS.impl.simple_selectorImpl <em>simple selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.e4.cSS.impl.simple_selectorImpl
     * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getsimple_selector()
     * @generated
     */
    EClass SIMPLE_SELECTOR = eINSTANCE.getsimple_selector();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR__ELEMENT = eINSTANCE.getsimple_selector_Element();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR__ID = eINSTANCE.getsimple_selector_Id();

    /**
     * The meta object literal for the '<em><b>Pseudo</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_SELECTOR__PSEUDO = eINSTANCE.getsimple_selector_Pseudo();

    /**
     * The meta object literal for the '{@link org.eclipse.e4.cSS.impl.pseudoImpl <em>pseudo</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.e4.cSS.impl.pseudoImpl
     * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getpseudo()
     * @generated
     */
    EClass PSEUDO = eINSTANCE.getpseudo();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PSEUDO__NAME = eINSTANCE.getpseudo_Name();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PSEUDO__FUNCTION = eINSTANCE.getpseudo_Function();

    /**
     * The meta object literal for the '{@link org.eclipse.e4.cSS.impl.element_nameImpl <em>element name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.e4.cSS.impl.element_nameImpl
     * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getelement_name()
     * @generated
     */
    EClass ELEMENT_NAME = eINSTANCE.getelement_name();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_NAME__NAME = eINSTANCE.getelement_name_Name();

    /**
     * The meta object literal for the '{@link org.eclipse.e4.cSS.impl.declarationImpl <em>declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.e4.cSS.impl.declarationImpl
     * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getdeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getdeclaration();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__PROPERTY = eINSTANCE.getdeclaration_Property();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__EXPR = eINSTANCE.getdeclaration_Expr();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__PRIORITY = eINSTANCE.getdeclaration_Priority();

    /**
     * The meta object literal for the '{@link org.eclipse.e4.cSS.impl.exprImpl <em>expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.e4.cSS.impl.exprImpl
     * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getexpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getexpr();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__TERM = eINSTANCE.getexpr_Term();

    /**
     * The meta object literal for the '<em><b>Operators</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR__OPERATORS = eINSTANCE.getexpr_Operators();

    /**
     * The meta object literal for the '{@link org.eclipse.e4.cSS.impl.termImpl <em>term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.e4.cSS.impl.termImpl
     * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getterm()
     * @generated
     */
    EClass TERM = eINSTANCE.getterm();

    /**
     * The meta object literal for the '<em><b>Unary</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__UNARY = eINSTANCE.getterm_Unary();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__NUMBER = eINSTANCE.getterm_Number();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__NAME = eINSTANCE.getterm_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__ID = eINSTANCE.getterm_Id();

    /**
     * The meta object literal for the '<em><b>Uri</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__URI = eINSTANCE.getterm_Uri();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__COLOR = eINSTANCE.getterm_Color();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__FUNCTION = eINSTANCE.getterm_Function();

    /**
     * The meta object literal for the '{@link org.eclipse.e4.cSS.impl.functionImpl <em>function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.e4.cSS.impl.functionImpl
     * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getfunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getfunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getfunction_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__EXPR = eINSTANCE.getfunction_Expr();

    /**
     * The meta object literal for the '{@link org.eclipse.e4.cSS.impl.URIImpl <em>URI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.e4.cSS.impl.URIImpl
     * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getURI()
     * @generated
     */
    EClass URI = eINSTANCE.getURI();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__NAME = eINSTANCE.getURI_Name();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute URI__ID = eINSTANCE.getURI_Id();

    /**
     * The meta object literal for the '{@link org.eclipse.e4.cSS.impl.css_hash_classImpl <em>css hash class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.e4.cSS.impl.css_hash_classImpl
     * @see org.eclipse.e4.cSS.impl.CSSPackageImpl#getcss_hash_class()
     * @generated
     */
    EClass CSS_HASH_CLASS = eINSTANCE.getcss_hash_class();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_HASH_CLASS__TYPE = eINSTANCE.getcss_hash_class_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS_HASH_CLASS__NAME = eINSTANCE.getcss_hash_class_Name();

  }

} //CSSPackage
