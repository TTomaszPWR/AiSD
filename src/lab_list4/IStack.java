package lab_list4;

public interface IStack<T> {
    boolean isEmpty();
    boolean isFull();
    void push(T value);
    T pop();
    int size();
    T top();
}
