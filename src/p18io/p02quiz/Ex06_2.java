package p18io.p02quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex06_2 {
	public static void main(String[] args) {
		// Reader를 활용해서 test3.txt 파일 내용 출력
		String fileName = "C:\\Users\\user\\Desktop\\iotest\\test3.txt";
		
		InputStreamReader is = null;
		int datas = 0;
		
		try {
			is = new FileReader(fileName);
			try {
				
				while((datas = is.read()) != -1){
					System.out.println((char)datas);
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
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
