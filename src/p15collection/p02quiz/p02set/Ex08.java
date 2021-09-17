package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex08 {
	public Set<Integer> diff(int[] a, int[] b){
		// a배열에만 있는 아이템들만 모은 set리턴
		Set<Integer> set1 = new HashSet<>();
		
		for(int item : a) {
			set1.add(item);
		}
		
		for(int item : b) {
			set1.remove(item);
		}
		
		return set1;
	}
}
