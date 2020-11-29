package org.hyeonisism.collection;

/**
 * @author hyeonisism
 */
public interface Queue<E> extends Iterable<E> {

    void enqueue(E e);

    E dequeue();

    boolean isEmpty();

    int size();
}
