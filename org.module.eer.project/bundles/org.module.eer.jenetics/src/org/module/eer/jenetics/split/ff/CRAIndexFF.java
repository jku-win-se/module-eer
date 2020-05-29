package org.module.eer.jenetics.split.ff;

import java.util.Iterator;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.module.eer.mm.moduleeer.Aggregation;
import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.Generalization;
import org.module.eer.mm.moduleeer.LinkToEntity;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.RelationshipType;
import org.module.eer.mm.moduleeer.procedure.AccessElement;
import org.module.eer.mm.moduleeer.procedure.Procedure;

import io.jenetics.BitChromosome;
import io.jenetics.BitGene;
import io.jenetics.EnumGene;
import io.jenetics.Genotype;
import io.jenetics.PermutationChromosome;

//TO DO Deeply Test CRAIndex
@Deprecated
@SuppressWarnings("rawtypes")
public class CRAIndexFF implements Function<Genotype, Double> {
	
	private EList<ModularizableElement> listOfElements;
	
	public CRAIndexFF(EList<ModularizableElement> listOfElements) {
		this.listOfElements = listOfElements;
	}
	
	@Override
	public Double apply(Genotype genotype) {		
		final PermutationChromosome pc = (PermutationChromosome) genotype.get(0);
		final BitChromosome bc = (BitChromosome) genotype.get(1);
		int craIndex = 0;		
		for (int i = 0; i < pc.length(); i++) {
			EnumGene enumGene = (EnumGene) pc.get(i);
			ModularizableElement element = this.listOfElements.get((Integer) enumGene.allele());
			craIndex += craIndex(element, i, pc, bc);
		}				
		return (double) craIndex;
	}	
		
	private int craIndex(ModularizableElement element, Integer position, PermutationChromosome pc, BitChromosome bc) {
		int elementCRAIndex = 0;
		//Generalizes
		if (element instanceof EntityType) {
			return generalizesCRAIndex((EntityType) element, position, pc, bc);
		} 
		//RelationshipType
		else if (element instanceof RelationshipType){		
			return relationshipTypeCRAIndex((RelationshipType) element, position, pc, bc);	
		}
		//Procedure
		else if (element instanceof Procedure) {
			return accessEntityTypeCRAIndex((Procedure) element, position, pc, bc);
		}
		return elementCRAIndex;
	}

	private int generalizesCRAIndex(EntityType currentEntityType, Integer position, PermutationChromosome pc, BitChromosome bc) {
		int generalizesCRAIndex = 0;
		Iterator<Generalization> itGeneralizations = currentEntityType.getGeneralizations().iterator();
		while (itGeneralizations.hasNext()) {
			EntityType relatedEntity = itGeneralizations.next().getEntity();
			int entityTypeId = this.listOfElements.indexOf(relatedEntity);
			generalizesCRAIndex += entityTypeCRAIndex(entityTypeId, position, pc, bc);
		}		
		return generalizesCRAIndex;
	}
	
	private int relationshipTypeCRAIndex(RelationshipType relationshipType, Integer position, PermutationChromosome pc, BitChromosome bc) {
		int relationshipTypeCRAIndex = 0;
		//Links to Entities
		for (LinkToEntity linkToEntity : relationshipType.getLinksToEntities()) {
			int entityTypeId = this.listOfElements.indexOf(linkToEntity.getEntity());
			relationshipTypeCRAIndex += entityTypeCRAIndex(entityTypeId, position, pc, bc);			
		}
		//Associations
		for (LinkToEntity linkToEntity : relationshipType.getAssociations()) {
			int entityTypeId = this.listOfElements.indexOf(linkToEntity.getEntity());
			relationshipTypeCRAIndex += entityTypeCRAIndex(entityTypeId, position, pc, bc);
		}
		//Agreggations
		for (Aggregation aggregation : relationshipType.getAggregations()) {
			int relationshipTypeId = this.listOfElements.indexOf(aggregation.getTo());
			relationshipTypeCRAIndex += entityTypeCRAIndex(relationshipTypeId, position, pc, bc);
		}		
		//Generalizes
		for (RelationshipType generalizeType : relationshipType.getGeneralizes()) {
			int relationshipTypeId = this.listOfElements.indexOf(generalizeType);
			relationshipTypeCRAIndex += entityTypeCRAIndex(relationshipTypeId, position, pc, bc);
		}		
		return relationshipTypeCRAIndex;
	}
	
	private int accessEntityTypeCRAIndex(Procedure element, Integer position, PermutationChromosome pc, BitChromosome bc) {
		int procedureCRAIndex = 0;
		for (AccessElement accessElement : element.getAccessElements()) {
			int elementId = this.listOfElements.indexOf(accessElement.getEntity());
			procedureCRAIndex += entityTypeCRAIndex(elementId, position, pc, bc);
		}
		return procedureCRAIndex;
	}
	
	private int entityTypeCRAIndex(int entityTypeId, int position, PermutationChromosome pc, BitChromosome bc) {
		//Forward Search
		boolean search = belongsSameModuleForward(entityTypeId, position, pc, bc);//bc.leenght
		if (search == true)
			return 1; //Cohesion
		else { //Backward Search
			search = belongsSameModuleBackward(entityTypeId, position, pc, bc);
			if (search == true)
				return 1; //Cohesion
		}		
		return -1; //Coupling
	}
	
	private boolean belongsSameModuleForward(int entityTypeId, Integer startPosition, PermutationChromosome pc, BitChromosome bc) {
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
	
	private boolean belongsSameModuleBackward(int entityTypeId, int startPosition, PermutationChromosome pc, BitChromosome bc) {
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
}
