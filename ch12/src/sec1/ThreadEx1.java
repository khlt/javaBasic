package sec1;
//쓰레드 : CPU가 현재 처리 중인 일
//프로세스 : CPU가 현재 실행 중인 프로그램
//자바는 쓰레드(Thread) 단위로 관리
import java.awt.Toolkit;
public class ThreadEx1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		String[] names = {"길정훈","김준호", "김태균","김효민","여승원","이규진","이규호","임소희","장성필","조수민"};
		for(int i=0;i<10;i++) {
			System.out.println(names[i]);
			if(names[i].equals("임소희")) {
				System.out.println("***** 침입자 *****");
				toolkit.beep();
				continue;
			} else {
				System.out.println("서비스");
				System.out.println("정상");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}