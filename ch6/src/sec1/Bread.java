package sec1;

public class Bread {
	//필드 : 현재 클래스의 특성의 값을 저장할 수 있는 변수	//필드의 대한 접근제한자는 모두 클래스 내부에서만 접근가능해야함
	//[접근제한자][지시자]변수타입 필드명;
	private String name;
	private String matrial;
	private int gram;
	private int price;
	private int cnt;
	//this()함수를 활용한 오버로딩
	Bread("빵");
	Bread(String name){
		this(name,"밀가루");
	}
	Bread(String name, String matrial){
		this(name,matrial,90);
	}
	Bread(String name, String matrial, int gram){
		this(name,matrial,gram,1500);
	}
	Bread(String name, String matrial, int gram, int price){
		this(name,matrial,gram,price,1);
	}
	Bread(String name, String matrial, int gram, int price, int cnt){
		this.name = name;
		this.matrial = matrial;
		this.gram=gram;
		this.price=price;
		this.cnt=cnt;
	}	
	//금액=가격*개수
	public int computeTotal() {
		return this.price*this.cnt;
	}
	public int computeTotal(int price) {
		return this.price*this.cnt;
	}
	public int computeTotal(int price, int cnt) {
		return price*cnt;
	}
	public String getName() {
		return name;
	}
	public String getMatrial() {
		return matrial;
	}
	public int getGram() {
		return gram;
	}
	public int getPrice() {
		return price;
	}
	public int getCnt() {
		return cnt;
	}
	
}
	//생성자: 현재 클래스로부터 객체를 생성해주는 함수-> 오버로딩:this()함수 활용
	
	
	//메서드: 현재 클래스로 부터 만든 객체의 처리방법이나 동작을 구현하기 위한 함수
	//반환타입의 경우 반환이 없는 경우는 void, 그 밖에 return 문으로 반환되는 결과의 타입을 적어야 함
	//전급제한자 반환타입 메서드명([변수타입 매개변수]){
	//처리구문;
	//}
	


