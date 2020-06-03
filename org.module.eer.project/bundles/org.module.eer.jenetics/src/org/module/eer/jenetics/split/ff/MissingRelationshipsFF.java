package org.module.eer.jenetics.split.ff;

import java.util.Iterator;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.module.eer.jenetics.config.utils.ModularizableElementUtils;
import org.module.eer.mm.moduleeer.Aggregation;
import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.Generalization;
import org.module.eer.mm.moduleeer.LinkToEntity;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.RelationshipType;
import org.module.eer.mm.moduleeer.procedure.Procedure;

import io.jenetics.BitChromosome;
import io.jenetics.EnumGene;
import io.jenetics.Genotype;
import io.jenetics.PermutationChromosome;

public class MissingRelationshipsFF implements Function<Genotype, Double>{

	private EList<ModularizableElement> modularizableElements;
	
	public MissingRelationshipsFF(EList<ModularizableElement> modularizableElements) {
		this.modularizableElements = modularizableElements;
	}
	
	@SuppressWarnings({ "unchecked" })
	@Override
	public Double apply(Genotype genotype) {
		final PermutationChromosome<Integer> pc = (PermutationChromosome<Integer>) genotype.get(0);
		final BitChromosome bc = (BitChromosome) genotype.get(1);
		double missingRelationships = 2;
		for (int i = 0; i < pc.length(); i++) {
			EnumGene<Integer> enumGene = (EnumGene<Integer>) pc.get(i);
			ModularizableElement element = this.modularizableElements.get(enumGene.alleleIndex());
			if (element instanceof EntityType){		
				findRelationships((EntityType) element, i, pc, bc, missingRelationships);
			}
		}		
		return missingRelationships;
	}

	private void findRelationships(EntityType currentEntityType, Integer position, PermutationChromosome<Integer> pc, BitChromosome bc,
			Double connectedRelationships) {
		Iterator<LinkToEntity> itEntityLinks = currentEntityType.getLinks().iterator();
		while (itEntityLinks.hasNext()) {
			LinkToEntity linkToEntity = itEntityLinks.next();
			int linkId = this.modularizableElements.indexOf(linkToEntity);
			searchRelationshipType(linkId, position, pc, bc, connectedRelationships);
		}		
	}
	
	private void searchRelationshipType(int entityTypeId, int position, PermutationChromosome<Integer> pc, BitChromosome bc, 
			Double connectedRelationships) {
		//Forward Search
		boolean search = ModularizableElementUtils.belongsToTheSameModule(entityTypeId, position, pc, bc);
		if (search == true)
			connectedRelationships--; // Relationships inside same module found.		
	}

}
