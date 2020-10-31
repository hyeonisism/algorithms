package org.hyeonisism.sorting;

/**
 * @author hyeonisism
 */
public class SelectionSort implements Sortable {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j].compareTo(array[min]) < 0)
                    min = j;
            }
            if (min != i) {
                T temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }
}
