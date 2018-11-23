package design.patterns.simplefactorypattern.algorithms;

public interface SortAlgorithm {
    String sort();

    default void reverse() {
        System.out.println("reverse the collection first");
    }
}
