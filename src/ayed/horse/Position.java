package ayed.horse;

public class Position {

    public static String[] letters = {"A","B", "C", "D", "E", "F", "G", "H"};

    private int number;
    private int letter;

    public Position(int number, int letter) {
        this.number = number;
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public int getLetter() {
        return letter;
    }

    public void print() {
        System.out.print(letters[letter] + (number + 1));
    }
}
