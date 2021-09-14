package p11api.p03lecture.p04wrapper;

public class Ex04 {
	public static void main(String[] args) {
		//auto unboxing
		Integer i1 = new Integer(300);
		int i2 = i1.intValue();	// unboxing
		int i3 = i1;	// auto unboxing
		
		Short s1 = new Short((short) 500);
		short s2 = s1;
		
		Long l1 = new Long(12345456L);
		long l2 = l1;
		
		Byte b1 = new Byte((byte) 100);
		byte b2 = b1;
		
		Float f1 = new Float(3.14f);
		float f2 = f1;
		
		Double d1 = new Double(3.14);
		double d2 = d1;
		
		Boolean n1 = new Boolean(true);
		boolean n2 = n1;
		
		Character c1 = new Character('c');
		char c2 = c1;
		
	}
}
