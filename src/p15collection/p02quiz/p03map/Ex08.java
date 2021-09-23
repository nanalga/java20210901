package p15collection.p02quiz.p03map;

import java.util.Map;
import java.util.Set;

public class Ex08 {
	public void swap(Map<String, String> param) {
		// param size : 2
		// param 키는 "a", "b"
		// param 각 값을 변경(swap)
		
		String temp = param.get("b");
		param.put("b", param.get("a"));
		param.put("a", temp);
	}
}
