package be_study.var;

public class Variable01 {

	public static void main(String[] args) {
		//변수 선언
		
		//타입 변수명
		// int 타입 : 정수형 숫자 타입
		
		int abc;  //변수 선언
		int def;  //정수형 숫자 타입의 변수
		
		int point; //선언
		int score;
		
		score = 90; //score 라는 변수에 90이란 값을 저장
		
		//int score = 90;
		
		int s;
		
//		int x;
//		int y;
//		int z;
		
		int x,y,z;
		
		//level = 99;  선언하지 않은 변수명 사용 불가능
		int level; //선언한 라인보다 아래에서 사용
		
		int math = 99; //선언과 동시에 저장 = 초기화
		
		int time;  // 변수 선언
		time = 12; // 12 값 저장
		
		time = 13; // 13 값 저장
		
		
		int myTime = 10 + 5 - 2; //연산 가능
		
		myTime = time + 5;
		
		//time = 20;
		myTime = time + 4 + time - 1 + time;
		//        13  + 4 +  13  - 1 + 13;
		//		  42
				
		
//		int value; //value 변수 선언만!
//		int result = value + 5;  //초기화되지 않은 수는 연산 불가
		
		int value = 20; //value 변수 선언 + 초기화(값 저장)
		int result = value + 5;  //값이 있는 변수는 연산 가능
		
		
		// 출력
		System.out.println("문자들 넣으면 출력");
		System.out.println(12345);
		System.out.println(value);
		System.out.println(result);
		//System.out.println(level); //초기화되지 않은 변수...
		
		System.out.println(  result + 50  );
		
		System.out.println( result + value + result + value );
		//					25		 20      25       20 	
		
		int totalScore = score + score + 50; //90 + 90 + 50
		System.out.println(totalScore);	// 230
		
		System.out.println( totalScore + 30 ); // 260
		
		System.out.println( totalScore ); // 230
		
		totalScore = totalScore + 70;
		System.out.println( totalScore ); // 300
		
		
		

		int a = 10;
		int b = 20;
		
		// a:10  b:20
		System.out.println(a);  //10
		System.out.println(b);  //20
		
		// 값 바꾸기 *******
		
		// 			a:10  b:20
		//a = b;	//  a:20  b:20
		//b = a;  //  a:20  b:20
		
		int c = a; // a:10  b:20  c:10
		a = b;     // a:20  b:20  c:10
		b = c;	   // a:20  b:10  c:10
		
		// a:20  b:10
		
		System.out.println(a);  // 20 ? 
		System.out.println(b);  // 10 ?
		
		
	}
}


