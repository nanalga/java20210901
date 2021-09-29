package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex02_2 {
	// InputStream.read(byte[])를 활용해서 file 크기 계산
	public static void main(String[] args) {
		String fileName = "C:\\Users\\user\\Desktop\\iotest\\keyboard.png";
		
		InputStream is = null;
		byte[] datas = new byte[100];
		int len = 0;
		int dataSize =0;
		
		try {
			is = new FileInputStream(fileName);
			
			try {
				
				while((len = is.read(datas)) != -1) {
					dataSize += len;
				}
				System.out.println("파일사이즈: " + dataSize);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
}
