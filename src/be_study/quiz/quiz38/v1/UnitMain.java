package be_study.quiz.quiz38.v1;

public class UnitMain {

	public static void main(String[] args) {
		Tank t1 = new Tank();
		Marine m1 = new Marine();
		Dropship d1 = new Dropship();
		
		Unit[] arr = {t1, m1, d1};
		
		Unit u1 = new Unit();  //??
		Unit u2 = new Unit(); //??
		
		for(Unit u : arr) {
			u.move(0, 0);
			u.stop();
		}
	}

}
