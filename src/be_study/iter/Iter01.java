package be_study.iter;

public class Iter01 {

	public static void main(String[] args) {
		// Iteration
		
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		System.out.println("배고프다");
		
		// for 문
		/*
		for(초기화식; 조건식; 증감식) {
			실행문
		}
		*/
		
		//  i:1 2 3 4 5 6 7 8 9 10   |   11
		//			 11<=10
		for(int i=1; i<=10; i++) {
			System.out.println("즐겁다");
		}
		
		
		/*
		int i=1;
		
		if(i<=10)
			System.out.println("즐겁다");
		i++;

		if(i<=10)
			System.out.println("즐겁다");
		i++;
		
		if(i<=10)
			System.out.println("즐겁다");
		i++;
		
		if(i<=10)
			System.out.println("즐겁다");
		i++;
		
		if(i<=10)
			System.out.println("즐겁다");
		i++;
		....
		
		
		if(i<=10) //거짓이 될때까지
			System.out.println("즐겁다");
		
		반복문 끝.

		그 다음줄 ...할거 해...


		 */
		
		int i = 0;
		//i:1 2 | 3
		//		 3<3
		for(i=1; i<3; i++) {
			System.out.println("화요일"); // 1 2 
		}
		
		//...
		
		//i:35 36 37 38 39 40 41 42 43 44  |  45
		//        45<45
		for(i=35; i<45; ++i) {  //단순 10번 반복
			System.out.println("실행문1");
		}
		
		System.out.println(i);
	
		System.out.println("다이어트 1일차");
		System.out.println("다이어트 2일차");
		System.out.println("다이어트 3일차");
		System.out.println("다이어트 4일차");
		System.out.println("다이어트 5일차");
		
		//j: 10 9 8 7 6   |  5 
		//            5>5
		for(int j=10; j>5; j--) {   //단순 5회 반복용도
			System.out.println("다이어트 1일차");
			System.out.println("다이어트 2일차");
			System.out.println("다이어트 3일차");
			System.out.println("다이어트 4일차");
			System.out.println("다이어트 5일차");
		}
		
		System.out.println("----------------------------");
		
 		//실행문에서 사용할 목적으로 값을 조정 -> 반복
		
		//j: 1 2 3 4 5 6
		//			 6<6
		for(int j=1; j<6; j++) {
			 
			System.out.println("다이어트 " +  j + "일차");
			//								1일차
			//								2일차
			//								3일차
			//								4일차
			//								5일차
		}
		
		System.out.println("----------------------------");
		
		int number = 1+2+3+4+5;
		
		number = number + 1;
		number = number + 2;
		number = number + 3;
		number = number + 4;
		number = number + 5;
		
		int sum = 0;  //0+0+0+0 = 0   덧셈에 영향을 안주는 0
		
		//n:1 2 3 4 5 | 6
		//for(int n=1; n<=5; n++) {
		for(int n=1; n<=100; n++) {
			//sum:0 1 3 6 10 15
			sum = sum + n;
			//    10  + 5 
			//    6   + 4 
			//    3   + 3
			//    1   + 2
			//    0   + 1 
		}
		System.out.println("최종합: " + sum );
		
		
		// 10 20 30 40 50 60 70 80 90 100 의 합
		// 반복문 
		
		int total = 0;
		for(int k=10; k<=100; k=k+10 ) {
			total = total + k;
		}
		
		System.out.println(total);
		
		
		total = 0;
		for(int k=1; k<=10; k++) {
			//k: 1 2 3 4 5 .... 9 10 
			//값: 10 20 30 40 ...  90 100
			//k*10 
			
			total = total + (k*10);
		}
		System.out.println(total);
		
		for(int k=2; k<20; k=k*2) {}
		// k: 2 4 8 16 | 32
		
		for(int k=400; k>100; k=k-50) {}
		// k: 400 350 300 250 200 150 |  100
		
		for(int k=100; k>=90; k--) {}
		// k: 100 99 98 97 96 95 94 93 92 91 90  |  89
	}

}

