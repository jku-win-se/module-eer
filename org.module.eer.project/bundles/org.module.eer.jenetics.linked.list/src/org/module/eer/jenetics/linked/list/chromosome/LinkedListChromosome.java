package org.module.eer.jenetics.linked.list.chromosome;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import io.jenetics.Chromosome;
import io.jenetics.IntegerGene;
import io.jenetics.util.ISeq;
import io.jenetics.util.MSeq;

public class LinkedListChromosome implements Chromosome<IntegerGene>{

	private ISeq<IntegerGene> linkedListSeq;
		
	public LinkedListChromosome(ISeq<IntegerGene> linkedListSeq) {
		this.linkedListSeq = linkedListSeq;		
	}
	
	public static LinkedListChromosome of(int size) {
		ISeq<IntegerGene> newSeq = seq(size);
		return new LinkedListChromosome(newSeq);
	}
	
	public static ISeq<IntegerGene> seq(int size) {
		MSeq<IntegerGene> genes = MSeq.ofLength(size);
		Random integerRandom = new Random();
		List<Integer> numberOfGenesSameValue = new ArrayList<Integer>(size);
		//Initialize with zeros
		//Collections.fill(listOfCounts, 0);
		for (int i = 0; i < genes.size(); i++) {
			int value = integerRandom.nextInt(size);
			//Check that it is Fulfilled the First Constraint (right part)
			//(1. The integer value stored in each gene is greater than or equal to its index)
			if (value > i && fullfilledSecondConstraint(value, i, numberOfGenesSameValue) == true) {
				genes.set(i, IntegerGene.of(value, 0, size));//Add the gene
				numberOfGenesSameValue.set(value, numberOfGenesSameValue.get(value) + 1);//Update table 
			} else {
				i--;
			}
		}		
		return ISeq.of(genes);
	}
	
	//Check that it is Fulfilled the Second Constraint
	// 2. No two genes in the chromosome have the same value with the exception that at most two genes
	//can have the same integer value if the integer is the index of an ending node
	private static boolean fullfilledSecondConstraint(int value, int pos, List<Integer> numberOfGenesSameValue) {
		if (numberOfGenesSameValue.get(value) + 1 > 2) {
			return false;
		} else if (numberOfGenesSameValue.get(value) + 1 == 2) {
			//Ending node
			if (pos == value) {
				return true;
			} else {
				return false;
			}				
		}
		return false;
	}

	@Override
	public IntegerGene get(int index) {
		return this.linkedListSeq.get(index);
	}

	@Override
	public int length() {
		return this.linkedListSeq.size();
	}

	@Override
	public Chromosome<IntegerGene> newInstance() {
		ISeq<IntegerGene> newSeq = seq(this.linkedListSeq.length());
		return new LinkedListChromosome(newSeq);
	}

	@Override
	public Chromosome<IntegerGene> newInstance(ISeq<IntegerGene> genes) {
		return new LinkedListChromosome(genes); 
	}
}
