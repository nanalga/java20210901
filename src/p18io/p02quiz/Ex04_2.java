package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04_2 {
	public static void main(String[] args) {
		// 각자 가진 그림 파일을 내용으로 채워진 새 파일 만들기
		// 파일명 outjujutest2.png (원본 파일 확장자 사용)
		// 원본 크기와 같은 크기, 같은 내용
		
		InputStream is = null;
		OutputStream os = null;
		
		int len = 0;
		
		try {
			is = new FileInputStream("C:\\Users\\user\\Desktop\\iotest\\keyboard.png");
			os = new FileOutputStream("C:\\Users\\user\\Desktop\\iotest\\outjujutest2.png");
			
			try {
				
				while((len = is.read()) != -1) {
					os.write(len);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}
