package org.sample.data.structures.stack;

import java.util.Optional;

/**
 * @author Amila Karunathilaka
 */
public interface Stack<T> {

    public boolean push(T key);

    public Optional<T> pop();

    public boolean isEmpty();

    public boolean isFull();

}
