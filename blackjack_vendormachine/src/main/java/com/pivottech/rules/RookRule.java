package com.pivottech.rules;

public class RookRule implements Rule {
    @Override
    public boolean canMove(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) return false;
        if (x1 == x2 || y1 == y2) return true;
        return false;
    }
}
