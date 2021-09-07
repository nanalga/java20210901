package p10exception.p03lecture.p03multiple_exception;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("program start");
		
		String[] arr = {"3", "4", "a"};
		
		try {
			int n = Integer.parseInt(arr[3]);
			System.out.println(n);
				
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("어레이인덱스오브바운즈익셉션 발생");
		} catch(NumberFormatException ne) {
			System.out.println("넘버포멧익셉션 발생");
		}
		
		System.out.println("program end");
		
		
	}
}
