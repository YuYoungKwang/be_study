package be_study.cls.cls03;

public class Calc {
	//메소드 계산기 Calculator
	
	//필드
	
	//생성자
	

	//메소드
	
	/*
		리턴타입 메소드명(매개변수){
			실행문
			return ...
		}
		
		
			리턴		매개변수
			ㅇ		ㅇ
			ㅇ		X
			X		O
			X		X
	 */
	
	//계산기 전원 켜기 -> 리턴X  매개변수X
	void powerOn() {
		System.out.println("power On");
	}
	
	//소유자 이름 등록 -> 리턴X  매개변수O (이름 전달)
	void setOwner(String name) {
		System.out.println(name + "님의 계산기로 등록되었습니다.");
	}
	
	//계산기 계산 수행 -> 리턴 O 매개변수 O 
	int sum(int n1, int n2) {
		int result = n1 + n2;
		return result; 
	}
	
	double sum(double n1, double n2) {
		double result = n1 + n2;
		return result; 
	}
	
	//메소드 오버로딩  (매개변수의 타입, 순서, 개수)	: 메소드를 호출하는 시점에 구분이 되어야한다.
	// return 타입이 다른것은 오버로딩 할수 있는 조건에 포함되지 않는다 
	// Calc c1 = new Calc();     c1.sum(500, 1000);
//	String sum(int n1, int n2) { //매개변수가 int int 두개 중복  
//		String result = "" + n1 + n2;
//		return result; 
//	}
	
	//c1.sum(10, 20);  c1.sum(10, 20, 30);   c1.sum(10.5, 20.5);
	//메소드 오버로딩  (매개변수의 타입, 순서, 개수)		
	int sum(int n1, int n2, int n3) {
		int result = n1 + n2 + n3;
		return result; 
	}
	
	
	
	double divide(int x, int y){
		double result = (double)x / y;
		return result;
	}
	
	//리턴O  매개변수X
	
	//배터리 잔여량 얼마냐?
	int checkBattery() {
		return 80;
	}
	//제조사 어디냐
	String madeByInfo() {
		return "카시오";
	}
	
}
