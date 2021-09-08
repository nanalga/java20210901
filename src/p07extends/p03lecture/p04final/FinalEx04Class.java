package p07extends.p03lecture.p04final;

public class FinalEx04Class {
	public static void main(String[] args) {
		int j = 0;
		
		System.out.println(j);
	}
}

final class TV {
	//상속할 수 없는 클래스
}

class SmartTV extends TV {	//클래스에 final 붙으면 상속 받을수 없다
	
}
