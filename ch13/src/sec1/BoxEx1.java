package sec1;
//제네릭 : 숫자든 문자든 타입에 관계없이 저장 및 전달이 가능하도록 한 구조
//클래스이름<T> { private T t; get; set; }
class Tax<T>{
	private T a;

	public T getA() {
		return a;
	}
	public void setA(T a) {
		this.a = a;
	}
}
public class BoxEx1 {

	public static void main(String[] args) {
		Tax<String> box1 = new Tax<String>();
		box1.setA("tava");
		System.out.println(box1.getA());
		
		Tax<Integer> box2 = new Tax<Integer>();
		box2.setA(1004);
		System.out.println(box2.getA());

	}
}
