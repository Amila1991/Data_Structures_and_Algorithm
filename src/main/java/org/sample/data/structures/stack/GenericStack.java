package org.sample.data.structures.stack;

import java.lang.reflect.Array;
import java.util.Optional;

/**
 * @author Amila Karunathilaka
 */
public class GenericStack<T> implements Stack<T> {

    private T[] stack;
    private final int max_size;
    private int lastIndex;

    public GenericStack(int max_size, Class<T> tClass) {
        this.max_size = max_size;
        this.stack = (T[]) Array.newInstance(tClass, max_size);
    }

    @Override
    public boolean push(T key) {
        if (isFull()) {
            return false;
        }
        this.stack[lastIndex++] = key;
        return true;
    }

    @Override
    public Optional<T> pop() {
        if(isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(this.stack[--lastIndex]);
    }

    @Override
    public boolean isEmpty() {
        return lastIndex == 0;
    }

    @Override
    public boolean isFull() {
        return max_size == lastIndex;
    }
}
