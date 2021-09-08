package p07extends.p03lecture.p04final;

public class FinalEx02Field {
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.setId(333);
		System.out.println(p1.getId());
		
		Person p2 = new Person(99);
		System.out.println(p2.getId());
		
		Person p3 = new Person("888");
		System.out.println(p3.getId());
	}
}

class Person {
	final private int id;	//final이 필드에 붙을 경우.

	public Person() {	//생성자로 필드값을 초기화 할수 있다
		this.id = 3;
	}
	public Person(int id) {
		this.id = id;
	}
	public Person(String id) {
		this.id = Integer.parseInt(id);
	}
//	public void set(int id) { 	//final이 필드에 붙을 경우 set메서드로 값은 받을수 없다.
//		this.id = id;
//	}
	public int getId() {
		return id;
	}
}