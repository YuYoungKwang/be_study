package be_study.quiz.quiz30.q3;

public class Account {
/*
	다음을 만족하는 클래스 Account를 작성하시오.
	· 다음의 2 개의 필드를 선언
	private String owner;
	private long balance;
	· 위 모든 필드에 대한 getter와 setter의 구현
	· 위 모든 필드를 사용하는 가능한 모든 생성자의 구현
	다음 기능을 추가하여 작성하시오.
	· 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소
	드
	public long deposit(long amount)
	· 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메
	소드
	public long withdraw(long amount)
	· Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한
	저축과 인출을 수행한 후 잔금을 출력
	메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
	· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
	· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인
	출하려는 메소드를 호출하여 출력
*/
	
	//필드
	private String owner;  //소유주
	private long balance;  //잔액
	
	//생성자
	public Account() {
		owner = null;
		balance = 0;
	}
	
	public Account(String owner) {
		this.owner = owner;
		balance = 0;
	}
	
	public Account(long balance) {
		owner = null;
		this.balance = balance;
	}
	
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public Account(long balance, String owner) {
		this.owner = owner;
		this.balance = balance;
	}
	
	
	
	//메소드	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long deposit(long amount) { //입금
		balance += amount; //입금한 금액만큼 내 잔액을 증가
		return balance; //입금 후 잔액 반환
		
		//기존잔액 : 3만원   입금 : 1만원
		//입금 기능의 return을 뭐로 해줄거냐?
		// 1) 입금한 금액  1만원
		// 2) 입금후 잔액  4만원  <---
	}
	
	public long deposit2(long amount) { //입금
		balance += amount; //입금한 금액만큼 내 잔액을 증가
		return amount; //입금처리된 금액 반환
		
		//기존잔액 : 3만원   입금 : 1만원
		//입금 기능의 return을 뭐로 해줄거냐?
		// 1) 입금한 금액  1만원  <---
		// 2) 입금후 잔액  4만원  
	}
	
	public long withdraw(long amount) { //출금
		
		//balance 잔액 amount 출금하려는 금액
		
		// 1) 잔액부족 -> 최대금액 출금? 
		// 2) 잔액부족 -> 출금불가. 잔액 부족하다! 정보전달
		
		if(amount > balance) { //잔액 이상 출금 시도
			System.out.println("잔액이 부족합니다.");
			return balance; 
			
			//잔액 return
			//출금 실패 -> return -99;
			
			//클래스 객체  필드변수 (여러정보 전달)
			//출금성공, 실패, 잔액 얼마, 얼마출금
		}
		
		//잔액 >= amount
		//출금을 했으니까 내 잔고 잔액 줄어
		balance -= amount;
		return balance;
		
	}
	
}
