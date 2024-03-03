package cw_list_2.zad6;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
    private final T[] array;
    private int pos = 0;
    public ArrayIterator(T anArray[]) {
        array = anArray;
    }
    public boolean hasNext() {
        return pos < array.length;
    }
    public T next() throws NoSuchElementException {
        if (hasNext())
            return array[pos++];
        else
            throw new NoSuchElementException();
    }
    public void remove() {
        if (pos < 1 || pos >= array.length) {
            throw new IllegalStateException("No element to remove");
        }

        for (int i = pos; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = null;
    }

}
