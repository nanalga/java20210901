package p11api.p02.quiz;

import java.util.Scanner;

public class Ex08Split {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//코드작성
		boolean run = true;
		while(run) {
			System.out.print("입력 문자열 : ");
			String input = scan.nextLine();
			
			if(input.equals("q")) {
				break;
			}
			
			System.out.print("구분자 입력 : ");
			String dm = scan.nextLine();
			
			String[] result = input.split(dm);
			
			for(String item : result) {
				System.out.println(item);
			}
			
		}
		
		
		scan.close();
	}
}
