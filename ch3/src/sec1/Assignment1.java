package sec1;

public class Assignment1 {

	public static void main(String[] args) {
		//대입 연산자
		int a = 30;
		int b;
		b = a;
		a+=1;	//a=a+1
		a+=3;	//a=a+3
		System.out.println("a = "+a);
		a-=2;	//a=a-2
		System.out.println("a = "+a);
		a/=3;
		System.out.println("a = "+a);
		a*=4;
		System.out.println("a = "+a);
		a%=7;	//나머지 표시
		System.out.println("a = "+a);
		
		//a>>=2 a를 오른쪽으로 2번시프트 후 대입
		//a<<=2 a를 왼쪽으로 2번시프트 후 대입
		//a>>>=2 a를 오른쪽으로 3번시프트 후 대입
		//a<<<=2 "<<<"는 안됌
	}

}
