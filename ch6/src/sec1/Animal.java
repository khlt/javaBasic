package sec1;

public class Animal {

	private String name;
	private String type;
	private int legs;
	private int wings;
	private boolean spine;
	private float speed;
	
	Animal(String name, String type, int legs, int wings, boolean spine, float speed) {
		
		this.name = name;
		this.type = type;
		this.legs = legs;
		this.wings = wings;
		this.spine = spine;
		this.speed = speed;
	}
	
	public void running(){System.out.println("동물이 달립니다.");
	}
	public running(String name){
		System.out.println(name+"가 달립니다.");	
	}
	public running(Stringg name,float speed) {
		System.out.println(name+"가 "+speed+"속도로 달립니다.");
	}
}
