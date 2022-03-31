package sec1;

import java.util.Scanner;
<<<<<<< HEAD
public class Hello4 {
	public static void main(String[] args) {
		//저장소(변수) 선언
		int kor, eng, mat;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 입력 : ");
		kor = sc.nextInt();
		System.out.println("영어점수 입력 : ");
		eng = sc.nextInt();
		System.out.println("수학점수 입력 : ");
		mat = sc.nextInt();
		System.out.println("당신의 총점은 "+(kor+eng+mat)+"점이며, 평균은 "
		+((kor+eng+mat)/3)+"점입니다.");
	}
=======

public class Hello4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor; //국어 점수를 받을 정수 변수 선언
		int mat; //수학
		int eng; //영어
		int sum; //점수를 합산할 정수 변수 선언
		int avr; //점수의 평균을 계산할 정수 변수 선언
		
		Scanner sc = new Scanner(System.in);	//키보드 생성
		System.out.println("국어점수 입력 :");
		kor = sc.nextInt();						//국어 점수를 정수로 저장.
		System.out.println("수학점수 입력 :");
		mat = sc.nextInt();						//수학 점수를 정수로 저장.
		System.out.println("영어점수 입력 :");
		eng = sc.nextInt();						//영어 점수를 정수로 저장.
		sum = kor + mat + eng;					//받은 점수들을 전부 더해 sum에 저장.
		avr = sum / 3;							//합산한 점수를 3으로 나눠 avr에 저장.
		System.out.println("당신의 총점은 "+sum+"점이며, 평균은 "+avr+"점입니다.");
	}

>>>>>>> 5f39c2c3411f093b2d1755807abfaa6f22b361d4
}
