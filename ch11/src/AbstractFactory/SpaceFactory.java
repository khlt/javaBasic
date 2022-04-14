package AbstractFactory;

public class SpaceFactory implements SuitAbstractFactory {
	@Override
	public Suit createSuit() {
		System.out.println("SpaceFactory~!");
		return new Suit();
	}
}
