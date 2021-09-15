package p15collection.p03lecture.p01list;

import java.util.ArrayList;

public class Ex02ArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();	//<>타입은 참조 타입
		
		// add 제일 뒤에 값을 추가, ArrayList 사이즈 크기 생성
		arr1.add(999);
		arr1.add(888);
		arr1.add(777);
		
		// size ArrayList index길이를 알아보는 메소드
		System.out.println(arr1.size());
		
		arr1.add(666);
		arr1.add(555);
		System.out.println(arr1.size());
		
		// get ArrayList 값 읽기 
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));
		System.out.println(arr1.get(4));
		
		// remove ArrayList 값 삭제, ArrayList 삭제하면 인덱스의 값이 삭제되고, size도 변경됨 한칸씩 당겨짐
		arr1.remove(3);
		System.out.println(arr1.size());
		
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));
		
	}
}
