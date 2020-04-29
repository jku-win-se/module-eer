/**
 */
package org.module.eer.mm.moduleeer.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.module.eer.mm.moduleeer.CardinalityType;
import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.ModuleeerPackage;
import org.module.eer.mm.moduleeer.RelationshipType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.RelationshipTypeImpl#getSrcEntity <em>Src Entity</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.RelationshipTypeImpl#getTrgEntity <em>Trg Entity</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.RelationshipTypeImpl#getSrcEntityCardinality <em>Src Entity Cardinality</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.RelationshipTypeImpl#getTrgEntityCardinality <em>Trg Entity Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipTypeImpl extends ElementImpl implements RelationshipType {
	/**
	 * The cached value of the '{@link #getSrcEntity() <em>Src Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcEntity()
	 * @generated
	 * @ordered
	 */
	protected EntityType srcEntity;

	/**
	 * The cached value of the '{@link #getTrgEntity() <em>Trg Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrgEntity()
	 * @generated
	 * @ordered
	 */
	protected EntityType trgEntity;

	/**
	 * The default value of the '{@link #getSrcEntityCardinality() <em>Src Entity Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcEntityCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final CardinalityType SRC_ENTITY_CARDINALITY_EDEFAULT = CardinalityType.ZERO;

	/**
	 * The cached value of the '{@link #getSrcEntityCardinality() <em>Src Entity Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcEntityCardinality()
	 * @generated
	 * @ordered
	 */
	protected CardinalityType srcEntityCardinality = SRC_ENTITY_CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrgEntityCardinality() <em>Trg Entity Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrgEntityCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final CardinalityType TRG_ENTITY_CARDINALITY_EDEFAULT = CardinalityType.ZERO;

	/**
	 * The cached value of the '{@link #getTrgEntityCardinality() <em>Trg Entity Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrgEntityCardinality()
	 * @generated
	 * @ordered
	 */
	protected CardinalityType trgEntityCardinality = TRG_ENTITY_CARDINALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.RELATIONSHIP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityType getSrcEntity() {
		if (srcEntity != null && srcEntity.eIsProxy()) {
			InternalEObject oldSrcEntity = (InternalEObject) srcEntity;
			srcEntity = (EntityType) eResolveProxy(oldSrcEntity);
			if (srcEntity != oldSrcEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY, oldSrcEntity, srcEntity));
			}
		}
		return srcEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetSrcEntity() {
		return srcEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrcEntity(EntityType newSrcEntity, NotificationChain msgs) {
		EntityType oldSrcEntity = srcEntity;
		srcEntity = newSrcEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY, oldSrcEntity, newSrcEntity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrcEntity(EntityType newSrcEntity) {
		if (newSrcEntity != srcEntity) {
			NotificationChain msgs = null;
			if (srcEntity != null)
				msgs = ((InternalEObject) srcEntity).eInverseRemove(this,
						ModuleeerPackage.ENTITY_TYPE__SRC_RELATIONSHIPTYPE, EntityType.class, msgs);
			if (newSrcEntity != null)
				msgs = ((InternalEObject) newSrcEntity).eInverseAdd(this,
						ModuleeerPackage.ENTITY_TYPE__SRC_RELATIONSHIPTYPE, EntityType.class, msgs);
			msgs = basicSetSrcEntity(newSrcEntity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY,
					newSrcEntity, newSrcEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EntityType getTrgEntity() {
		if (trgEntity != null && trgEntity.eIsProxy()) {
			InternalEObject oldTrgEntity = (InternalEObject) trgEntity;
			trgEntity = (EntityType) eResolveProxy(oldTrgEntity);
			if (trgEntity != oldTrgEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY, oldTrgEntity, trgEntity));
			}
		}
		return trgEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetTrgEntity() {
		return trgEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrgEntity(EntityType newTrgEntity, NotificationChain msgs) {
		EntityType oldTrgEntity = trgEntity;
		trgEntity = newTrgEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY, oldTrgEntity, newTrgEntity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrgEntity(EntityType newTrgEntity) {
		if (newTrgEntity != trgEntity) {
			NotificationChain msgs = null;
			if (trgEntity != null)
				msgs = ((InternalEObject) trgEntity).eInverseRemove(this,
						ModuleeerPackage.ENTITY_TYPE__TRG_RELATIONSHIPTYPE, EntityType.class, msgs);
			if (newTrgEntity != null)
				msgs = ((InternalEObject) newTrgEntity).eInverseAdd(this,
						ModuleeerPackage.ENTITY_TYPE__TRG_RELATIONSHIPTYPE, EntityType.class, msgs);
			msgs = basicSetTrgEntity(newTrgEntity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY,
					newTrgEntity, newTrgEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardinalityType getSrcEntityCardinality() {
		return srcEntityCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrcEntityCardinality(CardinalityType newSrcEntityCardinality) {
		CardinalityType oldSrcEntityCardinality = srcEntityCardinality;
		srcEntityCardinality = newSrcEntityCardinality == null ? SRC_ENTITY_CARDINALITY_EDEFAULT
				: newSrcEntityCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY_CARDINALITY, oldSrcEntityCardinality,
					srcEntityCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardinalityType getTrgEntityCardinality() {
		return trgEntityCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrgEntityCardinality(CardinalityType newTrgEntityCardinality) {
		CardinalityType oldTrgEntityCardinality = trgEntityCardinality;
		trgEntityCardinality = newTrgEntityCardinality == null ? TRG_ENTITY_CARDINALITY_EDEFAULT
				: newTrgEntityCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY_CARDINALITY, oldTrgEntityCardinality,
					trgEntityCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY:
			if (srcEntity != null)
				msgs = ((InternalEObject) srcEntity).eInverseRemove(this,
						ModuleeerPackage.ENTITY_TYPE__SRC_RELATIONSHIPTYPE, EntityType.class, msgs);
			return basicSetSrcEntity((EntityType) otherEnd, msgs);
		case ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY:
			if (trgEntity != null)
				msgs = ((InternalEObject) trgEntity).eInverseRemove(this,
						ModuleeerPackage.ENTITY_TYPE__TRG_RELATIONSHIPTYPE, EntityType.class, msgs);
			return basicSetTrgEntity((EntityType) otherEnd, msgs);
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
		case ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY:
			return basicSetSrcEntity(null, msgs);
		case ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY:
			return basicSetTrgEntity(null, msgs);
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
		case ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY:
			if (resolve)
				return getSrcEntity();
			return basicGetSrcEntity();
		case ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY:
			if (resolve)
				return getTrgEntity();
			return basicGetTrgEntity();
		case ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY_CARDINALITY:
			return getSrcEntityCardinality();
		case ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY_CARDINALITY:
			return getTrgEntityCardinality();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY:
			setSrcEntity((EntityType) newValue);
			return;
		case ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY:
			setTrgEntity((EntityType) newValue);
			return;
		case ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY_CARDINALITY:
			setSrcEntityCardinality((CardinalityType) newValue);
			return;
		case ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY_CARDINALITY:
			setTrgEntityCardinality((CardinalityType) newValue);
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
		case ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY:
			setSrcEntity((EntityType) null);
			return;
		case ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY:
			setTrgEntity((EntityType) null);
			return;
		case ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY_CARDINALITY:
			setSrcEntityCardinality(SRC_ENTITY_CARDINALITY_EDEFAULT);
			return;
		case ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY_CARDINALITY:
			setTrgEntityCardinality(TRG_ENTITY_CARDINALITY_EDEFAULT);
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
		case ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY:
			return srcEntity != null;
		case ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY:
			return trgEntity != null;
		case ModuleeerPackage.RELATIONSHIP_TYPE__SRC_ENTITY_CARDINALITY:
			return srcEntityCardinality != SRC_ENTITY_CARDINALITY_EDEFAULT;
		case ModuleeerPackage.RELATIONSHIP_TYPE__TRG_ENTITY_CARDINALITY:
			return trgEntityCardinality != TRG_ENTITY_CARDINALITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (srcEntityCardinality: ");
		result.append(srcEntityCardinality);
		result.append(", trgEntityCardinality: ");
		result.append(trgEntityCardinality);
		result.append(')');
		return result.toString();
	}

} //RelationshipTypeImpl
