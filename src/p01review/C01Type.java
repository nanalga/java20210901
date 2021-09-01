package p01review;

public class C01Type {
	public static void main(String[] args) {
		// 데이터 타입
		// 1. 기본타입(primitive type)
		// - 8개
		// byete(1), short(2), int(4), long(8)
		// float(4), double(8)
		// char(2)
		// boolean(1)
		int i = 4;
		int j = i;
	
		
		// 2. 참조타입(reference type) 
		// - 기본타입 8개 빼고 나머지
		int[] arr = {3, 4};
		int[] brr = arr;
		
		brr[0] = 33;
		System.out.println(arr[0]);
		
		
	}

}
