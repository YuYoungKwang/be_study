package be_study.quiz.quiz30.q3;

public class AccountMain {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.setOwner("김부자");
		a1.setBalance(50000);
		
		System.out.println("입금하기전 잔액 : " + a1.getBalance());
		System.out.println(a1.deposit2(5000) + "원 입금합니다.");
		System.out.println("입금 처리 후 잔액 : " + a1.getBalance());
		
		System.out.println("--------------------------");
		
		Account a2 = new Account("정부자", 30000);
		System.out.println("5000원 입금합니다.");
		System.out.println("입금 처리 후 잔액 : " + a2.deposit(5000));
		
		System.out.println("3000원 입금합니다.");
		System.out.println("입금 처리 후 잔액 : " + a2.deposit(3000));
		
		System.out.println("30000원 출금합니다.");
		System.out.println("출금 처리 후 잔액 : " + a2.withdraw(30000));
		
		System.out.println("15000원 출금합니다.");
		System.out.println("출금 처리 후 잔액 : " + a2.withdraw(15000));
		
	}

}
