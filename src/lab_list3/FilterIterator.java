package lab_list3;

import lab_list1.Predicate;

import java.util.Iterator;

public final class FilterIterator<T> implements Iterator<T> {
    private final Iterator<T> iterator;
    private final Predicate<T> predicate;
    private T elemNext=null;
    private boolean bHasNext=true;
    public FilterIterator(Iterator<T> iterator, Predicate<T> predicate) {
        super();
        this.iterator = iterator;
        this.predicate = predicate;
        findNextValid();
    }
    private void findNextValid() {
        while (iterator.hasNext()) {
            elemNext = iterator.next();
            if (predicate.accept(elemNext)) {
                return;
            }
        }
        bHasNext=false;
        elemNext=null;
    }
    @Override
    public boolean hasNext() {
        return bHasNext;
    }
    @Override
    public T next() {
        T nextValue = elemNext;
        findNextValid();
        return nextValue;
    }
}