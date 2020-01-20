package com.ityulkanov.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.UnaryOperator;

public class DIYArrayList<T> implements List<T> {

    //Default size of an array
    private static final int DEFAULT_LENGTH = 10;
    //Buffer
    transient T[] elementData;

    private int size = 0;

    protected transient int modCount = 0;

    public DIYArrayList(int length) {
        elementData = (T[]) new Object[length];
    }

    public DIYArrayList() {
        elementData =  (T[]) new Object[DEFAULT_LENGTH];
    }

    @Override
    public boolean add(T t) {
        modCount++;
        add(t, elementData, size);
        return true;
    }

    private void add(T type, T[] elementData, int size) {
        if (size == elementData.length) {
            elementData = grow();
        } else {
            elementData[size] = type;
            this.size = size + 1;
        }
    }

    private T[] grow() {
        return grow(size + 1);

    }

    private T[] grow(int i) {
        int oldCapacity = elementData.length;
        if (oldCapacity > 0) {
            int newCapacity = newLength(oldCapacity, i - oldCapacity, oldCapacity >> 1);
            return elementData = Arrays.copyOf(elementData, newCapacity);
        }
        return elementData = (T[]) new Object[Math.max(DEFAULT_LENGTH, i)];
    }

    public static int newLength(int oldLength, int minGrowth, int prefGrowth) {
        final int MAX_ARRAY_LENGTH = Integer.MAX_VALUE - 8;
        int newLength = Math.max(minGrowth, prefGrowth) + oldLength;
        if (newLength - MAX_ARRAY_LENGTH <= 0) {
            return newLength;
        }
        return hugeLength(oldLength, minGrowth);
    }

    private static int hugeLength(int oldLength, int minGrowth) {
        final int MAX_ARRAY_LENGTH = Integer.MAX_VALUE - 8;
        int minLength = oldLength + minGrowth;
        if (minLength < 0) { // overflow
            throw new OutOfMemoryError("Required array length too large");
        }
        if (minLength <= MAX_ARRAY_LENGTH) {
            return MAX_ARRAY_LENGTH;
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public T get(int i) {
        @SuppressWarnings("unchecked") final T e = (T) elementData[i];
        return e;
    }

    @Override
    public T set(int i, T element) {
        elementData[i] = element;
        return element;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementData);
    }


    @Override
    public void replaceAll(UnaryOperator<T> operator) {

    }

    @Override
    public void sort(Comparator<? super T> c) {

    }

    @Override
    public Spliterator<T> spliterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

//    @Override
//    public T get(int index) {
//        System.out.println("get method run");
//        return null;
//    }
//
//    @Override
//    public T set(int index, T type) {
//        return null;
//    }

    @Override
    public void add(int index, T type) {


    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

}
