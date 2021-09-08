package p07extends.p01textbook_1.s070804;

public class Example {
	public static void main(String[] args) {
		Animal c1 = new Cat();
		Animal d1 = new Dog();
		
		c1.sound();
		d1.sound();
		
		animalSound(new Cat());
		animalSound(new Dog());
		
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}



