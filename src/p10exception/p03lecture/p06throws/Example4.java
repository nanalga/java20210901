package p10exception.p03lecture.p06throws;

public class Example4 {
	public static void main(String[] args) throws Exception {
		System.out.println("program start");
		
		method1();
		
		System.out.println("program end");
	}
	
	public static void method1() throws Exception {
		System.out.println("method1 start");
		
		method2();

		System.out.println("method1 end");
	}
	
	public static void method2() throws Exception {
		System.out.println("method2 start");
		
		throw new Exception();
		
//		System.out.println("method2 end");	// Exception()이 발생 하기때문에 해당 라인까지 도달하지 못함
	}
	
}
