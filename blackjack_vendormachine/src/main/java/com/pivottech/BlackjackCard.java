package com.pivottech;

public class BlackjackCard extends Card{
    private int bjValue;
    public static BlackjackCard create(int value, Suit suit) {
        return new BlackjackCard(value, suit);
    }
    public BlackjackCard(int value, Suit suit) {
        super(value, suit);
        setBjValue(Math.max(10, value));
    }

    public int getBjValue() {
        return bjValue;
    }

    public void setBjValue(int bjValue) {
        this.bjValue = bjValue;
    }
}
