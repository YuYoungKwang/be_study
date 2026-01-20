package be_study.quiz.quiz25;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//모니터 클래스 활용
		//*별도의 main 메소드를 가진 클래스 파일 필요.
		모니터 객체 인스턴스를 생성하여, 모니터 타입 변수에 저장한 후 아래와 같이 출력되도록 작성.

		//실행 시 아래와 같은 형태로 출력이 나와야합니다.
		제조사:삼성 모델명:더프레임 인치:65인치
		제조사:LG 모델명:올레드 인치:80인치
		*/
		
		Monitor m1 = new Monitor(65, "삼성", "더프레임");
		Monitor m2 = new Monitor(80, "LG", "올레드");
		//m3
		System.out.println("제조사:" + m1.company + " 모델명:" + m1.model + " 인치:" + m1.inch + "인치");
		System.out.println("제조사:" + m2.company + " 모델명:" + m2.model + " 인치:" + m2.inch + "인치");
		//m3.company... + m3.model
		
		m1.printInfo();
		m2.printInfo();
		//m3.printInfo();
		
		System.out.println("===========================");
		Monitor m3 = new Monitor(80, "LG", "올레드");
		m3.printInfo();
		//m3.printInfo(80, "LG", "올레드");
		//m3.printInfo(120, "SONY", "SONYBIG");
		
		
		
		
	}

}
