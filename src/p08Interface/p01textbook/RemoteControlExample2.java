package p08Interface.p01textbook;

public class RemoteControlExample2 {
	public static void main(String[] args) {
		Searchable s1 = new SmartTelevision();
		s1.search("naver");
		
		RemoteControl r1 = new SmartTelevision();
		r1.turnOn();
		r1.TurnOff();
		
		System.out.println(r1 instanceof SmartTelevision);
		System.out.println(r1 instanceof RemoteControl);
		System.out.println(r1 instanceof Searchable);
		
		Searchable s2 = (Searchable) r1;
		SmartTelevision t1 = (SmartTelevision) r1;
			
	}
}
