package p01review.p06class.p03lecture.p01static;

public class StaticEx01Field {
	public static void main(String[] args) {
		Class01.id = 3;	//인스턴스를 생성 안하고 바로 사용가능하다
		System.out.println(Class01.id);
		
		Class01 c1 = new Class01();
		Class01 c2 = new Class01();
		
		System.out.println(c1.id);
		System.out.println(c2.id);
	}
}

class Class01 {
	// static field
	//(정적 멤버 변수, 정적 필드, 스태틱 필드, 스택틱 변수, 정적 변수)
	//클래스 변수
	static int id;
	
}