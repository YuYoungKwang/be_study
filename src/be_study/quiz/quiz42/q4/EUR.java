package be_study.quiz.quiz42.q4;

public class EUR extends Currency {

	public EUR(double amount, String notation) {
		super(amount, notation);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EUR: " + super.toString();
		
	}
}
