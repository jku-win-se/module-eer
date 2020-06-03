package org.module.eer.design.split;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.module.eer.jenetics.action.CreateProjectMEERModule;
import org.module.eer.jenetics.split.impl.HierarchicalModuleEERJenetics;
import org.module.eer.jenetics.split.impl.SOHierarchicalModuleEERJenetics;
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.Module;


public class SplitModuleAction implements IExternalJavaAction {

	public SplitModuleAction() {
		// Do Nothing
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Object objectModule = parameters.get("module");
		if (objectModule instanceof Module) {
			Module module = (Module) objectModule;
			Session session = SessionManager.INSTANCE.getSession(module);
			String projectName = getProjectBySession(session);
			//Split Module
			EList<MEERModel> listOfModuleEER = new BasicEList<MEERModel>();
			int minModules = 0;
			int maxModule = 0;
			int allModules = 0;
			for (int i = 0; i < 30; i++) {
				MEERModel splittedModule = new HierarchicalModuleEERJenetics().splitModules(module);
				listOfModuleEER.add(splittedModule);
				int tempModuleSize = splittedModule.getModules().size();
				if(i == 0) {
					minModules = tempModuleSize;
					maxModule = tempModuleSize;
					allModules = tempModuleSize;
				} else {
					if(tempModuleSize < minModules) {
						minModules = tempModuleSize;
					}
					if(tempModuleSize > maxModule) {
						maxModule = tempModuleSize;
					}
					allModules += tempModuleSize;
				}
			}
			
			String appendix = ".split-Mi" + minModules + "-Ma" + maxModule + "Av" + (String.valueOf(allModules/30));
			
			//Create Modelling Project with new MEERModel Split Diagram
			new CreateProjectMEERModule(listOfModuleEER, projectName + appendix, 
					module.eResource()).createProject();
		}
			
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
