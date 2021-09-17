package p15collection.p02quiz.p01list;

import java.util.Scanner;

public class Ex05 {
	public int sum(String str) {
		// str: "3 4"
		// return: 7
		int sub = str.indexOf(" ");
		int front = Integer.parseInt(str.substring(0, sub));
		int back = Integer.parseInt(str.substring(sub+1));
		
		return front + back;
	}
	
	public int sum2(String str) {
		String[] s = str.split(" ");
		
		int num1 = Integer.parseInt(s[0]);
		int num2 = Integer.parseInt(s[1]);
		
		return num1 + num2;
	}
	
	public int sum3(String str) {
		Scanner scan = new Scanner(str);
		
		return scan.nextInt() + scan.nextInt();
	}

}
