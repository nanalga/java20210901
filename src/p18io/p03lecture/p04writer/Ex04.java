package p18io.p03lecture.p04writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex04 {
	// writer(String s) 문자열
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\iotest\\outtestC.txt";
		Writer wr = new FileWriter(name);
		
		wr.write("java");
		wr.write("\n");
		wr.write("spring");
		
		wr.close();
		System.out.println("프로그램 종료");
	}
}
