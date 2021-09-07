package p10exception.p04textbook_ex.p1006;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassCastException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

	private static void findClass() throws ClassCastException, ClassNotFoundException {
		Class clazz = Class.forName("java.langString2");
	}
	
	
}
