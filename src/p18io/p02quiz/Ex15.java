package p18io.p02quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) throws Exception {
		OutputStream os = getOutputStream("C:\\Users\\user\\Desktop\\iotest\\outtestI.txt");
		Writer wr = new OutputStreamWriter(os); 
		Scanner scanner = new Scanner(System.in);
		
		String input = null;
		boolean run = true;
		while(run) {
			// input을 outtestI.txt 파일에 쓰기
			// exit를 입력 받으면 loof종료
			
			System.out.print("입력 : ");
			input = scanner.nextLine();
			
			if(input.equals("exit")) {
				break;
			} else {
				wr.write(input);
				wr.write("\n");
			}
		}
		
		wr.close();
		os.close();
		scanner.close();
		System.out.println("종료");
	}
	
	public static OutputStream getOutputStream(String file) throws Exception {
		return new FileOutputStream(file);
	}
}
