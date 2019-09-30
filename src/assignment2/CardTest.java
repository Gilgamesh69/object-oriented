package assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {
	public Card c = new Card("DIAMONDS",12);
	@Test
	public void testGetSuit() {
		assertEquals("DIAMONDS",c.getSuit());
	}

	@Test
	public void testGetValue() {
		assertEquals(12,c.getValue());
	}
	@Test
	public void testSetCardName() {
		assertEquals("Queen of DIAMONDS",c.getCardName());
	}



}
