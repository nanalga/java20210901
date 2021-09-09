package p11api_review;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "013611-2023123";
		
		char sex = ssn.charAt(7);
		
		switch (sex) {
		case '1':
			System.out.println("남자입니다.");
			break;
		case '2':
			System.out.println("여자입니다.");
			break;

		default:
			break;
		}
		
	}

}
