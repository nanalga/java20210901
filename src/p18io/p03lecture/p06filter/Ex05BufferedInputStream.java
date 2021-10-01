package p18io.p03lecture.p06filter;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Ex05BufferedInputStream {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\outtestF.txt";
		InputStream is = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(is); // BufferedInputStream으로 InputStream을 감싼다
		
		long start = System.currentTimeMillis();
		
//		while((is.read()) != -1) {	// 3680ms
//			
//		}
		
		while(bis.read() != -1) {	//26ms, 19ms
			
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println((end - start)+"ms");
		bis.close();
		is.close();
	}
}
