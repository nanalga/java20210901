package p18io.p02quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex03_2 {
	public static void main(String[] args) {
		// 파일 내용 상관없이
		// outtest2.txt 파일을
		// 1024byte 크기로 만들기
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("C:\\Users\\user\\Desktop\\iotest\\outjujutest1.txt");
			
			for(int i = 0; i < 1024; i++) {
				try {
					os.write(65);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				System.out.println("프로그램 종료");
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
