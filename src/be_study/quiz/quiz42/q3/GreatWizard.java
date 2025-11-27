package be_study.quiz.quiz42.q3;

public class GreatWizard extends Wizard {

	/* 1. 보호막 속성을 필드에 추가하시오. */
	protected int shield;

	/* 2. 생성자를 완성하시오. */
	public GreatWizard(String name, int hp, int mp, int shield) {
		super(name, hp, mp);
		this.shield = shield;
	}

	/* 3. toString() 메소드를 오버라이딩 하시오. */
	@Override
	public String toString() {
		return  super.toString() + ", MP: " + mp + ", SHIELD: " + shield + ")";
	}

	/* 4. 에너지볼트 마법을 오버라이딩 하시오. */
	@Override
	public void energeVolt() {
		// TODO Auto-generated method stub
		super.energeVolt();
	}

}
