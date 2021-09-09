package p11api_review;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("java ");	//문자열 끝에 추가
		sb.append("program study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2");	//4번째 문자에 2를 삽입
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');	//4번째 문자를 6으로 변ㄱ경
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "book");	//6번째부터 13번째 문자열까지 book로 변경
		System.out.println(sb.toString());
		
		sb.delete(4, 5);	//5번 문자 삭제
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("문자총수: "+length);
		
		String result = sb.toString();	//버퍼타입을 String타입으로 리턴
		System.out.println(result);
		
	}
}
