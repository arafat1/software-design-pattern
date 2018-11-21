package design.patterns.strategypattern;

import design.patterns.strategypattern.algorithms.MergeSort;
import design.patterns.strategypattern.algorithms.QuickSort;
import design.patterns.strategypattern.algorithms.RadixSort;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrategyPatternTest {
    private SortContext sortContext;

    @BeforeClass
    public static void setUp() {
        System.out.println("Executing Strategy Pattern -> Type: Behavioral");
    }

    @Test
    public void executeStrategyMergeSort() {
        sortContext = new SortContext(new MergeSort());
        assertEquals("Expecting Merge Sort", "Executing MergeSort", sortContext.executeStrategy());
    }

    @Test
    public void executeStrategyQuickSort() {
        sortContext = new SortContext(new QuickSort());
        assertEquals("Expecting Quick Sort", "Executing QuickSort", sortContext.executeStrategy());
    }

    @Test
    public void executeStrategyRadixSort() {
        sortContext = new SortContext(new RadixSort());
        assertEquals("Expecting Radix Sort", "Executing RadixSort", sortContext.executeStrategy());
    }
}