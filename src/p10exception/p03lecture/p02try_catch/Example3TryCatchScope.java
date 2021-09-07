package p10exception.p03lecture.p02try_catch;

public class Example3TryCatchScope {
	public static void main(String[] args) {
		
		System.out.println("program start");
		
		String str = "1fgsdffg00";
		
		int n = 0;
		
		try {
			n = Integer.parseInt(str);
			System.out.println(n * 2);
		} catch (NumberFormatException e) {
			System.out.println("넘버포멧익셉션 발생");
		}
		
		System.out.println("program end");
		
	}
}
