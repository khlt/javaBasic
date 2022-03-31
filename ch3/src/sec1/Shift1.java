package sec1;

public class Shift1 {

	public static void main(String[] args) {
		//시프트(자리이동) 연산 -> 비트(이진수) 연산
		//16	8	4	2	1
		//1		0	1	0	0			20
		//		1	0	1	0	0		10
		//			1	0	1	0	0	5
		
/*	
	64	32	16	8	4	2	1
		//1		0	1	0	0			20
	1	  0		1	0	0				40
1	0	  1		0	0					80
*/
		//컴퓨터는 시프트연산을 이용해서 곱셈과 나눗셈을 함
		int a = 20;
		System.out.println("a>>2 : "+(a>>2)); //5
		System.out.println("a<<2 : "+(a<<2)); //80
		System.out.println("a>>>2 : "+(a>>>2));
		//System.out.println("a<<<2 : "+(a<<<2)); <- 이건 안됌

	}

}
