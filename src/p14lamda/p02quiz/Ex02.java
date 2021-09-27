package p14lamda.p02quiz;

public class Ex02 {
	public static void main(String[] args) {
		MyInterface2 o1 = () -> System.out.println("hello");; // 적절한 코드 작성
		MyInterface2 o2 = () -> System.out.println("java");; // 적절한 코드 작성
		
		o1.method();	// hello
		o2.method();	// java
		
		// 출력
		// hello
		// java
		
	}
}

interface MyInterface2 {
	void method();
}