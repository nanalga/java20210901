package p11api.p02.quiz;

import java.util.Scanner;

public class Ex03CharAt {
	public static void main(String[] args) {
		//입력한 글자의 가운데 글자 출력
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("입력 : ");
			String str = scan.next();
			if(str.equals("exit")) {
				break;
			}
			int mid = (str.length()/2);
			char c = str.charAt(mid);
			System.out.println("가운데 글자는 : "+c);
		}
		
	}
}
