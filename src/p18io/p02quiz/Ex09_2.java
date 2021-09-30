package p18io.p02quiz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex09_2 {
	public static void main(String[] args) {
		// ABCDE ~ Z
		String file = "C:\\Users\\user\\Desktop\\iotest\\outjujutest9.txt";
		FileWriter fr = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileWriter(file);
			bw = new BufferedWriter(fr);
			
			for(char c = 'A'; c <= 'Z'; c++) {
				bw.write(c);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				
				bw.close();
				fr.close();
				
				System.out.println("프로그램 종료");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
