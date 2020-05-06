/**
 */
package org.module.eer.mm.moduleeer.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.module.eer.mm.moduleeer.Aggregation;
import org.module.eer.mm.moduleeer.CardinalityType;
import org.module.eer.mm.moduleeer.CompletenessType;
import org.module.eer.mm.moduleeer.ModuleeerPackage;
import org.module.eer.mm.moduleeer.RelationshipType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.AggregationImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.AggregationImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.AggregationImpl#getCompletness <em>Completness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregationImpl extends NameElementImpl implements Aggregation {
	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected RelationshipType to;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final CardinalityType CARDINALITY_EDEFAULT = CardinalityType.ONE_TO_ONE;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected CardinalityType cardinality = CARDINALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletness() <em>Completness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletness()
	 * @generated
	 * @ordered
	 */
	protected static final CompletenessType COMPLETNESS_EDEFAULT = CompletenessType.PARTIAL;

	/**
	 * The cached value of the '{@link #getCompletness() <em>Completness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletness()
	 * @generated
	 * @ordered
	 */
	protected CompletenessType completness = COMPLETNESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.AGGREGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipType getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject) to;
			to = (RelationshipType) eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModuleeerPackage.AGGREGATION__TO, oldTo,
							to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(RelationshipType newTo) {
		RelationshipType oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleeerPackage.AGGREGATION__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardinalityType getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardinality(CardinalityType newCardinality) {
		CardinalityType oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleeerPackage.AGGREGATION__CARDINALITY,
					oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompletenessType getCompletness() {
		return completness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletness(CompletenessType newCompletness) {
		CompletenessType oldCompletness = completness;
		completness = newCompletness == null ? COMPLETNESS_EDEFAULT : newCompletness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModuleeerPackage.AGGREGATION__COMPLETNESS,
					oldCompletness, completness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ModuleeerPackage.AGGREGATION__TO:
			if (resolve)
				return getTo();
			return basicGetTo();
		case ModuleeerPackage.AGGREGATION__CARDINALITY:
			return getCardinality();
		case ModuleeerPackage.AGGREGATION__COMPLETNESS:
			return getCompletness();
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
		case ModuleeerPackage.AGGREGATION__TO:
			setTo((RelationshipType) newValue);
			return;
		case ModuleeerPackage.AGGREGATION__CARDINALITY:
			setCardinality((CardinalityType) newValue);
			return;
		case ModuleeerPackage.AGGREGATION__COMPLETNESS:
			setCompletness((CompletenessType) newValue);
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
		case ModuleeerPackage.AGGREGATION__TO:
			setTo((RelationshipType) null);
			return;
		case ModuleeerPackage.AGGREGATION__CARDINALITY:
			setCardinality(CARDINALITY_EDEFAULT);
			return;
		case ModuleeerPackage.AGGREGATION__COMPLETNESS:
			setCompletness(COMPLETNESS_EDEFAULT);
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
		case ModuleeerPackage.AGGREGATION__TO:
			return to != null;
		case ModuleeerPackage.AGGREGATION__CARDINALITY:
			return cardinality != CARDINALITY_EDEFAULT;
		case ModuleeerPackage.AGGREGATION__COMPLETNESS:
			return completness != COMPLETNESS_EDEFAULT;
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(", completness: ");
		result.append(completness);
		result.append(')');
		return result.toString();
	}

} //AggregationImpl
