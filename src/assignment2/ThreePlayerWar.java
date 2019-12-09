package assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ThreePlayerWar extends War{
	//public Deck deck = new Deck();
	public Player player1 = new Player();
	public Player player2 = new Player();
	public Player player3 = new Player();
	
	
	public int TURN_LIMIT = 18;
	
	public ArrayList<Card> p1_table = new ArrayList<Card>();
	public ArrayList<Card> p2_table = new ArrayList<Card>();
	public ArrayList<Card> p3_table = new ArrayList<Card>();
	public ArrayList<ArrayList<Card>> PLAYER_TABLES;
	private boolean WAR = false;
	
	public ThreePlayerWar(Player p1, Player p2, Player p3) {
		this.player1 =p1;
		this.player2 = p2;
		this.player3 = p3;
		PLAYERS_IN = new ArrayList<Player>();
		PLAYERS_IN.add(player1);
		PLAYERS_IN.add(player2);
		PLAYERS_IN.add(player3);
		PLAYER_TABLES = new ArrayList<ArrayList<Card>>();
		PLAYER_TABLES.add(p1_table);
		PLAYER_TABLES.add(p2_table);
		PLAYER_TABLES.add(p3_table);
	}
	@Override
	public void give_players_cards() {
		for(int i = 0; i < deck.getDECK_SIZE();) {
			for(Player j : PLAYERS_IN) {
				j.addCardToHand(deck.getCard(i));
				//System.out.println(i);
				i++;
				if(i >= deck.getDECK_SIZE()) {break;}
			}
		}
	}
	@Override
	public void turn() {
		eliminate();
		placeCards();
		int winner = maxVal();
		if(winner == 4) {
			System.out.println("WAR!!");
			war();	
		}
		else {
			clearTable(PLAYERS_IN.get(winner));
			System.out.println("ROUND TO "+ PLAYERS_IN.get(winner).getName());
			if(WAR) {
				System.out.println("WAR won by "+PLAYERS_IN.get(winner).getName() );
				this.WAR = false;
			}
		}
	}
	public int maxVal() {
		int highValue = 0;
		int cnt = 0;
		int player_index = 0;
		for(Player i : PLAYERS_IN) {
			if(i.player_in) {
				if(PLAYER_TABLES.get(cnt).get(PLAYER_TABLES.get(cnt).size()-1).getValue() == highValue) {
					return 4;
				}else if(PLAYER_TABLES.get(cnt).get(PLAYER_TABLES.get(cnt).size()-1).getValue() > highValue) {
					highValue = PLAYER_TABLES.get(cnt).get(PLAYER_TABLES.get(cnt).size()-1).getValue();
					player_index = cnt;
				}
			}
			cnt++;
		}
		return player_index;
	}
	@Override
	public void placeCards() {
		int cnt = 0;
		for(Player i : PLAYERS_IN) {
			if(i.player_in) {
				System.out.println(i.getName() + " plays :" + i.hand.get(0).getCardName());
				PLAYER_TABLES.get(cnt).add(i.hand.get(0));
				i.removeCardFromHand(0);
			}
			cnt++;
		}
	}
	//clear the table and add the cards to the designated player
	@Override
	public void clearTable(Player p) {
		System.out.println("CARDS ON TABLE: " + (p1_table.size() + p2_table.size() + p3_table.size()));
		for(ArrayList<Card> i : PLAYER_TABLES) {
			for(int j = 0; j < i.size(); j++) {
				p.addToPointPile(i.get(j));
			}
			i.clear();
		}
	}
	@Override
	public void war() {
		eliminate();
		int cnt = 0;
		for(Player i : PLAYERS_IN) {
			if(i.player_in) {
				PLAYER_TABLES.get(cnt).add(i.hand.get(0));
				i.removeCardFromHand(0);
				cnt++;
			}
			else { cnt++; }
		}
		this.WAR = true;
	}
	public void eliminate() {
		for(Player i : PLAYERS_IN) {
			if(i.hand.isEmpty()) {
				i.player_in = false;
			}
		}
	}
	@Override
	public void play() {
		for(int i = 0; i < TURN_LIMIT; i++) {
			System.out.println("TURN: "+i);
			turn();
		}
		System.out.println("SCORE BOARD:\n");
		for(Player i : PLAYERS_IN) { System.out.println(i.getName() + " HAS :" + i.getScore());}
		if(player1.getScore() > player2.getScore() && player1.getScore() > player3.getScore()) { System.out.println(player1.getName()+ " WINS");}
		else if(player1.getScore() < player2.getScore() && player3.getScore() < player2.getScore()) { System.out.println(player2.getName()+ " WINS");}
		else if(player1.getScore() < player3.getScore() && player3.getScore() > player2.getScore()) {System.out.println(player3.getName()+ " WINS");
		}else {System.out.println("TIEEEEEE");}
	}
	public void setTurnLimit(int limit) {
		this.TURN_LIMIT = limit;
	}
}