package org.hyeonisism.sorting;

/**
 * @author hyeonisism
 */
public class InsertionSort implements Sortable {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {
            T temp = array[i];
            for (j = i - 1; j >= 0 && temp.compareTo(array[j]) < 0; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = temp;
        }
        return array;
    }
}