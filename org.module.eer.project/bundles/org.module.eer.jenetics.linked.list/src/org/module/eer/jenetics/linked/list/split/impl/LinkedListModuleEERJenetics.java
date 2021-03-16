package org.module.eer.jenetics.linked.list.split.impl;

import io.jenetics.Genotype;
import io.jenetics.IntegerGene;
import io.jenetics.engine.Engine;
import io.jenetics.ext.moea.NSGA2Selector;
import io.jenetics.ext.moea.Vec;
import io.jenetics.util.Factory;

import org.eclipse.emf.common.util.EList;
import org.module.eer.jenetics.linked.list.chromosome.LinkedListChromosome;
import org.module.eer.jenetics.linked.list.chromosome.crossover.GreedyPartitionCrossover;
import org.module.eer.jenetics.linked.list.chromosome.mutator.GraftingMutator;
import org.module.eer.jenetics.linked.list.split.ff.ModularizableFF;
import org.module.eer.jenetics.split.ISplitModulEER;
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.Module;


public class LinkedListModuleEERJenetics implements ISplitModulEER {

	@Override
	public EList<MEERModel> splitModules(Module splittingModule) {
		int modularizableElementsSize = splittingModule.getModularizableElements().size();
		//Mutator Rate is set to 1, Crossover Rate is set to 0,25
		final double croosoverRate = 0.25;
		final double mutatorRate = 1;
		//Define the Genotype
		final Factory<Genotype<IntegerGene>> gtf = 
				Genotype.of(encondig(modularizableElementsSize));
		//Execution Environment
		final Engine<IntegerGene, Vec<double[]>> engine = Engine.builder(new ModularizableFF(), gtf)
				.alterers(new GreedyPartitionCrossover(croosoverRate), 
						new GraftingMutator(mutatorRate))
				.survivorsSelector(NSGA2Selector.ofVec())
				.populationSize(200)
				.build();		
		
		return null;
	}
	
	//Enconding is a chromosome of Integer Genes
	public static final Genotype<IntegerGene> encondig(int size) {
		return Genotype.of(LinkedListChromosome.of(size));
	}

}
