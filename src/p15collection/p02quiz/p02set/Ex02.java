package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public Set<String> toSet(String[] arr){
		
		Set<String> set = new HashSet<>();
		
		for(String str : arr) {
			set.add(str);
		}
		
		return set;
	}

}
