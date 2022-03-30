package sec2;

public class ArithMetic2 {

	public static void main(String[] args) {
		// 연산 오류에 대한 예외
		
		//문법적 오류, 연산 오류, 논리 오류
		//(검출)		(검출안됌)
		int a = 25, b=0, c;
		String name = "이규진";
		System.out.println("a/b = "+(a/b)); //불능(무한대 = Infinite)
		//System.out.println("a/c = "+(a/c)); -> null (정보의 부재, 빈껍데기)
		System.out.println("a%b = "+(a%b)); //부정(NaN = Not a number)
		//System.out.println("a/name = "+(a/name)); -> 문자로 나누기 안됨
	
	}

}
