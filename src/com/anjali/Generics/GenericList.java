package com.anjali.Generics;

public class GenericList<T> {
    //List to store items
    private T[] list = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        list[count++] = item;
    }
    public T get(int index) {
        return  list[index];
    }
}
