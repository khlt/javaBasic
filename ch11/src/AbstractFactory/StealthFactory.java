package AbstractFactory;

public class StealthFactory implements SuitAbstractFactory {
	@Override
	public Suit createSuit() {
		System.out.println("StealthFactory~!");
		return new Suit();
	}
}
