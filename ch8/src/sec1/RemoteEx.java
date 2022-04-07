package sec1;

public class RemoteEx {

	public static void main(String[] args) {
		//1. 인터페이스타입으로 선언이 되었을 경우
		RemoteControl rc1; //선언을 인터페이스 타입으로 했으므로 필드에 직접 접근이 불가
		rc1 = new TvRemote();
		rc1.turnOn();
		rc1.setVolume(10);
		//인터페이스에서 선언되었으므로 getVolume()과 setVolume()으로 접근
		System.out.println("tv볼륨 : "+rc1.getVolume());
		rc1.turnOff();
		rc1 = new AudioRemote();
		rc1.turnOn();
		
		System.out.println("오디오 볼륨 : "+rc1.getVolume());
		rc1.turnOff();
		
		TvRemote rc2 = new TvRemote();
		rc2.volume = 20;
		rc2.channel = 24;
		
		RemoteControl rc4 = rc2;
		//3. 내부 메서드에 의한 참조/값에 의한 전달
		//메서드를 호출하여 값을 전달 할 때 클래스로 묶어서 전달하는 것이 효율적임
		RemoteEx.play(rc2);
		RemoteEx.play(rc2.volume,rc2.channel);
		
		System.out.println(rc2);

	}
	static void play(TvRemote tv1) {	//참조(객체)에 의한 전달을 하는 메서드
		System.out.println("TV의 볼륨 : "+tv1.volume);
		System.out.println("TV의 채널 : "+tv1.channel);
		System.out.println("참조 call by reference플레이~!");
	}
	static void play(int volume, int channel) {	//값에 의한 전달을 메서드
		System.out.println("TV의 볼륨 : "+volume);
		System.out.println("TV의 채널 : "+channel);
		System.out.println("값call by value 플레이~!");
	}
}
