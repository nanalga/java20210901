package p15collection.p02quiz.p01list;

import java.util.List;

public class Ex12 {
	public boolean mirror(List<Integer> list) {
		// list 중간 인덱스 기준으로 왼쪽과 오른쪽이 거울(데칼코마니)처럼 같은지
		int left = 0;
		int right = list.size()-1;
				
		while(left < right) {
			int leftValue = list.get(left);
			int rightValue = list.get(right);
			
			if(leftValue == rightValue) {
				left++;
				right--;
			} else {
				return false;
			}
		}
		return true;
	}
	public <T> boolean mirror2(List<T> list) {
		int left = 0;
		int right = list.size() - 1;
		
		while (left < right) {
			T leftValue = list.get(left);
			T rightValue = list.get(right);
			
			if (leftValue.equals(rightValue)) {
				left++;
				right--;
			} else {
				return false;
			}
		}
		
		return true;
	}
	
}
