package be_study.cond;

public class Cond01 {

	public static void main(String[] args) {

		//조건문  if문
		// if(조건식) 참 -> 실행
		
		int num = 15;
		int x = 3;
		
		if( num > 5) {
			System.out.println("num이 5보다 크네");
			System.out.println("if 문 안에 실행");
			
			//int x = 30;   // x 변수명 중복
			x = 30; // x는 이미 11번 라인에 선언되어 있음.
			
			int y = 20;
			y = y + 50;
		}
		
		x = 20;
		//y = y - 5;  y변수는 저 위에 if문 지역 내부에서만 인식되는 변수
		
		int y = 5;
		
		
		if( num < 10 ) {
			System.out.println("num이 10보다 작구나");
			System.out.println("num 작네...");
			y = 30;
		}
		else
			System.out.println("num이 10보다 작지 않네?");
			 
		// if(조건식)   조건식 -> 결과가 논리형 (true/false)
		
		boolean bln = (num != 15);

		// true / false
		if(bln) { //결과가 논리형
		//if(bln == true ) {
		//if(bln == false ) {
		//if( !bln ) { 
			System.out.println("15랑 다른 수");
		} else {
			System.out.println("15랑 같은 수");
			y = 20;
		}
		
		
		
		System.out.println("end");
	}

}
