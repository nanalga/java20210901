package p18io.p02quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex05_2 {
	public static void main(String[] args) {
		// 파일명 : outjujutest4.txt
		// 파일 크기 : 1024 * 1024 byte
		// 내용은 상관없음
		// 파일 만들어보기
		// OutputStream.write(byte[]) 사용해보기
		
		OutputStream os = null;
		
		byte[] datas = new byte[1000];
		
		try {
			os = new FileOutputStream("C:\\Users\\user\\Desktop\\iotest\\outjujutest4.txt");
			
			for(int i = 0; i < 1024*1024; i++) {
				try {
					os.write(64);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
