package sec1;

public class ClassNotFoundEx {

	public static void main(String[] args) {
		try {
			Class pu = Class.forName("java.lang.String");
			System.out.println("해당 클래스가 존재함");
		}catch(ClassNotFoundException e) {
			System.out.println("해당 클래스는 존재하지 않음");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("알 수 없는 예외");
			e.printStackTrace();
		}finally {
			System.out.println("프로그램 종료");
		}
	}
}
