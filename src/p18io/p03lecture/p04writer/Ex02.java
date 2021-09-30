package p18io.p03lecture.p04writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		// write(char[])
		String file = "C:\\Users\\user\\Desktop\\iotest\\test9.txt";
		Writer wr = new FileWriter(file);
		char[] datas = {'s', 'p', 'r', 'i', 'n', 'g'};
		char[] datas2 = {'j', 'a', 'v', 'a'};
		
		wr.write(datas);
		wr.write(datas2);
		wr.write(datas);
		wr.write(datas, 2, 4);	// datas배열의, 2번 index부터 4개
		
		System.out.println("프로그램 종료");
		wr.close();
	}
}
