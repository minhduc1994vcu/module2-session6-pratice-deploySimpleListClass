package com.codegym.list;

import java.util.Arrays;

public class Mylist<E> {
    int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];

    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);

    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
