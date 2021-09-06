package p08Interface.p03lecture.p01abstract_method;

public class Wolf extends KindaDog implements SledDog {
	
	@Override
	public void bark() {
		System.out.println("왈왈");
	}
	
	@Override
	public void pull() {
		System.out.println("늑대가 썰매를 끕니다");
	}
}
