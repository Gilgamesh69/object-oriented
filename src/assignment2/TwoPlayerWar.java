package assignment2;

import java.util.HashSet;
import java.util.Set;

public class TwoPlayerWar {
	
	private Deck deck = new Deck();
	public Player player1 = new Player();
	public Player player2 = new Player();
	public int TURN_LIMIT = 20;
	
	public TwoPlayerWar() {
		give_players_cards();
		coin_flip();
		play();
	}
	/**
	 * Deal the cards to players
	 */
	public void give_players_cards() {
		Set<Integer> hs = new HashSet<Integer>();
		Card[] cards = deck.getDeck();
		boolean p2 = false;
		while(hs.size()<52){
			int num = (int)( (Math.random()*100)%52);
			if(!hs.contains(num)) {
				if(p2) {
					player2.addCardToHand(cards[num]);
				}else {
					player1.addCardToHand(cards[num]);
				}
				hs.add(num);
				if(hs.size() == (deck.getDECK_SIZE()-1)/2) {
					p2 = true;
				}
			}
		}
	}
	public void coin_flip() {
		if(Math.random() < 0.49) {
			System.out.println("Player1!!!");
		}else {
			System.out.println("PLAYErr2!!@!!##");
		}
	}
	public void turn(int index) {
		System.out.println("Player1 plays :" + player1.hand.get(index).getCardName());
		System.out.println("Player2 plays :" + player2.hand.get(index).getCardName());
		if(player1.hand.get(index).getValue() > player2.hand.get(index).getValue()) {
			player1.incrementScore();
			System.out.println("ROUND TO P1");
			System.out.println();
			//player1.removeCardFromHand(index);
			//player2.removeCardFromHand(index);
		}
		else if(player1.hand.get(index).getValue() < player2.hand.get(index).getValue()) {
			player2.incrementScore();
			System.out.println("ROUND TO P2");
			System.out.println();
			//player1.removeCardFromHand(index);
			//player2.removeCardFromHand(index);
		}else {
			System.out.println("WAR!! HUA! YEAH!");
		}
	}
	public void play() {
		for(int i = 0; i < TURN_LIMIT; i++) {
			turn(i);
		}
		if(player1.getScore() > player2.getScore()) {
			System.out.println("PLAYER1 WINS");
		}
		else if(player1.getScore() < player2.getScore()) {
			System.out.println("PLAYER2 WINS");
		}else {
			System.out.println("TIEEEEEE");
		}
		
	}

}
