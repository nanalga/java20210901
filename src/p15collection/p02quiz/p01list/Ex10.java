package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.List;

public class Ex10 {
public ArrayList<Integer> evenList(List<Integer> list) {
		// list의 짝수 아이템들만 모은 새 ArrayList를 만들어서 리턴
		// 8, 9, 10, 10, 9, 8
		ArrayList<Integer> list1 = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				list1.add(list.get(i));
			}
		}
		return list1;
	}

}
