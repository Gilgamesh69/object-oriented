package assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {
	Player p1 = new Player();
	Card c = new Card("DIAMONDS",12);
	@Test
	public void testAddCardToHand() {
		p1.addCardToHand(c);
		assertEquals(1,p1.hand.size());
	}

	@Test
	public void testAddToPointPile() {
		p1.addToPointPile(c);
		assertEquals(1,p1.pointsPile.size());
	}

	@Test
	public void testRemoveCardFromHand() {
		p1.removeCardFromHand(0);
		assertEquals(0,p1.hand.size());
	}

	@Test
	public void testGetScore() {
		assertEquals(1,p1.getScore());
	}

	@Test
	public void testSetName() {
		p1.setName("BOB");
		assertEquals("BOB",p1.getName());
	}
}
