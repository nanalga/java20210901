package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex10 {
	public Map<String, Integer> sum(Map<String, Integer>map1, Map<String, Integer> map2){
		// map1과 map2에 키가 있으면 더해서 추가
		// 한 쪽에만 있으면 그냥 추가
		// 한 새 map을 만들어서 리턴
		Map<String, Integer> res = new HashMap<>();
		
		// map1을 res에 대입
		Set<String> keys = map1.keySet();
		for(String key : keys) {
			res.put(key, map1.get(key));
		}
		
		Set<String> keys2 = map2.keySet();
		for(String key : keys2) {
			if(res.containsKey(key)) {
				Integer v = res.get(key);
				res.put(key, v + map2.get(key));
			} else {
				res.put(key, map2.get(key));
			}
		}
		return res;
	}
}
