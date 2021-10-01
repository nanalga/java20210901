package p18io.p03lecture.p06filter;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex06InpuStreamReader {
	public static void main(String[] args) throws Exception {
		// InputStream -> Reader 변경
		InputStream is = getInputStream("C:\\Users\\user\\Desktop\\iotest\\test5.txt");
		Reader reader = new InputStreamReader(is);	// 문자를 읽기 위해 InputStreamReader로 Reader 생성
		
//		System.out.println((char) is.read());
//		System.out.println((char) is.read());
//		System.out.println((char) is.read());	// 한글 깨짐
//		System.out.println((char) is.read());	// 한글 깨짐
		
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());
		System.out.println((char) reader.read());
		
		reader.close();
		is.close();
	}
	
	public static InputStream getInputStream(String file) throws Exception {
		
		return new FileInputStream(file);
	}
	
	
}
