package p11api.p02.quiz;

import java.util.Scanner;

public class Ex04Substring {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("입력 : ");
			String str = scan.next();
			
			if(str.equals("exit")) {
				break;
			}
			String front = str.substring(0, (str.length()/2));
			String end = str.substring((str.length()/2), str.length());
			System.out.println("앞절반 : " + front);
			System.out.println("뒤절반 : " + end);
		}
		
	}
}
