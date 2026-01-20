package be_study.quiz.quiz36;

public class OrcWarrior extends Orc {
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}

	// 메소드 오버라이딩!
	public String toString() {
		return String.format("OrcWarrior { name : %s, hp : %d, amor : %d }", name, hp, amor);
	}
}
