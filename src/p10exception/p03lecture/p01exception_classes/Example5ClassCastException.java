package p10exception.p03lecture.p01exception_classes;

public class Example5ClassCastException {
	public static void main(String[] args) {
		String str = "java";
		method(str);
		
	}
	
	public static void method(Object o) {
		Number n = (Number) o;
	}
}
