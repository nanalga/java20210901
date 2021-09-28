package p14lamda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex08 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("apple", "java", "abc", "amond", "spring"));
		
		// List removeIf 활용
//		list.removeIf(s -> s.charAt(0) != 'a');
		list.removeIf(e -> !e.startsWith("a"));
		
		System.out.println(list); // [apple, abc, amond]
		
		
	}
}
