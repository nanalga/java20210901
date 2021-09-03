package p07extends.p01textbook_1.s070802;

public class TelePhone extends Phone {
	
	public void autoAnswering() {
		System.out.println("auto자동응답합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("자동응답전화기가 켜집니다.");
	}

}
