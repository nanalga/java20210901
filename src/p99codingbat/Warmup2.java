package p99codingbat;

public class Warmup2 {
	
	boolean doubleX(String str) {
		
		int x = str.indexOf("x");
		  if(x == -1) return false;
		  
		  if(x+1 >= str.length()) return false;
		  return str.substring(x + 1, x +2).equals("x");
		
//		if (str.length() >= 2) {
//
//			for (int i = 0; i < str.length() - 1; i++) {
//				String sub = str.substring(i, i + 2);
//				if (sub.equals("xx")) {
//					return true;
//				} else if (sub.equals("xxx")) {
//					return false;
//				}
//			}
//		}
//		return false;
	}
	
	int countXX(String str) {
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("xx")) {
				count++;
			}
		}
		return count;
	}
	
	public String frontTimes(String str, int n) {
		String sub = "";
		String result = "";
		if (str.length() <= 3) {
			sub = str.substring(0, str.length());
			for (int i = 0; i < n; i++) {
				result += sub;
			}
			return result;
		} else {
			for (int i = 0; i < str.length(); i++) {
				sub = str.substring(0, 3);
			}
			for (int i = 0; i < n; i++) {
				result += sub;
			}
			return result;
		}
	}
	
	public String stringTimes(String str, int n) {
		String result = "";

		for (int i = 0; i < n; i++) {
			if (n <= 0) {
				return str;
			}
			result += str;
		}
		return result;

	}
	
}
