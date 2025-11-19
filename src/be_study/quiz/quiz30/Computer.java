package be_study.quiz.quiz30;

public class Computer {

	public String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
	public int adress; 
	public int memory;
	
	
	public Computer(int adress, int memory) {
		this.adress = adress;
		this.memory = memory;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		pc.print();
		apple.print();
		galaxy.print();
	}
	
	public void print() {
		System.out.println("운영체제: " + osType[adress] + ", 메인메모리: " + memory);
	}

}
