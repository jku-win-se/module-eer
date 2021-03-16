package org.module.eer.jenetics.linked.list.split.constraint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.jenetics.Chromosome;
import io.jenetics.IntegerGene;
import io.jenetics.Phenotype;
import io.jenetics.engine.Constraint;
import io.jenetics.util.MSeq;

@Deprecated
public class LinkedListEncodingConstraint implements Constraint<IntegerGene, Integer>{

	@Override
	public boolean test(Phenotype<IntegerGene, Integer> individual) {
		// Do nothing
		// The repair method will repair the Chromosome if need it
		return false;
	}

	@Override
	public Phenotype<IntegerGene, Integer> repair(Phenotype<IntegerGene, Integer> individual, long generation) {
		MSeq<IntegerGene> mutChromosome = MSeq.of(individual.genotype().chromosome());
		//Count the number of genes of the same value
		List<Integer> numberOfGenesSameValue = new ArrayList<Integer>(mutChromosome.size());
		//Initialize with zeros
		//Collections.fill(listOfCounts, 0);
		for (int i = 0; i < mutChromosome.size(); i++) {
			int geneValue = mutChromosome.get(i).allele();
			//Violates the First constraint (the integer value stored in each gene is greater than or equal to its index)
			if (geneValue < i) {
				//repair, update gene
				
			}
			//Violates the Second Constraint
			//Two genes cannot have the same value, 
			//with the exception that two genes can have the same value if one of them is an ending node
			else if (numberOfGenesSameValue.get(geneValue) + 1 > 2 || //There are more than two genes that have the same value
					//Two genes has this value, but it is not an ending node
					(numberOfGenesSameValue.get(geneValue) + 1 == 2 && i == geneValue)) {
				//repair, update gene
			}			
			//Update numberOfGenesSameValue
			numberOfGenesSameValue.set(geneValue, numberOfGenesSameValue.get(geneValue) + 1);			
		}				
		return null;
	}
	
	//Change the gene with a correct value
	public IntegerGene repair() {
		return null;
	}

}
