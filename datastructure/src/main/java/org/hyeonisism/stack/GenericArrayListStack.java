package org.hyeonisism.stack;

import java.util.ArrayList;

/**
 * @author hyeonisism
 */
public class GenericArrayListStack<T> {

    private ArrayList<T> stack = new ArrayList<>();

    public void push(T value) {
        stack.add(value);
    }

    public T pop() {

        if (stack.isEmpty()) {
            return null;
        }

        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        return stack.get(stack.size() - 1);
    }
}
