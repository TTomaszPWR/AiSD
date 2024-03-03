package cw_list_2.zad4;

import java.util.Iterator;

public class ShuffleIterator<T> implements Iterator<T> {
    private final Iterator<T> iter1;
    private final Iterator<T> iter2;
    private boolean turn;

    public ShuffleIterator(Iterator<T> iter1, Iterator<T> iter2) {
        this.iter1 = iter1;
        this.iter2 = iter2;
        this.turn = false;
    }

    @Override
    public boolean hasNext() {
        return iter1.hasNext() || iter2.hasNext();
    }

    @Override
    public T next() {
        turn = !turn;
        return turn ? (iter1.hasNext() ? iter1.next() : iter2.next()) : (iter2.hasNext() ? iter2.next() : iter1.next());
    }
}
