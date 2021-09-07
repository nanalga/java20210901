package p08Interface.p03lecture.p05casting;

import java.io.Serializable;

public class Example2 {
	public static void main(String[] args) {
		
		//하위 타입으로 강제 형변환
		String str = "java";
		method(str);
		
		int[] arr = {1,2};
		method(arr);
		
		System.out.println("프로그램 정상 종료");
		
	}
	
	public static void method(Object o) {
		//하위 타입으로 강제 현변환
		String s = (String) o;
		Serializable se = (Serializable) o;
		Comparable<String> com = (Comparable<String>) o;
		CharSequence c = (CharSequence) o;
	}

}


