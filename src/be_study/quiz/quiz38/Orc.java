package be_study.quiz.quiz38;

class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
		return "Orc {name: " + name + ", hp: " + hp + " }";
	}
}
