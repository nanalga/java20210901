package p14lamda.p03lecture;

public class Ex04Return {
	public static void main(String[] args) {
		MyInterface4 o1 = new MyInterface4() {
			@Override
			public int method() {
				return 1;
			}
		};
		System.out.println(o1.method());
		
		MyInterface4 o2 = () -> { return 2; };
		System.out.println(o2.method());
		
		// 명령문이 하나이고 리턴 명령문이면 return 키워드 생략 가능
		MyInterface4 o3 = () -> 3;	// 하나 남은 statement는 중괄호({})와 return 생략 가능하다
		System.out.println(o3.method());
	}
}

interface MyInterface4 {
	int method();
}