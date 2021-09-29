package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex01 {
	// InputStream.read()를 사용해서 loof가 몇 번 실행 되었는지 size에 저장
	public static void main(String[] args) {
		String fileName = "C:\\Users\\user\\Desktop\\iotest\\test1.txt";
		
		InputStream is = null;
		int count = 0;
		
		try {
			is = new FileInputStream(fileName);
			
			try {
				while(is.read() != -1) {
					count++;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(count);
		
	}
}
