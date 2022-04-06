package sec3;

public class BikeEx {

	public static void main(String[] args) {
		Bike bike = new Bike();
		for(int i=1;i<101;i++) {
		int errorTire = bike.run();
		switch (errorTire) {
		case 1:
			System.out.println("앞타이어 교체");
			break;
		case 2:
			System.out.println("뒤타이어 교체");
			break;
		}
		System.out.println("---------------------");
		}
	}

}
