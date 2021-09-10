package p99codingbat;

public class String2 {
	public boolean bobThere(String str) {
		/*
		 * return java.util.regex.Pattern.matches(".*b.b.*",str);
		 */
		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 3);

			if (sub.charAt(0) == 'b' && sub.charAt(2) == 'b') {
				return true;
			}
		}

		return false;
	}

	public boolean catDog(String str) {
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i == (str.indexOf("cat", i))) {
				count1++;
			} else if (i == (str.indexOf("dog", i))) {
				count2++;
			}

		}
		if (count1 == count2) {
			return true;
		} else {
			return false;
		}
	}
	
}
