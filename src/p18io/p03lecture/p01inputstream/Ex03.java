package p18io.p03lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\text2.txt";
		InputStream is = new FileInputStream(file);
		
		byte[] data = new byte[10];
		
		int dataSize1 = is.read(data);	// 10byte를 읽고 리턴
		int dataSize2 = is.read(data);
		int dataSize3 = is.read(data);
		int dataSize4 = is.read(data);
		int dataSize5 = is.read(data);	// 마지막 남은 4byte사이즈 읽고 return 
		int dataSize6 = is.read(data);  // 더이상 읽을 테이터가 없을 때는 -1
		
		System.out.println(dataSize1);	// 10
		System.out.println(dataSize2);	// 10
		System.out.println(dataSize3);	// 10
		System.out.println(dataSize4);	// 10
		System.out.println(dataSize5);	// 4
		System.out.println(dataSize6);	// 더이상 읽을 데이터가 없어서 -1
		
		is.close();
	}
}
