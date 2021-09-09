package p11api.p03lecture.p01String;

public class Ex06IndexOf {
	public static void main(String[] args) {
		
		String s1 = "java와 javascript는 java도 oop고, javascript도 oop다";
		
		System.out.println(s1.indexOf("java"));	//시작부터
		System.out.println(s1.lastIndexOf("java"));	//뒤에서부터
		
		//특정 인덱스를 찾을때 파라미터 값을 넣어서 찾는다.
		System.out.println(s1.indexOf("java", 5));	//5번부터 찾는다
		System.out.println(s1.indexOf("java", 10));	//10번부터 찾는다.
		
	}
}
