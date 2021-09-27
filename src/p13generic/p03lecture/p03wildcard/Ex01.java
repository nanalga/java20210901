package p13generic.p03lecture.p03wildcard;

import java.util.ArrayList;

public class Ex01 {
	// wildcard
	
	public static void main(String[] args) {
		Number n1 = new Integer(3);
		
		ArrayList<Number> list1 = new ArrayList<>();
		
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list1 = list2;	// 이게 된다면...
		list1.add(new Double(3.14)); // 이게 되야 함
		// list1이 가리키고 있는 instance는 list2와 같음
		// list2는 Double 타입의 item을 가질 수 없음
		
		// 결론 ArrayList<Number>는 ArrayList<Integer>의 상위 타입이 아니다.
	
	
	}
}
