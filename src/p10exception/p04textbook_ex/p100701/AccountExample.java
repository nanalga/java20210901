package p10exception.p04textbook_ex.p100701;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액 : "+account.getBalance());
		
		try {
			account.withdraw(30000);
		}catch (BalanceInsufficientException be) {
			String message = be.getMessage();
			System.out.println(message);
			System.out.println();
			be.printStackTrace();
		}
		
		
	}

}
