package org.module.eer.jenetics.split;

import java.util.ListIterator;
import java.util.function.Function;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.Module;
import org.module.eer.mm.moduleeer.SubjectArea;
import org.module.eer.mm.moduleeer.impl.ModuleeerFactoryImpl;

import io.jenetics.Genotype;
import io.jenetics.IntegerChromosome;
import io.jenetics.IntegerGene;

public class FlattenModuleEER extends SplitModuleEERJenetics {
	
	public FlattenModuleEER(int maxOfModules, int sizeOfElements,
			Function<Genotype<IntegerGene>, Double> modularizableFitnessFunction) {
		super(maxOfModules, sizeOfElements, modularizableFitnessFunction);		
	}
	
	@Override
	protected Genotype<IntegerGene> getGenotype() {
		//Which defines for each element which module it belongs to 
		return Genotype.of(IntegerChromosome.of(0,this.maxOfModules,this.sizeOfElements));
	}

	@Override
	public MEERModel fromGenoTypeToMEERModel(Module splittingModule, Genotype<IntegerGene> chromosome) {
		Copier copier = new Copier();
		EList<Module> listOfModules = createModules(chromosome.gene().max());
		ListIterator<IntegerGene> itResultingChromosome = chromosome.chromosome().listIterator();
		while (itResultingChromosome.hasNext()) {
			Integer elementIndex = itResultingChromosome.nextIndex();
			IntegerGene moduleElement = ((IntegerGene) itResultingChromosome.next());
			Integer moduleValue = moduleElement.intValue();
			Module module = listOfModules.get(moduleValue);
			module.getModularizableElements().
					add((ModularizableElement) copier.copy(splittingModule.getModularizableElements().get(elementIndex)));
			
		}	
		MEERModel resultMEERModel = copyAllExceptModule(splittingModule,listOfModules,copier);
		copier.copyReferences();	
		return resultMEERModel;
	}
	
	//TODO Copy the rest of the model except the splitting module
	private MEERModel copyAllExceptModule(Module splittingModule, EList<Module> listOfModules, Copier copier) {
		//EObject rootEOBject = splittingModule.eResource().getContents().get(0);
		MEERModel resultMEERModel = ModuleeerFactoryImpl.eINSTANCE.createMEERModel();
		resultMEERModel.setName("MEER1");
		//if (rootEOBject instanceof MEERModel) {
		//	resultMEERModel = (MEERModel) copier.copy(rootEOBject);
		//}
		//
		SubjectArea defaultSubjectArea = ModuleeerFactoryImpl.eINSTANCE.createSubjectArea();
		defaultSubjectArea.setName("SubjectArea1");
		defaultSubjectArea.getContextDataModels().addAll(listOfModules);
		resultMEERModel.getContextDataModels().add(defaultSubjectArea);
		return resultMEERModel;
	}

	private EList<Module> createModules(Integer max) {
		EList<Module> listOfModules = new BasicEList<Module>();
		for (int i = 0; i <= max; i++) {
			Module module = ModuleeerFactoryImpl.eINSTANCE.createModule();
			module.setName("M" + (i+1));
			listOfModules.add(module);
		}
		return listOfModules;		
	}
}
