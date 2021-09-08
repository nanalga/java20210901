package p10exception.p03lecture.p06throws;

import java.io.IOException;

public class Example8 {
	public static void main(String[] args) {
		
		try {
			method1();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			method2();
		} catch (Exception e) {	//throw로 명시된 클래스보다 하위 익셉션을 사용할수 없다
			//e.printStackTrace();
			System.out.println(e instanceof Exception);
			System.out.println(e instanceof IOException);
		};
	}
	
	public static void method1() throws IOException {
		throw new IOException();
	}
	
	public static void method2() throws Exception {
		throw new IOException();
	}

}
