package org.hyeonisism.searching;

/**
 * @author hyeonisism
 */
class NotFoundException extends RuntimeException {
    <T extends Comparable<T>> NotFoundException(T key) {
        super("Not Found Key : " + key);
    }
}
