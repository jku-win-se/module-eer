package org.module.eer.jenetics.linked.list.split.ff;

import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.module.eer.jenetics.utils.Cohesive;
import org.module.eer.mm.moduleeer.ModularizableElement;

import io.jenetics.Genotype;
import io.jenetics.IntegerGene;
import io.jenetics.Optimize;
import io.jenetics.ext.moea.Vec;
import io.jenetics.ext.moea.VecFactory;

public class ModularizableFF implements Function<Genotype<IntegerGene>, Vec<double[]>>{

	private EList<ModularizableElement> modularizableElements;
	
	public ModularizableFF(EList<ModularizableElement> modularizableElements) {
		this.modularizableElements = modularizableElements;		
	}	
	
	@Override
	public Vec<double[]> apply(Genotype<IntegerGene> genotype) {
		Cohesive cohesiveLinkedList = new CohesiveLinkedList(this.modularizableElements).apply(genotype);
		return VEC_FACTORY.newVec(new double[] {
				cohesiveLinkedList.getCohesion(), //Cohesion
				cohesiveLinkedList.getCoupling(), //Coupling
				new StandardDeviation().apply(genotype) // Standard Deviation
			});
	}
	
	private static final VecFactory<double[]> VEC_FACTORY =
			VecFactory.ofDoubleVec(
				Optimize.MAXIMUM,//Cohesion	
				Optimize.MINIMUM,//Coupling
				Optimize.MINIMUM//Standard deviation
	);	
}
