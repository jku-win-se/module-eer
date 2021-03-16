package org.module.eer.jenetics.linked.list.chromosome.crossover;

import io.jenetics.Alterer;
import io.jenetics.AltererResult;
import io.jenetics.IntegerGene;
import io.jenetics.Phenotype;
import io.jenetics.ext.moea.Vec;
import io.jenetics.util.Seq;

public class GreedyPartitionCrossover implements Alterer<IntegerGene, Vec<double[]>>{
	
	private double probability;
	
	public GreedyPartitionCrossover(final double probability) {
		this.probability = probability;
	}

	@Override
	public AltererResult<IntegerGene, Vec<double[]>> alter(Seq<Phenotype<IntegerGene, Vec<double[]>>> arg0, long arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
