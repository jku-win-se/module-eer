/**
 */
package org.module.eer.mm.moduleeer;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.module.eer.mm.moduleeer.ModuleeerFactory
 * @model kind="package"
 * @generated
 */
public interface ModuleeerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "moduleeer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://moduleeer/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "moduleeer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModuleeerPackage eINSTANCE = org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.impl.NameElementImpl <em>Name Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.impl.NameElementImpl
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getNameElement()
	 * @generated
	 */
	int NAME_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Name Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.impl.MEERModelImpl <em>MEER Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.impl.MEERModelImpl
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getMEERModel()
	 * @generated
	 */
	int MEER_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEER_MODEL__NAME = NAME_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Context Data Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEER_MODEL__CONTEXT_DATA_MODELS = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEER_MODEL__SUBSYSTEMS = NAME_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MEER Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEER_MODEL_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MEER Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEER_MODEL_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.impl.ModularizableElementImpl <em>Modularizable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.impl.ModularizableElementImpl
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getModularizableElement()
	 * @generated
	 */
	int MODULARIZABLE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZABLE_ELEMENT__NAME = NAME_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Modularizable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZABLE_ELEMENT_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Modularizable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULARIZABLE_ELEMENT_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.impl.ElementImpl
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = MODULARIZABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ATTRIBUTES = MODULARIZABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ACCESS_ELEMENT = MODULARIZABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = MODULARIZABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = MODULARIZABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.impl.ContextDataModelImpl <em>Context Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.impl.ContextDataModelImpl
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getContextDataModel()
	 * @generated
	 */
	int CONTEXT_DATA_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DATA_MODEL__NAME = NAME_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Context Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DATA_MODEL_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Context Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_DATA_MODEL_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.impl.ModuleImpl
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = CONTEXT_DATA_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__EVENTS = CONTEXT_DATA_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modularizable Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULARIZABLE_ELEMENTS = CONTEXT_DATA_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = CONTEXT_DATA_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = CONTEXT_DATA_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.impl.EntityTypeImpl
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Access Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ACCESS_ELEMENT = ELEMENT__ACCESS_ELEMENT;

	/**
	 * The feature id for the '<em><b>Generalizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__GENERALIZES = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src Relationshiptype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__SRC_RELATIONSHIPTYPE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trg Relationshiptype</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__TRG_RELATIONSHIPTYPE = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.impl.RelationshipTypeImpl
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Access Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__ACCESS_ELEMENT = ELEMENT__ACCESS_ELEMENT;

	/**
	 * The feature id for the '<em><b>Src Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__SRC_ENTITY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trg Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__TRG_ENTITY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Src Entity Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__SRC_ENTITY_CARDINALITY = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Trg Entity Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__TRG_ENTITY_CARDINALITY = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.impl.AttributeImpl
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAME_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAME_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAME_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.impl.SingleAttributeImpl <em>Single Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.impl.SingleAttributeImpl
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getSingleAttribute()
	 * @generated
	 */
	int SINGLE_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATTRIBUTE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATTRIBUTE__IS_KEY = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Single Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.impl.SubjectAreaImpl <em>Subject Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.impl.SubjectAreaImpl
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getSubjectArea()
	 * @generated
	 */
	int SUBJECT_AREA = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_AREA__NAME = CONTEXT_DATA_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Context Data Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_AREA__CONTEXT_DATA_MODELS = CONTEXT_DATA_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subject Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_AREA_FEATURE_COUNT = CONTEXT_DATA_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subject Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_AREA_OPERATION_COUNT = CONTEXT_DATA_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.impl.CompositeAttributeImpl <em>Composite Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.impl.CompositeAttributeImpl
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getCompositeAttribute()
	 * @generated
	 */
	int COMPOSITE_ATTRIBUTE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ATTRIBUTE__ATTRIBUTES = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.AttributeType
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.module.eer.mm.moduleeer.CardinalityType <em>Cardinality Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.module.eer.mm.moduleeer.CardinalityType
	 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getCardinalityType()
	 * @generated
	 */
	int CARDINALITY_TYPE = 13;

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.MEERModel <em>MEER Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MEER Model</em>'.
	 * @see org.module.eer.mm.moduleeer.MEERModel
	 * @generated
	 */
	EClass getMEERModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.module.eer.mm.moduleeer.MEERModel#getContextDataModels <em>Context Data Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Data Models</em>'.
	 * @see org.module.eer.mm.moduleeer.MEERModel#getContextDataModels()
	 * @see #getMEERModel()
	 * @generated
	 */
	EReference getMEERModel_ContextDataModels();

	/**
	 * Returns the meta object for the containment reference list '{@link org.module.eer.mm.moduleeer.MEERModel#getSubsystems <em>Subsystems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subsystems</em>'.
	 * @see org.module.eer.mm.moduleeer.MEERModel#getSubsystems()
	 * @see #getMEERModel()
	 * @generated
	 */
	EReference getMEERModel_Subsystems();

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.module.eer.mm.moduleeer.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.module.eer.mm.moduleeer.Element#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.module.eer.mm.moduleeer.Element#getAttributes()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link org.module.eer.mm.moduleeer.Element#getAccessElement <em>Access Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Access Element</em>'.
	 * @see org.module.eer.mm.moduleeer.Element#getAccessElement()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_AccessElement();

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see org.module.eer.mm.moduleeer.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.module.eer.mm.moduleeer.Module#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.module.eer.mm.moduleeer.Module#getEvents()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link org.module.eer.mm.moduleeer.Module#getModularizableElements <em>Modularizable Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modularizable Elements</em>'.
	 * @see org.module.eer.mm.moduleeer.Module#getModularizableElements()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModularizableElements();

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.NameElement <em>Name Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Element</em>'.
	 * @see org.module.eer.mm.moduleeer.NameElement
	 * @generated
	 */
	EClass getNameElement();

	/**
	 * Returns the meta object for the attribute '{@link org.module.eer.mm.moduleeer.NameElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.module.eer.mm.moduleeer.NameElement#getName()
	 * @see #getNameElement()
	 * @generated
	 */
	EAttribute getNameElement_Name();

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see org.module.eer.mm.moduleeer.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the reference list '{@link org.module.eer.mm.moduleeer.EntityType#getGeneralizes <em>Generalizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generalizes</em>'.
	 * @see org.module.eer.mm.moduleeer.EntityType#getGeneralizes()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Generalizes();

	/**
	 * Returns the meta object for the reference list '{@link org.module.eer.mm.moduleeer.EntityType#getSrcRelationshiptype <em>Src Relationshiptype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Src Relationshiptype</em>'.
	 * @see org.module.eer.mm.moduleeer.EntityType#getSrcRelationshiptype()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_SrcRelationshiptype();

	/**
	 * Returns the meta object for the reference list '{@link org.module.eer.mm.moduleeer.EntityType#getTrgRelationshiptype <em>Trg Relationshiptype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Trg Relationshiptype</em>'.
	 * @see org.module.eer.mm.moduleeer.EntityType#getTrgRelationshiptype()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_TrgRelationshiptype();

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see org.module.eer.mm.moduleeer.RelationshipType
	 * @generated
	 */
	EClass getRelationshipType();

	/**
	 * Returns the meta object for the reference '{@link org.module.eer.mm.moduleeer.RelationshipType#getSrcEntity <em>Src Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src Entity</em>'.
	 * @see org.module.eer.mm.moduleeer.RelationshipType#getSrcEntity()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_SrcEntity();

	/**
	 * Returns the meta object for the reference '{@link org.module.eer.mm.moduleeer.RelationshipType#getTrgEntity <em>Trg Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trg Entity</em>'.
	 * @see org.module.eer.mm.moduleeer.RelationshipType#getTrgEntity()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_TrgEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.module.eer.mm.moduleeer.RelationshipType#getSrcEntityCardinality <em>Src Entity Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Entity Cardinality</em>'.
	 * @see org.module.eer.mm.moduleeer.RelationshipType#getSrcEntityCardinality()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_SrcEntityCardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.module.eer.mm.moduleeer.RelationshipType#getTrgEntityCardinality <em>Trg Entity Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trg Entity Cardinality</em>'.
	 * @see org.module.eer.mm.moduleeer.RelationshipType#getTrgEntityCardinality()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EAttribute getRelationshipType_TrgEntityCardinality();

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.SingleAttribute <em>Single Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Attribute</em>'.
	 * @see org.module.eer.mm.moduleeer.SingleAttribute
	 * @generated
	 */
	EClass getSingleAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.module.eer.mm.moduleeer.SingleAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.module.eer.mm.moduleeer.SingleAttribute#getType()
	 * @see #getSingleAttribute()
	 * @generated
	 */
	EAttribute getSingleAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.module.eer.mm.moduleeer.SingleAttribute#isIsKey <em>Is Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Key</em>'.
	 * @see org.module.eer.mm.moduleeer.SingleAttribute#isIsKey()
	 * @see #getSingleAttribute()
	 * @generated
	 */
	EAttribute getSingleAttribute_IsKey();

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.ModularizableElement <em>Modularizable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modularizable Element</em>'.
	 * @see org.module.eer.mm.moduleeer.ModularizableElement
	 * @generated
	 */
	EClass getModularizableElement();

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.ContextDataModel <em>Context Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Data Model</em>'.
	 * @see org.module.eer.mm.moduleeer.ContextDataModel
	 * @generated
	 */
	EClass getContextDataModel();

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.SubjectArea <em>Subject Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Area</em>'.
	 * @see org.module.eer.mm.moduleeer.SubjectArea
	 * @generated
	 */
	EClass getSubjectArea();

	/**
	 * Returns the meta object for the containment reference list '{@link org.module.eer.mm.moduleeer.SubjectArea#getContextDataModels <em>Context Data Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Data Models</em>'.
	 * @see org.module.eer.mm.moduleeer.SubjectArea#getContextDataModels()
	 * @see #getSubjectArea()
	 * @generated
	 */
	EReference getSubjectArea_ContextDataModels();

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.module.eer.mm.moduleeer.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link org.module.eer.mm.moduleeer.CompositeAttribute <em>Composite Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Attribute</em>'.
	 * @see org.module.eer.mm.moduleeer.CompositeAttribute
	 * @generated
	 */
	EClass getCompositeAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.module.eer.mm.moduleeer.CompositeAttribute#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.module.eer.mm.moduleeer.CompositeAttribute#getAttributes()
	 * @see #getCompositeAttribute()
	 * @generated
	 */
	EReference getCompositeAttribute_Attributes();

	/**
	 * Returns the meta object for enum '{@link org.module.eer.mm.moduleeer.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see org.module.eer.mm.moduleeer.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the meta object for enum '{@link org.module.eer.mm.moduleeer.CardinalityType <em>Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cardinality Type</em>'.
	 * @see org.module.eer.mm.moduleeer.CardinalityType
	 * @generated
	 */
	EEnum getCardinalityType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModuleeerFactory getModuleeerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.impl.MEERModelImpl <em>MEER Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.impl.MEERModelImpl
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getMEERModel()
		 * @generated
		 */
		EClass MEER_MODEL = eINSTANCE.getMEERModel();

		/**
		 * The meta object literal for the '<em><b>Context Data Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEER_MODEL__CONTEXT_DATA_MODELS = eINSTANCE.getMEERModel_ContextDataModels();

		/**
		 * The meta object literal for the '<em><b>Subsystems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEER_MODEL__SUBSYSTEMS = eINSTANCE.getMEERModel_Subsystems();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.impl.ElementImpl
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

		/**
		 * The meta object literal for the '<em><b>Access Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__ACCESS_ELEMENT = eINSTANCE.getElement_AccessElement();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.impl.ModuleImpl
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__EVENTS = eINSTANCE.getModule_Events();

		/**
		 * The meta object literal for the '<em><b>Modularizable Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULARIZABLE_ELEMENTS = eINSTANCE.getModule_ModularizableElements();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.impl.NameElementImpl <em>Name Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.impl.NameElementImpl
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getNameElement()
		 * @generated
		 */
		EClass NAME_ELEMENT = eINSTANCE.getNameElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ELEMENT__NAME = eINSTANCE.getNameElement_Name();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.impl.EntityTypeImpl
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Generalizes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__GENERALIZES = eINSTANCE.getEntityType_Generalizes();

		/**
		 * The meta object literal for the '<em><b>Src Relationshiptype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__SRC_RELATIONSHIPTYPE = eINSTANCE.getEntityType_SrcRelationshiptype();

		/**
		 * The meta object literal for the '<em><b>Trg Relationshiptype</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__TRG_RELATIONSHIPTYPE = eINSTANCE.getEntityType_TrgRelationshiptype();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.impl.RelationshipTypeImpl
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getRelationshipType()
		 * @generated
		 */
		EClass RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Src Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__SRC_ENTITY = eINSTANCE.getRelationshipType_SrcEntity();

		/**
		 * The meta object literal for the '<em><b>Trg Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__TRG_ENTITY = eINSTANCE.getRelationshipType_TrgEntity();

		/**
		 * The meta object literal for the '<em><b>Src Entity Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__SRC_ENTITY_CARDINALITY = eINSTANCE.getRelationshipType_SrcEntityCardinality();

		/**
		 * The meta object literal for the '<em><b>Trg Entity Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TYPE__TRG_ENTITY_CARDINALITY = eINSTANCE.getRelationshipType_TrgEntityCardinality();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.impl.SingleAttributeImpl <em>Single Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.impl.SingleAttributeImpl
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getSingleAttribute()
		 * @generated
		 */
		EClass SINGLE_ATTRIBUTE = eINSTANCE.getSingleAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_ATTRIBUTE__TYPE = eINSTANCE.getSingleAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Is Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_ATTRIBUTE__IS_KEY = eINSTANCE.getSingleAttribute_IsKey();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.impl.ModularizableElementImpl <em>Modularizable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.impl.ModularizableElementImpl
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getModularizableElement()
		 * @generated
		 */
		EClass MODULARIZABLE_ELEMENT = eINSTANCE.getModularizableElement();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.impl.ContextDataModelImpl <em>Context Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.impl.ContextDataModelImpl
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getContextDataModel()
		 * @generated
		 */
		EClass CONTEXT_DATA_MODEL = eINSTANCE.getContextDataModel();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.impl.SubjectAreaImpl <em>Subject Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.impl.SubjectAreaImpl
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getSubjectArea()
		 * @generated
		 */
		EClass SUBJECT_AREA = eINSTANCE.getSubjectArea();

		/**
		 * The meta object literal for the '<em><b>Context Data Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT_AREA__CONTEXT_DATA_MODELS = eINSTANCE.getSubjectArea_ContextDataModels();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.impl.AttributeImpl
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.impl.CompositeAttributeImpl <em>Composite Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.impl.CompositeAttributeImpl
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getCompositeAttribute()
		 * @generated
		 */
		EClass COMPOSITE_ATTRIBUTE = eINSTANCE.getCompositeAttribute();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ATTRIBUTE__ATTRIBUTES = eINSTANCE.getCompositeAttribute_Attributes();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.AttributeType
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '{@link org.module.eer.mm.moduleeer.CardinalityType <em>Cardinality Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.module.eer.mm.moduleeer.CardinalityType
		 * @see org.module.eer.mm.moduleeer.impl.ModuleeerPackageImpl#getCardinalityType()
		 * @generated
		 */
		EEnum CARDINALITY_TYPE = eINSTANCE.getCardinalityType();

	}

} //ModuleeerPackage
