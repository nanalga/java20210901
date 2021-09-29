package p18io.p03lecture.p02outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		byte[] dates = new byte[] {65, 65, 65, 65};
		
		OutputStream os = new FileOutputStream("C:\\Users\\user\\Desktop\\iotest\\outtest3.txt");
		
		os.write(dates);
		os.write(dates);
		
		System.out.println("program end");
		os.close();
	}
}

