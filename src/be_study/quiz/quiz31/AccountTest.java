package be_study.quiz.quiz31;

public class AccountTest {

	public static void main(String[] args) {
		// 객체 생성
		Account a = new Account("123-45", 10000);
		Account b = new Account("567-89", 10000);

		// 송금: 3천원씩 a 계좌에서 -> b계좌로!
		boolean result = true;
		while (result) {
			result = a.transfer(b, 3000);
		}
		
		// b.transfer(a, 5000);   //b계좌 기준으로 a계좌에 5천원을 보내라

		// 결과 출력
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
