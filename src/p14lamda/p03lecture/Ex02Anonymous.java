package p14lamda.p03lecture;

public class Ex02Anonymous {
	public static void main(String[] args) {
		MyInterface2 o1 = new MyInterface2() {	// 익명 객체 생성
			@Override
			public void method1() {	//추상 메소드 구현(재정의)해야 한다
				System.out.println("실행코드1");
			}
		};
		
		// lamda
		MyInterface2 o2 = () -> {			// () parameter기호, -> lamda기호
			System.out.println("실행코드2");
		};
		
		o1.method1();
		o2.method1();
	}
}

interface MyInterface2 {
	public void method1();	// 추상 메소드 단 하나!
}