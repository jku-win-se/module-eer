package org.module.eer.jenetics.action;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.module.eer.jenetics.split.stats.MEERStatistics;
import org.module.eer.mm.moduleeer.MEERModel;

public class CreateProjectMEERModule {
	
	private Map<MEERModel, MEERStatistics> mapModelbyStats;
	private String projectName;
	private Resource rootResource;
		
	public CreateProjectMEERModule(Map<MEERModel, MEERStatistics> mapOfModuleEER, String projectName, Resource rootResource) {
		this.mapModelbyStats = mapOfModuleEER;	
		this.projectName = projectName;
		this.rootResource = rootResource;
	}
	
	public void createProject() {		
			try {
				IProject iModelingProject = ModelingProjectManager.INSTANCE.createNewModelingProject(this.projectName, true, new NullProgressMonitor());
				final IWorkspaceRunnable create = new IWorkspaceRunnable(){
				@Override
				public void run(IProgressMonitor monitor) throws CoreException {
					//Create CSV Summary of the Stats
					try {
						String csvFile = iModelingProject.getLocationURI().toURL().getPath() + "/stats.csv"; 
						FileWriter csvOut = new FileWriter(csvFile);
						CSVPrinter printer = new CSVPrinter(csvOut, CSVFormat.DEFAULT.withDelimiter(',').withHeader("Model-Name",
								"Number of Modules", "Cohesion", "Coupling", "Relative Cohesion", "Standard Deviation", "Average Number of Modules"));
						//Create all resources
						int index = 0;
						for (Map.Entry<MEERModel, MEERStatistics> splittedModel : mapModelbyStats.entrySet()) {
							MEERModel meerModel = splittedModel.getKey();
							MEERStatistics stats = splittedModel.getValue();
							String modelName = rootResource.getURI().trimFileExtension().lastSegment() + "." + index;
							URI resourceURI = URI.createURI("platform:/resource/"+ projectName + "/" + modelName + ".moduleeer");
							Resource newResource = rootResource.getResourceSet().createResource(resourceURI);
							newResource.getContents().add(meerModel);
							newResource.save(Collections.EMPTY_MAP);				
							printer.printRecord(modelName, stats.getNumberOfModules(), stats.getCohesive().getCohesion(), stats.getCohesive().getCoupling(),
									stats.getCohesive().calculatesRelativeCohesion(), stats.getStandardDeviation(), stats.getAverageNumberOfModules());
							index++;
						}			
						printer.flush();
						printer.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
				}				
			};
			ResourcesPlugin.getWorkspace().run(create, new NullProgressMonitor());
			} catch (CoreException e) {				
				e.printStackTrace();
			}			
	}	
}
