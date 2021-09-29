package p18io.p03lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		String file = "C:\\Users\\user\\Desktop\\iotest\\text2.txt";
		InputStream is = new FileInputStream(file);
		
		byte[] data = new byte[10];		// 10크기의 byte 타입 배열 생성 
		int cnt = 0;					// 파일에서 읽은 데이터를 저장할 변수
		
		while((cnt = is.read(data)) != -1){	// cnt에 데이터를 10개 크기로 전달, 더이상 읽을 데이터가 없으면 -1리턴
			
			for(int i = 0; i < cnt; i++) {	// 전달받은 데이터 조회
				System.out.print(data[i] + ", ");	// 전달받은 데이터 크기만큼 출력 
			}
			
			System.out.println();
		}
		
		
		System.out.println("프로그램 종료");
		is.close();		// InpuStream 종료
	}
}







