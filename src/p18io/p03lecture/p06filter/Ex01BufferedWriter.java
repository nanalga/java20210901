package p18io.p03lecture.p06filter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01BufferedWriter {
	public static void main(String[] args) throws Exception {
		// 메모리를 확보해서 쓰는데 더 빠르게 해주는 스트림
		// BufferedWriter
		// 빠른 속도
		
		String name = "C:\\Users\\user\\Desktop\\iotest\\outtestE.txt";
		Writer writer = new FileWriter(name);	// 메모리를 거치지 않고 바로 바로 출력
		BufferedWriter bw = new BufferedWriter(writer);	// 메모리에 모아서 한번에 출력
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1024 * 1024 * 1024; i++) {
//			writer.write('a');	//Writer  // 36초
			bw.write('a');	// BufferedWriter //16초
		}
		long end = System.currentTimeMillis();
		
		System.out.println(end - start + " 밀리세컨드");
		
		System.out.println("프로그램 종료");
		bw.close();
		writer.close();
	}
}
