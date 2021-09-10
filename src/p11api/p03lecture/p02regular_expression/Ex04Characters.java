package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex04Characters {
	public static void main(String[] args) {
		String p1 = "[abcd]";
		
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "b"));
		System.out.println(Pattern.matches(p1, "c"));
		System.out.println(Pattern.matches(p1, "d"));
		
		System.out.println("=============================");
		
		String p2 = "[a-d]";
		
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "b"));
		System.out.println(Pattern.matches(p2, "c"));
		System.out.println(Pattern.matches(p2, "d"));
		
		String p3 = "[0-9]";
		System.out.println(Pattern.matches(p3, "0"));
		System.out.println(Pattern.matches(p3, "1"));
		System.out.println(Pattern.matches(p3, "8"));
		
		System.out.println("===========================");
		
		String p4 = "[A-Z]";
		System.out.println(Pattern.matches(p4, "A"));
		System.out.println(Pattern.matches(p4, "B"));
		System.out.println(Pattern.matches(p4, "Z"));
		
		System.out.println("===========================");
		
		String p5 = "[a-z, A-Z]";
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "b"));
		System.out.println(Pattern.matches(p2, "c"));
		System.out.println(Pattern.matches(p2, "d"));
		
		System.out.println(Pattern.matches(p5, "A"));
		System.out.println(Pattern.matches(p5, "B"));
		System.out.println(Pattern.matches(p5, "Z"));
		
		System.out.println(Pattern.matches(p5, " "));
		System.out.println(Pattern.matches(p5, ","));
		
		System.out.println("===========================");
		
	}
}
