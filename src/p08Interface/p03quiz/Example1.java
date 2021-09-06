package p08Interface.p03quiz;

public class Example1 {
	public static void main(String[] args) {
		//할 일:
		//interface Sword만들고
		//구현클래스
		//FireSword, RainbowSword
		
		//출력결과
		//불검을 장착합니다.
		//공격합니다.
		//불공격
		//무지개검을 장착합니다.
		//무지개공격
		
		Hero hero = new Hero();
		
		System.out.println("불검을 장착합니다.");
		hero.setSword(new FireSword());
		
		System.out.println("공격합니다.");
		hero.attack();
		
		System.out.println("무지개검을 장착합니다.");
		hero.setSword(new RainbowSword());
		
		System.out.println("공격합니다.");
		hero.attack();
		
		System.out.println("물검을 장착합니다.");
		hero.setSword(new WaterSword());
		
		System.out.println("공격합니다.");
		hero.attack();
	}

}
