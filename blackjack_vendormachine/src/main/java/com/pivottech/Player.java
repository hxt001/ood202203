package com.pivottech;

import java.util.ArrayList;
import java.util.List;

public class Player {

    List<BlackjackCard> shoe = new ArrayList<>();
    Dealer dealer;
    private int balance =0;
    public Player(Dealer dealer) {
        this.dealer = dealer;
    }
    public int getCurrentShoeValue() {
        int maxVal = 0;
        int curVal = 0;
        for (BlackjackCard card : shoe) {
            int val = card.getBjValue();
            // todo

        }
        return maxVal;
    }
    void hit() {
        dealer.serverOneCardToPlayer(this);

    }

    void stay() {
        int val = getCurrentShoeValue();
    }
}
