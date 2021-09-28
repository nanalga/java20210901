package p14lamda.p03lecture;

public class Ex09TwoParameter {
	public static void main(String[] args) {
		MyInterface9 o1 = (int a, int b) -> {System.out.println(a + ", " + b);};
		o1.method(3, 4);
		
		MyInterface9 o2 = (a, b) -> System.out.println(a + ", " + b);	// 데이터 타입 생략 가능
		o2.method(1, 2);
		
//		MyInterface9 o3 = a, b -> System.out.println(a + ", " + b); // ()괄호 생략 x
	}
}

interface MyInterface9{
	void method(int a, int b);
}