package p15collection.p01textbook.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Entry<String, Integer> maxEntry = null;
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(maxScore < entry.getValue()) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
			totalScore += entry.getValue();
			
		}
		System.out.println("평균점수 : " + totalScore/map.size());
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수 받은 아이디 : " + name);
	}
}
