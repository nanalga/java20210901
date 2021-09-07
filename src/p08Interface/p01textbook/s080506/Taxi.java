package p08Interface.p01textbook.s080506;

import p08Interface.p01textbook.s080505.Vehicle;

public class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}
