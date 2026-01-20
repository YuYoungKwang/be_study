package be_study.quiz.quiz38.v2;


//public interface Unit { //인터페이스로 바꾼다면??
// 			동일한 개념/의미로 사용 가능?

public abstract class Unit { //추상클래스 
	int x, y; // 현재 위치

	abstract void move(int x, int y); //추상메소드

	void stop() {
		/* 현재 위치에 정지 */
		System.out.println("제자리 멈춤");
	}
}
