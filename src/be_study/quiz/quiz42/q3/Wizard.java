package be_study.quiz.quiz42.q3;

public class Wizard extends Novice {
	// 필드
	protected int mp;

	// 생성자
	public Wizard(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}

	public void energeVolt() {
		System.out.printf("%s의 에너지볼트! (대마법사 버프로 데미지 + 30 추가)\n", this.name);
	}
}