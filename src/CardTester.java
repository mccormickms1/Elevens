/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card mark = new Card("King", "Diamonds", 10);
		Card susan = new Card("King", "Diamonds", 10);
		Card dad = new Card("Five", "Spades", 5);
		System.out.println(mark.rank());
		System.out.println(mark.suit());
		System.out.println(mark.pointValue());
		System.out.println(mark.matches(susan));
		System.out.println(mark.matches(dad));
		System.out.println(mark.toString());
	}
}
