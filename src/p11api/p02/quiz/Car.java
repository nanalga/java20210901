package p11api.p02.quiz;

public class Car {
	private String company;
	private int price;
	
	public Car(String company, int price) {
		this.company = company;
		this.price = price;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return this.company;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	
	public String toString() {
		return "회사: " + this.company + ", 가격 : " + this.price;
	}

}
