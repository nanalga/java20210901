package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex04 {
	public Map<String, Integer> length(List<String> strs){
		// list에 있는 String을 키, 그 문자열(key)의 길이를 벨류
		// map을 만들어서 return
		Map<String, Integer> map = new HashMap<>();
		
		for(String key : strs) {
			map.put(key, key.length());
		}
		
		
		return map;
	}
}
