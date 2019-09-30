package assignment2;

public abstract class War {
	private Deck deck = new Deck();
	private boolean WAR;
	
	public abstract void turn();
	public abstract void placeCards();	
	public abstract void clearTable(Player p);
	public abstract void war();
	public abstract void play();
	public abstract void give_players_cards();
}
