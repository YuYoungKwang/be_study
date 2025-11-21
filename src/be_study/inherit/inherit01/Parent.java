package be_study.inherit.inherit01;

public class Parent extends GrandParent {
	//private int money; //상속X
	protected int money;  //default : 같은 패키지
	//protected : 같은 패키지 + 상속받은 자식

//	public Parent() {
//		System.out.println("Parent 생성자 실행됨");
//	}
	
	public Parent(int money) {
		System.out.println("Parent(int money) 생성자 실행됨");
		this.money = money;
	}
	
	public void say() {
		System.out.println("한말씀 드립니다");
	}
}
