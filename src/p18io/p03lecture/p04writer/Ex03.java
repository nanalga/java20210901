package p18io.p03lecture.p04writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex03 {
	public static void main(String[] args) throws Exception {
		String src = "C:\\Users\\user\\Desktop\\iotest\\test9.txt";
		String des = "C:\\Users\\user\\Desktop\\iotest\\testA.txt";
		
		Reader rd = new FileReader(src);
		Writer wr = new FileWriter(des);
		
		char[] datas = new char[3];
		int cnt = 0;	// 몇개 읽었는지 저장하는 변수
		
		while ((cnt = rd.read(datas)) != -1) {
			wr.write(datas, 0, cnt);		// datas의 배열 크기 만큼 복사
		}
		
		rd.close();
		wr.close();
		System.out.println("프로그램 종료");
	}
}
