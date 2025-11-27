package be_study.quiz.quiz42.q4;

public class USD extends Currency {
	public USD(double amount, String notation) {
		super(amount, notation);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "USD: " + super.toString();
		
	}
}
