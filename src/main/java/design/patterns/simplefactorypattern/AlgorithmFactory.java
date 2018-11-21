package design.patterns.simplefactorypattern;

import design.patterns.simplefactorypattern.algorithms.MergeSort;
import design.patterns.simplefactorypattern.algorithms.QuickSort;
import design.patterns.simplefactorypattern.algorithms.RadixSort;
import design.patterns.simplefactorypattern.algorithms.SortAlgorithm;

public class AlgorithmFactory {

    public static SortAlgorithm getAlgorithm(AlgorithmType algType) {
        switch (algType) {
            case MERGE: return new MergeSort();
            case QUICK: return new QuickSort();
            case RADIX: return new RadixSort();
        }
        return null;
    }
}
