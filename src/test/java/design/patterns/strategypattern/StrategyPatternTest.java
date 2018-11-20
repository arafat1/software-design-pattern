package design.patterns.strategypattern;

import design.patterns.strategypattern.MergeSort;
import design.patterns.strategypattern.SortContext;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrategyPatternTest {
    private SortContext sortContext;

    @Test
    public void executeStrategyMergeSort() {
        sortContext = new SortContext(new MergeSort());
        assertEquals("Sort by Merge Sort", "Executing MergeSort", sortContext.executeStrategy());
    }

    @Test
    public void executeStrategyQuickSort() {
        sortContext = new SortContext(new QuickSort());
        assertEquals("Sort by Merge Sort", "Executing QuickSort", sortContext.executeStrategy());
    }

    @Test
    public void executeStrategyRadixSort() {
        sortContext = new SortContext(new RadixSort());
        assertEquals("Sort by Merge Sort", "Executing RadixSort", sortContext.executeStrategy());
    }
}