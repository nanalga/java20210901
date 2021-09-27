package p13generic.p03lecture.p03wildcard;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		// 파라미터나 리턴 타입에 작성됨
		// 상위타입 제한
		ArrayList<? extends Number> list1 = new ArrayList<Integer>();	// 변수 선언시 사용되는 경우는 없음 
																		// number의 하위 타입을 갖고 있는 ArrayList
		list1 = new ArrayList<Double>();
		list1 = new ArrayList<Long>();
		
//		list1 = new ArrayList<Object>();	// x	Number의 상위 타입 X
//		list1 = new ArrayList<String>();	// x
		
		// 하위타입제한
		ArrayList<? super Number> list2 = new ArrayList<Number>();
		list2 = new ArrayList<Object>();
		
//		list2 = new ArrayList<Integer>();	// x
//		list2 = new ArrayList<Double>();	// x
		
		// 타입 제한 없음
		ArrayList<?> list3 = new ArrayList<Integer>();
		list3 = new ArrayList<Number>();
		list3 = new ArrayList<String>();
		list3 = new ArrayList<Object>();
		
	}
}
