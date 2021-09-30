package p18io.p02quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex09 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\outtest8.txt";
		Writer wr = new FileWriter(file);
		
		// ABCDE ~ Z
		for(int i = 65; i <= 90; i++) {
			wr.write(i);
		}
		
		
		System.out.println("프로그램 종료");
		wr.close();
	}
}
