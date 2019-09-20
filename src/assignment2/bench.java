package assignment2;
import java.util.*;
import java.math.*;
import java.util.Random;

public class bench {

	public static void main(String[] args) {

		Deck deck = new Deck();
		Card[] arr = deck.getDeck();
		for(int i = 0;i<52;i++) {
		//	System.out.println(arr[i].getCardName());
		}
		TwoPlayerWar war = new TwoPlayerWar();
		//war.give_players_cards();
		System.out.println();
		//war.player1.printHand();
		System.out.println();
		//war.player2.printHand();
		
	}

}