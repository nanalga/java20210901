package p18io.p02quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex13 {
	public static void main(String[] args) throws Exception {
		// src -> des
		// 라인넘버를 앞에 붙여서
		
		String file = "src/p18io/p02quiz/Ex13.java";
		String des = "C:\\Users\\user\\Desktop\\iotest\\Ex13.java";
		
		FileReader fr = new FileReader(file);
		FileWriter fw = new FileWriter(des);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line = "";
		int numberLine = 0;
		
		while ((line = br.readLine()) != null) {
			bw.write(numberLine + ":" + line);
			bw.newLine();
			numberLine++;
		}

		br.close();	// 감싼거 먼저 닫는다 or 가장 밖에 있는 것만 닫아도 된다.
		fr.close();
		
		bw.close();
		fw.close();
	
		System.out.println("프로그램 종료");
	}
}
