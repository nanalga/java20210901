package p18io.p02quiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex12_2 {
	public static void main(String[] args) {
		// 이 파일을 출력
		// 앞에 라인 넘버 붙여서 콘솔창에 출력
		String src = "src/p18io/p02quiz/Ex12_2.java";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		String line = "";
		int lineNum = 0;
		
		try {
			fr = new FileReader(src);
			br = new BufferedReader(fr);
			
			try {
				while((line = br.readLine()) != null) {
					System.out.println(lineNum + ":" + line);
					lineNum++;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
