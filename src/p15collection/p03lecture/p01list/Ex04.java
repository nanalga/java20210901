package p15collection.p03lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		//ArrayList 주의해야 할 점
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("html");
		
		System.out.println(list.get(-1));	// 또는 음수를 사용
		System.out.println(list.get(2));	// 벗어난 인덱스 사용 IndexOutOfBoundsException
	}
}
