package cw_list_2.zad1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class KthElementIterator<T> implements Iterator<T> {
    private final Iterator<T> baseIterator;
    private final int k;
    private int count;

    public KthElementIterator(Iterator<T> baseIterator, int k) {
        this.baseIterator = baseIterator;
        this.k = k;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return baseIterator.hasNext();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        T result = null;
        while (baseIterator.hasNext()) {
            result = baseIterator.next();
            count++;
            if (count == k) {
                count = 0;
                break;
            }
        }

        if (result == null) {
            throw new NoSuchElementException();
        }

        return result;
    }

    @Override
    public void remove() {
        baseIterator.remove();
    }
}