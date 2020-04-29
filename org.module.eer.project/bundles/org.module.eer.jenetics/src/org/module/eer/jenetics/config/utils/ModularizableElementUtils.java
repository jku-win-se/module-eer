package org.module.eer.jenetics.config.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.module.eer.mm.moduleeer.EntityType;
import org.module.eer.mm.moduleeer.ModularizableElement;
import org.module.eer.mm.moduleeer.RelationshipType;
import org.module.eer.mm.moduleeer.procedure.AccessElement;
import org.module.eer.mm.moduleeer.procedure.Procedure;

public class ModularizableElementUtils {
	
	//TODO fix all dependencies...
	
	/*
	 * Map with all constraints of EntityType, RelationshipType, Procedure
	 * */
	public static Map<Integer, List<Integer>> dependenciesOfAllModularizableElements(EList<ModularizableElement> listOfElements) {
		ListIterator<ModularizableElement> itModularizableElement = listOfElements.listIterator();
		Map<Integer, List<Integer>> mapOfRelationships = new HashMap<Integer, List<Integer>>();
		while (itModularizableElement.hasNext()) {
			int relationShipIndex = itModularizableElement.nextIndex();
			ModularizableElement modularizableElement = itModularizableElement.next();
			if (modularizableElement instanceof RelationshipType) 
				relationShiptypeDependency(relationShipIndex, listOfElements, (RelationshipType) modularizableElement, mapOfRelationships);
			else if (modularizableElement instanceof EntityType)
				entityTypeDependency(relationShipIndex, listOfElements, (EntityType) modularizableElement, mapOfRelationships);
			else if (modularizableElement instanceof Procedure)
				procedureDependency(relationShipIndex, listOfElements, (Procedure) modularizableElement, mapOfRelationships);
		}		
		return mapOfRelationships;
	}	
	
	/*
	 * Map with the position of each Relationshiptype and 
	 * the list of elements it point to that belongs to the same module we are trying to split
	 * */	
	public static Map<Integer, List<Integer>> dependenciesOfRelationshipType(EList<ModularizableElement> listOfElements) {
		ListIterator<ModularizableElement> itModularizableElement = listOfElements.listIterator();
		Map<Integer, List<Integer>> mapOfRelationships = new HashMap<Integer, List<Integer>>();
		while (itModularizableElement.hasNext()) {
			int relationShipIndex = itModularizableElement.nextIndex();
			ModularizableElement modularizableElement = itModularizableElement.next();
			if (modularizableElement instanceof RelationshipType) 
				relationShiptypeDependency(relationShipIndex, listOfElements, (RelationshipType) modularizableElement, mapOfRelationships);
		}		
		return mapOfRelationships;
	}	
	
	/*
	 * Map with the position of each EntityType that has only one Relationshiptype that points to it
	 * */
	
	public static Map<Integer, List<Integer>> dependenciesOfEntityType(EList<ModularizableElement> listOfElements) {
		ListIterator<ModularizableElement> itModularizableElement = listOfElements.listIterator();
		Map<Integer, List<Integer>> mapOfRelationships = new HashMap<Integer, List<Integer>>();
		while (itModularizableElement.hasNext()) {
			int relationShipIndex = itModularizableElement.nextIndex();
			ModularizableElement modularizableElement = itModularizableElement.next();
			if (modularizableElement instanceof EntityType) {
				entityTypeDependency(relationShipIndex, listOfElements, (EntityType) modularizableElement, mapOfRelationships);
			} 				
		}		
		return mapOfRelationships;
	}
	
	/*
	 * Map with the position of each Procedure that access only to one EntityType
	 * */
	public static Map<Integer, List<Integer>> dependenciesOfProcedure(EList<ModularizableElement> listOfElements) {
		ListIterator<ModularizableElement> itModularizableElement = listOfElements.listIterator();
		Map<Integer, List<Integer>> mapOfRelationships = new HashMap<Integer, List<Integer>>();
		while (itModularizableElement.hasNext()) {
			int relationShipIndex = itModularizableElement.nextIndex();
			ModularizableElement modularizableElement = itModularizableElement.next();
			if (modularizableElement instanceof Procedure) {
				procedureDependency(relationShipIndex, listOfElements, (Procedure) modularizableElement, mapOfRelationships);
			} 				
		}		
		return mapOfRelationships;
	}
	
	private static void procedureDependency(int relationShipIndex, EList<ModularizableElement> listOfElements,
			Procedure procedure, Map<Integer, List<Integer>> mapOfRelationships) {
		Iterator<AccessElement> itAccessElements = procedure.getAccessElements().iterator();
		List<Integer> dependenciesList = new ArrayList<Integer>(procedure.getAccessElements().size());
		while (itAccessElements.hasNext()) {
			AccessElement accessElement = (AccessElement) itAccessElements.next();
			int indexElement = listOfElements.indexOf(accessElement.getEntity());
			if (indexElement != -1)
				dependenciesList.add(indexElement);
		}
		mapOfRelationships.put(relationShipIndex, Collections.unmodifiableList(dependenciesList));				
	}

	private static void relationShiptypeDependency(int relationShipIndex, EList<ModularizableElement> listOfElements, 
			RelationshipType relationshipType, Map<Integer, List<Integer>> mapOfRelationships) {
		int source = listOfElements.indexOf(relationshipType.getSrcEntity());
		int target = listOfElements.indexOf(relationshipType.getTrgEntity());
		List<Integer> listOfDependencies = createUnmodifiableListRelationshipType(source,target);				
		if (listOfDependencies.size() > 0)
				mapOfRelationships.put(relationShipIndex, listOfDependencies);		
	}
	
	private static void entityTypeDependency(int relationShipIndex, EList<ModularizableElement> listOfElements, 
			EntityType entityType, Map<Integer, List<Integer>> mapOfRelationships) {
		if (entityType.getSrcRelationshiptype().size() + entityType.getTrgRelationshiptype().size() == 1) {
			int elementIndex = -1;
			if (entityType.getSrcRelationshiptype().size() == 0) {
				elementIndex = listOfElements.indexOf(entityType.getTrgRelationshiptype().get(0));				
			} else {
				elementIndex = listOfElements.indexOf(entityType.getSrcRelationshiptype().get(0));
			}
			mapOfRelationships.put(relationShipIndex, Collections.unmodifiableList(Arrays.asList(elementIndex)));			
		}		
	}
	
	private static List<Integer> createUnmodifiableListRelationshipType(int source, int target) {
		List<Integer> dependenciesList = new ArrayList<Integer>(2);
		if (source != -1)
			dependenciesList.add(source);
		if (target != -1)
			dependenciesList.add(target);
		return Collections.unmodifiableList(dependenciesList);		
	}

}
