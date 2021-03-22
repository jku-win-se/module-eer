package org.module.eer.design.action.menu;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.module.eer.design.utils.ModulEERUtils;
import org.module.eer.jenetics.linked.list.split.impl.LinkedListModuleEERJenetics;
import org.module.eer.mm.moduleeer.Module;

public class LinkedListSplitAction implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Object objectModule = parameters.get("module");
		if (objectModule instanceof Module) {
			Module module = (Module) objectModule;
			Session session = SessionManager.INSTANCE.getSession(module);
			String projectName = ModulEERUtils.getProjectBySession(session);
			//Split Module
			ModulEERUtils.createProject(projectName,
										module, 
										new LinkedListModuleEERJenetics());		
		}		
	}
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}	
}
