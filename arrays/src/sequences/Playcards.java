package sequences;

/**
 * Prints all cards from standart card deck
 * 
 * @author 888
 *
 */
public class Playcards {

	static String[] cardSuits = { "spade", "diamond", "heart", "club" };
	static String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
			"J", "Q", "K", "A" };

	public static void printAll() {
		for (String card : cards) {
			for (String suit : cardSuits) {
				System.out.printf("%s " + "%s, ", card, suit);
			}
			System.out.println();
		}
	}

}
