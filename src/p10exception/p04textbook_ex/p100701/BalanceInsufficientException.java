package p10exception.p04textbook_ex.p100701;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() { }
//	public BalanceInsufficientException(String super) {
//		super(message);
//	}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
