/**
 */
package org.module.eer.mm.moduleeer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.Aggregation#getTo <em>To</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.Aggregation#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.Aggregation#getCompletness <em>Completness</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getAggregation()
 * @model
 * @generated
 */
public interface Aggregation extends NameElement {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(RelationshipType)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getAggregation_To()
	 * @model required="true"
	 * @generated
	 */
	RelationshipType getTo();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.Aggregation#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(RelationshipType value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.module.eer.mm.moduleeer.CardinalityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CardinalityType
	 * @see #setCardinality(CardinalityType)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getAggregation_Cardinality()
	 * @model
	 * @generated
	 */
	CardinalityType getCardinality();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.Aggregation#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CardinalityType
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(CardinalityType value);

	/**
	 * Returns the value of the '<em><b>Completness</b></em>' attribute.
	 * The literals are from the enumeration {@link org.module.eer.mm.moduleeer.CompletenessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completness</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CompletenessType
	 * @see #setCompletness(CompletenessType)
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getAggregation_Completness()
	 * @model
	 * @generated
	 */
	CompletenessType getCompletness();

	/**
	 * Sets the value of the '{@link org.module.eer.mm.moduleeer.Aggregation#getCompletness <em>Completness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completness</em>' attribute.
	 * @see org.module.eer.mm.moduleeer.CompletenessType
	 * @see #getCompletness()
	 * @generated
	 */
	void setCompletness(CompletenessType value);

} // Aggregation
