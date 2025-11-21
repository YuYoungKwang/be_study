package be_study.inherit.inherit02;

import be_study.inherit.inherit01.Parent;

public class HideChild extends Parent {
	
	public HideChild() {
		super(0);
	}
	
	public HideChild(int money) {
		super(money);
	}
	
	public void showMoney() {
		//protected int money;
		//다른 패키지에 있는 자식이 money 필드에 접근 가능
		System.out.println(money);
	}
}
