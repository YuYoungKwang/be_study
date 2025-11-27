package be_study.quiz.quiz40;

public abstract class Unit {
	int x;
	int y;
	
	public abstract void move(int x, int y);//지정된 위치로 이동
	public void stop() { /* */ 
		System.out.println("정지");
	} //현재 위치에 정지
}
