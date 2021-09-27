package p13generic.p03lecture.p02generic;

public class Ex03 {
	// generic method
	// type이 parameter, return type 유추가 가능하면 생략해서 사용이 가능하다.
	
	public static <T> void method1() {	// 메소드에 타입 파라미터 입력 
		T obj1;	//메소드를 사용하는 곳에서 타입 설정
	}
	public static void main(String[] args) {
	
		Ex03.<Integer>method1();	// method1의 T는 인티저로 치환
		Ex03.method1();
		
		Ex03.<Integer>method2(3);
		Ex03.method2(3);	// type parameter가 유추되는 상황이면 타입 생각하고 사용가능
		
		Ex03.<Double>method2(3.14);
		Ex03.method2(3.14);
		
		System.out.println("=======================");
		Ex03.<Integer, Double>method3(300, 3.4);
		Ex03.method3(900, 3.14);
	}
	
	public static <T> void method2(T param) {
		System.out.println(param);
		System.out.println(param instanceof Integer);
		System.out.println(param instanceof Double);
	}
	
	public static <T, U> void method3(T param1, U param2) {	//type 1개 이상 가능하다
		System.out.println(param1);
		System.out.println(param2);
		
		System.out.println(param1 instanceof Integer);
		System.out.println(param1 instanceof Double);

		System.out.println(param2 instanceof Integer);
		System.out.println(param2 instanceof Double);
	}
}
