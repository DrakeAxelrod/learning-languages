package cards;
import java.util.Collections;
import java.util.Stack;

import javax.swing.SpringLayout;

public class Deck
{
    // actual deck
    private Stack<Card> deck;

    // array that associates the value of suit of a card with a actual suit
    public static final String[] SUITS = {"C", "D", "H", "S"};
    // array that associates the rank of a card with the correspond card
    public static final String[] RANKS = {null, "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Deck()
    {
        this.deck = populateDeck();
    }

    private Stack<Card> populateDeck()
    {
        Stack<Card> tmp = new Stack<>();
        for (int i = 0; i <= 3; i++)
            for (int j = 1; j<=13; j++)
                tmp.push(new Card(i, j));
        Collections.shuffle(tmp);
        return tmp;
    }

    public boolean isFace(Card card)
    {
        if (card.getRank() == 11 || card.getRank() == 12 || card.getRank() == 13) return true;
        return false;
    }

    public boolean isAce(Card card)
    {
        if (card.getRank() == 1) return true;
        return false;
    }

    public Stack<Card> getDeck() 
    {
        return deck;
    }

    @Override
    public String toString() 
    {
        return "Current in deck: " + deck.toString();
    }

    public static void main(String[] args) {
        Deck a = new Deck();
        Stack<Card> d = a.populateDeck();
        System.out.print(d.toString());
    }
}
