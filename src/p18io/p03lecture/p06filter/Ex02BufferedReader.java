package p18io.p03lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Ex02BufferedReader {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\iotest\\outtestE.txt";
		Reader reader = new FileReader(name);
		BufferedReader br = new BufferedReader(reader);
		
		long start = System.currentTimeMillis();
		while(reader.read() != -1) {	// Reader 사용 47556ms, 48441ms
//		while(br.read() != -1) {	// BufferedReader 사용 23215ms, 23040ms 
			
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start + "ms");
		
		
		System.out.println("프로그램 종료");
		reader.close();
		br.close();
	}
}
