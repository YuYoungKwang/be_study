package be_study.cls.cls03;

public class CalcMain {

	public static void main(String[] args) {
		
		//계산기 생성
		Calc c1 = new Calc(); 
		c1.powerOn(); //메소드호출(실행)   뒤에 괄호
		
		// c1.powerOn()  매개변수가 없는 powerOn 메소드 호출
		// c1.powerOn = true   powerOn 이라는 필드변수가 있나보다~
		
		c1.setOwner("에드워드리"); //setOwner 메소드 실행시 필요한
		//name 이라는 매개변수에 들어가게될 값을 전달하면서 호출
		
		Calc c2 = new Calc();
		c2.powerOn();
		c2.setOwner("김풍");
		//int r = c2.setOwner("김풍"); int r = void; XX
		//System.out.println(c2.setOwner("김풍")); XX
		
		int result1 = c2.sum(10, 20);
		System.out.println(result1);
		c2.sum(10, 20);
		
		System.out.println(c2.sum(50, 100));
		double result2 = c2.divide(30, 7);
		System.out.println(result2);
		
		int result3 = (int)c2.divide(30, 7);
		System.out.println(result3);
	
		c2.checkBattery();
		
		int cb = c2.checkBattery();
		System.out.println("잔여배터리량 : " + cb);
		
		System.out.println("계산기 제조사 : " + c2.madeByInfo());
		
		
		//println 메소드 오버로딩
		System.out.println(10203);			//printlnInt 	X
		System.out.println(102.12031);		//printlnDouble	X
		System.out.println("문자열");
		System.out.println(true);
	}

}
