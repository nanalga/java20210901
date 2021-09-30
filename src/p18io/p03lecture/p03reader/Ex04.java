package p18io.p03lecture.p03reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		// 반복문을 이용한 파일 출력
		String name = "C:\\Users\\user\\Desktop\\iotest\\test4.txt";
		FileReader fr = new FileReader(name);
		char[] datas = new char[3];
		int cnt = 0;
		
//		while((cnt = fr.read(datas)) != -1) {
//			for(int i = 0; i < cnt; i++) {
//				System.out.print(datas[i] + ", ");	
//			}
//		}
		while((cnt = fr.read(datas, 0, 1)) != -1) {
			for(int i = 0; i < cnt; i++) {
				System.out.print(datas[i]);	
			}
			System.out.print(", ");
		}
		
		
		fr.close();
	}
}
