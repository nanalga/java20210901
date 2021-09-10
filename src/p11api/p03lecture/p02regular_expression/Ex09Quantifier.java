package p11api.p03lecture.p02regular_expression;

import java.util.regex.Pattern;

public class Ex09Quantifier {
	public static void main(String[] args) {
		String p1 = "a{3}"; // a가 3번 반복 패턴 {반복수}
		System.out.println(Pattern.matches(p1, "aaa"));
		System.out.println(Pattern.matches(p1, "a"));
		System.out.println(Pattern.matches(p1, "aa"));
		System.out.println(Pattern.matches(p1, "aaaa"));

		System.out.println("===================================");

		String p2 = "a{1,3}"; // 1~3번
		System.out.println(Pattern.matches(p2, "aaa"));
		System.out.println(Pattern.matches(p2, "a"));
		System.out.println(Pattern.matches(p2, "aa"));
		System.out.println(Pattern.matches(p2, "aaaa"));

		System.out.println("===================================");

		String p3 = "a{2,}"; // 2번이상	
		System.out.println(Pattern.matches(p3, "aaa"));
		System.out.println(Pattern.matches(p3, "a"));
		System.out.println(Pattern.matches(p3, "aa"));
		System.out.println(Pattern.matches(p3, "aaaa"));
	}
}
