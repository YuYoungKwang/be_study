package be_study.inherit.inherit03;

public class Mike {
	//마이크
	
	String type;
	String model;
	int price;
	
	public void volumeUp() {
		System.out.println("Mike volumeUp()");
	}
	
	public void check() {
		System.out.println("마이크 기능 check");
	}
	
	public final void noMethod() {
		System.out.println("noMethod");
	}
	
	//여러 기능 메소드 
	//여러 기능 메소드
}
