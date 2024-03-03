package cw_list_2.zad2;
import java.util.Iterator;

public class NumberIterator implements Iterator<Integer> {
    private int currentNumber;

    public NumberIterator(int startNumber) {
        this.currentNumber = startNumber;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        int nextNumber = currentNumber;
        currentNumber++;
        return nextNumber;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
