package p07extends.p01textbook_1.s070802;

public class SmartPhone extends Phone {
	
	public void internetSearch() {
		System.out.println("인터넷을 검색합니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("스마트폰이 켜집니다.");
	}

}
