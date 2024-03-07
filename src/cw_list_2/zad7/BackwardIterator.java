package cw_list_2.zad7;

import java.util.Iterator;

public class BackwardIterator<T> implements Iterator<T> {
    private final T[][] array;
    private int index, row;

    public BackwardIterator(T[][] array) {
        this.array = array;
        this.index = array.length -1;
        this.row = array[0].length -1;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
