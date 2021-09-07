package p10exception.p03lecture.p02try_catch;

public class Example2TryCatch {
	public static void main(String[] args) {
		System.out.println("program start");
		
		String str = "1aa00";
		
		try {
			// exception이 발생하면 try블럭안의 명령문 실행 안함
			int n1 = Integer.parseInt(str);
			System.out.println(n1 * 2);
		} catch(NumberFormatException ne) {
			System.out.println("NumberFormatException 발생");
		}
		
		System.out.println("program end");
	}

}
