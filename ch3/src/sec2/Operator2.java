package sec2;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20; boolean b = true; //2줄로 인식해서 가능
		System.out.println("a="+a	  //컴파일러가 1줄로 인식
				+", b="+b);
		//int c = 20, d=true; -> 타입에러
		int c=20;
		int d= a+c;		//이항연산
		boolean e=!b;	//단항연산 e의반대 false
		String pass= a>=20 ? "합격" : "불합격"; //삼항 연산자
		
		System.out.println(pass);
	/*
		(operator) = 연산 = 명령어(Instruction)
				
		op-code	operand
		연산자	피연산자(기억장소)
		end				=>	제0주소 명령어 형식
		!		b		=>	단항(unary)	=>	제1주소 명령어 형식
		+		a, c	=>	이항(binary)	=>	제2주소 명령어 형식
		=		d		
		?:		조건, 참, 거짓		기타		=> 	제3주소 명령어 형식
	*/	
		
	}

}
