package ex7;

public class Child extends Parent{
	private int studentNo;
	public Child(String name, int studentNo) {

		super(name);   // 부모 클래스 생성자 먼저 super를 통해 정의

		this.studentNo = studentNo;

		}

	}

