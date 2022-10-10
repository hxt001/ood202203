package com.pivottech.rules;

public class KnightRule implements Rule {

    @Override
    public boolean canMove(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) return false;
        int deltaX = Math.abs(x1-x2);
        int deltaY = Math.abs(y1-y2);

        if ((deltaX==2 && deltaY ==1) || (deltaX==1 && deltaY ==2)) {
            return true;
        }
        return false;
    }
}
