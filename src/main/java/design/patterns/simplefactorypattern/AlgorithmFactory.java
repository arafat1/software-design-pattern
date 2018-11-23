package design.patterns.simplefactorypattern;

import design.patterns.simplefactorypattern.algorithms.MergeSort;
import design.patterns.simplefactorypattern.algorithms.QuickSort;
import design.patterns.simplefactorypattern.algorithms.RadixSort;
import design.patterns.simplefactorypattern.algorithms.SortAlgorithm;

public enum AlgorithmFactory {
    MERGESORT{
        public SortAlgorithm getAlgorithm() { return new MergeSort(); }
    },
    QUICKSORT{
        public SortAlgorithm getAlgorithm() { return new QuickSort(); }
    },
    RADIXSORT{
        public SortAlgorithm getAlgorithm() { return new RadixSort(); }
    };

    public abstract SortAlgorithm getAlgorithm();
}
