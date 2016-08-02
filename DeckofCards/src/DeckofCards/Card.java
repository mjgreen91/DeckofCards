package DeckofCards;

/**
 * Card
 * A card object represents a traditional playing card.
 * Each card has a suit (Spades, Hearts, Diamonds or Clubs) and a numerical value (1-13).
 * The face cards (Ace, Jack, Queen & King) are represented by the values 1, 11, 12 & 13 respectively.  
 * @author Mathew Green
 */
public class Card {

	char suit;
	int value;
	
	/**
	 * Create a new Card object with the given suit and value.
	 * @param s - The char representation of the Cards suit.
	 * @param v - The numerical value of the card.
	 */
	public Card(char s, int v){
		suit = s; //[s]pades, [h]earts, [d]iamonds or [c]lubs.
		value = v; //1-13. Ace = 1, Jack = 11, Queen = 12, King = 13. 
	}
	
	/**
	 * Return the suit of the card.
	 * @returns the char representation of the Cards suit.
	 */
	public char getSuit(){
		return suit;
	}
	
	/**
	 * Return the value of the card.
	 * @returns the numerical value of the card.
	 */
	public int getValue(){
		return value;
	}
	
	/**
	 * Determine the full suit from the char value.
	 * @returns the full name of the cards suit.
	 */
	public String getFullSuit(){
		switch (suit){
		case 's' : return "Spades";
		case 'h' : return "Hearts";
		case 'd' : return "Diamonds";
		default : return "Clubs";
		}
	}
	
	/**
	 * Determine the face value of the card from the numerical value.
	 * @returns the face value of the card.
	 */
	public String getFaceValue(){
		if(value == 1){
			return "Ace";
		} else if(value == 11){
			return "Jack";
		} else if(value == 12){
			return "Queen";
		} else if(value == 13){
			return "King";
		} else {
			return Integer.toString(value);
		}
	}
	
	/**
	 * Builds and returns a sentence describing the cards suit and value.
	 * @returns the face value and full suit of the card.
	 */
	public String getCard(){
		return this.getFaceValue() + " of " + this.getFullSuit();
	}
	
}
