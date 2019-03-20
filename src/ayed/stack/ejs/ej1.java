package ayed.stack.ejs;

import ayed.stack.StaticStack;

public class ej1 {

    public static void main(String[] args) {

        StaticStack<Integer> stack = new StaticStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
