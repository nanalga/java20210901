package p15collection.p02quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.print("0:종료, 1:출력, 2:삭제, 3:통계 점수(50점이상)> ");
			int num = scan.nextInt();
			
			switch (num) {
			case 0:
				run = false;
				break;
			case 1:
				for(int number : list) {
					System.out.println(number);
				}
				break;
			case 2:
				if(list.size() > 0) {
					list.remove(list.size()-1);
				}
				break;
			case 3:
				int sum = 0;
				double avg = 0;
				for(int i = 0; i < list.size(); i++) {
					 sum += list.get(i);
				}
				avg = (double)sum / list.size();
				int max = max(list);
				int min = min(list);
				
				System.out.println("합 : "+ sum);
				System.out.println("평균 : " + avg);
				System.out.println("최대값 : " + max);
				System.out.println("최대값 : " + min);

			default:
				if(num >= 50) {
					list.add(num);
				}
				break;
			}
		}
		scan.close();
	}
	private static int max(ArrayList<Integer> list) {
		int max = list.get(0);
		
		if(list.isEmpty()) {
			return 0;
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(max >= list.get(i)) {
				max = list.get(i);
			}
		}
		
		return max;
	}
	
	private static int min(ArrayList<Integer> list) {
		int min = list.get(0);
		
		if(list.isEmpty()) {
			return 0;
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(min <= list.get(i)) {
				min = list.get(i);
			}
		}
		return min;
		
//		int min = Integer.MAX_VALUE;
//		
//		for(int item : list) {
//			min = Math.min(min, item);
//		}
//		
//		return min;
		
	}

}
