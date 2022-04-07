package sec1;

public class AudioRemote implements RemoteControl {
	int volume;	//자동 private
	
	@Override
	public void turnOn() {
		System.out.println( "TV 전원을 켭니다."); }

	@Override
	public void turnOff() {
		System.out.println( "TV 전원을 끕니다."); }

	@Override
	public void setVolume(int volume) { this.volume = volume; }

	@Override
	public int getVolume() { return volume; }
}
