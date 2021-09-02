package p07extends.p01textbook_1.s070702;

public class Car {
	Tire FrontLeftTire1 = new Tire("앞왼쪽", 6);
	Tire FrontRightTire = new Tire("앞오른쪽", 2);
	Tire BackLeftTire = new Tire("뒤왼쪽", 3);
	Tire BackRightTire = new Tire("앞오른쪽", 4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(FrontLeftTire1.roll() == false) {stop(); return 1;}
		if(FrontRightTire.roll() == false) {stop(); return 2;}
		if(BackLeftTire.roll() == false) {stop(); return 3;}
		if(BackRightTire.roll() == false) {stop(); return 4;}
		
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	

}
