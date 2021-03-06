package p07extends.p03lecture.p01casting;

import p11api.p110503.Cat;

public class InstanceOfExample {
	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Dog();

		if(a1 instanceof Cat) {	//a1이 Cat(타입)인스턴스인지 확인
			Cat c1 = (Cat) a1;
			c1.punch();
		}
		if(a2 instanceof Cat) {
			Cat c2 = (Cat) a2;
			c2.punch();
		}
		System.out.println("프로그램 정상종료");
	}
}
