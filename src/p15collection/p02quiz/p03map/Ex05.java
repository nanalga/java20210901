package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex05 {
	public Map<Integer, Integer> doubling(Map<Integer, Integer> param){
		// param이 가지고 있는 value를 2배한 새 맵을 만들어서 return
		// param이 변경되면 안됨
		
		Map<Integer, Integer> map = new HashMap<>();
		
		Set<Integer> keys = param.keySet();
		for(Integer key : keys) {
			map.put(key, param.get(key)*2);
		}
		return map;
	}

	public Map<Integer, Integer> doubling2(Map<Integer, Integer> param) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		Set<Map.Entry<Integer, Integer>> entries = param.entrySet();
		for(Map.Entry<Integer, Integer> entry : entries) {
			Integer keyValue = entry.getKey();
			Integer value = entry.getValue();
			
			map.put(keyValue, value * 2);
		}
		
		
		return map;
	}
	
	
	
}
