/**
 */
package org.module.eer.mm.moduleeer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.EntityType#getGeneralizes <em>Generalizes</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.EntityType#getSrcRelationshiptype <em>Src Relationshiptype</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.EntityType#getTrgRelationshiptype <em>Trg Relationshiptype</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getEntityType()
 * @model
 * @generated
 */
public interface EntityType extends Element {
	/**
	 * Returns the value of the '<em><b>Generalizes</b></em>' reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.EntityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizes</em>' reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getEntityType_Generalizes()
	 * @model
	 * @generated
	 */
	EList<EntityType> getGeneralizes();

	/**
	 * Returns the value of the '<em><b>Src Relationshiptype</b></em>' reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.RelationshipType}.
	 * It is bidirectional and its opposite is '{@link org.module.eer.mm.moduleeer.RelationshipType#getSrcEntity <em>Src Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Relationshiptype</em>' reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getEntityType_SrcRelationshiptype()
	 * @see org.module.eer.mm.moduleeer.RelationshipType#getSrcEntity
	 * @model opposite="srcEntity"
	 * @generated
	 */
	EList<RelationshipType> getSrcRelationshiptype();

	/**
	 * Returns the value of the '<em><b>Trg Relationshiptype</b></em>' reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.RelationshipType}.
	 * It is bidirectional and its opposite is '{@link org.module.eer.mm.moduleeer.RelationshipType#getTrgEntity <em>Trg Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trg Relationshiptype</em>' reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getEntityType_TrgRelationshiptype()
	 * @see org.module.eer.mm.moduleeer.RelationshipType#getTrgEntity
	 * @model opposite="trgEntity"
	 * @generated
	 */
	EList<RelationshipType> getTrgRelationshiptype();

} // EntityType
