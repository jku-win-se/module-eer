package org.module.eer.jenetics.linked.list.split.ff;

import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.module.eer.jenetics.utils.Cohesive;
import org.module.eer.mm.moduleeer.ModularizableElement;

import io.jenetics.Genotype;
import io.jenetics.IntegerGene;

public class CohesiveLinkedList implements Function<Genotype<IntegerGene>, Cohesive>{

	private EList<ModularizableElement> modularizableElements;

	public CohesiveLinkedList(EList<ModularizableElement> modularizableElements) {
		this.modularizableElements = modularizableElements;
	}	
	
	@Override
	public Cohesive apply(Genotype<IntegerGene> t) {
		
		return new Cohesive();
	}
}
