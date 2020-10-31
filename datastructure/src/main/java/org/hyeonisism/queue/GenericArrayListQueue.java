package org.hyeonisism.queue;

import java.util.ArrayList;

/**
 * @author hyeonisism
 */
public class GenericArrayListQueue<T> {

    ArrayList<T> queue = new ArrayList<>();

    private boolean hasElements() {
        return !queue.isEmpty();
    }

    public T peek() {
        if (this.hasElements())
            return queue.get(0);
        return null;
    }

    public boolean add(T element) {
        return queue.add(element);
    }

    public T poll() {
        if (this.hasElements())
            return queue.remove(0);
        return null;
    }
}
