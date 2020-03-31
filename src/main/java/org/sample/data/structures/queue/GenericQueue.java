package org.sample.data.structures.queue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

/**
 * @author Amila Karunathilaka
 */
public class GenericQueue<T> implements Queue<T>{

    private T[] queue;
    private final int max_size;
    private int lastIndex;

    public GenericQueue(int max_size, Class<T> tClass) {
        this.max_size = max_size;
        this.queue = (T[]) Array.newInstance(tClass, max_size);
    }

    @Override
    public boolean enqueue(T key) {
        if (isFull()) {
            return false;
        }

        queue[lastIndex++] = key;
        return true;
    }

    @Override
    public Optional<T> dequeue() {
        if (isEmpty()) {
            return Optional.empty();
        }

        T temp = queue[0];
        queue = Arrays.copyOfRange(queue, 1, lastIndex--);

        return Optional.of(temp);
    }

    @Override
    public boolean isEmpty() {
        return lastIndex == 0;
    }

    @Override
    public boolean isFull() {
        return lastIndex == max_size;
    }
}
