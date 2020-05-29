package org.module.eer.jenetics.config.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.util.EList;
import org.module.eer.jenetics.split.constraint.BasicConstraint;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.RelationshipType;
import org.module.eer.mm.moduleeer.procedure.AccessElement;
import org.module.eer.mm.moduleeer.procedure.Procedure;

import io.jenetics.BitChromosome;
import io.jenetics.BitGene;
import io.jenetics.EnumGene;
import io.jenetics.PermutationChromosome;
import io.jenetics.util.MSeq;

public class ModularizableElementUtils {
	
	public static boolean belongsToTheSameModule(int modularizableId, Integer startPosition, PermutationChromosome<Integer> pc, BitChromosome bc) {
		return belongsSameModuleForward(modularizableId, startPosition, pc, bc) || 
				belongsSameModuleBackward(modularizableId, startPosition, pc, bc);		
	}
	
	public static boolean belongsToTheSameModule(int modularizableId, int chromosomePosition, MSeq<EnumGene<Integer>> repairPc, String stringBitChromosome) {
		return belongsSameModuleForward(modularizableId, chromosomePosition, repairPc, stringBitChromosome) || 
				belongsSameModuleBackward(modularizableId, chromosomePosition, repairPc, stringBitChromosome);
	}		
	
	public static boolean belongsSameModuleForward(int entityTypeId, Integer startPosition, PermutationChromosome<Integer> pc, BitChromosome bc) {
		for (int i = startPosition; i < bc.length(); i++) {
			BitGene bitGene = bc.get(i);
			if (bitGene.bit() == false) {
				if (pc.get(i + 1).allele().equals(entityTypeId) == true) {
					return true;
				}
			} else
				break;
		}		
		return false;		
	}
	
	public static boolean belongsSameModuleBackward(int entityTypeId, int startPosition, PermutationChromosome<Integer> pc, BitChromosome bc) {
		for (int i = startPosition; i > 0; i--) {
			BitGene bitGene = bc.get(i-1);
			if (bitGene.bit() == false) {
				if (pc.get(i - 1).allele().equals(entityTypeId) == true) {
					return true;
				}
			} else
				break;
		}		
		return false;
	}
	
	private static boolean belongsSameModuleForward(int modularizableId, int startPosition, MSeq<EnumGene<Integer>> repairPc, String stringBitChromosome) {
		int nextSetPosition = stringBitChromosome.indexOf("1",startPosition);
		for (int i = startPosition + 1; i <= nextSetPosition; i++) {
			if (repairPc.get(i).allele() == modularizableId)
				return true;
		}			
		return false;
	}
	
	private static boolean belongsSameModuleBackward(int modularizableId, int startPosition, MSeq<EnumGene<Integer>> repairPc, String stringBitChromosome) {
		int previousSetPosition = stringBitChromosome.lastIndexOf("1",startPosition);
		if (previousSetPosition != -1) {
			for (int i = startPosition-1; i > previousSetPosition; i--) {
				if (repairPc.get(i).allele() == modularizableId)
					return true;
			}
		}
		return false;
	}
	
	/*
	 * Map with all constraints of EntityType, RelationshipType, Procedure
	 */	
	public static List<BasicConstraint> dependenciesOfAllModularizableElements(EList<ModularizableElement> listOfElements) {
		ListIterator<ModularizableElement> itModularizableElement = listOfElements.listIterator();
		List<BasicConstraint> listOfConstraints = new LinkedList<BasicConstraint>();
		while (itModularizableElement.hasNext()) {
			int elementIndex = itModularizableElement.nextIndex();
			ModularizableElement modularizableElement = itModularizableElement.next();
			if (modularizableElement instanceof RelationshipType) 
				relationshipTypeDependency(elementIndex, listOfElements, (RelationshipType) modularizableElement, listOfConstraints);			
			else if (modularizableElement instanceof Procedure)
				procedureDependency(elementIndex, listOfElements, (Procedure) modularizableElement, listOfConstraints);
		}
		
		return listOfConstraints;
	}
	
	private static void relationshipTypeDependency(int elementIndex, EList<ModularizableElement> listOfElements, 
			RelationshipType relationshipType, List<BasicConstraint> listOfConstraints) {
		List<Integer> listOfDependencies = new LinkedList<Integer>();		
		int sourceIndexElement = listOfElements.indexOf(relationshipType.getLinksToEntities().get(0).getEntity());
		int targetIndexElement = listOfElements.indexOf(relationshipType.getLinksToEntities().get(1).getEntity());
		boolean sameModule = false;
		if (relationshipType.getLinksToEntities().get(0).getEntity().getLinks().size() == 1 &&
				relationshipType.getLinksToEntities().get(1).getEntity().getLinks().size() == 1) {
			listOfDependencies.add(sourceIndexElement);
			listOfDependencies.add(targetIndexElement);
			sameModule = true;
		} else if (
				relationshipType.getLinksToEntities().get(0).getEntity().getLinks().size() > 1 &&
				relationshipType.getLinksToEntities().get(1).getEntity().getLinks().size() > 1
			) {
			listOfDependencies.add(sourceIndexElement);
			listOfDependencies.add(targetIndexElement);
		} else if (relationshipType.getLinksToEntities().get(0).getEntity().getLinks().size() == 1) {
			listOfDependencies.add(sourceIndexElement);
		} else if (relationshipType.getLinksToEntities().get(1).getEntity().getLinks().size() == 1) {
			listOfDependencies.add(targetIndexElement);
		}		
		//Add to the list of constraints
		listOfConstraints.add(new BasicConstraint(elementIndex, Collections.unmodifiableList(listOfDependencies), sameModule));					
	}	
	
	private static void procedureDependency(int elementIndex, EList<ModularizableElement> listOfElements,
			Procedure procedure, List<BasicConstraint> listOfConstraints) {
		Iterator<AccessElement> itAccessElements = procedure.getAccessElements().iterator();
		List<Integer> dependenciesList = new ArrayList<Integer>(procedure.getAccessElements().size());
		while (itAccessElements.hasNext()) {
			AccessElement accessElement = (AccessElement) itAccessElements.next();
			int indexElement = listOfElements.indexOf(accessElement.getEntity());
			if (indexElement != -1)
				dependenciesList.add(indexElement);
		}
		listOfConstraints.add(new BasicConstraint(elementIndex, Collections.unmodifiableList(dependenciesList), false));				
	}
	
}
