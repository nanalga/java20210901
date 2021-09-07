package p10exception.p03lecture.p01exception_classes;

public class Example4NumberFormatException {
	public static void main(String[] args) {
		System.out.println("program start");
		
		String s1 = "100";
		System.out.println(dbl(s1));
		
		String s2 = "10a0";
		System.out.println(dbl(s2));
		
		
		System.out.println("program end");
	}
	
	public static int dbl(String s) {
		return Integer.parseInt(s) * 2;
	}

}
