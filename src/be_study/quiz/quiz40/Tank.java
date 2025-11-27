package be_study.quiz.quiz40;

public class Tank extends Unit {
	
	@Override
	public void move(int x, int y) {
		System.out.println("바퀴를 굴려서 x: "+ x +" y: "+ y + "로 이동중");
	}

	@Override
	public void stop() {
		super.stop();
	}
	
	public void changeMode() { /* . */} //공격모드를 변환한다
}
