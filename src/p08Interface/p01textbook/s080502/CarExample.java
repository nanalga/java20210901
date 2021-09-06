package p08Interface.p01textbook.s080502;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car();
		
		myCar.run();
		
		System.out.println("----------------------");
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
		yourCar.run();
		
		
	}
}
