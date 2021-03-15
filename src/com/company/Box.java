package com.company;

public class Box<T> {
    private T element;


    public final T get() {
        return element;
    }


    public final void put(final T elements) {
        this.element = elements;
    }

}
