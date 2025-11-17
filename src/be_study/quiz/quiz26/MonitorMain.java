package be_study.quiz.quiz26;

public class MonitorMain {

	public static void main(String[] args) {
		
		Monitor m1 = new Monitor("삼성", 27, 150000);
		//m1.color = "검은색";
		m1.setColor("검은색");
		
		Monitor m2 = new Monitor("LG", 32, 330000);
		
		m1.setXY(1080, 780);
		
		m2.setColor("흰색");
		m2.setXY(4096, 2048);
		
		m1.printInfo();
		m2.printInfo();
		
		int returnPrice = m2.addPrice(70000); //7만원을 인상해라
						//m2에 가격 7만원 높이고, 높아진 최종금액 리턴
		System.out.println("인상된 최종 금액 : " + returnPrice);
		
		m1.printInfo();
		m2.printInfo();
	}

}
