package org.sample.data.structures.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Amila Karunathilaka
 */
public class ListQueue<T> implements Queue<T> {

    private final List<T> queue;

    public ListQueue() {
        this.queue = new ArrayList<T>();
    }

    public ListQueue(int size) {
        this.queue = new ArrayList<T>(size);
    }

    @Override
    public boolean enqueue(T key) {
        return queue.add(key);
    }

    @Override
    public Optional<T> dequeue() {
        if(isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(queue.remove(0));
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    @Deprecated
    public boolean isFull() {
        return false;
    }
}
