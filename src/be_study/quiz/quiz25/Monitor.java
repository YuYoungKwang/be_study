package be_study.quiz.quiz25;

public class Monitor {

	/*
	//다음 가이드에 따라 클래스를 선언하고, 클래스 인스턴스를 생성하세요.
	//생성한 클래스 변수의 값들을 차례대로 출력하는 메소드를 구현하여 호출하세요.

	//모니터 클래스 생성
	*속성
	인치수(int타입)
	제조사(String타입)
	모델명(String타입)

	*생성자
	매개변수로 3개를 모두 받아서 저장하는 생성자

	*메소드
	가지고 있는 3개의 정보를 출력하는 printInfo 메소드 생성

	//모니터 클래스 활용
	//*별도의 main 메소드를 가진 클래스 파일 필요.
	모니터 객체 인스턴스를 생성하여, 모니터 타입 변수에 저장한 후 아래와 같이 출력되도록 작성.

	//실행 시 아래와 같은 형태로 출력이 나와야합니다.
	제조사:삼성 모델명:더프레임 인치:65인치
	제조사:LG 모델명:올레드 인치:80인치
	*/
	
	
	//필드
	int inch; 		//인치수(int타입)
	String company; //제조사(String타입)
	String model;   //모델명(String타입)
	
	//생성자
	//Monitor(){	} //매개변수가 없는 기본 생성자

	//매개변수로 3개를 모두 받아서 저장하는 생성자
	Monitor(int inch, String company, String model){
		this.inch = inch;
		this.company = company;
		this.model = model;
	}
	
	
	//가지고 있는 3개의 정보를 출력하는 printInfo 메소드 생성
	void printInfo() {
		//제조사:삼성 모델명:더프레임 인치:65인치
		System.out.printf("[모니터 정보] 제조사:%s 모델명:%s 인치:%d인치\n",company, model, inch);		
	}
	
//	void printInfo(int inch, String company, String model) {
//		System.out.printf("[모니터 정보] 제조사:%s 모델명:%s 인치:%d인치\n",company, model, inch);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
}




















