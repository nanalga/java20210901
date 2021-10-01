package p18io.p03lecture.p06filter;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex04BufferedOutputStream {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\outtestF.txt";
		OutputStream os = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1024 * 1024 * 1; i++) {
//			os.write('a');	// 4834ms
			bos.write('a');	// 24ms
		}
		long end = System.currentTimeMillis();
		
		System.out.println((end - start) + "ms");
		
		bos.close();
//		os.close();
	}
}
