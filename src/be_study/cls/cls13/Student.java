package be_study.cls.cls13;

public class Student {
	//학생
	
	String name;
	int stuNum;
	String phone;
	//....
	
	Card card; //학생이 들고다니는 카드
	
	
	public void setCard(Card card) {
		this.card = card;
	}
	
	public Card getCard() {
		return this.card;
	}
}
