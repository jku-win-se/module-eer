package org.module.eer.jenetics.config.ff;

import java.util.Iterator;
import java.util.function.Function;

import org.eclipse.emf.common.util.EList;
import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.RelationshipType;
import org.module.eer.mm.moduleeer.procedure.AccessElement;
import org.module.eer.mm.moduleeer.procedure.Procedure;

import io.jenetics.Genotype;
import io.jenetics.IntegerGene;

public class ModularizableFF implements Function<Genotype<IntegerGene>, Double> {

	private ModularizableCRAIndexFF craIndexFF;
	private ModularizableBalancedFF balancedFF;
	private EList<ModularizableElement> listOfElements;
	private int maxCRAIndex;
	
	public ModularizableFF(EList<ModularizableElement> listOfElements) {
		this.listOfElements = listOfElements;
		this.craIndexFF = new ModularizableCRAIndexFF(listOfElements);
		this.balancedFF = new ModularizableBalancedFF();
		this.maxCRAIndex = calculateMaxCRAIndex();
	}
	
	private int calculateMaxCRAIndex() {
		Iterator<ModularizableElement> itListOfElements = listOfElements.iterator();
		int count = 0;
		while (itListOfElements.hasNext()) {
			ModularizableElement modularizableElement = (ModularizableElement) itListOfElements.next();
			if (modularizableElement instanceof EntityType)
				count += countGeneralizes((EntityType) modularizableElement);
			else if (modularizableElement instanceof RelationshipType)
				count += countRelationships((RelationshipType) modularizableElement);
			else if (modularizableElement instanceof Procedure)
				count += countProcedures((Procedure) modularizableElement);
		}
		return count;
	}

	private int countGeneralizes(EntityType entity) {
		Iterator<EntityType> itGeneralizes = entity.getGeneralizes().iterator();
		int count = 0;
		while (itGeneralizes.hasNext()) {
			EntityType entityType = (EntityType) itGeneralizes.next();
			if (this.listOfElements.indexOf(entityType) != -1)
				count++;
		}
		return count;
	}
	
	private int countRelationships(RelationshipType entity) {
		int count = 0;
		if (this.listOfElements.indexOf(entity.getSrcEntity()) != -1)
			count++;
		if (this.listOfElements.indexOf(entity.getTrgEntity()) != -1)
			count++;
		return count;
	}
	
	private int countProcedures(Procedure procedure) {
		int count = 0;
		Iterator<AccessElement> itAccessElements = procedure.getAccessElements().iterator();
		while (itAccessElements.hasNext()) {
			AccessElement accessElement = (AccessElement) itAccessElements.next();
			if (this.listOfElements.indexOf(accessElement.getEntity()) != -1)
				count++;
		}		
		return count;
	}
	
	@Override
	public Double apply(Genotype<IntegerGene> genotype) {
		int max = genotype.chromosome().gene().max();
		double mean = this.listOfElements.size()/(max+1);		
		double craIndexPercentage = (this.craIndexFF.apply(genotype)/this.maxCRAIndex)*100;
		double coefficientVariability = (this.balancedFF.apply(genotype)/mean)*100;
		return craIndexPercentage + (100 - coefficientVariability);
	}
}
