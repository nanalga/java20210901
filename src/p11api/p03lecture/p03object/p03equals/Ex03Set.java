package p11api.p03lecture.p03object.p03equals;

import java.util.HashSet;
import java.util.Set;

public class Ex03Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		System.out.println(set.size()); //0
		
		set.add("java");
		System.out.println(set.size()); //1
		
		set.add("spring");
		System.out.println(set.size()); //2
		
		set.add("java");
		System.out.println(set.size()); //2 - 같은 객체는 담겨질수 없다.
		
		
	}
}
