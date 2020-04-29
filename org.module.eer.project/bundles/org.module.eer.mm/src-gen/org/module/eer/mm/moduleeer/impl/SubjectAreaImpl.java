/**
 */
package org.module.eer.mm.moduleeer.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.module.eer.mm.moduleeer.ContextDataModel;
import org.module.eer.mm.moduleeer.ModuleeerPackage;
import org.module.eer.mm.moduleeer.SubjectArea;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.SubjectAreaImpl#getContextDataModels <em>Context Data Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubjectAreaImpl extends ContextDataModelImpl implements SubjectArea {
	/**
	 * The cached value of the '{@link #getContextDataModels() <em>Context Data Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextDataModels()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextDataModel> contextDataModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.SUBJECT_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContextDataModel> getContextDataModels() {
		if (contextDataModels == null) {
			contextDataModels = new EObjectContainmentEList<ContextDataModel>(ContextDataModel.class, this,
					ModuleeerPackage.SUBJECT_AREA__CONTEXT_DATA_MODELS);
		}
		return contextDataModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModuleeerPackage.SUBJECT_AREA__CONTEXT_DATA_MODELS:
			return ((InternalEList<?>) getContextDataModels()).basicRemove(otherEnd, msgs);
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
		case ModuleeerPackage.SUBJECT_AREA__CONTEXT_DATA_MODELS:
			return getContextDataModels();
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
		case ModuleeerPackage.SUBJECT_AREA__CONTEXT_DATA_MODELS:
			getContextDataModels().clear();
			getContextDataModels().addAll((Collection<? extends ContextDataModel>) newValue);
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
		case ModuleeerPackage.SUBJECT_AREA__CONTEXT_DATA_MODELS:
			getContextDataModels().clear();
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
		case ModuleeerPackage.SUBJECT_AREA__CONTEXT_DATA_MODELS:
			return contextDataModels != null && !contextDataModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubjectAreaImpl
