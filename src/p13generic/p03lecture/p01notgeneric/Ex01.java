package p13generic.p03lecture.p01notgeneric;

public class Ex01 {
	public static void main(String[] args) {
		Box b1 = new Box();
		
		b1.setItem("java");
		String s = (String)b1.getItem();	//object는 스트링으로 될수 없고, String으로 형 변환
		
		System.out.println("아이템 길이 : "+ s.length());
		
		b1.setItem(3); // Interger로 autoboxing
		
//		Integer i = b1.getItem();	//return type이 objeect라 Object는 Integer다 할 수 없다.
		Integer i = (Integer)b1.getItem();	// Integer로 형변환
		
		System.out.println("아이템 값 : " + i);
		
		b1.setItem("html");
		Integer j = (Integer)b1.getItem();	// ClassCastException발생
	}
}

class Box {
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
}