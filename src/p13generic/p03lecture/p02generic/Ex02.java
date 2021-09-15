package p13generic.p03lecture.p02generic;

import java.util.List;
import java.util.Map;

public class Ex02 {
	public static void main(String[] args) {
		//generic type 여러개 사용
		
		Container<String, Integer> c1;
		c1 = new Container<String, Integer>();
		
		c1.setItem1("html");
		c1.setItem2(333);
		
		String s1 = c1.getItem1();
		Integer i1 = c1.getItem2();
		
		System.out.println(s1);
		System.out.println(i1);
		
//		Container<Double, int[]> c2 = new Container<Double, int[]> ();
		Container<Double, int[]> c2 = new Container<>();
		c2.setItem1(3.14);
		c2.setItem2(new int[] {1, 2, 3});
		
		Double d1 = c2.getItem1();
		int[] arr1 = c2.getItem2();
		
		System.out.println(d1);
		System.out.println(arr1);
		
		//type 파라미터가 복잡하게 들어가는 경우 -> 인스턴스 생성할때 <> type생략가능
		Container<List<List<String>>, Map<String, Integer>> c3 = new Container<>();	//인스턴스 만들때 <생략>가능
		Container<? extends Number, Object> c4 = new Container<Integer, Object>();	//타입 앞뒤가 다른 경우
	}
}

class Container<T, U> {	//2개의 타입 파라미터를 갖는 객체
	private T item1;	// String type
	private U item2;	// Integer type
	
	public Container() {

	}
	
	Container(T item1, U item2) {	// 생성자에도 type 파라미터 가능
		this.item1 = item1;
		this.item2 = item2;
	}
	
	public T getItem1() {
		return item1;
	}
	
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	
	public U getItem2() {
		return item2;
	}
	
	public void setItem2(U item2) {
		this.item2 = item2;
	}
	
}