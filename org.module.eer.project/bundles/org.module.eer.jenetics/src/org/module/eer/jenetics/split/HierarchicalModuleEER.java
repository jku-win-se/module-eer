package org.module.eer.jenetics.split;

import java.util.function.Function;

import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.Module;

import io.jenetics.Genotype;
import io.jenetics.IntegerChromosome;
import io.jenetics.IntegerGene;

public class HierarchicalModuleEER extends SplitModuleEERJenetics{
	
	private int maxOfSubjectAreas;

	public HierarchicalModuleEER(int maxOfModules, int maxOfSubjectAreas, int sizeOfElements,
			Function<Genotype<IntegerGene>, Double> modularizableFitnessFunction) {
		super(maxOfModules, sizeOfElements, modularizableFitnessFunction);
		this.maxOfSubjectAreas = maxOfSubjectAreas;
	}

	@Override
	protected Genotype<IntegerGene> getGenotype() {
		return Genotype.of(
				//Part One of the Genotype 
				//Which defines for each ModularizableElement the Module to be assigned
				IntegerChromosome.of(0, this.maxOfModules, this.sizeOfElements),
				//Part two of the Genotype
				//Which defines for each Module the SubjectArea to be assigned
				IntegerChromosome.of(0, this.maxOfSubjectAreas, this.maxOfModules)								
				);
	}
	
	//TODO Convert the Genotype in a Hierarchical Model
	@Override
	public MEERModel fromGenoTypeToMEERModel(Module splittingModule, Genotype<IntegerGene> chromosome) {
		return null;
	}
}
