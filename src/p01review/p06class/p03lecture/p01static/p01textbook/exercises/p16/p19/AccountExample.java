package p01review.p06class.p03lecture.p01static.p01textbook.exercises.p16.p19;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(200000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
	}

}
