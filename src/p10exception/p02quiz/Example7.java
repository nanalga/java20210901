package p10exception.p02quiz;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.jar.JarException;

public class Example7 {
	// 일반예외(checked exception)을 발생시기는 코드를 작성
	public static void main(String[] args) {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException fe) {
			System.out.println("파일 못 찾음");
		}
		
		
		IOException e = new IOException();
		try {
			throw e;
		} catch (IOException ie) {
			System.out.println("아이오익셉션 발생");
		}
		
		JarException j = new JarException();
		try {
			throw j;
		} catch (JarException e2) {
			System.out.println("자르익셉션 발생");
		}
		
		
		
	}
}
