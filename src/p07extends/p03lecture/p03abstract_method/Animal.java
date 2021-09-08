package p07extends.p03lecture.p03abstract_method;

public abstract class Animal {
	//추상 메서드가 있는 클래스는 반드시 추상 클래스이어야함
	
	public abstract void cry();	//추상메서드(몸통이 없는 메서드)
	
	public void walk() {
		System.out.println("네발로 걷는다.");
	}
}
