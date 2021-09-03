package p01review.p06class.p03lecture.p01static;

public class StaticEx06Member {
	
	//스태택(클래스) 멤버(메서드, 필드)에서는 인스턴스 멤버(메서드, 필드) 접근 불가
		
	public int value1;
	public static int value2;
		
	public void method1() {
		System.out.println(value1);
		System.out.println(value2);
	}
		
	public static void method2() {
		System.out.println(value1);	//스태틱은 인스턴스를 접근하지 못한다
		System.out.println(value2);
	}
}


