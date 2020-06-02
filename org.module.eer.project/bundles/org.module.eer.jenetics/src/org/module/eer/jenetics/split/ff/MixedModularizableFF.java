package org.module.eer.jenetics.split.ff;

import io.jenetics.Genotype;
import io.jenetics.Optimize;
import io.jenetics.ext.moea.Vec;
import io.jenetics.ext.moea.VecFactory;

import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.module.eer.mm.moduleeer.ModularizableElement;

@SuppressWarnings("rawtypes")
public class MixedModularizableFF implements Function<Genotype, Vec<double[]>>{
	
	private EList<ModularizableElement> modularizableElements;
	private int optimalNumberOfModules;
	
	public MixedModularizableFF(EList<ModularizableElement> modularizableElements, int optimalNumberOfModules) {
		this.modularizableElements = modularizableElements;
		this.optimalNumberOfModules = optimalNumberOfModules;
	}
	
	private static final VecFactory<double[]> VEC_FACTORY =
			VecFactory.ofDoubleVec(
				Optimize.MAXIMUM,//Cohesion	
				Optimize.MINIMUM,//Coupling
				//Optimize.MINIMUM,//Moody's Principles number of modules.
				//Optimize.MINIMUM,//Standard deviation
				Optimize.MINIMUM,//Minimize Number of Modules
				Optimize.MINIMUM //Average Number of Classes per Module
	);	

	@Override
	public Vec<double[]> apply(Genotype genotype) {		
		return VEC_FACTORY.newVec(new double[] {
				new CohesionFF(this.modularizableElements).apply(genotype),
				new CouplingFF(this.modularizableElements).apply(genotype),
				//new ModuleFF(this.optimalNumberOfModules).apply(genotype),
				//new BalancedFF().apply(genotype),
				new NumberOfClustersFF().apply(genotype),
				new AverageClassesPerModule().apply(genotype)
			});
	}
}
