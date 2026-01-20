package be_study.quiz.quiz30.q2;

public class SalaryManMain {

	public static void main(String[] args) {
		
		SalaryMan sm1 = new SalaryMan();
		sm1.getAnnualGross();
		
		SalaryMan sm2 = new SalaryMan(2000000);
		sm2.getAnnualGross();
		
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
		
	}

}
