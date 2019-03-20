package ayed.stack;

public interface Stack<T> {

    void push(T t);
    void pop();
    T peek();
    boolean isEmpty();
    int size();
    void empty();
}
