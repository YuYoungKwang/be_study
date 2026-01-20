package be_study.quiz.quiz34;

public class Refrigerator {
//	냉장고
//	- 어느 브랜드인지
//	- 몇리터 짜리인지
//	- 문이 몇개인지
	
	String brandName; //어디꺼냐 삼성 LG
	int liter; //몇리터짜리 320l  175l 
	int doorCount; //문2개 양문   4개
	
	boolean isPowerOn; //true 켜짐
	//boolean isPowerOff;  //true 꺼짐
	
	int temperature; //온도 현재 상태 온도
	
	// 온도 조절 가능 범위 -15 ~ 8
	// 온도 조절 가능 범위 -10 ~ 5
	int maxTemperature;  // r1.maxTemperature = 8
	int minTemperature;  // r2.maxTemperature = 5
	
	//냉동실 안에 얼음트레이
	IceTray iceTray; 
	
	//	- 전원을 켤수 있다
	
	void powerOn() { //전원켜기
		isPowerOn = true;
	}
	
	void powerOff() { //전원끄기
		isPowerOn = false;
	}
	
	//	- 온도조절을할수있다(온도 up 또는 온도 down)
	
	//온도 올리기
	// 1도 올리고 return 없음
	void upTemperature() {
		if(temperature < maxTemperature)
			temperature++; // 온도 1도 증가
	} 
	
	// 1도 올리고, 제대로 작동했는지 성공여부 return
	boolean upTemperature2() {
		if(temperature < maxTemperature) {
			temperature++;
			return true;
		}
		return false;
	}
	
	// 1도 올리고, 올린후 현재 온도 return
	int upTemperature3() {
		temperature++;
		return temperature;
	}
	
	//온도 내리기
	void downTemperature() {
		if(temperature > minTemperature)
			temperature--; // 온도 1도 감소
	} 
	
	
	//온도 조절하기 
	// controlTemperature(1) controlTemperature(2)
	void controlTemperature(int flag) {  
		if(flag == 1)
			temperature++;
		else
			temperature--;
		
		// controlTemperature(1)
		// controlTemperature(1)
		// controlTemperature(1)
	}
	
	void controlTemperature(boolean isUp) {  
		if(isUp)
			temperature++;
		else
			temperature--;
	}
	
	//controlTemperature2(1) controlTemperature2(2)
	//controlTemperature2(-5)
	void controlTemperature2(int change) {  
		temperature += change;
	}
	
	//원하는 온도로 바로세팅
	// setTemperature(5) setTemperature(-3)
	
	// setTemperature(50)
	// //r1.temperature = 50;
	void setTemperature(int temperature) {
		
		if(temperature > maxTemperature)
			temperature = maxTemperature;
		
		if(temperature < minTemperature)
			temperature = minTemperature;
		
		this.temperature = temperature;
	}
}

















