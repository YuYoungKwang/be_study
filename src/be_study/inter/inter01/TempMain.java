package be_study.inter.inter01;

public class TempMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TempInterface ti = new TempInterface();
		//인터페이스 객체(?) 생성 불가
		
		TempObject to = new TempObject();
		to.method1();
		to.method2();
		to.method99();
		
		Temp2Interface ti = new TempObject();
		ti.method1();
		ti.method2();
		//ti.method99();
		
		
		TempInterface ti1 = new TempObject();
		Temp2Interface ti2 = new TempObject();
		
		ti1.method3();
		ti2.method1();
		ti2.method2();
		
		TempInterface[] tArr = {new TempObject(),new TempObject()};
	
		TempObject to2 = (TempObject)ti1;
		to2.method99();
		
		/*
		클래스 상속
			- 객체 생성 가능
			- 필드변수 선언 가능
			- 메소드 구현
			- 부모타입 변수 = 자식객체
			- 상속 선언 1개
			- is a
			
		추상클래스 상속
			- 객체 생성 불가
			- 필드변수 선언 가능
			- 메소드 구현 + 추상 메소드 선언
			- 추상부모타입 변수 = 자식객체
			- 상속 선언 1개
					
		인터페이스 구현
			- 객체 생성 불가
			- 필드변수 선언 불가능 -> 변수는 전부 상수화
			- (추상)메소드 선언
			- 인터페이스타입 변수 = 구현객체
			- 인터페이스 구현 여러개(N개)
			- 인터페이스가 인터페이스를 다중 상속 가능
			- has a
			
		*공통
		 매개변수, 리턴타입 다형성 개념 
		 
		 */
		
		
		
	}

}














