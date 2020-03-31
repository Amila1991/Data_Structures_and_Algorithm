package org.sample.data.structures.queue;

import java.util.Optional;

/**
 * @author Amila Karunathilaka
 */
public interface Queue<T> {

    public boolean enqueue(T key);

    public Optional<T> dequeue();

    public boolean isEmpty();

    public boolean isFull();
}
