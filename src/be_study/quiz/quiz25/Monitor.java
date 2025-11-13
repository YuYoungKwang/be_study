package be_study.quiz.quiz25;

public class Monitor {

	
	
	public Monitor(int inch, String maker, String modelName) {
		this.inch = inch;
		this.maker = maker;
		this.modelName = modelName;
	}

	int inch;
	String maker;
	String modelName;
	
	void showInfo() {
		
		System.out.printf("제조사 : %s 모델명: %s 인치: %d \n" , maker, modelName, inch);
	}
}
