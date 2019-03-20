package ayed.horse;

import ayed.stack.StaticStack;

import java.util.ArrayList;

public class Horse {

    private Position[][] board;
    private Position currentPosition;
    private StaticStack<Position>[] stacks;
    private int currentStack;
    private ArrayList<Position> previousPositions;

    public Horse(int n) {
        board = new Position[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Position(i, j);
            }
        }
        currentPosition = board[0][0];
        stacks = new StaticStack[n];
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new StaticStack<>();
        }
        currentStack = 0;
        previousPositions = new ArrayList<>();
    }

    public void start() {
        for (int i = 0; i < stacks.length; i++) {
            currentStack = i;
            previousPositions.add(currentPosition);
            movements();
            currentPosition = stacks[currentStack].peek();
        }
        while (!stacks[currentStack - 1].isEmpty()) {
            printer();
            stacks[currentStack - 1].pop();
            if (stacks[currentStack - 1].isEmpty()) break;
            currentPosition = stacks[currentStack - 1].peek();
            movements();
            System.out.println();
        }
    }
    public void printer() {
        while (!stacks[currentStack].isEmpty()) {
            for (int i = 0; i < stacks.length; i++) {
                stacks[i].peek().print();
                System.out.print(" ");
            }
            stacks[currentStack].pop();
            System.out.println();
        }
    }

    public void movements() {
        check(currentPosition.getNumber() + 2, currentPosition.getLetter() + 1);
        check(currentPosition.getNumber() + 2, currentPosition.getLetter() - 1);
        check(currentPosition.getNumber() - 2, currentPosition.getLetter() + 1);
        check(currentPosition.getNumber() - 2, currentPosition.getLetter() - 1);
        check(currentPosition.getNumber() + 1, currentPosition.getLetter() + 2);
        check(currentPosition.getNumber() + 1, currentPosition.getLetter() - 2);
        check(currentPosition.getNumber() - 1, currentPosition.getLetter() + 2);
        check(currentPosition.getNumber() - 1, currentPosition.getLetter() - 2);
    }

    public void check(int n, int l) {
        if (n >= 0 && n < 8 && l >= 0 && l < 8 && !previousPositions.contains(board[n][l]))
            stacks[currentStack].push(board[n][l]);
    }

}
