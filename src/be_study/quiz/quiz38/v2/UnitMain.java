package be_study.quiz.quiz38.v2;

public class UnitMain {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Marine m1 = new Marine();
		Dropship d1 = new Dropship();
		
		//Unit u1 = new Unit(); //생성불가
		
		Unit[] arr = {t1, m1, d1};
		
		for(Unit u : arr) {
			u.move(0, 0);
			u.stop();
		}
	}

}
