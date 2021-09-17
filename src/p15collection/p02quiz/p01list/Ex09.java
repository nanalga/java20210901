package p15collection.p02quiz.p01list;

import java.util.List;

public class Ex09 {
	public void removeLastMax(List<Integer> list) {
		// list의 마지막 가장 큰값을 삭제
		int max = list.get(list.size()-1);
		int index = list.size()-1;
		
		for(int i = list.size()-2; i >= 0; i--) {
			if(max < list.get(i)) {
				max = list.get(i);
				index = i;
			}
		}
		list.remove(index);
		
	}
}
