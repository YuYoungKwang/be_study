package be_study.quiz.quiz34;

public class Sink {
//	싱크대
//	- 가로, 세로, 깊이 사이즈
//	- 색상
//	- 재질
	int width; //가로   500mm 1000mm
	int height; //세로
	int depth; //깊이
	String color; //색상
	String material; //재질
	
	int getWidth() {  //mm 단위 기준 그냥 값 그대로 리턴
		return width;
	}
	
	double getWidthAsCm() { //보유한 mm단위값을 cm 단위로 변환해서 리턴
		return width/10.0; //205mm -> 20.5cm
	}
	
	double getWidthAsMeter() { //보유한 mm단위값을 m 단위로 변환해서 리턴
		return width/1000.0; //205mm -> 0.205m
	}
}
