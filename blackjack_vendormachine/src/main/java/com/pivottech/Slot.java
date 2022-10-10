package com.pivottech;

public class Slot {
    int col;
    int row;
    private Slot(){}
    public static Slot createFromString(String input) {
        Slot slot = new Slot();

        char rowChar = input.charAt(0);
        char colChar = input.charAt(0);
        slot.row = rowChar - 'A';
        slot.col = colChar - '1';
        return slot;
    }
}
