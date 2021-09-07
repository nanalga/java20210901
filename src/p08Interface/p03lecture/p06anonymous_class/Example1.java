package p08Interface.p03lecture.p06anonymous_class;

public class Example1 {
	public static void main(String[] args) {
//		MyInterface1 i1 = new MyInterface1();	//x
		MyInterface1 i2 = new MyClass1();	// o
		
		//클래스와 인스턴스(객체)를 한번에 만들 수 있음
		MyInterface1 i3 = new MyInterface1() {
			//인터페이스에 선언된 추상 메소드의 실체 메소드 선언
			
			
		};	// o 익명 구현 객체
		
	}

}
