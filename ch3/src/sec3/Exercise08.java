package sec3;

public class Exercise08 {

	public static void main(String[] args) {
		
		double x = 5.0;
		double y = 0.0;
		
		
		double z = x % y;		//NaN		//x/y : infinte
		
		
		if( Double.isNaN(z) ) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		}
		else {
			double result = z + 10;
			System.out.println("결과 : "+result);
			//Double.valueOf() => X => 이 메서드는 괄호 안의 값을
//			double 타입의 실수로 변경 -> z = "NaN"
			
			//Double.isNaN(z) => isNaN()는 z가 NaN 값이라면,
//			true, NaN값이 아니면, false
			
//			Double/isDouble(z) => z가 double 타입의 데이터라면, true,
//			아니면, false
			
//			Double.isInfinite(z) => z가 infinite 이라면 true, 아니면 false

			
		
		}
	}

}
