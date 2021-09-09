package p07extends.p03lecture.p01casting;

import p11api.p110503.Cat;

public class CatExample {
	public static void main(String[] args) {
		Animal animal = new Cat();
		
		animal.walk();
		
		Cat c1 = (Cat)animal;	//Cat(자식 객체) 형변환
		
		c1.walk();
		c1.punch();
	}
}
