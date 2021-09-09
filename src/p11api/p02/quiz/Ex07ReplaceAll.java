package p11api.p02.quiz;

import java.util.Scanner;

public class Ex07ReplaceAll {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str = scan.nextLine();
		
		String r = str.replaceAll("\s+", " ").trim();
		
		System.out.println(r);
		
		scan.close();
		
	}
}
