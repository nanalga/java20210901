package p11api.p03lecture.p01String;

public class Ex05LastIndexOf {
	public static void main(String[] args) {
		//lastIndexOf
		
		String s1 = "java보다 javascript가 더 쉬웠어요";
		
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.lastIndexOf("java"));	//뒤에서부터 찾는다.
		System.out.println(s1.lastIndexOf("python"));
		
	}
}
