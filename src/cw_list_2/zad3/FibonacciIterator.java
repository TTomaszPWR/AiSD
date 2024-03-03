package cw_list_2.zad3;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int current;
    private int next;

    public FibonacciIterator() {
        this.current = 1;
        this.next = 1;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int result = current;
        int temp = next;
        next = current + next;
        current = temp;
        return result;
    }
}
