package design.patterns.strategypattern;

public class QuickSort implements SortStrategy {
    @Override
    public String sort() {
        return "Executing QuickSort";
    }
}
