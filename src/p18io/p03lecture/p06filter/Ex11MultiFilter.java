package p18io.p03lecture.p06filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Ex11MultiFilter {
	public static void main(String[] args) throws Exception {
		// InputStream to Reader
		// Reader를 BufferedReader로 감싸서 읽어서 출력
		String file = "C:\\Users\\user\\Desktop\\iotest\\outtestJ.txt";
		
		InputStream is = new FileInputStream(file);
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		String line = null;
				
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		System.out.println("종료");
		br.close();
		reader.close();
		is.close();
	}
}
