/**
 */
package org.module.eer.mm.moduleeer;

import org.eclipse.emf.common.util.EList;

import org.module.eer.mm.moduleeer.subsystem.ModuleSubsystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MEER Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.MEERModel#getContextDataModels <em>Context Data Models</em>}</li>
 *   <li>{@link org.module.eer.mm.moduleeer.MEERModel#getSubsystems <em>Subsystems</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getMEERModel()
 * @model
 * @generated
 */
public interface MEERModel extends NameElement {
	/**
	 * Returns the value of the '<em><b>Context Data Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.ContextDataModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Data Models</em>' containment reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getMEERModel_ContextDataModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextDataModel> getContextDataModels();

	/**
	 * Returns the value of the '<em><b>Subsystems</b></em>' containment reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.subsystem.ModuleSubsystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystems</em>' containment reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getMEERModel_Subsystems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleSubsystem> getSubsystems();

} // MEERModel
