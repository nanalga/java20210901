package p10exception.p03lecture.p03multiple_exception;

public class Example4Multiple {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		String[] arr = {"1", "a"};
		
		try {
			int n = Integer.parseInt(arr[2]);
		} catch(ArrayIndexOutOfBoundsException e) {	// 하위 익셉션 먼저 잡아야함
			System.out.println("익셉션 발생");
		} catch (Exception e) {
			System.out.println("익셉션 발생");
		} 
		
		System.out.println("프로그램 종료");
	}
}
