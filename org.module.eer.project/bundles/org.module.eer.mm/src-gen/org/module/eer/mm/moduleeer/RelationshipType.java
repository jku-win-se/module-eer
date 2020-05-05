/**
 */
package org.module.eer.mm.moduleeer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.RelationshipType#getGeneralizes <em>Generalizes</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.RelationshipType#getLinks <em>Links</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.RelationshipType#getAggregations <em>Aggregations</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getRelationshipType()
 * @model
 * @generated
 */
public interface RelationshipType extends Element {
	/**
	 * Returns the value of the '<em><b>Generalizes</b></em>' reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.RelationshipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizes</em>' reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getRelationshipType_Generalizes()
	 * @model
	 * @generated
	 */
	EList<RelationshipType> getGeneralizes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getRelationshipType_Links()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Aggregations</b></em>' containment reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.Aggregation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregations</em>' containment reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getRelationshipType_Aggregations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Aggregation> getAggregations();

} // RelationshipType
