package p11api.p03lecture.p04wrapper;

public class Ex03 {
	public static void main(String[] args) {
		// unboxing
		Integer i1 = new Integer(300);
		int i2 = i1.intValue();	//참조타입을 리턴 받아 변수에 전달해서 언박싱
		
//		Short s1 = new Short(10013); // 오류 이유 : 리터널한 숫자는 인티저 타입으로 shor로 강제 형변환
		Short s1 = new Short((short)10013);
		short s2 = s1.shortValue();
		
		Long l1 = new Long(213456L);
		long l2 = l1.longValue();
		
		Byte b1 = new Byte((byte)11);
		byte b2 = b1.byteValue();
		
		Float f1 = new Float(3.14F);
		float f2 = f1.floatValue();
		
		Double d1 = new Double(3.14);
		double d2 = d1.doubleValue();
		
		Boolean n1 = new Boolean(true);
		boolean n2 = n1.booleanValue();
		
		Character c1 = new Character('a');
		char c2 = c1.charValue();
		
		
		
		
		
		
	}
}
