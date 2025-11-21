package be_study.quiz.quiz35;

public class Refrigerator {
	String brand;
	int volume;
	boolean isTurnedOn;
	int temperature;
	int door;
	
	IceTray iceTray;
	
	public void temperatureControl(int temperature) {
		this.temperature = temperature;
	}
	
	public void turnOnPower() {
		isTurnedOn = true;
	}
	
	public void turnOffPower() {
		isTurnedOn = false;
	}
}
