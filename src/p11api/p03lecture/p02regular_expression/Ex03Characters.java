package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex03Characters {
	public static void main(String[] args) {
		String p1 = "[abc]";
		
		System.out.println(Pattern.matches(p1, "a"));	//true
		System.out.println(Pattern.matches(p1, "b"));	//true
		System.out.println(Pattern.matches(p1, "c"));	//true

		System.out.println(Pattern.matches(p1, "d"));	//false
		System.out.println(Pattern.matches(p1, "e"));	//false
		System.out.println(Pattern.matches(p1, "f"));	//false
		
		System.out.println("======================================");
		
		String p2 = "[azAZ]";
		
		System.out.println(Pattern.matches(p2, "a"));	//true
		System.out.println(Pattern.matches(p2, "A"));	//true
		System.out.println(Pattern.matches(p2, "z"));	//true
		System.out.println(Pattern.matches(p2, "Z"));	//true

		System.out.println(Pattern.matches(p2, "B"));	//false
		System.out.println(Pattern.matches(p2, "B"));	//false
		
		System.out.println("======================================");
		
		String p3 = "[abcdefghijklmnopqrstuvwxyz]";
		System.out.println(Pattern.matches(p3, "a"));
		System.out.println(Pattern.matches(p3, "b"));
		System.out.println(Pattern.matches(p3, "z"));

		System.out.println(Pattern.matches(p3, "A"));
		System.out.println(Pattern.matches(p3, "B"));
		System.out.println(Pattern.matches(p3, "Z"));
		
	}
}
