package p18io.p03lecture.p03reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		String fileName = "C:\\Users\\user\\Desktop\\iotest\\test3.txt";
		Reader r = new FileReader(fileName);
		
		int c1 = r.read();	// Reader의 read()에서는 한글표현 가능
		int c2 = r.read();
		int c3 = r.read();
		int c4 = r.read();
		int c5 = r.read();	// 더 읽을 문자가 없으면 -1 return
		
		System.out.println((char)c1);
		System.out.println((char)c2);
		System.out.println((char)c3);
		System.out.println((char)c4);
		System.out.println(c5);
		
		r.close();
	}
}
