package p15collection.p02quiz.p01list;

import java.util.ArrayList;

public class Ex13 {
	public static void main(String[] args) {
		// Math.random();
		// 1~45사이의 값 6개 랜덤
		ArrayList<Integer> list = new ArrayList<>();
		
		while(list.size() < 6) {
			int ran = (int)(Math.random()*45)+1;
			
			if(!list.contains(ran)) {
				list.add(ran);
			}
		}
		
		for(int item : list) {
			System.out.println(item);
		}
		
	}
}
