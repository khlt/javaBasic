package sec1;

import java.util.Scanner;

public class Hello4_1 {

	public static void main(String[] args) {
		// 변수 선언
		int kor, eng, mat; //정수 변수 선언
		Scanner sc= new Scanner(System.in);		//키보드 입력
		
		System.out.println("국어점수 입력 :");
		kor = sc.nextInt();						//키보드 입력을 받아 정수로 kor에 저장
		System.out.println("수학점수 입력 :");
		mat= sc.nextInt();						//키보드 입력을 받아 정수로 mat에 저장
		System.out.println("영어점수 입력 :");	
		eng = sc.nextInt();						//키보드 입력을 받아 정수로 eng에 저장
		System.out.println("당신의 총점은 "+(kor+mat+eng)+"점이며, 평균은 "+((kor+mat+eng)/3)+"점입니다.");
		//괄호 안에 점수를 계산함. 괄호를 안치면 문자열로 나옴. ex)8090100 
		//괄호는 덧셈먼저 하도록 괄호를 쳐줌.
		
	}

}
