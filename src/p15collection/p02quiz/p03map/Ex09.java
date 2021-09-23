package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex09 {
	public Map<Character, Integer> countCharacter(String str){
		// str의 문자가 몇번 나오는지 세어서
		// 문자를 key로 몇번을 value로 갖는 map을 만들어서 return 
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
			
		}
		return map;
	}
}
