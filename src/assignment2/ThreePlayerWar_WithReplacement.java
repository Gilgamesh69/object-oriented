package assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ThreePlayerWar_WithReplacement extends War{

	private Deck deck = new Deck();
	public Player player1 = new Player();
	public Player player2 = new Player();
	public Player player3 = new Player();
	ArrayList<Player> PLAYERS_IN;
	public int TURN_LIMIT = 55;
	public ArrayList<Card> p1_table = new ArrayList<Card>();
	public ArrayList<Card> p2_table = new ArrayList<Card>();
	public ArrayList<Card> p3_table = new ArrayList<Card>();
	public ArrayList<ArrayList<Card>> PLAYER_TABLES;
	private boolean WAR = false;
	
	public ThreePlayerWar_WithReplacement() {
		PLAYERS_IN = new ArrayList<Player>();
		PLAYERS_IN.add(player1);
		PLAYERS_IN.add(player2);
		PLAYERS_IN.add(player3);
		PLAYER_TABLES = new ArrayList<ArrayList<Card>>();
		PLAYER_TABLES.add(p1_table);
		PLAYER_TABLES.add(p2_table);
		PLAYER_TABLES.add(p3_table);
		player1.setName("BOB");
		player2.setName("JOE");
		player3.setName("PETE");
		give_players_cards();
		play();
	}
	@Override
	public void give_players_cards() {
		Set<Integer> hs = new HashSet<Integer>();
		Card[] cards = deck.getDeck();
		while(hs.size()<51){
			for(Player i : PLAYERS_IN) {
				while(i.hand.size() < (deck.getDECK_SIZE()-1)/3){
					int num = (int)( (Math.random()*100)%52);
					if(!hs.contains(num)) {
						i.addCardToHand(cards[num]);
						hs.add(num);
					}
				}
			}
		}
	}
	@Override
	public void turn() {
		int cnt = 0;
		placeCards();
		int winner = maxVal();
		if(winner <= PLAYERS_IN.size()) {
			clearTable(PLAYERS_IN.get(winner));
			System.out.println("ROUND TO "+ PLAYERS_IN.get(winner).getName());
			if(WAR) {
				System.out.println("WAR won by player1");
				this.WAR = false;
			}
		}else {
			System.out.println("WAR!!");
			war();			
		}
	}
	public int maxVal() {
		int max = 0;
		if(!PLAYER_TABLES.get(0).isEmpty() && !PLAYER_TABLES.get(1).isEmpty()){
		if(PLAYER_TABLES.get(0).get(PLAYER_TABLES.get(0).size()-1).getValue() == PLAYER_TABLES.get(1).get(PLAYER_TABLES.get(0).size()-1).getValue()) return 4;
		else if(PLAYER_TABLES.get(0).get(PLAYER_TABLES.get(0).size()-1).getValue() > PLAYER_TABLES.get(1).get(PLAYER_TABLES.get(0).size()-1).getValue()) {
			max = 0;
		}else{ max = 1; }
		}
		if(PLAYER_TABLES.size() == 3) {
			if(max == PLAYER_TABLES.get(2).get(PLAYER_TABLES.get(2).size()-1).getValue()) return 4;
			if(max > PLAYER_TABLES.get(2).get(PLAYER_TABLES.get(2).size()-1).getValue()) {
				return max;
			}else { return 2; }
		}
		return max;
	}
	@Override
	public void placeCards() {
		eliminate();
		int cnt = 0;
		for(Player i : PLAYERS_IN) {
			if(!i.hand.isEmpty()) {
			System.out.println(i.getName() + " plays :" + i.hand.get(0).getCardName());
			PLAYER_TABLES.get(cnt).add(i.hand.get(0));
			i.removeCardFromHand(0);
			cnt++;
			}
			else {continue;}
		}
	}
	//clear the table and add the cards to the designated player
	@Override
	public void clearTable(Player p) {
		System.out.println("CARDS ON TABLE: " + (p1_table.size() + p2_table.size() + p3_table.size()));
		for(ArrayList<Card> i : PLAYER_TABLES) {
			for(int j = 0; j < i.size(); j++) {
				p.addCardToHand(i.get(j));
			}
			i.clear();
		}
	}
	@Override
	public void war() {
		int cnt = 0;
		eliminate();
		for(Player i : PLAYERS_IN) {
			if(!i.hand.isEmpty())  {
				PLAYER_TABLES.get(cnt).add(i.hand.get(0));
				i.removeCardFromHand(0);
				cnt++;
			}else {continue;}
		}
		this.WAR = true;
	}
	public void eliminate() {

		if(PLAYERS_IN.get(0).hand.isEmpty()) {
				PLAYERS_IN.remove(0);
				PLAYER_TABLES.remove(0);
		}
		if(PLAYERS_IN.size() == 2) {
			if(PLAYERS_IN.get(1).hand.isEmpty()) {
				PLAYERS_IN.remove(1);
				PLAYER_TABLES.remove(1);
			}
		}
		if(PLAYERS_IN.size() == 3) {
			System.out.println(PLAYERS_IN.get(1).hand.isEmpty());
			if(PLAYERS_IN.get(2).hand.isEmpty()) {
				PLAYERS_IN.remove(2);
				PLAYER_TABLES.remove(2);
			}
		}
	}
	@Override
	public void play() {
		for(int i = 0; i < TURN_LIMIT; i++) {
			if(PLAYERS_IN.size()  < 2) break;
			turn();
		}
		if(player1.getScore() > player2.getScore() && player1.getScore() > player3.getScore()) {
			System.out.println(player1.getName()+ " WINS");
		}
		else if(player1.getScore() < player2.getScore() && player3.getScore() < player2.getScore()) {
			System.out.println(player2.getName()+ " WINS");
		}
		else if(player1.getScore() < player3.getScore() && player3.getScore() > player2.getScore()) {
			System.out.println(player3.getName()+ " WINS");
		}else {
			System.out.println("TIEEEEEE");
		}
	}
}
