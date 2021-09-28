package p14lamda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex09 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		// ArrayList.replaceAll
		// 코드 작성
		
		list.replaceAll(e -> e*2);
		
		System.out.println(list); // [2, 4, 6, 8]
	}
}
