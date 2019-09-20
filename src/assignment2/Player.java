package assignment2;

import java.util.ArrayList;
import java.util.HashMap;

public class Player {
	private String name;
	private int score;
	public ArrayList<Card> hand;
	
	public Player() {
		hand = new ArrayList<Card>();
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
			System.out.println(i.getCardName());
		}
	}
	/**
	 * Remove card from hand
	 * @param index
	 */
	public void removeCardFromHand(int index) {
		hand.remove(index);
	}
	public void incrementScore() {
		score++;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

}
