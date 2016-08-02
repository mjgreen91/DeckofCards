package DeckofCards;

import java.util.ArrayList;

/**
 * Pile
 * The Pile represents a set of cards on the table.
 * They are similar to hands but are not private to a player.
 * Cards can only be added/removed from the top of the pile.
 * @author Mathew Green
 */
public class Pile {

	ArrayList<Card> pile;
	
	public Pile() {
		pile = new ArrayList<Card>();
	}
	
	/**
	 * Adds the given card to the top of the pile.
	 * @param c - the card to be added.
	 */
	public void addCard(Card c){
		pile.add(pile.size(), c);
	}
	
	/**
	 * Removes the top card from the pile.
	 */
	public void removeCard(){
		pile.remove(pile.size());
	}
	
	/**
	 * Get the top card of the pile.
	 * @returns the top card on the pile.
	 */
	public Card getTopCard(){
		return pile.get(pile.size());
	}
	
	/**
	 * Get the number of cards left in the pile.
	 * @returns the number of cards left in the pile.
	 */
	public int pileSize(){
		return pile.size();
	}
}
