package assignment2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Deck {
	
	private int DECK_SIZE = 52;
	private ArrayList<Card> deck;
	
	public Deck() {	
		deck = new ArrayList<Card>();
	}
	public void addCardToDeck(Card c) {
		deck.add(c);
	}
	public void shuffle() {
		Collections.shuffle(deck);
	}
	public void setRandomDeck() {
		int deck_count = 0;
		while(deck_count < DECK_SIZE) {
			int suit_ran = (int)( (Math.random()*100)%4);
			String suit = null;
			if(suit_ran == 0) {
				suit = "HEARTS";
			}else if(suit_ran ==1) {
				suit = "DIAMONDS";
			}else if(suit_ran ==2) {
				suit = "CLUBS";
			}else if(suit_ran ==3) {
				suit = "SPADES";
			}
			
			int val = (int)( (Math.random()*100)%13)+2;
			Card c = new Card(suit,val);
			deck.add(c);
			deck_count++;
		}
	}
	public void setStandardDeck() {
		for(int i = 2; i < 15; i++) {
			deck.add(new Card("HEARTS",i));
			deck.add(new Card("DIAMONDS",i));
			deck.add(new Card("CLUBS",i));
			deck.add(new Card("SPADES",i));
		}
	}
	public int getDECK_SIZE() {
		return DECK_SIZE;
	}
	public void setDECK_SIZE(int dECK_SIZE) {
		DECK_SIZE = dECK_SIZE;
		deck = new ArrayList<Card>(DECK_SIZE);
	}
	public ArrayList<Card> getDeck() {
		return deck;
	}
	public Card getCard(int index) {
		return deck.get(index);
	}
}
