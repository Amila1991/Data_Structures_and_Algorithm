package org.sample.data.structures.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Amila Karunathilaka
 */
public class ListStack<T> implements Stack<T> {

    private List<T> stack;
    private int last_index;

    public ListStack(int size) {
        this.stack = new ArrayList<>(size);
    }

    @Override
    public boolean push(T key) {
        this.last_index++;
        return stack.add(key);
    }

    @Override
    public Optional<T> pop() {
        return Optional.ofNullable(this.stack.remove(--this.last_index));
    }

    @Override
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
