package design.patterns.strategypattern;

public class SortContext {
    private SortStrategy sortStrategy;

    public SortContext(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public String executeStrategy() {
        return sortStrategy.sort();
    }
}
