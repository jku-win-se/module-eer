package org.module.eer.jenetics.split.ff;

import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.module.eer.jenetics.config.utils.ModularizableElementUtils;
import org.module.eer.mm.moduleeer.Aggregation;
import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.LinkToEntity;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.RelationshipType;
import org.module.eer.mm.moduleeer.procedure.Procedure;

import io.jenetics.BitChromosome;
import io.jenetics.EnumGene;
import io.jenetics.Genotype;
import io.jenetics.PermutationChromosome;

public class MissingEntitiesFF implements Function<Genotype, Double>{

	private EList<ModularizableElement> modularizableElements;
	
	public MissingEntitiesFF(EList<ModularizableElement> modularizableElements) {
		this.modularizableElements = modularizableElements;
	}
	
	@SuppressWarnings({ "unchecked" })
	@Override
	public Double apply(Genotype genotype) {
		final PermutationChromosome<Integer> pc = (PermutationChromosome<Integer>) genotype.get(0);
		final BitChromosome bc = (BitChromosome) genotype.get(1);
		double missingEntities = 2;
		for (int i = 0; i < pc.length(); i++) {
			EnumGene<Integer> enumGene = (EnumGene<Integer>) pc.get(i);
			ModularizableElement element = this.modularizableElements.get(enumGene.alleleIndex());
			if (element instanceof RelationshipType){		
				findEntities((RelationshipType) element, i, pc, bc, missingEntities);
			}
		}		
		return missingEntities;
	}

	private void findEntities(RelationshipType relationshipType, Integer position, PermutationChromosome<Integer> pc, BitChromosome bc, 
			Double connectedEntities) {
		//Links to Entities
		for (LinkToEntity linkToEntity : relationshipType.getLinksToEntities()) {
			int entityTypeId = this.modularizableElements.indexOf(linkToEntity.getEntity());
			searchEntityType(entityTypeId, position, pc, bc, connectedEntities);			
		}
	}
	
	private void searchEntityType(int entityTypeId, int position, PermutationChromosome<Integer> pc, BitChromosome bc, 
			Double connectedEntities) {
		//Forward Search
		boolean search = ModularizableElementUtils.belongsToTheSameModule(entityTypeId, position, pc, bc);
		if (search == true)
			connectedEntities--; //ENtity inside same module found.		
	}

}
