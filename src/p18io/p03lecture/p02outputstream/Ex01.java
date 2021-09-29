package p18io.p03lecture.p02outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\outtest1.txt";	// 출력할 파일명까지 작성
		OutputStream os = new FileOutputStream(file);
		
		// write()는 마지막 1byte만 출력
		os.write(65);	// 1 byte 출력	
		os.write(66);
		
		System.out.println("프로그램 종료");
		os.close();
	}
}

