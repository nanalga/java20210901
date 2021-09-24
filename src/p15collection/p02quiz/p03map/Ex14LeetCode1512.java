package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex14LeetCode1512 {
	public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
        	if(map.containsKey(num)) {
//        		map.put(num, map.get(num)+1);
        		map.computeIfPresent(num, (k, v) -> v+1); 	// key가 있으면 value + 1로 덮어쓰기
        	} else {
        		map.put(num, 1);
        	}
        }
        
        int result = 0;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	int val = entry.getValue();
        	int sum = (val) * (val-1) / 2;
        	result += sum;
        }
		return result;
    }
}
