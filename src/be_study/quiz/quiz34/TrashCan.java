package be_study.quiz.quiz34;

public class TrashCan {
//	쓰레기통
//	(*주방에 여러개가 있다)
//	- 몇리터
//	- 색상
//	- 용량이 몇퍼센트나 찼는지
	
	int liter; //20l 50l 용량몇리터 최대 용량 
	String color; //색상 
	
	int trashPercentage;  //용량이 몇퍼센트나 찼는지 20%  50% 
	
	// 현재용량을 저장 하면서 얼마나 채워졌는지 관리   10l  50l 1/5 = 20%
	
	boolean isCoverOpened; //뚜껑이 열려 있는지?
	
//	- 쓰레기통을 연다
	void openCover() {
		this.isCoverOpened = true;
	}
//	- 쓰레기통을 닫는다
	void closeCover() {
		this.isCoverOpened = false;
	}
	
//	- 쓰레기를 채운다
	// 퍼센트만큼 추가한다(채운다)
	//원래20%   insertTrash(10)   20+10 =>> 30 %
	void insertTrash(int addPercentage) {
		trashPercentage += addPercentage; //몇퍼센트만큼 추가로 채워졌다.
	}
	
	// 원래 20%  setTrashPercentage(40)
	// 특정 퍼센티지로 지정
	void setTrashPercentage(int trashPercentage) {
		this.trashPercentage = trashPercentage;
	}

	void insertTrashLiter(int trashLiter) {
		//현재 몇리터 차있다!
		//  (현재리터 + trashLiter)/ liter -> 0.3  0.5
		// 계산결과 * 100 -> % 단위로 변환
		// (10l + 20l) / 50l -> 0.6  * 100 -> 60% 
	}
	
//	- 쓰레기통을 비운다
	void cleanTrashCan() {
		this.trashPercentage = 0; //쓰레기 다 비워서 채워진 용량이 0
	}
	
}
