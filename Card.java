package Assignment2;

public class Card {
	
	
	private String suit;
	private String cardName;

	private int value;
	
	public Card(String suit, int value) {
		this.suit = suit;
		this.value = value;
		setCardName();
	}

	public String getCardName() {
		return cardName;
	}
	
	public void setCardName() {
		if(value == 11)
			this.cardName = "Jack";
		else if(value == 12)
			this.cardName = "Queen";
		else if(value == 13)
			this.cardName = "King";
		else if(value == 14)
			this.cardName = "Ace";
		else {
			this.cardName = String.valueOf(value);
			}
			
	}
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	

}
