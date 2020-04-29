/**
 */
package org.module.eer.mm.moduleeer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.ModuleeerPackage;
import org.module.eer.mm.moduleeer.RelationshipType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.EntityTypeImpl#getGeneralizes <em>Generalizes</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.EntityTypeImpl#getSrcRelationshiptype <em>Src Relationshiptype</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.EntityTypeImpl#getTrgRelationshiptype <em>Trg Relationshiptype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityTypeImpl extends ElementImpl implements EntityType {
	/**
	 * The cached value of the '{@link #getGeneralizes() <em>Generalizes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizes()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> generalizes;

	/**
	 * The cached value of the '{@link #getSrcRelationshiptype() <em>Src Relationshiptype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcRelationshiptype()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipType> srcRelationshiptype;

	/**
	 * The cached value of the '{@link #getTrgRelationshiptype() <em>Trg Relationshiptype</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrgRelationshiptype()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipType> trgRelationshiptype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EntityType> getGeneralizes() {
		if (generalizes == null) {
			generalizes = new EObjectResolvingEList<EntityType>(EntityType.class, this,
					ModuleeerPackage.ENTITY_TYPE__GENERALIZES);
		}
		return generalizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelationshipType> getSrcRelationshiptype() {
		if (srcRelationshiptype == null) {
			srcRelationshiptype = new EObjectWithInverseResolvingEList<RelationshipType>(RelationshipType.class, this,
					ModuleeerPackage.ENTITY_TYPE__SRC_RELATIONSHIPTYPE, ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY);
		}
		return srcRelationshiptype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelationshipType> getTrgRelationshiptype() {
		if (trgRelationshiptype == null) {
			trgRelationshiptype = new EObjectWithInverseResolvingEList<RelationshipType>(RelationshipType.class, this,
					ModuleeerPackage.ENTITY_TYPE__TRG_RELATIONSHIPTYPE, ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY);
		}
		return trgRelationshiptype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModuleeerPackage.ENTITY_TYPE__SRC_RELATIONSHIPTYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSrcRelationshiptype()).basicAdd(otherEnd,
					msgs);
		case ModuleeerPackage.ENTITY_TYPE__TRG_RELATIONSHIPTYPE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTrgRelationshiptype()).basicAdd(otherEnd,
					msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModuleeerPackage.ENTITY_TYPE__SRC_RELATIONSHIPTYPE:
			return ((InternalEList<?>) getSrcRelationshiptype()).basicRemove(otherEnd, msgs);
		case ModuleeerPackage.ENTITY_TYPE__TRG_RELATIONSHIPTYPE:
			return ((InternalEList<?>) getTrgRelationshiptype()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModuleeerPackage.ENTITY_TYPE__GENERALIZES:
			return getGeneralizes();
		case ModuleeerPackage.ENTITY_TYPE__SRC_RELATIONSHIPTYPE:
			return getSrcRelationshiptype();
		case ModuleeerPackage.ENTITY_TYPE__TRG_RELATIONSHIPTYPE:
			return getTrgRelationshiptype();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModuleeerPackage.ENTITY_TYPE__GENERALIZES:
			getGeneralizes().clear();
			getGeneralizes().addAll((Collection<? extends EntityType>) newValue);
			return;
		case ModuleeerPackage.ENTITY_TYPE__SRC_RELATIONSHIPTYPE:
			getSrcRelationshiptype().clear();
			getSrcRelationshiptype().addAll((Collection<? extends RelationshipType>) newValue);
			return;
		case ModuleeerPackage.ENTITY_TYPE__TRG_RELATIONSHIPTYPE:
			getTrgRelationshiptype().clear();
			getTrgRelationshiptype().addAll((Collection<? extends RelationshipType>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case ModuleeerPackage.ENTITY_TYPE__GENERALIZES:
			getGeneralizes().clear();
			return;
		case ModuleeerPackage.ENTITY_TYPE__SRC_RELATIONSHIPTYPE:
			getSrcRelationshiptype().clear();
			return;
		case ModuleeerPackage.ENTITY_TYPE__TRG_RELATIONSHIPTYPE:
			getTrgRelationshiptype().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ModuleeerPackage.ENTITY_TYPE__GENERALIZES:
			return generalizes != null && !generalizes.isEmpty();
		case ModuleeerPackage.ENTITY_TYPE__SRC_RELATIONSHIPTYPE:
			return srcRelationshiptype != null && !srcRelationshiptype.isEmpty();
		case ModuleeerPackage.ENTITY_TYPE__TRG_RELATIONSHIPTYPE:
			return trgRelationshiptype != null && !trgRelationshiptype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityTypeImpl
