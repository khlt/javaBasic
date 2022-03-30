package sec1;

import java.util.Scanner;

public class Hello3 {

	public static void main(String[] args) {
		
		String name;	//이름을 받을 변수 문자열 선언
		int age;		//나이를 받을 변수 정수 선언
		double height;	//키를 받을 변수 실수 선언
		
		Scanner sc = new Scanner(System.in);	//입력을 받을 수 있게 키보드 생성
		System.out.println("이름 입력 :");	
		name = sc.next();						//문자열로 name에 저장
		System.out.println("나이 입력 :");
		age = sc.nextInt();						//정수로 age에 저장
		System.out.println("키 입력 :");
		height = sc.nextDouble();				//실수로 height에 저장
		System.out.println("너의 이름은 "+name+"이고, 나이는 "+age+"세, 키는 "+height+"입니다.");
		
	}

}
