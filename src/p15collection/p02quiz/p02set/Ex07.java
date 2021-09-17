package p15collection.p02quiz.p02set;

import java.util.HashSet;
import java.util.Set;

public class Ex07 {
	public int countOnlyLetter(String str) {
		// 한번만 사용된 문자의 개수
		Set<Character> set = new HashSet<>();		// 중복 안된 문자 저장
		Set<Character> result = new HashSet<>();	// 중복된 문자 저장
		
		for(int i = 0; i < str.length(); i ++) {
			if(set.contains(str.charAt(i))) {		// set에 있는 중복된 문자 검사
				result.add(str.charAt(i));			// 중복된 문자 있으면 result에 저장
			} else {
				set.add(str.charAt(i));				// 중복 안된 문자 저장
			}
		}
		
		for(Character c : result) {					// set.remove로 set에 저장된 중복 값 제거 
			set.remove(c);
		}
		
		return set.size();
	}
}
