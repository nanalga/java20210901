package p08Interface.p01textbook;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Television을 켭니다.");
	}

	@Override
	public void TurnOff() {
		System.out.println("Television을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}
	
}
