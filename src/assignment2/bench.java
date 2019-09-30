package assignment2;
import java.util.*;
import java.math.*;
import java.util.Random;

public class bench {

	public static void main(String[] args) {
		ThreePlayerWar war = new ThreePlayerWar();
		war.deck.setDECK_SIZE(6);
		Card a = new Card("HEARTS",12);
		Card b = new Card("DIAMONDS",3);
		Card c = new Card("CLUBS",4);
		Card d = new Card("SPADES",12);
		Card e = new Card("CLUBS",6);
		Card f = new Card("SPADES",11);
		war.deck.addCardToDeck(a);
		war.deck.addCardToDeck(b);
		war.deck.addCardToDeck(c);
		war.deck.addCardToDeck(d);
		war.deck.addCardToDeck(e);
		war.deck.addCardToDeck(f);
		war.give_players_cards();
		war.player1.printHand();
		war.player2.printHand();
		war.player3.printHand();
		war.placeCards();
		war.player1.printHand();
		war.player2.printHand();
		war.player3.printHand();
		//Card[] arr = deck.getDeck();
		
		//ThreePlayerWar war = new ThreePlayerWar();

		//war.give_players_cards();
		System.out.println();
		//war.player1.printHand();
		System.out.println();
		//war.player2.printHand();
		//ThreePlayerWar_noR war2 = new ThreePlayerWar_noR();
	}

}