package p11api.p03lecture.p04wrapper;

public class Ex02 {
	public static void main(String[] args) {
		// boxing
		int i1 = 300;
		Integer i2 = new Integer(i1);
		
		// auto boxing 자동 변환
		int i3 = 500;
		Integer i4 = i3;	// 변수에 담아서 넣기 OK
		Integer i5 = 700;	// 직접 값을 넣기 OK
		
		byte b1 = 100;
		Byte b2 = b1;
		Byte b3 = 100;
		
		long l1 = 234546878L;
		Long l2 = l1;
		Long l3 = 234235346L;
		
		short s1 = 12343;
		Short s2 = s1;
		Short s3 = 3111;
		
		float f1 = 3.14f;
		Float f2 = f1;
		Float f3 = 234.4f;
		
		double d1 = 3.14;
		Double d2 = d1;
		Double d3 = 4.14;
		
		boolean n1 = true;
		Boolean n2 = n1;
		Boolean n3 = false;
		
		char c1 = 'c';
		Character c2 = c1;
		Character c3 = 'd';
	}
}
