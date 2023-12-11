package com.sa.dsa.list.arraylist;

import java.util.Arrays;

public class CustomArrayList<E> {

    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object[] elementArray;

    public CustomArrayList() {
        elementArray = new Object[INITIAL_CAPACITY];
    }

    public CustomArrayList(int capacity) {
        elementArray = new Object[capacity];
    }

    public void add(E e) {
        if (size == elementArray.length) {
            increaseCapacity();
        }
        elementArray[size++] = e;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(" Beyond scope");
        }
        return (E) elementArray[index];
    }

    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(" Beyond scope");
        }
        Object removedElement = elementArray[index];
        for (int i = index; i < size - 1; i++) {
            elementArray[i] = elementArray[i + 1];
        }
        size--;
        return removedElement;
    }

    public void display() {
        System.out.print("Displaying list : ");
        for (int i = 0; i < size; i++) {
            System.out.print(elementArray[i] + " ");
        }
    }

    public int size() {
        return elementArray.length;
    }

    private void increaseCapacity() {
        int newIncreasedCapacity = elementArray.length * 2;
        elementArray = Arrays.copyOf(elementArray, newIncreasedCapacity);
    }


}
