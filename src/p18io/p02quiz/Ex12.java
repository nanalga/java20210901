package p18io.p02quiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Ex12 {
	public static void main(String[] args) throws Exception {
		// 이 파일을 출력
		// 앞에 라인 넘버 붙여서 출력
		
		String file = "src/p18io/p02quiz/Ex12.java";
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		int i = 1;
		
		while ( (line = br.readLine()) != null ) {
			System.out.println(i + ":" + line);
			i++;
		}
		
		fr.close();
		br.close();
		
		System.out.println("프로그램 종료");
	}

}
