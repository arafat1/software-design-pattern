package design.patterns.strategypattern;

import design.patterns.strategypattern.algorithms.SortStrategy;

public class SortContext {
    private SortStrategy sortStrategy;

    public SortContext(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public String executeStrategy() {
        return sortStrategy.sort();
    }
}
