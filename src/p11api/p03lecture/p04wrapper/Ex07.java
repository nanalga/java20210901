package p11api.p03lecture.p04wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0] = 11;
		arr1[1] = 22;
		arr1[2] = 33;
		
		int[] arr2 = Arrays.copyOf(arr1, 5);
		
		System.out.println(Arrays.toString(arr2));
		
		// ArrayList
		System.out.println("==================================");
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("css");
		list1.add("html");
		
		System.out.println(list1);
		
		// int in ArrayList
		System.out.println("=================================");
//		ArrayList<int> list2 = new ArrayList<>();	// 객체는 객체를 담을수 없다.
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(new Integer(100));
		list2.add(200);	//auto boxing이뤄진다
		list2.add(333);
		list2.add(null);
		
		System.out.println(list2);	// 참조타입 인티저값이 들어가있다.
		
		Integer i3 = list2.get(2);	// get은 Integer타입을 return한다.
		System.out.println(i3);
		
		int i4 = list2.get(2);	//auto unboxing으로 기본타입으로 해도 된다.
		System.out.println(i4);

		if(list2.get(2) != null) {	// 과거 auto unboxing 안될때
			int i5 = list2.get(2).intValue();
			System.out.println(i5);
		}
		
		int i6 = list2.get(3);	// null값은 주의해야 한다.
		System.out.println(i6);
		
	}
}
