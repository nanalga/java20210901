package p01review;

public class C02Polymorphism {
	// 다형성
	// 1.상위 타입으로 자동변환(값 할당)
	// 2.실행되는 메서드는 실제 인스턴스가 실행
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Cat c1  = new Cat();	//c1에 Cat인스턴스 대입
		Dog d1 = new Dog();		//d1에 Dog인스턴스 대입
		
		a1.cry();	//Animal cry()메서드 실행
		c1.cry();	//
		d1.cry();
		
		System.out.println("=========================");
		
		Animal a2 = c1;	// Animal인스턴스 타입의 a2는 c1을 할당 받는다. 즉 a2는 Cat인스턴스를 할당 받는다.
		Animal a3 = d1;
		
		a2.cry();
		a3.cry();
	}
}

class Animal{
	
	public void cry() {
		System.out.println("동물이 웁니다.");
	}
}

class Cat extends Animal {
	@Override
	public void cry() {
		System.out.println("고양이가 웁니다.");
	}
}
class Dog extends Animal {

}
