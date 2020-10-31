package org.hyeonisism.sorting;

/**
 * @author hyeonisism
 */
public interface Sortable {

    <T extends Comparable<T>> T[] sort(T[] unsortedArray);
}
