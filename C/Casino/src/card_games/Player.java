package card_games;

import java.util.TreeSet;
import java.util.stream.Collectors;

import cards.Card;

public class Player 
{
    private String name;
    private TreeSet<Card> hand;

    public Player(String name)
    {
        this.name = name;
        this.hand = new TreeSet<>();
    }

    public void draw(Card card)
    {
        hand.add(card);
    }
    
    public TreeSet<Card> getHand() 
    {
        return hand;
    }

    public int handValue()
    {
        return hand.stream().collect(Collectors.summingInt(Card::getRank));
    }

    public String getName() 
    {
        return name;
    }
}
