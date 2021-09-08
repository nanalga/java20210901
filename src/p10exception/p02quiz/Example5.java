package p10exception.p02quiz;

public class Example5 {
	// ArrayaIndexOutOfIndexException
	public static void main(String[] args) {
		String[] arr = {"a", "b", "c"};
		
		System.out.println(arr[1]);
		
		throw new ArrayIndexOutOfBoundsException();
	}
	
	
}
