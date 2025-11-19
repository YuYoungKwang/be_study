package be_study.quiz.quiz30;

public class Account {
	private String owner;
	private long balance;
	
	private String getOwner() {
		return owner;
	}

	private void setOwner(String owner) {
		this.owner = owner;
	}

	private long getBalance() {
		return balance;
	}

	private void setBalance(long balance) {
		this.balance = balance;
	}

	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	
	
	public Account(String owner) {
		this.owner = owner;
	}

	public Account(long balance) {
		this.balance = balance;
	}

	
	public Account() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account("유영광" , 10000);
		account.deposit(10000);
		
		account.withdraw(10000);
		
		System.out.println("예금주 : " + account.getOwner() + " 잔액 : " + account.getBalance());
		account.withdraw(30000);
	}
	
	public long deposit(long amount) {
		balance += amount;
		System.out.println("예금주 : " + owner + " 예금액 : " + amount + " 잔액 : " + balance);
		return balance;
	}
	
	public long withdraw(long amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("예금주 : " + owner + " 인출액 : " + amount + " 잔액 : " + balance);
			return balance;
		}else {
			System.out.println("잔액이 부족합니다 잔액 : " + balance);
			return balance;
		}
	}
}
