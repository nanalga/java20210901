package p13generic.p01textbook.s130401;

public class Util {
	public static <T> Box <T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		
		return box;
	}
}
