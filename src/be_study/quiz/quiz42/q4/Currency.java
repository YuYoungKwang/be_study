package be_study.quiz.quiz42.q4;

public class Currency {

	protected double amount; // 수량(1000)
	protected String notation; // 표기법(원)
	
	public Currency(double amount, String notation) {
		this.amount = amount;
		this.notation = notation;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%.2f %s", amount, notation);
	}
}
