package com.BridgeLabz.Day18.workShop2;

public class DeckOfCardMain {
    public static void main(String[] args) {
        /*
        In this I have created an object of DeckOfCardsGame class and just calling the method through object.
         */
        DeckOfCards deckOfCardsGame = new DeckOfCards();
        deckOfCardsGame.welcome();
        deckOfCardsGame.deckOfCard();
        deckOfCardsGame.noOfPlayers();
    }
}
