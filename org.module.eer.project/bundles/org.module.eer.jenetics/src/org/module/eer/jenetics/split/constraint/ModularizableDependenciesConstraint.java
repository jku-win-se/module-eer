package org.module.eer.jenetics.split.constraint;

import java.util.List;
import java.util.Random;

import org.module.eer.jenetics.config.utils.BitChromosomeUtils;
import org.module.eer.jenetics.config.utils.ModularizableElementUtils;

import io.jenetics.BitChromosome;
import io.jenetics.Chromosome;
import io.jenetics.EnumGene;
import io.jenetics.Genotype;
import io.jenetics.PermutationChromosome;
import io.jenetics.Phenotype;
import io.jenetics.engine.Constraint;
import io.jenetics.util.MSeq;



@SuppressWarnings("rawtypes")
public class ModularizableDependenciesConstraint implements Constraint{
	
	private List<BasicConstraint> listOfConstraints; 
	
	public ModularizableDependenciesConstraint(List<BasicConstraint> listOfConstraints) {
		this.listOfConstraints = listOfConstraints;
	}	
		
	@SuppressWarnings("unchecked")
	@Override
	public boolean test(Phenotype individual) {
		PermutationChromosome<Integer> pc = (PermutationChromosome<Integer>) individual.genotype().get(0);
		BitChromosome bc =  (BitChromosome) individual.genotype().get(1);
		for (BasicConstraint basicConstraint : listOfConstraints) {
			int chromosomePosition = getPositionInPChromosome(basicConstraint.getElementId(), pc);
			boolean search = false;
			for (int relatedElementId : basicConstraint.getElements()) {
				search = ModularizableElementUtils.belongsToTheSameModule(relatedElementId, chromosomePosition, pc, bc);
				if (search == true) 
					break;						
			}
			if (search == false)
				return false;
			if (basicConstraint.isSameModule() == true) { 
				if (basicConstraint.getElements().size() == 2) {
					int sourceId = basicConstraint.getElements().get(0);
					int targetId = basicConstraint.getElements().get(1);
					int sourceChromosomePosition = getPositionInPChromosome(sourceId, pc);
					search = ModularizableElementUtils.belongsToTheSameModule(targetId, sourceChromosomePosition, pc, bc);
					if (search == false)
						return false;
				}
				else
					throw new UnsupportedOperationException("The List of related elements must be 2"); 
			}			
		}	
		return true;
	}

	private int getPositionInPChromosome(int elementId, PermutationChromosome<Integer> pc) {
		for (int i = 0; i < pc.length(); i++) {
			EnumGene<Integer> enumGene = pc.get(i);		
			if (enumGene.allele() == elementId) {
				return i;
			}			
		}		
		throw new IllegalArgumentException("The Chromosome is invalid"); 
	}
	
	private int getPositionInPChromosome(MSeq<EnumGene<Integer>> repairPc, int elementId) {
		for (int i = 0; i < repairPc.length(); i++) {
			if (repairPc.get(i).allele() == elementId)
				return i;
		}
		throw new IllegalArgumentException("The Chromosome is invalid");
	}

