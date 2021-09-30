package p18io.p03lecture.p03reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\iotest\\test4.txt";
		FileReader fr = new FileReader(name);
		char [] datas = new char[3];	// 3크기 char 배열 (배열 크기만큼 문자 읽음)
		
		int cnt1 = fr.read(datas);					// 3개 문자 읽음
		System.out.println(cnt1 + "개 읽음");		// 3개 읽음
		System.out.println(Arrays.toString(datas));
		
		int cnt2 = fr.read(datas);					// 3개 문자 읽음
		System.out.println(cnt2 + "개 읽음");		// 3개 읽음
		System.out.println(Arrays.toString(datas));
		
		int cnt3 = fr.read(datas);					// 3개 문자 읽음
		System.out.println(cnt3 + "개 읽음");		// 3개읽음
		System.out.println(Arrays.toString(datas));
		
		int cnt4 = fr.read(datas);					// 1개 문자 읽음
		System.out.println(cnt4 + "개 읽음");		// 1 읽음
		System.out.println(Arrays.toString(datas));
		
		int cnt5 = fr.read(datas);
		System.out.println(cnt5 + "개 읽음 : -1이면 더 이상 읽을 문자가 없음");
		
		fr.close();
	}
}
