package be_study.quiz.quiz26;

public class ExrMain {

	public static void main(String[] args) {

		TV myTv = new TV("LG", 2021, 43);
		
		myTv.show();  //  void 매개변수()
		
		//LG제품 2021년형 43인치 TV
		
		
		TV myTv2 = new TV("삼성", 2024, 120);
		myTv2.show();
	}

}
