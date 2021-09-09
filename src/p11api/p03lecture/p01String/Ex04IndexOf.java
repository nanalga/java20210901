package p11api.p03lecture.p01String;

public class Ex04IndexOf {
	public static void main(String[] args) {
		String s1 = "string";
		//index      012345
		System.out.println(s1.length());
		System.out.println(s1.indexOf("ring"));
		
		System.out.println(s1.indexOf("s"));
		System.out.println(s1.indexOf("ps"));
		
		String s2 = "java보다 javascript가 더 쉬웠어요";
		System.out.println(s2.indexOf("script"));
		System.out.println(s2.indexOf("java"));
	}
}
