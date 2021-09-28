package p14lamda.p03lecture;

import java.util.Arrays;
import java.util.List;

public class Ex14FinalVariable {
	
	public static void main(String[] args) {
		final int a = 3;
		
		int sum = 0;
		List<Integer> list = Arrays.asList(3, 4, 5);
//		list.forEach(e -> sum += e);	// 지역변수를 변경 할 수 없음
										// 사용하는 지역변수는 final이어야 함
										// final이 아니면 final로 간주함
		list.forEach(e -> System.out.println(sum)); // 사용은 가능
		
//		sum = 1;
	}
}
