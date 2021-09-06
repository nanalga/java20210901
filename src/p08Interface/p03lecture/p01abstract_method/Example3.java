package p08Interface.p03lecture.p01abstract_method;

public class Example3 {
	public static void main(String[] args) {
		Malamute m = new Malamute();
		
		System.out.println(m instanceof Malamute);
		System.out.println(m instanceof Pet);
		System.out.println(m instanceof KindaDog);
		System.out.println(m instanceof SledDog);
		
		SledDog s1 = m;
		s1.pull();
		
		Pet p1 = m;
		p1.sit();
		
		m.pull();
		m.sit();
	}

}
