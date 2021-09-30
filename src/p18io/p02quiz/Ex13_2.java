package p18io.p02quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex13_2 {
	public static void main(String[] args) {
		// src -> des
		// 라인넘버를 앞에 붙여서
		
		String src = "src/p18io/p02quiz/Ex13_2.java";
		String des = "C:\\Users\\user\\Desktop\\iotest\\Ex13_2.java";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		String line = "";
		int lineNum = 0;
		
		try {
			fr = new FileReader(src);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(des);
			bw = new BufferedWriter(fw);
			
			while((line = br.readLine()) != null) {
				bw.write(lineNum+":"+line);
				bw.newLine();
				lineNum++;
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}catch (IllegalArgumentException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				
				br.close();
				fr.close();
				
				System.out.println("프로그램 종료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}
