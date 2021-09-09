package p07extends.p03lecture.p01casting;

import p11api.p110503.Cat;

public class DogExampe {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		
		a1.walk();
		
		Cat c1 = (Cat)a1;	//Dog 인스턴스를 받는 ai를 Cat으로 형변환 안됨
		c1.punch();
		
		System.out.println("프로그램 정상종료");
		
	}

}
