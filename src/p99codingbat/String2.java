package p99codingbat;

public class String2 {

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
