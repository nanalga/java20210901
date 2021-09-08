package p10exception.p02quiz;

public class Example6 {
	// ClassCastException
	public static void main(String[] args) {
//		 Object o = new Integer(0);
//	     System.out.println((String)o);
		
		Object o = "java";
		String s = (String) o;
//		Number n = (Number) o;
		
		throw new ClassCastException();
	}
}
