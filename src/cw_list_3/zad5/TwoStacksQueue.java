package cw_list_3.zad5;

import java.util.Stack;

public class TwoStacksQueue<T> {
    private final Stack<T> inbox;
    private final Stack<T> outbox;

    public TwoStacksQueue() {
        inbox = new Stack<>();
        outbox = new Stack<>();
    }

    public void enqueue(T value) {
        inbox.push(value);
    }

    public T dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }
    public boolean isEmpty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }
    public int size() {
        return inbox.size() + outbox.size();
    }

}
