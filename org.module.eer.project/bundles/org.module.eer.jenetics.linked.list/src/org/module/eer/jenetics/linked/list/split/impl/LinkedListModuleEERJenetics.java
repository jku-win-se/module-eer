package org.module.eer.jenetics.linked.list.split.impl;

import io.jenetics.Genotype;
import io.jenetics.IntegerGene;
import io.jenetics.Phenotype;
import io.jenetics.engine.Engine;
import io.jenetics.ext.moea.MOEA;
import io.jenetics.ext.moea.NSGA2Selector;
import io.jenetics.ext.moea.Vec;
import io.jenetics.util.Factory;
import io.jenetics.util.ISeq;
import io.jenetics.util.IntRange;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.module.eer.jenetics.linked.list.chromosome.LinkedListChromosome;
import org.module.eer.jenetics.linked.list.chromosome.crossover.GreedyPartitionCrossover;
import org.module.eer.jenetics.linked.list.chromosome.mutator.GraftingMutator;
import org.module.eer.jenetics.linked.list.split.ff.ModularizableFF;
import org.module.eer.jenetics.split.ISplitModulEER;
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.Module;


public class LinkedListModuleEERJenetics implements ISplitModulEER {

	public ISeq<Phenotype<IntegerGene, Vec<double[]>>> performParetoSet(Module splittingModule) {
		int modularizableElementsSize = splittingModule.getModularizableElements().size();
		//Mutator Rate is set to 1, Crossover Rate is set to 0,25
		final double croosoverRate = 0.25;
		final double mutatorRate = 1;
		//Define the Genotype
		final Factory<Genotype<IntegerGene>> gtf = 
				Genotype.of(encondig(modularizableElementsSize));
		//Execution Environment
		final Engine<IntegerGene, Vec<double[]>> engine = Engine.builder(
				new ModularizableFF(splittingModule.getModularizableElements()), gtf)
				.alterers(new GreedyPartitionCrossover(croosoverRate), 
						new GraftingMutator(mutatorRate))
				.survivorsSelector(NSGA2Selector.ofVec())
				.populationSize(300)
				.build();		
		
		final ISeq<Phenotype<IntegerGene, Vec<double[]>>> seqPhenotypes = 
				(ISeq<Phenotype<IntegerGene, Vec<double[]>>>) engine.stream()
				.limit(300)				
				.collect(MOEA.toParetoSet(IntRange.of(75, 100)));
		
		return seqPhenotypes;
	}
	
	
	@Override
	public EList<MEERModel> splitModules(Module splittingModule) {
		final ISeq<Phenotype<IntegerGene, Vec<double[]>>> seqPhenotypes = performParetoSet(splittingModule);		
		EList<MEERModel> resultOfSplittingModels = new BasicEList<MEERModel>();
		for (Phenotype<IntegerGene, Vec<double[]>> phenotype : seqPhenotypes) {
			convertPhenotypeToModulEER(phenotype, splittingModule);
		}		
		return resultOfSplittingModels;
	}
	
	//Convert Phenotype to the actual splitted module
	private MEERModel convertPhenotypeToModulEER(Phenotype<IntegerGene, Vec<double[]>> phenotype, Module splittingModule) {
		throw new UnsupportedOperationException("Not supported");
	}
	
	//Enconding is a chromosome of Integer Genes
	public static final Genotype<IntegerGene> encondig(int size) {
		return Genotype.of(LinkedListChromosome.of(size));
	}

}
