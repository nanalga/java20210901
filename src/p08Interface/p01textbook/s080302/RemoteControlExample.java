package p08Interface.p01textbook.s080302;

import p08Interface.p01textbook.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
//		rc = new RemoteControl();	// x
		rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("메소드 구현");
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("메소드 구현");
			}
			
			@Override
			public void TurnOff() {
				System.out.println("메소드 구현");
			}
		};	//o
	}
}
