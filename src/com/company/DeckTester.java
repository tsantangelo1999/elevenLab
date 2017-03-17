package com.company;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args)
	{
		String[] dank = {"a", "b", "c"};
        String[] memes = {"f", "g"};
        int[] fourTwenty = {1, 2, 3};
        Deck d1 = new Deck(dank, memes, fourTwenty);
        Deck d2 = new Deck(new String[] {"one", "two", "three"}, new String[] {"yes", "no", "maybe"}, new int[] {5, 1, 8});
        Deck d3 = new Deck(new String[] {"jack", "queen", "king", "ace"}, new String[] {"clubs", "diamonds", "hearts", "spades"}, new int[] {1, 2, 3, 4});
        System.out.println(d1.size());
        System.out.println(d1.deal().toString());
        System.out.println(d1.size());
        while(d2.size() > 0)
        {
            d2.deal();
        }
        System.out.println(d2.isEmpty());
        System.out.println(d3.size());
        System.out.println(d3.deal().toString());
        System.out.println(d3.isEmpty());
        System.out.println(d3.toString());
    }
}
