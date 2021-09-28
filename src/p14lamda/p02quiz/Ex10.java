package p14lamda.p02quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("java", "spring", "html", "a", "", "css"));
		
		// List.replaceAll
		list.replaceAll(e -> {
			if(e.length() <= 2) {
				return e;
			}
			return e.substring(e.length()-2);
		});
		
		//삼항 연산식 활용
		list.replaceAll(e -> e.length() <= 2 ? e : e.substring(e.length()- 2));
	
		System.out.println(list); // [va, ng, ml, a,  , ss]
	}
}
