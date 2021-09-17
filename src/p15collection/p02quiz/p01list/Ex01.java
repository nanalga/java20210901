package p15collection.p02quiz.p01list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("l:list, e:exit, r:remove 입력>");
			String text = scan.nextLine();
//			if(!text.equals("l")) {
//				list.add(text);
//			}
			switch (text) {
			case "l":
				//list.forEach(str -> System.out.println(str));
				for(String str : list) {
					System.out.println(str);
				}
				break;
			case "r":
				//마지막 입력한 item 삭제
//				if(!list.isEmpty())
				if(list.size() > 0) {
					list.remove(list.size()-1);
				}
				
				break;
				
			case "e":
				run = false;
				break;
				
			default:
				list.add(text);
				break;
			}
		}
		scan.close();
	}
}
