package p10exception.p02quiz;

import java.io.IOException;
import java.io.InputStreamReader;

public class Example9 {
	//try/catch 안쓰고 컴파일 오류 해결
	public static void main(String[] args) throws IOException {
		method1();
	}

	private static void method1() throws IOException {
		method2();
	}

	private static void method2() throws IOException {
		method3();
	}

	private static void method3() throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		
		is.close();
	}

}
