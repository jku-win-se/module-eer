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
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.ModuleeerPackage;

import org.module.eer.mm.moduleeer.subsystem.ModuleSubsystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MEER Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.MEERModelImpl#getContextDataModels <em>Context Data Models</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.impl.MEERModelImpl#getSubsystems <em>Subsystems</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MEERModelImpl extends NameElementImpl implements MEERModel {
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
	 * The cached value of the '{@link #getSubsystems() <em>Subsystems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystems()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleSubsystem> subsystems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MEERModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModuleeerPackage.Literals.MEER_MODEL;
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
					ModuleeerPackage.MEER_MODEL__CONTEXT_DATA_MODELS);
		}
		return contextDataModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModuleSubsystem> getSubsystems() {
		if (subsystems == null) {
			subsystems = new EObjectContainmentEList<ModuleSubsystem>(ModuleSubsystem.class, this,
					ModuleeerPackage.MEER_MODEL__SUBSYSTEMS);
		}
		return subsystems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModuleeerPackage.MEER_MODEL__CONTEXT_DATA_MODELS:
			return ((InternalEList<?>) getContextDataModels()).basicRemove(otherEnd, msgs);
		case ModuleeerPackage.MEER_MODEL__SUBSYSTEMS:
			return ((InternalEList<?>) getSubsystems()).basicRemove(otherEnd, msgs);
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
		case ModuleeerPackage.MEER_MODEL__CONTEXT_DATA_MODELS:
			return getContextDataModels();
		case ModuleeerPackage.MEER_MODEL__SUBSYSTEMS:
			return getSubsystems();
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
		case ModuleeerPackage.MEER_MODEL__CONTEXT_DATA_MODELS:
			getContextDataModels().clear();
			getContextDataModels().addAll((Collection<? extends ContextDataModel>) newValue);
			return;
		case ModuleeerPackage.MEER_MODEL__SUBSYSTEMS:
			getSubsystems().clear();
			getSubsystems().addAll((Collection<? extends ModuleSubsystem>) newValue);
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
		case ModuleeerPackage.MEER_MODEL__CONTEXT_DATA_MODELS:
			getContextDataModels().clear();
			return;
		case ModuleeerPackage.MEER_MODEL__SUBSYSTEMS:
			getSubsystems().clear();
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
		case ModuleeerPackage.MEER_MODEL__CONTEXT_DATA_MODELS:
			return contextDataModels != null && !contextDataModels.isEmpty();
		case ModuleeerPackage.MEER_MODEL__SUBSYSTEMS:
			return subsystems != null && !subsystems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MEERModelImpl
