package p18io.p02quiz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex11_2 {
	public static void main(String[] args) {
		// 사용자로 입력 받은 내용을
		// 파일에 작성하기
		
		// 입력 : 오늘 점심은 돈까스
		// 입력 : 내일 점심은 자장면
		// 입력 : exit
		
		String file = "C:\\Users\\user\\Desktop\\iotest\\outhuhutestD.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		Scanner scan = new Scanner(System.in);
		String input = "";
		boolean run = true;		
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			while(run) {
				System.out.print("입력 : ");
				input = scan.nextLine();
				
				if(input.equals("exit")) {
					run = false;
				} else {
					
					bw.write(input);
					bw.newLine();
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				
				System.out.println("프로그램 종료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
