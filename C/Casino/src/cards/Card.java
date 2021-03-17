package cards;

public class Card
{
    private int suit;
    private int rank;

    public Card(int suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    public int getRank() 
    {
        return rank;
    }
    public int getSuit() 
    {
        return suit;
    }

    public String toString() {
        return "[" + Deck.RANKS[this.rank] + "/" + Deck.SUITS[this.suit] + "]";
    }
}