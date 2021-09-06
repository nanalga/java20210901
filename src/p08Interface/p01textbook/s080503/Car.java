package p08Interface.p01textbook.s080503;

import p08Interface.p01textbook.s080502.HankookTire;
import p08Interface.p01textbook.s080502.Tire;

public class Car {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}

}
