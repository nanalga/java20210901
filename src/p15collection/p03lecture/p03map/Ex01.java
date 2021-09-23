package p15collection.p03lecture.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		// Map
		// key : value 쌍으로 저장
		
		HashMap<Integer, Integer> map;
		map = new HashMap<>();
		
		// put : key:value 쌍 추가
		map.put(100, 300);
		map.put(500, 3000);
		
		// size : map의 크기
		System.out.println(map.size());
		
		// get : key로 value를 얻기 
		Integer v1 = map.get(100);
		System.out.println(v1);
		System.out.println(map.get(500));
		System.out.println(map.get(6000));	// 없는 key를 넣을때는 null 리턴
		
		// put : 이미 있는 ket로 value를 추가 -> 덮어씀
		map.put(500, 7000);
		System.out.println(map.get(500));
		System.out.println(map.size());
		
		// keySet : key 집합(set) 리턴
		System.out.println("===keys===");
		Set<Integer> keys = map.keySet();	// key들을 set으로 리턴
		for(Integer key : keys) {
			System.out.println(key);	// Set형태로 순서대로 안나올수도 있음 
		}
		
		// 전체 key:value 쌍(entry) 탐색 
		// 1. key set 얻고
		// 2. key로 value탐색
		System.out.println("=== 탐색 ===");
		keys = map.keySet(); // 1. key set 얻고
		for(Integer key : keys) {	// 2. key로 value탐색
			System.out.println(key + ":" + map.get(key));
		}
		
		// Map안에 있는 Entry타입?
		System.out.println("=== 탐색2 ===");
		Set<Map.Entry<Integer, Integer>> entrys = map.entrySet();
		for(Map.Entry<Integer, Integer> entry : entrys) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		// containsKey : key가 있는 지 확인
		System.out.println("=== 키 확인 ===");
		boolean c1 = map.containsKey(100);
		System.out.println(c1);
		System.out.println(map.containsKey(500));
		System.out.println(map.containsKey(700));
	}
}
