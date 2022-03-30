package sec1;

import java.util.Scanner;

//본인의 월을 숫자 정수로 입력하면, 해당하는 월의 탄생석을 출력
//1월 : 석류석
//2월 : 자수정
//3월 : 아쿠아마린(남옥)
//4월 : 다이아몬드
//5월 : 비취(에메랄드)
//6월 : 진주(Pearl)
//7월 : 홍옥(Ruby)
//8월 : 감람석(Peridot)
//9월 : 청옥(사파이어)
//10월 : 오팔
//11월 : 황옥(토파즈)
//12월 : 터키석

public class SwitchEx2 {

	public static void main(String[] args) {
		//태어난 월을 입력[1-12]
		Scanner sc = new Scanner(System.in);
		
		System.out.println("본인의 태어난월을 정수로 입력하면, 해당하는 월의 탄생석을 출력합니다.");
		System.out.print("태어난 월 : ");
		int month = sc.nextInt();
		
		
		switch(month) {
		case 1 :
			System.out.println("석류석");
		break;
		case 2 :System.out.println("자수정");
		break;
		case 3 :System.out.println("아쿠아마린");
		break;
		case 4 :System.out.println("다이아몬드");
		break;
		case 5 :System.out.println("에메랄드");
		break;
		case 6 :System.out.println("진주(pearl)");
		break;
		case 7:System.out.println("홍옥");
		break;
		case 8 :System.out.println("감람석");
		break;
		case 9 :System.out.println("청옥");
		break;
		case 10 :System.out.println("오팔");
		break;
		case 11 :System.out.println("황옥");
		break;
		case 12 :System.out.println("터키석");
		break;
		default : System.out.println("다시 입력하세요.");
		break;
			
		}
	}

}
