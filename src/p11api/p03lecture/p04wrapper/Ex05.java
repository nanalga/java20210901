package p11api.p03lecture.p04wrapper;

public class Ex05 {
	public static void main(String[] args) {
		// 사용하는 타입이 기본인지 참조인지 주의해서 사용
		
		int i1 = 300;	// 기본타입 4byte
		Integer i2 = 300;	//참조타입
		
//		i1 = null;	// x
		i2 = null;	// o
		
		short s1 = 100;	// 2byte
		Short s2 = 100;
		
		i1 = s1;
//		i2 = s2;	// Integer 상속 받지 않기에 안된다.
//		i2 = (Integer) s2;	// 강제형변환 x
		i2 = s2.intValue();	// 자동 박싱
		
		int i3 = i2 + 100;	// auto unboxing
		System.out.println(i3);
		
		Object o1 = i2;	// 참조타입은 object이기에 가능
		i2 = (Integer) o1;
		
	}
}
