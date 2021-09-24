package p15collection.p02quiz.p03map;

import java.util.HashMap;
import java.util.Map;

public class Ex12LeetCode1 {
	 public int[] twoSum(int[] nums, int target) {
		 Map<Integer, Integer> map = new HashMap<>();
		 
		 for(int i = 0; i < nums.length; i++) {
			 int otherValue = target - nums[i];	
			 if(map.containsKey(otherValue)) {
				 return new int[] {map.get(otherValue), i};
			 } else {
				 map.put(nums[i], i);
			 }
		 }
		 
		 return null;
	 }
}
