package org.module.eer.jenetics.config.ff;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import com.google.common.primitives.Doubles;
import io.jenetics.Genotype;
import io.jenetics.IntegerGene;

public class ModularizableBalancedFF implements Function<Genotype<IntegerGene>, Double> {

	@Override
	public Double apply(Genotype<IntegerGene> genotype) {
		int max = genotype.chromosome().gene().max();
		Map<Integer, Integer> elementsPerModule = initializeElementsPerModuleMap(max);
		Iterator<IntegerGene> itGenes = genotype.chromosome().iterator();
		while (itGenes.hasNext()) {
			Integer module = itGenes.next().intValue();
			elementsPerModule.replace(module, elementsPerModule.get(module) + 1);
		}
		return standardDeviation(elementsPerModule);
	}
	
	private double standardDeviation(Map<Integer, Integer> elementsPerModule) {
		StandardDeviation stats = new StandardDeviation(false);		
		return stats.evaluate(Doubles.toArray(elementsPerModule.values()));		
	}
	
	private Map<Integer, Integer> initializeElementsPerModuleMap(int max) {
		Map<Integer, Integer> elementsPerModule = new HashMap<Integer, Integer>(max + 1);
		for (int i = 0; i < max + 1; i++) {
			elementsPerModule.put(i, 0);
		}		
		return elementsPerModule;
	}
}
