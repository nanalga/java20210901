package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex06 {
	public int dupLetter(String str) {
		//  몇개의 문자가 중복 사용 되었는지?
		Set<Character> set = new HashSet<>();
		Set<Character> result = new HashSet<>();
		
		for(int i =0; i < str.length(); i++) {
			if(set.contains(str.charAt(i))) {
				result.add(str.charAt(i));
			}else {
				set.add(str.charAt(i));
			}
		}
		
		
		
		return result.size();
	}
}
