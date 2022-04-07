//예외처리 : 혹시 모를 정상적인 실행을 하지 못할 경우의 대비책을 마련하고, 실행되지 못할 때는 대비책을 가동하도록 하는 방안
package sec1;
public class ExceptionEx1 {
	public static void main(String[] args) {
		int i;
		int a = 20;
		int[] arr = {10,20,30};
		String b = "김기태";
		//try { 실행문장; } catch (예외종류코드 e) { 예외를처리할구문; }
		try {
			System.out.println(Integer.parseInt(b));
			System.out.println(a/0);
		}catch(NumberFormatException e) {
			System.out.println("정수로 바꿀 수 없는 데이터입니다.");
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누려고 시도하엿음");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}