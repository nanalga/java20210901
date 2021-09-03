package p01review.p06class.p03lecture.p01static.p01textbook.exercises.p16.p20;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public Account() {
		
	}
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getAno() {
		return this.ano;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	
	

}
