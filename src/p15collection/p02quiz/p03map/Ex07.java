package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex07 {
	public Map<String, String> swap(Map<String, String> param) {
		// param의 size가 2
		// param의 키는 "a", "b"
		// 두 value를 서로 바꾼(swap) map을 만들어서 return
		// param은 변경 x
		Map<String, String> map = new HashMap<>();
		
		map.put("a", param.get("b"));
		map.put("b", param.get("a"));
		
		
		return map;
	}
}
