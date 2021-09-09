package p11api_review;

public class StringReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바는 객체지향 언어이다.";
		String newStr = oldStr.replace("자바", "java");
		
		System.out.println(newStr);
	}

}
