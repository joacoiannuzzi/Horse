package ayed.stack;

public class StaticStack<T> implements Stack<T> {

    private Object[] stack;
    private int size;

    public StaticStack() {
        stack = new Object[5];
        size = 0;
    }
    public StaticStack(int capacity) {
        stack = new Object[capacity];
        size = 0;
    }

    @Override
    public void push(T t) {
        if (size == stack.length) grow();
        stack[size++] = t;
    }

    @Override
    public void pop() {
        if (size != 0) size--;
    }

    @Override
    public T peek() {
        if (size == 0) return null;
        return (T) stack[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void empty() {
        size = 0;
    }

    private void grow() {
        Object[] tempStack = new Object[stack.length * 2];
        System.arraycopy(stack, 0, tempStack, 0, stack.length);
        stack = tempStack;
    }
}
