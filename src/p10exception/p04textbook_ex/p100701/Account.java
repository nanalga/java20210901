package p10exception.p04textbook_ex.p100701;

public class Account {
	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	public void setBalanace(long balance) {
		this.balance = balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족: " + (money-balance) + "모자람");
		}
		balance -= money;
	}

}
