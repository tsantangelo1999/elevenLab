package com.company;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("ace", "hearts", 2);
        Card card2 = new Card("jack", "spades", 1);
        Card card3 = new Card("ace", "hearts", 2);
        System.out.println(card1.suit()); //hearts
        System.out.println(card1.rank()); //ace
        System.out.println(card1.pointValue()); //2
        System.out.println(card1.matches(card2)); //false
        System.out.println(card2.suit()); //spades
        System.out.println(card2.rank()); //jack
        System.out.println(card2.pointValue()); //1
        System.out.println(card2.matches(card3)); //false
        System.out.println(card3.suit()); //hearts
        System.out.println(card3.rank()); //ace
        System.out.println(card3.pointValue()); //2
        System.out.println(card3.matches(card1)); //true
    }
}
