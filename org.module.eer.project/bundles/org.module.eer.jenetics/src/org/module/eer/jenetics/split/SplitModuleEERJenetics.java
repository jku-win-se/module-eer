package org.module.eer.jenetics.split;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import org.module.eer.mm.moduleeer.MEERModel;
import org.module.eer.mm.moduleeer.Module;

import io.jenetics.Alterer;
import io.jenetics.EliteSelector;
import io.jenetics.Genotype;
import io.jenetics.IntegerGene;
import io.jenetics.Mutator;
import io.jenetics.Phenotype;
import io.jenetics.Selector;
import io.jenetics.SinglePointCrossover;
import io.jenetics.engine.Constraint;
import io.jenetics.engine.Engine;
import io.jenetics.engine.EvolutionResult;
import io.jenetics.engine.EvolutionStatistics;
import io.jenetics.engine.EvolutionStream;
import io.jenetics.engine.Engine.Builder;

public abstract class SplitModuleEERJenetics {
	
	protected int maxOfModules;
	protected int sizeOfElements;
	protected int populationSize;
	protected int limitGenerations;
	protected Function<Genotype<IntegerGene>, Double> modularizableFitnessFunction;
	protected List<Alterer<IntegerGene, Double>> listOfAlterers;
	protected Selector<IntegerGene, Double> survivorSelector;
	protected Constraint<IntegerGene,Double> moduleConstraint;
	protected boolean performStats;
	private Builder<IntegerGene, Double> engine;
	private Consumer<? super EvolutionResult<IntegerGene, Double>> stats;
	
	protected SplitModuleEERJenetics(int maxOfModules, int sizeOfElements, 
			Function<Genotype<IntegerGene>, Double> modularizableFitnessFunction) {
		this.maxOfModules = maxOfModules;
		this.sizeOfElements = sizeOfElements;
		this.modularizableFitnessFunction = modularizableFitnessFunction;
		this.populationSize = 100;
		this.listOfAlterers = null;
		this.survivorSelector = null;
		this.moduleConstraint = null;
		this.performStats = false;
		this.stats = null;
		this.limitGenerations = 300;
		this.engine = null;
	}	
	
	protected abstract Genotype<IntegerGene> getGenotype();
	public abstract MEERModel fromGenoTypeToMEERModel(Module splittingModule, Genotype<IntegerGene> chromosome);
	
	public Builder<IntegerGene, Double> getBuilder() {
		if (this.engine == null) {
			this.engine = Engine.builder(this.modularizableFitnessFunction, this.getGenotype())
					.populationSize(this.populationSize);
			addAlterers(engine);
			addSelectors(engine);
			addConstraints(engine);		
		}	
		return this.engine;
	}	
	
	protected void createDefaultAlterers() {
		this.listOfAlterers = new ArrayList<Alterer<IntegerGene,Double>>();
		this.listOfAlterers.add(new SinglePointCrossover<>(0.7));
		this.listOfAlterers.add(new Mutator<>(0.4));		
	}
	
	protected void createDefaultSelectors() {
		this.survivorSelector = new EliteSelector<>(4);		
	}
	
	@SuppressWarnings("unchecked")
	protected void addAlterers(Builder<IntegerGene, Double> engine) {
		if (getListOfAlterers() == null) 
			createDefaultAlterers();
		if (getListOfAlterers().size() == 1)
			engine.alterers(getListOfAlterers().get(0));
		else {
			engine.alterers(getListOfAlterers().get(0), 
					getListOfAlterers().subList(1, getListOfAlterers().size()).
						toArray((Alterer<IntegerGene, Double>[]) new Alterer[getListOfAlterers().size() - 1]));		
		}	
	}
	
	protected void addSelectors(Builder<IntegerGene, Double> engine) {
		if (this.survivorSelector == null)
			createDefaultSelectors();
		engine.survivorsSelector(getSurvivorSelector());
	}	

	public Genotype<IntegerGene> bestResult() {
		Engine<IntegerGene, Double> engine = getBuilder().build();
		EvolutionStream<IntegerGene, Double> evolutionEngine = engine.stream();
		if (performStats == true) {
			stats = EvolutionStatistics.ofNumber();
			evolutionEngine.peek(stats);			
		}
		return evolutionEngine
				.limit(getLimitGenerations())
				.collect(EvolutionResult.toBestGenotype());	
	}
	
	public Phenotype<IntegerGene, Double> bestResultPhenotype() {
		Engine<IntegerGene, Double> engine = getBuilder().build();
		EvolutionStream<IntegerGene, Double> evolutionEngine = engine.stream();
		if (performStats == true) {
			stats = EvolutionStatistics.ofNumber();
			evolutionEngine.peek(stats);			
		}
		return evolutionEngine
				.limit(getLimitGenerations())
				.collect(EvolutionResult.toBestPhenotype());	
	}
	
	protected void addConstraints(Builder<IntegerGene, Double> engine) {
		if (getModuleConstraint() != null)
			engine.constraint(getModuleConstraint());
	}
	
	public List<Alterer<IntegerGene, Double>> getListOfAlterers() {
		return listOfAlterers;
	}

	public void setListOfAlterers(List<Alterer<IntegerGene, Double>> listOfAlterers) {
		this.listOfAlterers = listOfAlterers;
	}

	public Selector<IntegerGene, Double> getSurvivorSelector() {
		return survivorSelector;
	}

	public void setSurvivorSelector(Selector<IntegerGene, Double> survivorSelector) {
		this.survivorSelector = survivorSelector;
	}	
	
	public void setPopulationSize(int populationSize) {
		this.populationSize = populationSize;
	}
	
	public int getPopulationSize() {
		return populationSize;
	}	
	
	public int getMaxOfModules() {
		return maxOfModules;
	}
	
	public Constraint<IntegerGene, Double> getModuleConstraint() {
		return moduleConstraint;
	}

	public void setModuleConstraint(Constraint<IntegerGene, Double> moduleConstraint) {
		this.moduleConstraint = moduleConstraint;
	}
	
	public int getLimitGenerations() {
		return this.limitGenerations;
	}

	public void setLimitGenerations(int limitGenerations) {
		this.limitGenerations = limitGenerations;
	}
	
	public Consumer<? super EvolutionResult<IntegerGene, Double>> getStats() {
		return stats;
	}

	public void setStats(Consumer<? super EvolutionResult<IntegerGene, Double>> stats) {
		this.stats = stats;
	}
}