	@SuppressWarnings("unchecked")
	@Override
	public Phenotype repair(Phenotype individual, long generation) {
		MSeq<EnumGene<Integer>> repairPc = MSeq.of((PermutationChromosome<Integer>) individual.genotype().get(0));
		BitChromosome bitChromosome = ((BitChromosome) individual.genotype().get(1));
		String stringBitChromosome = bitChromosome.toCanonicalString();
		for (BasicConstraint basicConstraint : listOfConstraints) {
			int chromosomePosition = getPositionInPChromosome(repairPc, basicConstraint.getElementId());
			boolean search = false;
			for (int relatedElementId : basicConstraint.getElements()) {
				search = ModularizableElementUtils.belongsToTheSameModule(relatedElementId, chromosomePosition, repairPc, stringBitChromosome);
				if (search == true)
					break;
			}
			if (search == false) {
				//Randomly select one of dependencies to put the element in its same module
				int randomId = new Random().nextInt(basicConstraint.getElements().size());
				int toPosition = getPositionInPChromosome(repairPc,basicConstraint.getElements().get(randomId));
				updateModuleOf(chromosomePosition, toPosition, repairPc, stringBitChromosome);
			}
			if (basicConstraint.isSameModule() == true) { 
				if (basicConstraint.getElements().size() == 2) {
					int sourceId = basicConstraint.getElements().get(0);
					int targetId = basicConstraint.getElements().get(1);
					int sourceChromosomePosition = getPositionInPChromosome(repairPc, sourceId);
					search = ModularizableElementUtils.belongsToTheSameModule(targetId, sourceChromosomePosition, repairPc, stringBitChromosome);
					if (search == false) {
						int targetChromosomePosition = getPositionInPChromosome(repairPc, targetId);
						//Randomly select one dependency to put the element in its same module
						int randomId = new Random().nextInt(2);
						if (randomId == 0)
							updateModuleOf(sourceChromosomePosition, targetChromosomePosition, repairPc, stringBitChromosome);
						else
							updateModuleOf(targetChromosomePosition, sourceChromosomePosition, repairPc, stringBitChromosome);
					}
				} else
					throw new IllegalArgumentException("The List of related elements must be 2");				
			}
		}		
		return newPhenotype(repairPc, stringBitChromosome, bitChromosome.oneProbability(),generation);
	}
	
	private void updateModuleOf(int position, int toPosition, MSeq<EnumGene<Integer>> repairPc, String stringBitChromosome) {
		StringBuilder strBuilder = new StringBuilder(stringBitChromosome);		
		removeSeparator(position, repairPc, strBuilder);
		// Swap elements positions until toPosition
		if (position > toPosition) {
			swapElementsBackwards(toPosition, position, repairPc);
			strBuilder.insert(toPosition, '0');
		} else {
			swapElementsForWards(position, toPosition, repairPc);
			strBuilder.insert(toPosition - 1, '0');
		}
	}
	
	private void swapElementsBackwards(int startPosition, int endPosition, MSeq<EnumGene<Integer>> repairPc) {
		for (int i = endPosition; i > startPosition; i--) {
			repairPc.swap(i-1, i);
		}		
	}

	private void swapElementsForWards(int startPosition, int endPosition, MSeq<EnumGene<Integer>> repairPc) {
		for (int i = startPosition; i < endPosition; i++) {
			repairPc.swap(i, i+1);
		}
	}
	
	private void removeSeparator(int position, MSeq<EnumGene<Integer>> repairPc, StringBuilder strBuilder) {
		if (position == 0)
			strBuilder.deleteCharAt(0);
		else if (position == (repairPc.length() - 1))
			strBuilder.deleteCharAt(strBuilder.length() - 1);
		else {
			char nextSeparator = strBuilder.charAt(position);
			char previousSeparator = strBuilder.charAt(position - 1);
			strBuilder.delete(position, position + 2);
			if (previousSeparator == nextSeparator && previousSeparator == '0') {
				strBuilder.insert(position, '0');
			} else {
				strBuilder.insert(position, '1');				
			}				
		}	
	}	
	
	@SuppressWarnings("unchecked")
	private Phenotype newPhenotype(MSeq<EnumGene<Integer>> repairPc, String stringBitChromosome, double probabilityOnes, long generation) {
		PermutationChromosome<Integer> pc = new PermutationChromosome<Integer>(repairPc.toISeq());
		BitChromosome bc = BitChromosomeUtils.of(stringBitChromosome, probabilityOnes);		
		final Genotype genoType = Genotype.of(
				(Chromosome) pc,
				(Chromosome) bc 
				);
		return Phenotype.of(genoType, generation);
	}	
}
