package be_study.quiz.quiz36;

public class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
//		String str = "Orc { name : " + name + ", hp : " + hp + " }";
//		return str;
		return String.format("Orc { name : %s, hp : %d }", name, hp);
		
	}
}
