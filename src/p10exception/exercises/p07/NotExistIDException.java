package p10exception.exercises.p07;

public class NotExistIDException extends Exception {
	//일반예외 checkedException
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}

}
