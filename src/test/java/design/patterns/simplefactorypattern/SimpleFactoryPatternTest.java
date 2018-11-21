package design.patterns.simplefactorypattern;

import design.patterns.simplefactorypattern.algorithms.SortAlgorithm;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleFactoryPatternTest {

    @BeforeClass
    public static void setUp() {
        System.out.println("Executing Simple Factory Pattern (not a design pattern) -> Type: Creational");
    }

    @Test
    public void createMergeSortTest() {
        SortAlgorithm algo = AlgorithmFactory.getAlgorithm(AlgorithmType.MERGE);
        assertEquals("Expecting Merge Sort", "Executing MergeSort", algo.sort());
    }

    @Test
    public void createQuickSortTest() {
        SortAlgorithm algo = AlgorithmFactory.getAlgorithm(AlgorithmType.QUICK);
        assertEquals("Expecting Quick Sort", "Executing QuickSort", algo.sort());
    }

    @Test
    public void createRadixSortTest() {
        SortAlgorithm algo = AlgorithmFactory.getAlgorithm(AlgorithmType.RADIX);
        assertEquals("Expecting Radix Sort", "Executing RadixSort", algo.sort());
    }
}
