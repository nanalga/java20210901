package p18io.p03lecture.p02outputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:\\Users\\user\\Desktop\\iotest\\keyboard.png");	// 130,510
		OutputStream os = new FileOutputStream("C:\\Users\\user\\Desktop\\iotest\\outtest5.png");
		
		byte[] datas = new byte[100];
		
		for(int i = 0; i < 1306; i++) {
			if (i == 1305) {
				is.read(datas);		
				os.write(datas, 0, 10);	// datas로 나눈 나머지 값(마지막) 지정
			} else {
				is.read(datas);		// si에서 읽은것을 datas에
				os.write(datas);	// datas에서 쓴것을 os에
			}
		}
		
		System.out.println("program end");
		is.close();
		os.close();
	}
}
