package ex1;

public class star1 {

	public static void main(String[] args) {
		//반복문 1개만을 이용하여 다음의 결과가 나오도록 하시오(printf("*") 사용, if문 사용
		int i;
		for( i=0;i<50;i++) {
		System.out.print("*");
		if(i%10==9)System.out.println("*");
		
		}
	}

}