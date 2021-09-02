package p07extends.p01textbook_1;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method01();
		parent.method02();	//상속받고 있는 인스턴스를 실행을 한다 .
//		parent.method03();	//부모가 자식의 메서드를 실행 할수 없다. 
		
		child.method03();
	}

}
