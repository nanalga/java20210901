package p18io.p03lecture.p01inputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		String fileName = "src/p18io/p03lecture/p01inputstream/Ex01.java"; // String으로 파일 주소를 받는다
		
		File file = new File(fileName);		// File 객체 생성하면서, 파일주소 대입
		System.out.println(file.exists());	// File 있는지 확인
		
		String fileName2 = "C:\\Users\\user\\Desktop\\iotest\\test1.txt";	// 바탕화면 메모장 파일 경로 "\"는 \\로 써야함 
		File file2 = new File(fileName2);
		System.out.println(file2.exists());	// File 있는지 확인 
		
		// InputStream 클래스의 FileInputStream 사용
		InputStream is = new FileInputStream(file2);	// 예외처리 try / catch사용
		int byte1 = is.read();	// read : 1 byte를 읽고 리턴, int 타입으로 받아야 한다, ex)test1.txt 크기2byte인 파일 2번 읽음
		int byte2 = is.read();
		int byte3 = is.read();	// 더이상 읽을 내용이 없으면 -1 리턴
		int byte4 = is.read();
		
		System.out.println(byte1);
		System.out.println(byte2);
		System.out.println(byte3);
		System.out.println(byte4);
		
		is.close();  // 사용한 입력스트림 닫기
	}
}




