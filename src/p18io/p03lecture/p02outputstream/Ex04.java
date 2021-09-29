package p18io.p03lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\user\\Desktop\\iotest\\keyboard.png");
		OutputStream os = new FileOutputStream("C:\\Users\\user\\Desktop\\iotest\\outtest6.png");
		
		byte[] datas = new byte[100];	// 100크기의 byte타입 배열 생성
		int len = 0;					// FileInputStream을 저장 받을 변수
		
		while((len = is.read(datas)) != -1) {	// datas길이만큼 읽을 데이터를 len에 저장 
			os.write(datas, 0, len);			// 0 ~ len까지의 길이를 write입력 
		}
		
		System.out.println("program end");
		is.close();		// InputStream 종료
		os.close();		// OutputStream 종료
	}
}



