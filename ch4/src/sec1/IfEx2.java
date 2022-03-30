package sec1;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		
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
	
		
	int tot = kor + eng + mat;
	int avg = (kor+eng+mat)/3;

	
	if (avg>=70) {
		System.out.println("합격");
	}else {
			System.out.println("불합격");
		}
	

	if(avg>=95) {
		System.out.println("특장학생");
	}else if(avg>=95) {
		System.out.println("과목장학생");
	}else {
		System.out.println("일반학생");
	}
	
		
	if(avg>=90) {System.out.print("A");
	
	 if(avg>=98) {System.out.print("+");}
	 else if(avg>=94) {System.out.print("0");}
	 else {System.out.print("-");}
	}
	else if(avg>=80) {System.out.print("B");
	
	 if(avg>=88) {System.out.print("+");}
	 else if(avg>=84) {System.out.print("0");}
	 else {System.out.print("-");}
	}
	else if(avg>=70) {System.out.print("C");
	
	 if(avg>=78) {System.out.print("+");}
	else if(avg>=74) {System.out.print("0");}
	else {System.out.print("-");}
	 }
	else { System.out.println("D");}
	
	
}
}
