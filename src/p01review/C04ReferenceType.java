package p01review;

public class C04ReferenceType {
	public static void main(String[] args) {
		Tesla t1 = new Tesla();
		Car c1 = t1;
		
		c1.setSpeed(100);
		
		System.out.println(t1.getSpeed());
		
		t1.AutoControl();
		//c1.AutoControl();	
	}
}

class Car {
	private int speed;

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
}

class Tesla extends Car {
	public void AutoControl() {
		System.out.println("자동운전");
	}
}