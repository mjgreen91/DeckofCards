package DeckofCards;

import java.util.ArrayList;

/**
 * The Hand object represents a players hand in the game.
 * Cards can be added/removed from the hand and sorted to provide better reading order to users.
 * @author Mathew Green
 */
public class Hand {

	ArrayList<Card> hand;
	
	public Hand(){
		hand = new ArrayList<Card>();
	}
	
	/**
	 * Add a new card to the hand
	 * @param c - the card to be added
	 */
	public void addCard(Card c){
		hand.add(c);
	}
	
	/**
	 * Removes the selected card from the hand.
	 * @param c
	 */
	public void removeCard(Card c){
		hand.remove(c);
	}
	
	/**
	 * Get how many cards are left in the hand.
	 * @returns the number of cards in the hand.
	 */
	public int handSize(){
		return hand.size();
	}
}
