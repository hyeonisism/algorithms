package org.hyeonisism.collection;

/**
 * @author hyeonisism
 */
public interface Stack<E> extends Iterable<E> {

    void push(E e);

    E pop();

    boolean isEmpty();

    int size();
}
