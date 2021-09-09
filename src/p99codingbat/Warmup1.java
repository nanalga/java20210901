package p99codingbat;

public class Warmup1 {
	public int intMax(int a, int b, int c) {
		int max = 0;

		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else {
			max = c;
		}
		return max;
	}
	
	public String startOz(String str) {
		String result = "";
		if (str.length() >= 1 && str.charAt(0) == 'o') {
			result += str.charAt(0);
		}
		if (str.length() >= 2 && str.charAt(1) == 'z') {
			result += str.charAt(1);
		}

		return result;
	}
	
	public boolean mixStart(String str) {

		if (str.length() < 3) {
			return false;
		}

		String two = str.substring(1, 3);

		if (two.equals("ix")) {
			return true;
		} else {
			return false;
		}

	}

	
	public String delDel(String str) {
		if ((str.length() >= 4 && str.substring(1, 4).equals("del"))) {
			return str.substring(0, 1) + str.substring(4);
		}
		return str;
	}
	
	public boolean loneTeen(int a, int b) {
		boolean aTeen = (a >= 13 && a <= 19);
		boolean bTeen = (b >= 13 && b <= 19);

		return (aTeen && !bTeen) || (!aTeen && bTeen);
	}
	
	public boolean hasTeen(int a, int b, int c) {

		if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
			return true;
		} else {
			return false;
		}

	}
	
	public boolean icyHot(int temp1, int temp2) {

		boolean result = true;

		if ((temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean in1020(int a, int b) {

		return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));

	}

}
