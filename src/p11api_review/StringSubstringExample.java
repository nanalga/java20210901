package p11api_review;

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "123456-999999";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
