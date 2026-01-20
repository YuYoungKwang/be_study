package be_study.quiz.quiz34;

public class GasRange {
//	가스렌지
//	- 화구가 몇인지
//	- 어디 브랜드인지
//	- 가격이 얼마인지
	int fireCount; //화구
	String brand; //브랜드
	int price; //가격
	
	
	int fireLevel; //현재 불의 세기 상태
	// 불 단계 0~10 
	
//	- 불을 켠다
	void fireOn() {
		fireLevel = 5;
	}
//	- 불을 끈다
	void fireOff() {
		fireLevel = 0;
	}
//	- 불세기를 조절한다.
	void setFireLevel(int fireLevel) {
		this.fireLevel = fireLevel;
	}
	
}
