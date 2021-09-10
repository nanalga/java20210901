package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex05Characters {
	public static void main(String[] args) {
		String p1 = "[^a]";	//^ㅁ 빼고 다 true, ^맨 앞에 붙인다.
		
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, " "));
		
		System.out.println("==============================");
		
		String p2 = "[^a-z]";
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "A"));
		System.out.println(Pattern.matches(p2, "1"));
		
		System.out.println("==============================");
		
		String p3 = "[a-z^c]";
		System.out.println(Pattern.matches(p3, "a"));
		System.out.println(Pattern.matches(p3, "c"));
		
		System.out.println("==============================");
		
		String p4 = "[a-bd-z]";
		System.out.println(Pattern.matches(p4, "c"));
		System.out.println(Pattern.matches(p4, "a"));
		System.out.println(Pattern.matches(p4, "z"));
		
		System.out.println("==============================");
		
		String p5 = "[az&&[^C]]";
		System.out.println(Pattern.matches(p4, "C"));
		System.out.println(Pattern.matches(p4, "a"));
		System.out.println(Pattern.matches(p4, "z"));
		
	}
}
