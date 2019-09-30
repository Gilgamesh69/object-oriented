package assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TwoPlayerWar_noR extends War{
	
	private Deck deck = new Deck();
	public Player player1 = new Player();
	public Player player2 = new Player();
	public int TURN_LIMIT = 20;
	public ArrayList<Card> p1_table = new ArrayList<Card>();
	public ArrayList<Card> p2_table = new ArrayList<Card>();
	private boolean WAR = false;
	
	public TwoPlayerWar_noR() {}
	/**
	 * Deal the cards to players
	 */
	@Override
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
	@Override
	public void turn() {
		placeCards();
		//if player1 wins
		if(p1_table.get(p1_table.size()-1).getValue() > p2_table.get(p2_table.size()-1).getValue() ) {
			clearTable(player1);
			System.out.println("ROUND TO " + player1.getName());
			System.out.println();
			if(WAR) {
				System.out.println("WAR won by " + player1.getName());
				this.WAR = false;
			}
		}
		//if player2 wins
		else if(p1_table.get(p1_table.size()-1).getValue() < p2_table.get(p2_table.size()-1).getValue() ) {
			clearTable(player2);
			System.out.println("ROUND TO " + player2.getName());
			System.out.println();
			if(WAR) {
				System.out.println("WAR won by " + player2.getName());
				this.WAR = false;
			}
		}else {
			System.out.println("WAR!!");
			war();
		}
	}
	@Override
	public void placeCards() {
		System.out.println(player1.getName() + " plays :" + player1.hand.get(0).getCardName());
		System.out.println(player2.getName() + " plays :" + player2.hand.get(0).getCardName());
		p1_table.add(player1.hand.get(0));
		p2_table.add(player2.hand.get(0));
		player1.removeCardFromHand(0);
		player2.removeCardFromHand(0);
	}
	//clear the table and add the cards to the designated player
	@Override
	public void clearTable(Player p) {
		System.out.println("CARDS ON TABLE: " + (p1_table.size() + p2_table.size()));
		for(int i = 0;i < p1_table.size();i++) {
			
			p.addToPointPile(p1_table.get(i));
			p.addToPointPile(p2_table.get(i));
			System.out.println(p.getName() + " Points: " + p.pointsPile.size());
		}
		p1_table.clear();
		p2_table.clear();
	}
	@Override
	public void war() {
		p1_table.add(player1.hand.get(0));
		p2_table.add(player2.hand.get(0));	
		player1.removeCardFromHand(0);
		player2.removeCardFromHand(0);
		this.WAR = true;
	}
	/**
	 * play game
	 */
	@Override
	public void play() {
		for(int i = 0; i < TURN_LIMIT; i++) {
			turn();
		}
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " WINS");
		}
		else if(player1.getScore() < player2.getScore()) {
			System.out.println(player2.getName()+" WINS");
		}else {
			System.out.println("TIEEEEEE");
		}
	}

}
