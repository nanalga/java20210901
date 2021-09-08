package p10exception.p03lecture.p06throws;

public class Example6FlowThrows {
	public static void main(String[] args) throws Exception {
		System.out.println("program start");
		
		method1();
		
		System.out.println("program start");	//throws로 인해 예외를 JVM으로 넘겨서 해당 문장 실행 X
	}
	
	public static void method1() throws Exception {
		throw new Exception();
	}
	
}
