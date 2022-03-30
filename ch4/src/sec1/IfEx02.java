package sec1;

import java.util.Scanner;	//ctrl + shift + o


//키보드로 세 과목 edps(전산), pl(프로그래밍), db(데이터베이스) 를 키보드로 입력받아
//총점(tot), 평균(avg), 합격여부(pan), 학점(hak), 장학생 여부(dv)를 출력하는 프로그래밍을 완성하시오.
//
//합격여부 : 평균과 세 과목의 점수가 모두 70점 이상이면, "합격", 아니면 "불합격" (if~else 사용)
//학점(평균구하여 중첩if 활용)
//평균이
//A+ : 98~100
//A0 : 94~97
//A- : 90~93
//B+ : 88~89
//B0 : 84~87
//B- : 80~83
//C+ : 78~79
//C0 : 74~77
//C- : 70~73
//D+ : 68~69
//D0 : 64~67
//D- :  60~63
//F : 60 미만
//
//장학생 여부(if~elseif~else 활용)
//모든 과목이 95점 이상이면 "특장학생"
//한 과목이라도 95점 이상이면 "과목장학생"
//아니면 "일반학생"


public class IfEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edps, pl, db;
		Scanner sc = new Scanner(System.in);	//ctrl + shift + o
		System.out.println("국어점수 입력 : ");
		edps = sc.nextInt();	//정수 -> nextInt 더블 -> nextDouble sc -> 입력값불러오기
		System.out.println("프로그래밍 점수 입력 : ");
		pl = sc.nextInt();
		System.out.println("데이터베이스 점수 입력 : ");
		db = sc.nextInt();
		
		int tot = edps+pl+db;
		float avg = tot/3.0f;
		String pan = "";
		String hak = "";
		String dv = "";
		
		if(edps>=70 && pl>=70 && db>=70){		//&& -> 모두만족할시{
			pan = "합격";
		}else pan = "불합격"; 
		
		
		if(avg>=90) {hak="A";
		if(avg>=98) {hak= hak + "+";}
		else if(avg>=94) {hak= hak + "0";}
		else {hak=hak +"-";}
		}
		else if(avg>=80) {hak="B";
		if(avg>=88) {hak= hak + "+";}
		else if(avg>=84) {hak= hak + "0";}
		else {hak=hak +"-";}
		}
		else if(avg>=70) {hak="C";
		if(avg>=78) {hak= hak + "+";}
		else if(avg>=74) {hak= hak + "0";}
		else {hak=hak +"-";}
		}
		else if(avg>=60) {hak="A";
		if(avg>=68) {hak= hak + "+";}
		else if(avg>=64) {hak= hak + "0";}
		else {hak=hak +"-";}
		} else {hak= "F";}
		
		
		if (edps>=95 && pl>=95 && db>=95) {dv="특장학생";}
		else if (edps>=70 || pl>=70 || db>=70) {dv="과목장학생";}
		else {dv="일반학생";}
		
		System.out.println("총점\t평균\t합격여부\t학점\t장학생 여부");
		System.out.println(tot+"\t"+avg+"\t"+pan+"\t"+hak+"\t"+dv);
			
					
}
}
