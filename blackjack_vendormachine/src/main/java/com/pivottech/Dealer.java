package com.pivottech;

public class Dealer {
    Game currentGame = new Game();
    void serverOneCardToPlayer(Player player) {
        BlackjackCard card = currentGame.getDeck().cards.poll();
        player.shoe.add(card);
    }
}
