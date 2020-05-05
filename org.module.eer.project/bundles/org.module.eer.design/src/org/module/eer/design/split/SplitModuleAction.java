package org.module.eer.design.split;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
/*
import org.module.eer.jenetics.action.CreateProjectMEERModule;
import org.module.eer.jenetics.config.ModularizableDependenciesConstraint;
import org.module.eer.jenetics.config.ff.ModularizableFF;
import org.module.eer.jenetics.config.principles.MoodyPrinciples;
import org.module.eer.jenetics.config.utils.ModularizableElementUtils;
import org.module.eer.jenetics.split.FlattenModuleEER;
*/
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.Module;

import io.jenetics.Genotype;
import io.jenetics.IntegerGene;

public class SplitModuleAction implements IExternalJavaAction {

	public SplitModuleAction() {
		// Do Nothing
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		/*
		Object objectModule = parameters.get("module");
		if (objectModule instanceof Module) {
			Module module = (Module) objectModule;
			Session session = SessionManager.INSTANCE.getSession(module);
			String projectName = getProjectBySession(session);
			//Split Module			
			int maxOfModules = new MoodyPrinciples(module.getModularizableElements().size()).getOptimimalNumberOfModules();
			Function<Genotype<IntegerGene>, Double> modularizableFF= new ModularizableFF(module.getModularizableElements());
			Map<Integer, List<Integer>> constraint = ModularizableElementUtils.dependenciesOfAllModularizableElements(module.getModularizableElements());			
			FlattenModuleEER flattenModuleEER = new FlattenModuleEER(maxOfModules,module.getModularizableElements().size(), modularizableFF);
			ModularizableDependenciesConstraint constraintImplementation = new ModularizableDependenciesConstraint(constraint);
			flattenModuleEER.setModuleConstraint(constraintImplementation);
			MEERModel splitModuleMEER = flattenModuleEER.fromGenoTypeToMEERModel(module, flattenModuleEER.bestResult());
			EList<MEERModel> listOfModuleEER = new BasicEList<MEERModel>();
			listOfModuleEER.add(splitModuleMEER);
			//Create Modelling Project with new MEERModel Split Diagram
			new CreateProjectMEERModule(listOfModuleEER, projectName + ".split", 
					module.eResource()).createProject();
		}
		*/		
	}	

	private String getProjectBySession(Session session) {
		Resource sessionResource = session.getSessionResource();		
		return sessionResource.getURI().segment(1);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
