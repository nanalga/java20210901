package p10exception.p03lecture.p06throws;

public class Example5FlowTryCatch {
	public static void main(String[] args) {
		System.out.println("program start");
		
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("program end");
	}
	
	public static void method1() throws Exception {
		throw new Exception();
	}
	
}
