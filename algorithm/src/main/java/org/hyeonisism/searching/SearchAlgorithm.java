package org.hyeonisism.searching;

/**
 * @author hyeonisism
 */
public interface SearchAlgorithm {

    <T extends Comparable<T>> T find(T[] sortedArray, T key);
}
