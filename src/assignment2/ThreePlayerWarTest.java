package assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ThreePlayerWarTest {
	
	ThreePlayerWar war = new ThreePlayerWar();
	@Before
	public void setup() {
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
	}
	@Test
	public void testGive_players_cards() {
		war.give_players_cards();
		assertEquals(2,war.player1.hand.size());
		assertEquals(2,war.player2.hand.size());
		assertEquals(2,war.player3.hand.size());
	}
	@Test
	public void testTurn() {
		assertEquals(false,war.p1_table.isEmpty());
		assertEquals(false,war.p2_table.isEmpty());
		assertEquals(false,war.p2_table.isEmpty());
	}
	@Test
	public void testPlaceCards() {
		war.placeCards();
		assertEquals(1,war.p1_table.size());
		assertEquals(1,war.p2_table.size());
		assertEquals(1,war.p2_table.size());
		assertEquals(1,war.player1.hand.size());
		assertEquals(1,war.player2.hand.size());
		assertEquals(1,war.player3.hand.size());
	}

	@Test
	public void testClearTable() {
		war.clearTable(p);
	}

	@Test
	public void testWar() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testPlay() {
		fail("Not yet implemented"); // TODO
	}


}
