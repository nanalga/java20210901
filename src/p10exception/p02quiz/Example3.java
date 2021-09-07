package p10exception.p02quiz;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		try {
			while(true) {
				int n1 = 0;
				int n2 = 0;
			
				System.out.print("첫번째 수 입력: ");
				String str1 = scanner.next();

				System.out.print("두번째 수 입력: ");
				String str2 = scanner.next();
			
				n1 = Integer.parseInt(str1);
				n2 = Integer.parseInt(str2);
				
				System.out.println("더한 결과는 : "+ (n1+n2));
			}
		} catch (NumberFormatException e) {
			System.out.println("잘못된 값을 입력 했습니다.");
			System.out.println("프로그램을 종료합니다.");
		}
		scanner.close();
	}
}

