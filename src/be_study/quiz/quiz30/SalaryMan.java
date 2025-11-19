package be_study.quiz.quiz30;

public class SalaryMan {

	int salary = 1000000; //월급
	
	
	
	public SalaryMan() {
		
	}

	public SalaryMan(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());

	}
	
	public int getAnnualGross() { //연봉을 반환하는 메소드
	//연봉 : 월급 1년치 + 상여금(보너스 월급 500%) 로 계산
		
		return (salary * 12) + (salary * 5);
	}

}
