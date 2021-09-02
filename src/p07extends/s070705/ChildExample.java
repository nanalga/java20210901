package p07extends.s070705;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.method01();
		parent.method02();
		
		Child child = (Child) parent;
		
		child.method03();
		
	}

}
