package p10exception.p02quiz;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("program start");
		
			method1(null);
		
		System.out.println("program end");
	}
	
	public static void method1(Object o) {
		try {
			System.out.println(o.hashCode());
		} catch(NullPointerException ne) {
			System.out.println(ne+" 발생");
		}
		
	}

}
