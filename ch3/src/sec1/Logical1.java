package sec1;

public class Logical1 {
	public static void main(String[] args) {
		//&&, ||, !, &, |, ^
		
		
		
		
		int a = 30;	//
		int b = 20;	//
		int c = 10;
		
		System.out.println("a와 b의 AND 연산 : "+(a & b));
		System.out.println("a와 b의 OR 연산 : "+(a | b));
		System.out.println("a와 b의 XOR 연산 : "+(a ^ b));
		System.out.println("~a -> a의 보수 : "+(~a));
		
		boolean d = true;
		boolean e = true;
		boolean f = false;
		//&&(AND)연산은 입력값이 모두 참일 때만 결과가 참
		//입력1		입력2	출력
		//true		true	true
		//true		false	false
		//false		true	false
		//false		false	false
		System.out.println("&& => AND연산의 결과1 : "+(d && e));
		System.out.println("&& => AND연산의 결과2 : "+(d && f));
		System.out.println("&& => AND연산의 결과3 : "+(f && d));
		System.out.println("&& => AND연산의 결과4 : "+(f && f));
		//||(OR)연산 : 어느 하나라도 입력이 참이 있으면, 참(true)
		//입력1		입력2	출력
		//true		true	true
		//true		false	true
		//false		true	true
		//false		false	false
		System.out.println("|| => OR연산의 결과1 : "+(d || e));
		System.out.println("|| => OR연산의 결과2 : "+(d || f));
		System.out.println("|| => OR연산의 결과3 : "+(f || d));
		System.out.println("|| => OR연산의 결과4 : "+(f || f));
		//!(not) : 입력된 논리값을 true는 false로, false는 true로 반대로 반환
		//입력		출력
		//true		false
		//false		true
		System.out.println(d+" ! => NOT연산의 결과1 : "+(!d));
		System.out.println(f+" ! => NOT연산의 결과2 : "+(!f));
	}
}