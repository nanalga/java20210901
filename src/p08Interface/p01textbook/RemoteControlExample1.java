package p08Interface.p01textbook;

public class RemoteControlExample1 {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc = new Audio();
		
		System.out.println(rc instanceof RemoteControl);
		System.out.println(rc instanceof Audio);
		
		System.out.println(rc instanceof Television);	//fase 마지막에 rc는 Audio인스턴스를 받기 때문
		
		rc.turnOn();
		rc.TurnOff();
		rc.setVolume(3);
		
	}

}
