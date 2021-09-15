package p15collection.p03lecture.p01list;

import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();	//ArrayList 타입은 String
		
		list.add("java");
		list.add("spring");
		list.add("js");
		
		System.out.println(list.size());	//ArrayList 크기 확인
		
		for(int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.add("boot");
		list.add("list");
		
		System.out.println(list.size());
		
		for(String str : list) {	//향상된 for문으로 ArrayList 출력 가능
			System.out.println(str);
		}
		
		list.forEach(str -> System.out.println(str));	//람다식 활용
		
		System.out.println(list);	//ArrayList에 toString()메소드 재정의 되어 이용 가능
	}
}
