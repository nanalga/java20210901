package p08Interface.p03lecture.p01abstract_method;

public class Cat extends KindaCat implements Pet {
	@Override
	public void sit() {
		System.out.println("무시합니다.");
	}

}
