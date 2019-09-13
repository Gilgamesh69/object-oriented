package assignment2;
import java.util.HashSet;
import java.util.Set;

public class Deck {
	private int DECK_SIZE = 52;
	private Card[] deck;
	
	public Deck() {
		deck = new Card[DECK_SIZE];
		setDeck();
		
	}
	private void setDeck() {
		int deck_count = 0;
		for(int i = 2; i < 15; i++) {
			Card heart = new Card("HEARTS",i);
			Card diamond = new Card("DIAMONDS",i);
			Card club = new Card("CLUBS",i);
			Card spade = new Card("SPADES",i);
			deck[deck_count] = heart;
			deck_count++;
			deck[deck_count] = diamond;
			deck_count++;
			deck[deck_count] = club;
			deck_count++;
			deck[deck_count] = spade;
			deck_count++;
			
		}
	}
	public int getDECK_SIZE() {
		return DECK_SIZE;
	}
	public void setDECK_SIZE(int dECK_SIZE) {
		DECK_SIZE = dECK_SIZE;
	}
	public Card[] getDeck() {
		return deck;
	}
}
