package be_study.inherit.inherit07;

//public class Driver extends Object {
public class Driver {

	public void driveBus(Bus bus) {
		bus.run();
	}
	
	public void driveTaxi(Taxi taxi) {
		taxi.run();
	}
						// d.drive(new Taxi());   
	public void drive(Vehicle vehicle) { //Vehicle vehicle = new Taxi();
		vehicle.run();
	}
	
	//메소드 재정의OOO
	//메소드 새로 생성XXX
	
	//private String toString() {XX  
	// 메소드 재정의시 부모에 정의된 접근제한자보다 좁은 범위로 줄일 수 없다.
	public String toString() {
		return "이것은 driver입니다";
	}
}
