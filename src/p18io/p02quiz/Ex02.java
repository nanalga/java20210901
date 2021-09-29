package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\keyboard.png";
		InputStream is = new FileInputStream(file);
		
		byte[] data = new byte[100];
		int cnt = 0;	
		int fileSize = 0;
		
		// InputStream.read(byte[])를 활용해서 file 크기 계산
//		while ((cnt = is.read(data)) != -1) {
//			for(int i = 0; i < cnt; i++) {
//				fileSize++;
//			}
//		}
		
		while((cnt = is.read(data)) != -1) {
			fileSize += cnt;
		}
		
		System.out.println("파일크기 : " + fileSize + " bytes");	// 파일크기 : 130,510bytes
		System.out.println("프로그램 종료");
		is.close();
	}
}
