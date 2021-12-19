package com.bridgelabz.deckofcards;

public class deckOfcards {
    static String[] Cards = new String[52];
    static String[] ShuffledCards = new String[52];
    static String[] suits = {"Club", "Diamond", "Heart", "Spade"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static String[][] Player = new String[4][9];


    public static void main(String[] args) {
        Cards = InitializeCards();
        ShuffledCards = ShuffleCards();
        DistributeCards();
    }


    //Initialize the deck of Cards
    public static String[] InitializeCards() {
        int index = 0;
        String[] InitialCards = new String[52];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                InitialCards[index] = ranks[i] + " of " + suits[j];
                index++;
            }
        }
        return InitialCards;
    }

    //Shuffle Cards
    public static String[] ShuffleCards() {
        for (int i = 0; i < 52; i++) {
            int r1 = (int) (Math.random() * 52);
            int r2 = (int) (Math.random() * 52);
            String temp = Cards[r1];
            Cards[r1] = Cards[r2];
            Cards[r2] = temp;
        }
        return Cards;
    }

    //Distribute Cards to 4 Players
    public static void DistributeCards() {
        int index = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                Player[j][i] = ShuffledCards[index];
                index++;
            }
            for (int l = 0; l < 4; l++) {
                for (int m = 0; m < 9; m++) {
                    System.out.println(" " + Player[l][m]);
                }
            }
        }
    }
}
