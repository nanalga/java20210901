package p10exception.p03lecture.p03finally;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("program start");
		
		try {
			String[] arr = {"java", "python", "c"};
			
			System.out.println(arr[3]);
			
			System.out.println("트라이 블럭 종료");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("익셉션 발생");
			
			System.out.println("익셉션 블럭 종료");
		} finally {
			System.out.println("꼭 실행되어야 하는 코드");
		}
		
		System.out.println("program end");
	}
}
