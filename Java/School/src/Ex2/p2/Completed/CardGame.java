package Ex2.p2.Completed;

import java.util.*;

public class CardGame {
    public static void main(String[] args) {
        Random rn = new Random();
        int card = rn.nextInt(13 - 1) + 1;
        int suitPicker = rn.nextInt(4 - 1) + 1;
        String suit;
        String king = "K";
        String queen = "Q";
        String jack = "J";
        String ace = "A";
            if (suitPicker == 1) {
                suit = "D";
            } else if (suitPicker == 2) {
                suit = "S";
            } else if (suitPicker == 3) {
                suit = "C";
            } else {
                suit = "H";
            }
            if (card == 1) {
                System.out.println(ace + suit);
            } else if (card == 11) {
                System.out.println(jack + suit);
            } else if (card == 12) {
                System.out.println(queen + suit);
            } else if (card == 13) {
                System.out.println(king + suit);
            } else {
                System.out.println(card + suit);
            }
    }
}
/*
Write a program that simulates picking a (random) card from a deck  of 52 cards.
Your program should display the rank ( Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King )
and suit (Clubs, Diamonds, Hearts, Spades) of the card.

 */