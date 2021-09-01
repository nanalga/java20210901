package p01review;

public class C02Polymorphism {
	// 다형성
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Cat c1  = new Cat();
		Dog d1 = new Dog();
		
		a1.cry();
		c1.cry();
		d1.cry();
		
		System.out.println("=========================");
		
		Animal a2 = c1;
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
