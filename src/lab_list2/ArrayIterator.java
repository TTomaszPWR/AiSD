package lab_list2;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Worker> {
    private Worker[] workers;
    private int index;

    public ArrayIterator(Worker[] workers) {
        this.workers = workers;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < workers.length;
    }

    @Override
    public Worker next() {
        return workers[index++];
    }
}
