package assignment2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class DeckTest {
	private Deck deck = new Deck();
	@Test
	public void testGetDECK_SIZE() {
		assertEquals(52, deck.getDECK_SIZE());
	}
	@Test
	public void testDeckIsSet() {
		Set<String> set = new HashSet<String>();
		for(Card i : deck.getDeck()) {
			set.add(i.getCardName());
		}
		assertEquals(52, set.size());
	}

}
