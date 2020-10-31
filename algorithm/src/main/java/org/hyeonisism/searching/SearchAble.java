package org.hyeonisism.searching;

/**
 * @author hyeonisism
 */
public interface SearchAble {

    <T extends Comparable<T>> T find(T[] sortedArray, T key);
}
