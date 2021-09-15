package p13generic.p03lecture.p02generic;

public class Ex01 {
	public static void main(String[] args) {
		Box<String> b1;	//b1은 Box String type
		Box<Integer> b2;	//b2는 Box Integer type
		
		b1 = new Box<String>();	//어떤 type인지 똑같이 명시
		b2 = new Box<Integer>();
		
//		b1.setItem(33); 	//b1에는 String타입만 넣을수 있다.
//		b2.setItem("java"); //b2에는 Integer타입만 넣을수 있다.
		
		b1.setItem("java");
		b2.setItem(333);
		
		String s = b1.getItem();	//return String type으로 강제 형변환 없이 가능
		Integer i = b2.getItem();	//return Integer type으로 강제 형변환 없이 가능
		
		System.out.println(s.length());
		System.out.println(i.intValue());
	}
}

class Box<T> {	// 클래스 정의할 당시<T> 아직 특정 타입이 지어지지 않음 -> 클래스를 사용할때 특정 타입 지어줌
				// 클래스 <T>는 String으로 정의됨
				// 관습상 한글자 대문자로 사용(T말고 다른 알파벳도 가능)
	private T item;
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
	
	
	
}