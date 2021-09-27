package p13generic.p01textbook.s130501;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {	// Number의 하위 타입만 받도록 설정
		double v1 = t1.doubleValue();	// Number가 가지고 있는 메소드 사용
		double v2 = t2.doubleValue();
		
		return Double.compare(v1, v2);
		// compare는 두개의 파라미터를 int로 리턴
		// equal -> 0, v1 > v2 -> +, v1 < v2 -> -
		// v1 - v2 값 return 
	}
}
