package design.patterns.simplefactorypattern;

import design.patterns.simplefactorypattern.algorithms.MergeSort;
import design.patterns.simplefactorypattern.algorithms.QuickSort;
import design.patterns.simplefactorypattern.algorithms.RadixSort;
import design.patterns.simplefactorypattern.algorithms.SortAlgorithm;

public enum AlgorithmFactory {
    MERGE_SORT{
        public SortAlgorithm getAlgorithm() { return new MergeSort(); }
    },
    QUICK_SORT{
        public SortAlgorithm getAlgorithm() { return new QuickSort(); }
    },
    RADIX_SORT{
        public SortAlgorithm getAlgorithm() { return new RadixSort(); }
    };

    public abstract SortAlgorithm getAlgorithm();
}
