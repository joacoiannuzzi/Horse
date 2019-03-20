package ayed.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaticStackTest {

    @Test
    public void test1() {
        StaticStack<Integer> stack = new StaticStack<>(1);
        stack.push(0);
        assertEquals(new Integer(0), stack.peek());
    }

    @Test
    public void test2() {
        StaticStack<Integer> stack = new StaticStack<>(1);
        stack.push(0);
        stack.push(1);
        assertEquals(new Integer(1), stack.peek());
    }

    @Test
    public void test3() {
        StaticStack<Integer> stack = new StaticStack<>(1);
        for (int i = 0; i < 9; i++) {
            stack.push(i);
        }
        assertEquals(new Integer(8), stack.peek());
    }

    @Test
    public void test4() {
        StaticStack<Integer> stack = new StaticStack<>(1);
        for (int i = 0; i < 9; i++) {
            stack.push(i);
        }
        stack.pop();
        assertEquals(new Integer(7), stack.peek());
        assertEquals(8, stack.size());
    }

    @Test
    public void test5() {
        StaticStack<Integer> stack = new StaticStack<>(1);
        for (int i = 0; i < 9; i++) {
            stack.push(i);
        }
        assertEquals(false, stack.isEmpty());
        stack.empty();
        assertEquals(0, stack.size());
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void test6() {
        StaticStack<Integer> stack = new StaticStack<>();
        stack.push(4);
        stack.pop();
        assertEquals(null, stack.peek());
    }

}