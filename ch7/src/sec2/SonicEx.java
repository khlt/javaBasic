package sec2;

public class SonicEx {
	public static void main(String[] args) {
		SupersonicAirplane Airplane = new SupersonicAirplane();
		Airplane.takeOff();
		Airplane.fly();
		Airplane.flyMode = SupersonicAirplane.SUPERSONIC;
		Airplane.fly();
		Airplane.flyMode = SupersonicAirplane.NORMAL;
		Airplane.fly();
		Airplane.landing();
	}
}