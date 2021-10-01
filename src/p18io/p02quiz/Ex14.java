package p18io.p02quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex14 {
	public static void main(String[] args) throws Exception {
		// BufferedInputStream과 BufferedOutputStream 이용해서 파일 복사 하기
		String src = "C:\\Users\\user\\Desktop\\iotest\\outtestF.txt";
		String des = "C:\\Users\\user\\Desktop\\iotest\\outtestG.txt";
		
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(des);
		
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		int len = 0;
		
		long start = System.currentTimeMillis();
//		while((len = is.read()) != -1) {	// 8153ms, 8193ms
//			os.write(len);
//		}
		while((len = bis.read()) != -1) {	// 42ms, 40ms
			bos.write(len);
		}
		long end = System.currentTimeMillis();
		
		
		bos.close();
		bis.close();
		os.close();
		is.close();
		
		System.out.println((end - start) + "ms");
	}
}
