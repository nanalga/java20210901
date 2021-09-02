package p07extends.p01textbook_1.s070702;

public class KumhoTire extends Tire {
	public KumhoTire(String lotation, int maxRotation) {
		super(lotation, maxRotation);
	}
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명: "+ (maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire 펑크 ***");
			return false;
		}
	}

}
