package card_games;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.stream.Collectors;
import cards.Card;
import cards.Deck;

public class Blackjack 
{
    private Stack<Card> deck;
    private Queue<Card> discard;
    private TreeSet<Player> players;

    public Blackjack() 
    {
        this.deck = new Deck().getDeck();
        this.discard = new LinkedList<Card>();
        this.players = new TreeSet<>();
    }

    public void addPlayer(Player player)
    {
        players.add(player);
    }



    public Card deal() {
        discard.add(deck.peek());
        return deck.pop();
    }

    public Card hit()
    {
        deck.peek();
        return deck.pop();
    }

    public boolean isTwentyOne(Player player)
    {
        if (player.handValue() == 21) return true;
        return false;
    }

    public boolean bust(Player player)
    {
        if (player.handValue() > 21) return true;
        return false;
    }

    public Stack<Card> getDeck() 
    {
        return deck;
    }

    public Queue<Card> getDiscard() 
    {
        return discard;
    }

    public TreeSet<Player> getPlayers() 
    {
        return players;
    }
}
