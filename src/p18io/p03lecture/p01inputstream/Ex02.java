package p18io.p03lecture.p01inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\test1.txt";
		InputStream is = new FileInputStream(file);
		
		int input = 0;
		
		while((input = is.read()) != -1) {	// input이 -1이 아닌동안 while작동, read()는 파일이 없을때 -1리턴
			System.out.println(input);		// 입력 받은 값을 출력
		}
		
		System.out.println("프로그램 종료");
		is.close();	// InputStream 종료
	}
}






