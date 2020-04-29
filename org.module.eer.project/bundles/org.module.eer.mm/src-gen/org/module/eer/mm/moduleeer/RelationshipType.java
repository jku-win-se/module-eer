/**
 */
package org.module.eer.mm.moduleeer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.RelationshipType#getSrcEntity <em>Src Entity</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.RelationshipType#getTrgEntity <em>Trg Entity</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.RelationshipType#getSrcEntityCardinality <em>Src Entity Cardinality</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.RelationshipType#getTrgEntityCardinality <em>Trg Entity Cardinality</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getRelationshipType()
 * @model
 * @generated
 */
public interface RelationshipType extends Element {
	/**
	 * Returns the value of the '<em><b>Src Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.module.eer.mm.moduleeer.EntityType#getSrcRelationshiptype <em>Src Relationshiptype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Entity</em>' reference.
	 * @see #setSrcEntity(EntityType)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getRelationshipType_SrcEntity()
	 * @see org.module.eer.mm.moduleeer.EntityType#getSrcRelationshiptype
	 * @model opposite="srcRelationshiptype"
	 * @generated
	 */
	EntityType getSrcEntity();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.RelationshipType#getSrcEntity <em>Src Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Entity</em>' reference.
	 * @see #getSrcEntity()
	 * @generated
	 */
	void setSrcEntity(EntityType value);

	/**
	 * Returns the value of the '<em><b>Trg Entity</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.module.eer.mm.moduleeer.EntityType#getTrgRelationshiptype <em>Trg Relationshiptype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trg Entity</em>' reference.
	 * @see #setTrgEntity(EntityType)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getRelationshipType_TrgEntity()
	 * @see org.module.eer.mm.moduleeer.EntityType#getTrgRelationshiptype
	 * @model opposite="trgRelationshiptype"
	 * @generated
	 */
	EntityType getTrgEntity();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.RelationshipType#getTrgEntity <em>Trg Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trg Entity</em>' reference.
	 * @see #getTrgEntity()
	 * @generated
	 */
	void setTrgEntity(EntityType value);

	/**
	 * Returns the value of the '<em><b>Src Entity Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.module.eer.mm.moduleeer.CardinalityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Entity Cardinality</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CardinalityType
	 * @see #setSrcEntityCardinality(CardinalityType)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getRelationshipType_SrcEntityCardinality()
	 * @model
	 * @generated
	 */
	CardinalityType getSrcEntityCardinality();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.RelationshipType#getSrcEntityCardinality <em>Src Entity Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Entity Cardinality</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CardinalityType
	 * @see #getSrcEntityCardinality()
	 * @generated
	 */
	void setSrcEntityCardinality(CardinalityType value);

	/**
	 * Returns the value of the '<em><b>Trg Entity Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.module.eer.mm.moduleeer.CardinalityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trg Entity Cardinality</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CardinalityType
	 * @see #setTrgEntityCardinality(CardinalityType)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getRelationshipType_TrgEntityCardinality()
	 * @model
	 * @generated
	 */
	CardinalityType getTrgEntityCardinality();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.RelationshipType#getTrgEntityCardinality <em>Trg Entity Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trg Entity Cardinality</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CardinalityType
	 * @see #getTrgEntityCardinality()
	 * @generated
	 */
	void setTrgEntityCardinality(CardinalityType value);

} // RelationshipType
