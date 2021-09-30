package p18io.p02quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex10 {
	public static void main(String[] args) throws Exception {
		String src = "C:\\Users\\user\\Desktop\\iotest\\test9.txt";	// 원본파일
		String des = "C:\\Users\\user\\Desktop\\iotest\\testB.txt";	// 대상파일
		
		// 원본내용
		// springjavaspringring
		
		// 대상파일
		// 4개씩 끊어서 거꾸로 복사
		// irspajgnpsavgnirgnir
		
		Reader rd = new FileReader(src);
		Writer wd = new FileWriter(des);
		
		char[] datas = new char[4];
		int cnt = 0;
		String str = "";
		
		
//		while((cnt = rd.read(datas)) != -1) {
//			for(int i = datas.length-1; i >= 0; i--) {	// 배열을 거꾸로 저장
//				wd.write(datas[i]);
//			}
//		}
		
		// 선생님
		while((cnt = rd.read(datas)) != -1) {
			//reverse
			reverse(datas);
			wd.write(datas);
		}
		
		rd.close();
		wd.close();
		System.out.println("프로그램 종료");
	}

	private static void reverse(char[] datas) {
		int left = 0;					// 왼쪽에서 0번째 index
		int right = datas.length-1;		// 오른쪽에서 마지막 index
		
		while(left < right) {			// 왼쪽이 오른쪽보다 클때까지 즉 가운데까지
			char c = datas[left];		// 왼쪽 char를 임시 저장 변수에 대입
			datas[left] = datas[right];	// 오른쪽 char를 왼쪽에 대입
			datas[right] = c;			// 임시로 왼쪽char 저장한 데이터를 오른쪽에 대입
			
			left++;						// 하나씩 증가
			right--;					// 하나씩 감소
		}
	}
}
