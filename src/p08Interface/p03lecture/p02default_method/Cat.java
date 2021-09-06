package p08Interface.p03lecture.p02default_method;

public class Cat implements Pet {
	@Override
	public void sit() {
		System.out.println("무시합니다.");
	}
	
	@Override
	public void roll() {
		System.out.println("또 무시합니다.");
	}
}
