package org.module.eer.jenetics.config.principles;

public class MoodyPrinciples {
	
	private int numberOfelements;
	private int optimalSize;

	public MoodyPrinciples(int numberOfelements) {
		this.numberOfelements = numberOfelements;	
		this.optimalSize = 7;
	}

	public int getOptimimalNumberOfModules() {
		return getNumberOfelements()/getOptimalSize();
	} 
	
	public int getOptimalNumberOfDecompositionLevels() {
		return (int) Math.round(Math.log10(getNumberOfelements())/Math.log10(getOptimalSize()));
	}
	
	public int getOptimalNumberOfSubjectAreas() {
		return (int) Math.pow(getOptimalSize(), getOptimalNumberOfDecompositionLevels() - 1);
	}
	
	public int getNumberOfelements() {
		return numberOfelements;
	}

	public void setNumberOfelements(int numberOfelements) {
		this.numberOfelements = numberOfelements;
	}
	
	public int getOptimalSize() {
		return optimalSize;
	}

	public void setOptimalSize(int optimalSize) {
		this.optimalSize = optimalSize;
	}	
}
