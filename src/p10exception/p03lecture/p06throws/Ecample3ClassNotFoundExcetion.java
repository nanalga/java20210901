package p10exception.p03lecture.p06throws;

public class Ecample3ClassNotFoundExcetion {
	public static void main(String[] args) {
		
		try {
			Class.forName("aaa");
		} catch (ClassNotFoundException e) {
			System.out.println("classnotfoundexception 발생");
			e.printStackTrace();
		}
		
		
	}
}
