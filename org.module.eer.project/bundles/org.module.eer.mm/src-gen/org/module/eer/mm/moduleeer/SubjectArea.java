/**
 */
package org.module.eer.mm.moduleeer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.module.eer.mm.moduleeer.SubjectArea#getContextDataModels <em>Context Data Models</em>}</li>
 * </ul>
 *
 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getSubjectArea()
 * @model
 * @generated
 */
public interface SubjectArea extends ContextDataModel {
	/**
	 * Returns the value of the '<em><b>Context Data Models</b></em>' containment reference list.
	 * The list contents are of type {@link org.module.eer.mm.moduleeer.ContextDataModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Data Models</em>' containment reference list.
	 * @see org.module.eer.mm.moduleeer.ModuleeerPackage#getSubjectArea_ContextDataModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextDataModel> getContextDataModels();

} // SubjectArea
