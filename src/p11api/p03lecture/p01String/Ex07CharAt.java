package p11api.p03lecture.p01String;

public class Ex07CharAt {
	public static void main(String[] args) {
		//charAt
		
		String s1 = "java";
		
		System.out.println(s1.charAt(0));
		
		char c = s1.charAt(1);
		System.out.println(c);
		
		char d = s1.charAt(4);	//exception
		System.out.println(d);
		
	}
}
