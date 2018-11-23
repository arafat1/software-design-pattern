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
        SortAlgorithm algo = AlgorithmFactory.MERGESORT.getAlgorithm();
        algo.reverse();
        assertEquals("Expecting Merge Sort", "Executing AttackStrategy", algo.sort());
    }

    @Test
    public void createQuickSortTest() {
        SortAlgorithm algo = AlgorithmFactory.QUICKSORT.getAlgorithm();
        assertEquals("Expecting Quick Sort", "Executing DefenceStrategy", algo.sort());
    }

    @Test
    public void createRadixSortTest() {
        SortAlgorithm algo = AlgorithmFactory.RADIXSORT.getAlgorithm();
        algo.reverse();
        assertEquals("Expecting Radix Sort", "Executing StandByStrategy", algo.sort());
    }
}
