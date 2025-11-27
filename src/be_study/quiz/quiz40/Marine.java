package be_study.quiz.quiz40;

public class Marine extends Unit {
	
	@Override
	public void move(int x, int y) {
		System.out.println("걸어서 x: "+ x +" y: "+ y + "로 이동중");
	}

	@Override
	public void stop() {
		
	}
	
	public void stimPack() { /* .*/} //스팀팩을 사용한다
	
}
