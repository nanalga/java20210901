package p07extends.p01textbook_1.s070802;

public class Example {
	public static void main(String[] args) {
		Phone t1 = new TelePhone();
		Phone s1 = new SmartPhone();
		
		t1.turnOn();
//		t1.autoAnswering();
		
		s1.turnOn();
//		s1.internetSearch();
		
		System.out.println("-----------------------");
		
		TelePhone t2 = (TelePhone)t1;
		t2.autoAnswering();
		
		SmartPhone s2 = (SmartPhone)s1;
		s2.internetSearch();
		
		System.out.println("------------------------");
		((TelePhone) t2).autoAnswering();
		((SmartPhone) s2).internetSearch();
	}

}
