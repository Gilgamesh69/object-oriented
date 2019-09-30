package assignment2;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {
	private String name;
	public ArrayList<Card> hand;
	public ArrayList<Card> pointsPile;
	public boolean player_in = true; //player still in game
	public Player() {
		hand = new ArrayList<Card>();
		pointsPile = new ArrayList<Card>();
	}
	/**
	 * add a card to players hand
	 * @param card
	 */
	public void addCardToHand(Card card) {
		hand.add(card);
	}
	public void printHand() {
		for(Card i : hand) {
			System.out.print(i.getCardName());
		}
	}
	public void addToPointPile(Card c) {
		pointsPile.add(c);
	}
	/**
	 * Remove card from hand
	 * @param index
	 */
	public void removeCardFromHand(int index) {
		if(hand.isEmpty()) {
			this.player_in = false;
		}else {
			hand.remove(index);
		}
		
	}
	public int getScore() {
		return pointsPile.size();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void eliminated() {
		System.out.println("PLAYER ELEMINATED" + name);
		this.player_in = false;
	}
}
