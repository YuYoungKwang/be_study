package be_study.quiz.quiz35;

public class GasStove {
	int fireHole;
	String brand;
	int price;
	int fire;
	
	public void turnOnFire() {
		fireControl(10);
	}
	
	public void turnOffFire() {
		fireControl(0);
	}
	
	public void fireControl(int fire) {
		this.fire = fire;
	}
}
