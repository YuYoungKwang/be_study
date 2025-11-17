package be_study.quiz.quiz26;

public class TV {
	
	String company; // 제조사
	int year; //제조년도 몇년형
	int inch; //몇인치 
	
	TV(String company, int year, int inch){ //매개변수 3개  제조사, 제조년도, 인치
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	//메소드
	void show() {
		System.out.printf("%s제품 %d년형 %d인치 TV\n", company, year, inch);
	}
}
