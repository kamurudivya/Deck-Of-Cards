package com.bridgelabz.DeckOfCards;

        // Welcome to Program of Deck of cards
public class DeckOfCards {
    static String[] Cards = new String[52];
    static String[] Suits = {"Club", "Diamond", "Heart", "Spade"};
    static String[] Ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static int n = Suits.length * Ranks.length;

    public static void main(String[] args) {
        InitializeCards();
    }

        //Initialize the deck of Cards
    public static void InitializeCards() {
        int index = 0;
        for (int i = 0; i < Ranks.length; i++) {
            for (int j = 0; j < Suits.length; j++) {
                Cards[index] = Ranks[i] + " of " + Suits[j];
                index++;
            }
        }

        //Print Deck of Unique cards
        System.out.println("DeckOfCards: ");
        for (int i = 0; i < n; i++) {
            System.out.println(Cards[i]);
        }
    }
}