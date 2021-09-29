package p18io.p02quiz;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		// 파일 내용 상관없이
		// outtest2.txt 파일을
		// 1024byte 크기로 만들기
		
		String name = "C:\\Users\\user\\Desktop\\iotest\\outtest2.txt";
		
		OutputStream os = new FileOutputStream(name);
		
		for(int i = 0; i < 1024; i++) {
			os.write(65);
		}
		
		
		System.out.println("program end");
		os.close();
	}
}
