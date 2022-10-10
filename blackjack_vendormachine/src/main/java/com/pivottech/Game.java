package com.pivottech;

public class Game {
    private Deck<BlackjackCard> deck = new Deck<>();

    public Deck<BlackjackCard> getDeck() {
        return deck;
    }

    public void setDeck(Deck<BlackjackCard> deck) {
        this.deck = deck;
    }
}
