/**
 */
package org.module.eer.mm.moduleeer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.module.eer.mm.moduleeer.Aggregation;
import org.module.eer.mm.moduleeer.Link;
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
 *   <li>{@link org.module.eer.mm.moduleeer.impl.RelationshipTypeImpl#getGeneralizes <em>Generalizes</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.RelationshipTypeImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.RelationshipTypeImpl#getAggregations <em>Aggregations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipTypeImpl extends ElementImpl implements RelationshipType {
	/**
	 * The cached value of the '{@link #getGeneralizes() <em>Generalizes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizes()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipType> generalizes;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The cached value of the '{@link #getAggregations() <em>Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<Aggregation> aggregations;

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
	public EList<RelationshipType> getGeneralizes() {
		if (generalizes == null) {
			generalizes = new EObjectResolvingEList<RelationshipType>(RelationshipType.class, this,
					ModuleeerPackage.RELATIONSHIP_TYPE__GENERALIZES);
		}
		return generalizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, ModuleeerPackage.RELATIONSHIP_TYPE__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aggregation> getAggregations() {
		if (aggregations == null) {
			aggregations = new EObjectContainmentEList<Aggregation>(Aggregation.class, this,
					ModuleeerPackage.RELATIONSHIP_TYPE__AGGREGATIONS);
		}
		return aggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModuleeerPackage.RELATIONSHIP_TYPE__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case ModuleeerPackage.RELATIONSHIP_TYPE__AGGREGATIONS:
			return ((InternalEList<?>) getAggregations()).basicRemove(otherEnd, msgs);
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
		case ModuleeerPackage.RELATIONSHIP_TYPE__GENERALIZES:
			return getGeneralizes();
		case ModuleeerPackage.RELATIONSHIP_TYPE__LINKS:
			return getLinks();
		case ModuleeerPackage.RELATIONSHIP_TYPE__AGGREGATIONS:
			return getAggregations();
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
		case ModuleeerPackage.RELATIONSHIP_TYPE__GENERALIZES:
			getGeneralizes().clear();
			getGeneralizes().addAll((Collection<? extends RelationshipType>) newValue);
			return;
		case ModuleeerPackage.RELATIONSHIP_TYPE__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case ModuleeerPackage.RELATIONSHIP_TYPE__AGGREGATIONS:
			getAggregations().clear();
			getAggregations().addAll((Collection<? extends Aggregation>) newValue);
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
		case ModuleeerPackage.RELATIONSHIP_TYPE__GENERALIZES:
			getGeneralizes().clear();
			return;
		case ModuleeerPackage.RELATIONSHIP_TYPE__LINKS:
			getLinks().clear();
			return;
		case ModuleeerPackage.RELATIONSHIP_TYPE__AGGREGATIONS:
			getAggregations().clear();
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
		case ModuleeerPackage.RELATIONSHIP_TYPE__GENERALIZES:
			return generalizes != null && !generalizes.isEmpty();
		case ModuleeerPackage.RELATIONSHIP_TYPE__LINKS:
			return links != null && !links.isEmpty();
		case ModuleeerPackage.RELATIONSHIP_TYPE__AGGREGATIONS:
			return aggregations != null && !aggregations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelationshipTypeImpl
