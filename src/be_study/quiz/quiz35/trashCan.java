package be_study.quiz.quiz35;

public class trashCan {
	int volume;
	String color;
	int capacity;
	boolean isOpened;

	public void trashIn(int trashAmount) {
		capacity += trashAmount;
		if(capacity >= 100) {
			System.out.println("쓰레기통이 가득찼습니다.");
		}
	}
	
	public void trashOpen() {
		isOpened = true;
	}
	
	public void trashClose() {
		isOpened = false;
	}
	
	public void trashOut() {
		capacity = 0;
	}
	
}