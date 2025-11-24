package be_study.quiz.quiz38;

public class OrcWarrior extends Orc {
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}

	// 메소드 오버라이딩!
	public String toString() {
		return "Orc {name: " + name + ", hp: " + hp + ", amor: " + amor + " }";
	}

}
