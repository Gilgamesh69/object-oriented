package Assignment2;

import java.util.Random;

public class TwoPlayerWar {
	
	private Deck deck = new Deck();
	private Player player1 = new Player();
	private Player player2 = new Player();
	
	public TwoPlayerWar() {
		give_players_cards();
	}
	public void give_players_cards() {
		int[] rand = new Random().ints(0, 14).distinct().limit(52).toArray();
		for(int i : rand) {
			System.out.println(i);
		}
	}
	

}
