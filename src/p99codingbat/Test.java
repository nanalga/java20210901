package p99codingbat;

public class Test {
	public static void main(String[] args) {
		String str = everyNth("Miracle", 2);
		
		System.out.println(str);
		
	}
	
	public static String everyNth(String str, int n) {
		String result = "";
		for(int i = 0; i < str.length(); i = i+n ) {	// 0, 0+2=2,  
			result += str.charAt(i);
		}
		return result;
		
		
	}

	

	
}
