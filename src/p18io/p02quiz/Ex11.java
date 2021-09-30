package p18io.p02quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) throws Exception {
		// 사용자로 입력 받은 내용을
		// 파일에 작성하기
		
		// 입력 : 오늘 점심은 돈까스
		// 입력 : 내일 점심은 자장면
		// 입력 : exit
		
		String name = "C:\\Users\\user\\Desktop\\iotest\\outtestD.txt";
		Writer wr = new FileWriter(name);
		
		Scanner scan = new Scanner(System.in);	// Scanner 생성
		
		boolean run = true;		// while문 반복 조건
		
		while(run) {	// false경우 종료
			System.out.print("입력 : ");
			String strInput = scan.nextLine();	// 입력 받는 내용 -> strInput에 저장
			
			if(strInput.equals("exit")) {		// exit입력 되었을때
				run = false;					// run -> false로 대입하고 반복문 종료
			} else {							// exit 입력이 안될때
				wr.write(strInput);				// write()에 저장 
				wr.write("\n");					// 줄바꿈
				wr.flush(); 					// 한줄 쓸때마다 flush
			}
		}

		wr.close();
		scan.close();
		System.out.println("프로그램 종료");
	}
}
