package AbstractFactory;

public class CombatFactory implements SuitAbstractFactory {
	@Override
	public Suit createSuit() {
		System.out.println("CombatFactory~!");
		return new Suit();
	}
}
