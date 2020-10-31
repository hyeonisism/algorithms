package org.hyeonisism.searching;

/**
 * @author hyeonisism
 */
public class BinarySearch implements SearchAlgorithm {

    @Override
    public <T extends Comparable<T>> T find(T[] sortedArray, T key) {
        return search(sortedArray, key, 0, sortedArray.length - 1);
    }

    private <T extends Comparable<T>> T search(T[] sortedArray, T key, int left, int right) {
        if (right < left) throw new NotFoundException(key);

        int mediumValue = (left + right) >>> 1;

        int compareResult = key.compareTo(sortedArray[mediumValue]);

        if (compareResult == 0) {
            return sortedArray[mediumValue];
        } else if (compareResult > 0) {
            return search(sortedArray, key, mediumValue + 1, right);
        } else {
            return search(sortedArray, key, left, mediumValue - 1);
        }
    }
}
