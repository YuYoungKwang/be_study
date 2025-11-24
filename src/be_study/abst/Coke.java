package be_study.abst;

public class Coke extends Beverage {
	int sugar; //당분 함량

	@Override
	public void checkSafety() {
		System.out.println("당분 이상없나?");
	}
	
	
}
