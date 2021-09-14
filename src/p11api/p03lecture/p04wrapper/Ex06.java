package p11api.p03lecture.p04wrapper;

public class Ex06 {
	public static void main(String[] args) {
		int i1 = 1000;
		int i2 = 1000;
		
		System.out.println(i1 == i2);
		
		Integer i3 = new Integer(1000);
		Integer i4 = new Integer(1000);
		
		System.out.println(i3 == i4); 	// false 참조비교
		System.out.println(i3.equals(i4));	//참조타입 비교시 equals이용 i3과 i4의 같은 int 타입을 가지고 있는지 비교
		
		System.out.println(i3.intValue() == i4.intValue());	//참조타입 비교시 형변환 후 비교
	}
}
