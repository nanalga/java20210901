package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	public Set<Integer> dupSet(int[] arr){
		// arr 배열에 중복된 값들만 set에 모아서 리턴
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		for(int item : arr) {
			if(set1.contains(item)) {
				set2.add(item);
			} else {
				set1.add(item);
			}
		}
				
		return set2;
	}
}
