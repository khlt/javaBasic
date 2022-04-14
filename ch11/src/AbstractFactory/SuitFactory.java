package AbstractFactory;

public class SuitFactory {
	static public Suit getSuit(SuitAbstractFactory suitAbstractFactory) {
		return suitAbstractFactory.createSuit();
	}
}