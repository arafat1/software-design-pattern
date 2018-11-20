package design.patterns.strategypattern;

public class RadixSort implements SortStrategy {
    @Override
    public String sort() {
        return "Executing RadixSort";
    }
}
