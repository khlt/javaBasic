package sec1;

public class SmartTv implements Searchable,RemoteControl{
	private int volume;
	private int channel;
	public int getChannel() {
		return channel;
	}
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
