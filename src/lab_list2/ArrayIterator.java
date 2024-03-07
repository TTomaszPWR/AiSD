package lab_list2;

public class ArrayIterator {
    private Worker[] workers;
    private int index;

    public ArrayIterator(Worker[] workers) {
        this.workers = workers;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < workers.length;
    }

    public Worker next() {
        return workers[index++];
    }
}
