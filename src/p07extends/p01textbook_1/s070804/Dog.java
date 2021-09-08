package p07extends.p01textbook_1.s070804;

public class Dog extends Animal {
	/*
	 * 상위 클래스가 추상 메서드를 가지고 있다면
	 * 하위클래스가 실제 클래스일 때
	 * 꼭 추상 메서드를 재정의 해야함
	 */
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
