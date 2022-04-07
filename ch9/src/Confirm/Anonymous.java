package Confirm;

public class Anonymous {
	Vehicle field = new Vehicle() {
		public void run() {System.out.println("자전거달림");}//인터페이스의 익명의 객체 생성
	};
	void method1() {	//메서드 호출시 인터페이스의 익명의 객체 생성
		Vehicle localVar = new Vehicle() {
			
		}
		localVar.run();
	}
	void method2(Vehicle v) {	//메서드 호출시 인터페이스를 매개변수로 받아 메서드 실행 
		v.run();
	}
}