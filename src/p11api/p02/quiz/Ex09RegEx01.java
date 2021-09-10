package p11api.p02.quiz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex09RegEx01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Boolean run = true;
		String p3 = "[a-zA-Z]*\\w\\w";
		
		while(run) {
			System.out.print("입력 : ");
			String input = scanner.nextLine();
			
			if(Pattern.matches(p3, input)) {
				System.out.println(input + "은 " + p3 + "와 일치합니다.");
			} else {
				System.out.println(input + "은 " + p3 + "와 일치하지 않습니다.");
			}
		}
		
	}
}
