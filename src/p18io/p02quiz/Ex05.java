package p18io.p02quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		// 파일명 : outtest4.txt
		// 파일 크기 : 1024 * 1024 byte
		// 내용은 상관없음
		// 파일 만들어보기
		// OutputStream.write(byte[]) 사용해보기
		
		OutputStream os = new FileOutputStream("C:\\Users\\user\\Desktop\\iotest\\outtest4.txt");
		
		byte[] datas = new byte[1000];
		int size = 1024*1024;
		
		
		for(int i = 0; i < size; i++) {
			os.write(64);
		}
		
		System.out.println("program end");
		os.close();
	}
}
