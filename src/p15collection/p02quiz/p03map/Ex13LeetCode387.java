package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex13LeetCode387 {
	public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
        	Character c = s.charAt(i);
        	if(map.containsKey(c)) {
        		map.put(c, map.get(c)+1);
        	} else {
            	map.put(c, 1);
        	}
        }
//        System.out.println(map);
		
        for(int i = 0; i < s.length(); i++) {
        	if(map.get(s.charAt(i)) == 1) {
        		return i;
        	}
        }
        
		return -1;
    }
}
