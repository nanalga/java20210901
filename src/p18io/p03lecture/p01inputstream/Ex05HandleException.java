package p18io.p03lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex05HandleException {
	public static void main(String[] args) {
		String name = "없는파일";
		InputStream is = null;	// 전역 변수로 설정 close()에서 변수 사용
		try {
			is = new FileInputStream(name);
			
			while(is.read() != -1) {
				System.out.println("읽음");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {	// close()는 무조건 실행
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void method() {
		// try - with - resource
		// 책 438쪽
		String name = "없는파일";
		
		try(InputStream is = new FileInputStream(name)) {
			//정상적으로 할 일
			while(is.read() != -1) {
				System.out.println("읽음");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//finally 블록에서 close 메소드 실행 생략 가능
		
	}
}



