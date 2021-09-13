package p11api.p03lecture.p01String;

public class Ex08Substring {
	public static void main(String[] args) {
		// substring
		
		//			 0123456789
		String s1 = "javascript";
		
		String sub1 = s1.substring(4);	//4번 인덱스부터 끝까지 부분 문자열 리턴
		System.out.println(sub1);
		
		String sub2 = s1.substring(0, 4); //0번 인덱스부터 3번 인덱스까지의 부분 문자열 리턴
		System.out.println(sub2); 		  //0번부터 4-1번까지
		
	}
}



