package p14lamda.p02quiz;

import java.util.Arrays;
import java.util.List;

public class Ex11 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "a", "spring", "qa", "mouse", "bob");
		
		System.out.println(list);
		
		//list.sort
		list.sort((o1, o2) -> o1.length() - o2.length());
		System.out.println(list); // [a, qa, bob, java, mouse, spring]
		
		list.sort((o1, o2) -> o2.length() - o1.length());
		System.out.println(list);
	}
}
