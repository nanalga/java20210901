package p10exception.exercises.p07;

public class WrongPassWordException extends Exception {
	public WrongPassWordException() {}
	public WrongPassWordException(String message) {
		super(message);
	}
	public WrongPassWordException(Throwable cause) {
		super(cause);
	}
}
