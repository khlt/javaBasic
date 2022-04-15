package sec1;
import java.awt.Toolkit;
class BeepTask implements Runnable {
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		String[] names = {"길정훈","김준호", "김태균","김효민","여승원","이규진","이규호","임소희","장성필","조수민"};
		for(int i=0;i<10;i++) {
			System.out.println(names[i]);
			if(names[i].equals("장성필")) {
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
public class ThreadEx2 {
	public static void main(String[] args) {
		BeepTask bp = new BeepTask();
		bp.run();
	}
}