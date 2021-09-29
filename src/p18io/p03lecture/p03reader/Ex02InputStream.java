package p18io.p03lecture.p03reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Ex02InputStream {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\user\\Desktop\\iotest\\test3.txt";
		InputStream is = new FileInputStream(fileName);
		
		int b1 = is.read();
		int b2 = is.read();
		int b3 = is.read();
		int b4 = is.read();
		
		int b5 = is.read();
		int b6 = is.read();
		int b7 = is.read();
		int b8 = is.read();
		
		int b9 = is.read();
		
		System.out.println((char)b1);	// 영문자는 2byte
		System.out.println((char)b2);
		System.out.println(b3);			// 문서에서 한글은 3byte -> java에서는 2byte 유니코드
		System.out.println(b4);

		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		System.out.println(b8);

		System.out.println(b9);
		
	}
}
