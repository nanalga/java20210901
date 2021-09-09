package p11api.p02.quiz;

public class Ex02IndexOf {
	public static void main(String[] args) {
		String str = "간장 공장 공장장은 강 공장장이고 된장 공장 공장장은 공 공장장이다.";
		
		//"공장"이 있는 index들을 출력
		//출력 결과 -> 3, 6, 13, 22, 24, 30 (6개 인덱스)
		System.out.println(str.length());
		for(int i = 0; i < str.length(); i++) {
			if(i == (str.indexOf("공장", i))) {
				System.out.println(i);
			}
		}
		
	}
}
