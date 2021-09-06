package p08Interface.p03quiz;

public class Hero {
	
	private Sword sword;
	
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	
	public void attack() {
		sword.swing();
	}

}
