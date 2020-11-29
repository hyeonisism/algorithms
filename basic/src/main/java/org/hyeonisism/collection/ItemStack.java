package org.hyeonisism.collection;

import java.util.Iterator;

public class ItemStack implements Stack<Item> {
    @Override
    public void push(Item item) {

    }

    @Override
    public Item pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
