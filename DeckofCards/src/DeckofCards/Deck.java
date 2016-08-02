package DeckofCards;

import java.util.ArrayList;
import java.util.Random;

/**
 * The Deck object represents a traditional deck of 52 playing cards.
 * A deck can be built, shuffled, deal cards to hands/piles and have cards added back in.
 * @author Mathew Green
 */
public class Deck {
	
	ArrayList<Card> deck;
	
	/**
	 * Build a new deck of 52 cards (4 suits x 13 values)
	 */
	public Deck(){
		deck = new ArrayList<Card>();
		char[] suits = {'s','h','d','c'};
		
		//Loop through and create the 52 cards
		for(int i = 0; i < suits.length; i++){
			int j = 0;
			while(j <= 13){
				Card c = new Card(suits[i], j);
				deck.add(c);
			}
		}
	}
	
	/**
	 * Randomise the order of the deck.
	 */
	public void shuffleDeck(){
		Random r = new Random();
		ArrayList<Card> temp = deck; //Copy the deck
		deck.clear(); //empty the original
		
		while (temp.size() > 0){
			//Pull a random card out of the copied deck and insert it in the main deck.
			int i = r.nextInt(temp.size());
			deck.add(temp.get(i));
			temp.remove(i);
		}
	}
	
	/**
	 * Remove a card from the deck and add it to the specified hand.
	 * @param h - The hand to add the card to.
	 */
	public void dealtoHand(Hand h){
		h.addCard(deck.get(deck.size()));
	}
	
	/**
	 * Remove a card from the deck and add it to the specified pile.
	 * @param p - The pile to add the card to.
	 */
	public void dealtoPile(Pile p){
		p.addCard(deck.get(deck.size()));
	}
	
	/**
	 * Add a card back into the bottom of the deck.
	 * @param c
	 */
	public void addToBottom(Card c){
		deck.add(0, c);
	}
	
	/**
	 * Add a card back into the deck in a random place.
	 * @param c - The card to add back into the deck
	 */
	public void addRandom(Card c){
		Random r = new Random();
		int i = r.nextInt(deck.size() - 3);
		deck.add(i, c);
	}
	
	/**
	 * How many cards are left in the deck.
	 * @returns the number of cards left in the deck.
	 */
	public int cardsLeft(){
		return deck.size();
	}
}
