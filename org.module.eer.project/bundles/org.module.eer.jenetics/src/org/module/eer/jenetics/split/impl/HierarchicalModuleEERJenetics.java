package org.module.eer.jenetics.split.impl;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.module.eer.jenetics.config.utils.ModularizableElementUtils;
import org.module.eer.jenetics.split.ISplitModulEER;
import org.module.eer.jenetics.split.constraint.ModularizableDependenciesConstraint;
import org.module.eer.jenetics.split.ff.ModuleFF;
import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.Module;
import org.module.eer.mm.moduleeer.impl.ModuleeerFactoryImpl;

import io.jenetics.BitChromosome;
import io.jenetics.Chromosome;
import io.jenetics.Genotype;
import io.jenetics.MultiPointCrossover;
import io.jenetics.Mutator;
import io.jenetics.PartialAlterer;
import io.jenetics.PartiallyMatchedCrossover;
import io.jenetics.PermutationChromosome;
import io.jenetics.Phenotype;
import io.jenetics.SwapMutator;
import io.jenetics.engine.Engine;
import io.jenetics.ext.moea.MOEA;
import io.jenetics.ext.moea.NSGA2Selector;
import io.jenetics.util.ISeq;
import io.jenetics.util.IntRange;

public class HierarchicalModuleEERJenetics implements ISplitModulEER {	
	
	@Override
	public MEERModel splitModules(Module splittingModule) {			
		int sizeOfModularizableElements = splittingModule.getModularizableElements().size();
		int optimalNumberOfModules = sizeOfModularizableElements/ModuleFF.OPTIMAL_SIZE_PER_MODULE;
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final Engine engine = Engine
				.builder(new MixedModularizableFF(splittingModule.getModularizableElements(),optimalNumberOfModules), encoding(sizeOfModularizableElements))
				//.constraint(new ModularizableDependenciesConstraint(ModularizableElementUtils.
				//		dependenciesOfAllModularizableElements(splittingModule.getModularizableElements())))
				.alterers(
						//The `PartiallyMatchedCrossover` is used on chromosome with index 0.
						PartialAlterer.of(new PartiallyMatchedCrossover(0.8), 0),
						//The `PartiallyMatchedCrossover` is used on chromosome with index 1.
						PartialAlterer.of(new MultiPointCrossover(0.8), 1),
						//The SwapMutator is used on chromosome with index 0.
						PartialAlterer.of(new SwapMutator(0.2), 0),
						//The `Mutator` is used on chromosome with index 1.
						PartialAlterer.of(new Mutator(0.2), 1)
						)
				.survivorsSelector(NSGA2Selector.ofVec())
				.populationSize(200)
				.build();
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		final ISeq<Phenotype> best = (ISeq<Phenotype>) engine.stream()
				.limit(700) 
				.peek(new StatisticsModulEER())
				.collect(MOEA.toParetoSet(IntRange.of(75, 100)));
		System.out.println(best);		
		return convertPhenotypeToModulEER(best.get(0),splittingModule);		
	}
	
	@SuppressWarnings("rawtypes")
	private MEERModel convertPhenotypeToModulEER(Phenotype phenotype, Module splittingModule) {
		MEERModel splittedMEERModel = ModuleeerFactoryImpl.eINSTANCE.createMEERModel();
		splittedMEERModel.setName("Splitted " + splittingModule.getName());
		Copier copier = new Copier();
		EList<Module> listOfModules = new BasicEList<Module>();
		Module currentModule = ModuleeerFactoryImpl.eINSTANCE.createModule();
		listOfModules.add(currentModule);
		final PermutationChromosome pc = (PermutationChromosome) phenotype.genotype().get(0);
		final BitChromosome bc = (BitChromosome) phenotype.genotype().get(1);
		for (int i = 0; i < bc.length(); i++) {
			currentModule.getModularizableElements().add( (ModularizableElement) 
					copier.copy(splittingModule.getModularizableElements().get((Integer) pc.get(i).allele())));
			if (bc.get(i).bit() == true) {
				currentModule = ModuleeerFactoryImpl.eINSTANCE.createModule();
				listOfModules.add(currentModule);
			}
		}
		currentModule.getModularizableElements().add( (ModularizableElement) 
				copier.copy(splittingModule.getModularizableElements().get((Integer) pc.get(bc.length()).allele())));
		copier.copyReferences();		
		splittedMEERModel.getModules().addAll(listOfModules);		
		return splittedMEERModel;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static final Genotype encoding(int size) {		
		return Genotype.of(
				(Chromosome) PermutationChromosome.ofInteger(size),
				(Chromosome) BitChromosome.of(size - 1)			
				);
	}
}
