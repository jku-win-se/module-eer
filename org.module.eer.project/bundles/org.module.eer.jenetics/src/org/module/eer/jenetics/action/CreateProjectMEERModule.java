package org.module.eer.jenetics.action;

import java.io.IOException;
import java.util.Collections;
import java.util.ListIterator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.module.eer.mm.moduleeer.MEERModel;

public class CreateProjectMEERModule {
	
	private EList<MEERModel> meerModel;
	private String projectName;
	private Resource rootResource;
	
	public CreateProjectMEERModule(EList<MEERModel> meerModel, String projectName, Resource rootResource) {
		this.meerModel = meerModel;	
		this.projectName = projectName;
		this.rootResource = rootResource;
	}
	
	public void createProject() {
		try {
			ModelingProjectManager.INSTANCE.createNewModelingProject(this.projectName, true, new NullProgressMonitor());
			//Create all resources
			ListIterator<MEERModel> itMEERModel = meerModel.listIterator();
			while (itMEERModel.hasNext()) {
				int index = itMEERModel.nextIndex();
				MEERModel meerModel = (MEERModel) itMEERModel.next();
				URI resourceURI = URI.createURI("platform:/resource/"+ this.projectName + "/" + this.rootResource.getURI().trimFileExtension().lastSegment() 
						+ "." + index + ".moduleeer");
				Resource newResource = rootResource.getResourceSet().createResource(resourceURI);
				newResource.getContents().add(meerModel);
				newResource.save(Collections.EMPTY_MAP);
			}
			
		} catch (CoreException | IOException e) {
			e.printStackTrace();
		}
	}	
}
