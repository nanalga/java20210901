package p18io.p02quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex10_2 {
	public static void main(String[] args) {
		// 원본내용
		// springjavaspringring

		// 대상파일
		// 4개씩 끊어서 거꾸로 복사
		// irspajgnpsavgnirgnir
		
		String src = "C:\\Users\\user\\Desktop\\iotest\\test9.txt";	// 원본파일
		String des = "C:\\Users\\user\\Desktop\\iotest\\testjujuB.txt";	// 대상파일
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		char[] datas = new char[4];
		int len = 0;
		
		try {
			fr = new FileReader(src);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(des);
			bw = new BufferedWriter(fw);
			
			while((len = br.read(datas)) != -1) {
//				for(int i = datas.length-1; i >= 0; i--) {
//					bw.write(datas[i]);
//				}
				
				reverse(datas);
				bw.write(datas);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
				
				fw.close();
				fr.close();
				System.out.println("프로그램 종료");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void reverse(char[] datas) {
		int left = 0;
		int right = datas.length-1;
		
		while(left < right) {
			char c = datas[left];
			datas[left] = datas[right];
			datas[right] = c;
			
			left++;
			right--;
		}
		
	}

}
