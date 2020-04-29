package org.module.eer.jenetics.config.ff;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.RelationshipType;
import org.module.eer.mm.moduleeer.procedure.AccessElement;
import org.module.eer.mm.moduleeer.procedure.Procedure;

import io.jenetics.Genotype;
import io.jenetics.IntegerGene;

public class ModularizableCRAIndexFF implements Function<Genotype<IntegerGene>, Double> {
	
	private EList<ModularizableElement> listOfElements;
	
	public ModularizableCRAIndexFF(EList<ModularizableElement> listOfElements) {
		this.listOfElements = listOfElements;
	}

	@Override
	public Double apply(Genotype<IntegerGene> genotype) {
		int craIndex = 0;	
		ListIterator<IntegerGene> itGenes = genotype.chromosome().listIterator();
		while (itGenes.hasNext()) {
			int index = itGenes.nextIndex();
			Integer module = itGenes.next().intValue();
			ModularizableElement element = this.listOfElements.get(index);
			craIndex = craIndex + craIndex(element, module, genotype);			
		}		
		return new Double(craIndex);
	}	
	private Integer craIndex(ModularizableElement element, Integer currentModule, Genotype<IntegerGene> genotype) {
		int elementCRAIndex = 0;
		//Generalizes
		if (element instanceof EntityType) {
			return generalizesCRAIndex((EntityType) element, currentModule, genotype);
		} 
		//RelationshipType
		else if (element instanceof RelationshipType){		
			return relationshipTypeCRAIndex((RelationshipType) element, currentModule, genotype);	
		}
		//Procedure
		else if (element instanceof Procedure) {
			return accessEntityTypeCRAIndex((Procedure) element, currentModule, genotype);
		}
		return elementCRAIndex;
	}
	
	//Calculates the CRA-Index taking into account Generalizes relations
	private Integer generalizesCRAIndex(EntityType currentEntityType, Integer currentModule, Genotype<IntegerGene> genotype) {
		int generalizesCRAIndex = 0;
		Iterator<EntityType> itGeneralizes = currentEntityType.getGeneralizes().iterator();
		while (itGeneralizes.hasNext()) {
			EntityType entity = (EntityType) itGeneralizes.next();
			generalizesCRAIndex += entityTypeCRAIndex(entity, currentModule, genotype);			
		}
		return generalizesCRAIndex;
	}	
		
	//RelationshipType
	private Integer relationshipTypeCRAIndex(RelationshipType relationshipType, Integer currentModule, Genotype<IntegerGene> genotype) {
		return entityTypeCRAIndex(relationshipType.getSrcEntity(), currentModule, genotype) + 
				entityTypeCRAIndex(relationshipType.getTrgEntity(), currentModule, genotype);		
	}
	
	//Procedure
	private Integer accessEntityTypeCRAIndex(Procedure procedure, Integer currentModule, Genotype<IntegerGene> genotype) {
		int accessEntityTypeCRAIndex = 0;
		Iterator<AccessElement> itAccessElements = procedure.getAccessElements().iterator();
		while (itAccessElements.hasNext()) {
			AccessElement accessElement = (AccessElement) itAccessElements.next();
			accessEntityTypeCRAIndex += entityTypeCRAIndex(accessElement.getEntity(), currentModule, genotype);
		}
		return accessEntityTypeCRAIndex;		
	}	
		
	//Check whether the element belongs to the same module or not
	private Integer entityTypeCRAIndex(ModularizableElement modularizableElement, Integer currentModule, Genotype<IntegerGene> genotype) {
		Integer idElement = this.listOfElements.indexOf(modularizableElement);
		/*
		 * Probably the element is not on the list because it belongs to another module
		 * In this case, this ModularizableElement does not alter the CRA-Index and return 0.
		 * */
		if (idElement == -1)
			return 0;
		IntegerGene elementChromosomeModule = genotype.chromosome().get(idElement);
		if (currentModule.equals(elementChromosomeModule.intValue())) {
			 return 1;//Cohesion
		} else {
			return -1;//Coupling
		}		
	}
}
