package p14lamda.p03lecture;

import java.util.HashMap;
import java.util.Map;

public class Ex12Map {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		
		// forEach
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		
		map.compute(1, (k, v) -> v * 10);
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		
		map.compute(4, (k, v) -> v);	// key에는 4가 들어가고, value에는 null -> null을 리턴 하면 사라진다.
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		
		map.compute(4, (k, v) -> v == null ? k * 10 : v * 10);	// v가 null일 경우 k *10 값을 return, v가 null이 아닌경우 v *10 값 return
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		
	}
}
