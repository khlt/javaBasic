package sec3;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단 출력 프로그램(이중 for문)
		int k=0;
		for (int i=2;i<10;i++) {
			
			for(int j=1;j<10;j++) {
				k=i*j;
				System.out.println(i+"*"+j+"="+k);
			}
		}

	}

}
