package org.module.eer.jenetics.split.constraint;

import java.util.List;

public class BasicConstraint {
	
	// Id of the Relationship Oject
	private int elementId;
	// Elements that relates size = 2
	private List<Integer> elements;
	// Elements that relates should be in the same module
	private boolean sameModule;
	
	public BasicConstraint(int elementId, List<Integer> elements, boolean sameModule) {
		this.elementId = elementId;
		this.elements = elements;
		this.sameModule = sameModule;
	}

	public int getElementId() {
		return elementId;
	}

	public void setElementId(int elementId) {
		this.elementId = elementId;
	}

	public List<Integer> getElements() {
		return elements;
	}

	public void setElements(List<Integer> elements) {
		this.elements = elements;
	}

	public boolean isSameModule() {
		return sameModule;
	}

	public void setSameModule(boolean sameModule) {
		this.sameModule = sameModule;
	}	
}
