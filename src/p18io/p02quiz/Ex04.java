package p18io.p02quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		// 각자 가진 그림 파일을 내용으로 채워진 새 파일 만들기
		// 파일명 outtest2.png (원본 파일 확장자 사용)
		// 원본 크기와 같은 크기, 같은 내용
		
		String fileName = "C:\\Users\\user\\Desktop\\iotest\\keyboard.png";	// 입력 받은 (기존)데이터
		String outFile = "C:\\Users\\user\\Desktop\\iotest\\outtest2.png";	// 복사 할 데이터
		
		InputStream is = new FileInputStream(fileName);
		OutputStream os = new FileOutputStream(outFile);
		
//		int cnt = 0;
//		byte[] byteData = new byte[100];
//		
//		while((cnt = is.read(byteData)) != -1){		// cnt가 -1일 경우 while문 종료(파일 내용이 끝날때 종료)
//			
//			for(int i =0; i < cnt; i++) {
//				os.write(byteData[i]);				// 기존 파일을 os.write()에 대입
//			}
//		}
		
		// 선생님
		int data = 0;
		while ((data = is.read()) != -1) {
			os.write(data);	// 파일 크기 만큼 반복
		}
		
		System.out.println("프로그램 종료");
		is.close();
		os.close();
	}
}
