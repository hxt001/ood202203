package com.pivottech;

import java.util.*;

public class Deck<T extends Card> {
    Deque<T> cards = new LinkedList<>();
    public Deck() {
        for (int i =1; i<=13; i++) {
            for (Suit s : Suit.values()) {
                cards.add((T) T.create(i, s));
            }
        }
    }
}
