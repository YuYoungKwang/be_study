package be_study.quiz.quiz40;

public class Dropship extends Unit {

	@Override
	public void move(int x, int y) {
		System.out.println("날아서 x: "+ x +" y: "+ y + "로 이동중");
	}

	@Override
	public void stop() {
		super.stop();
	}
	
	public void load() { /* .*/ } //선택된 대상을 태운다
	public void unload() { /* .*/ } //선택된 대상을 내린다
}
