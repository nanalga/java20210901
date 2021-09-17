package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.List;

public class Ex11 {
	public ArrayList<Integer> minMax(List<Integer> list) {
		// 파라미터로 받은 list의 최소값, 최대값을 아이템으로 갖는 ArrayList 리턴
		ArrayList<Integer> list1 = new ArrayList<>();
		int max = list.get(0);
		int min = list.get(0);
		
		for(int i = 0; i < list.size(); i++) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
			if(min > list.get(i)) {
				min = list.get(i);
			}
		}

		list1.add(min);
		list1.add(max);
	
		return list1;
	}
}
