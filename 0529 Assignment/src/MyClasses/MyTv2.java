package MyClasses;

public class MyTv2 {

	
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	 
	int temp;
	int keep;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
			keep = this.channel;
		this.channel = channel;
	}
		
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getMAX_VOLUME() {
		return MAX_VOLUME;
	}
	public int getMIN_VOLUME() {
		return MIN_VOLUME;
	}
	public int getMAX_CHANNEL() {
		return MAX_CHANNEL;
	}
	public int getMIN_CHANNEL() {
		return MIN_CHANNEL;
	}
	
	public void gotoPrevChannel() {
			temp = keep;
			keep = channel;
			channel = temp;
	}
	
}
