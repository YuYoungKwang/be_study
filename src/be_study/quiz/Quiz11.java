package be_study.quiz;

public class Quiz11 {

	public static void main(String[] args) {
		
		//아래와 같은 결과가 출력되도록 코드를 작성하시오
		//1.
//		12345
//		12345
//		12345
//		12345
//		12345
		
		System.out.println("-----------------");
		System.out.println("12345");
		System.out.println("12345");
		System.out.println("12345");
		System.out.println("12345");
		System.out.println("12345");
		
		System.out.println("-----------------");
		for(int i=1; i<=5; i++){  //i: 1 2 3 4 5 
			System.out.println("12345");
		}
		
		System.out.println("-----------------");
		
		
		
		//한줄 출력 자체를 5번 반복
		for(int j=1; j<=5; j++) { //단순 5줄 반복용
			for(int i=1; i<=5; i++) {  //12345 한줄 출력
				System.out.print(i);
			}
			System.out.println(); //줄바꿈
		}
		
		System.out.println("-----------------");
		
		
		//2.
//		11111
//		22222
//		33333
//		44444
//		55555

		System.out.println("-----------------");
		System.out.println("11111");
		System.out.println("22222");
		System.out.println("33333");
		System.out.println("44444");
		System.out.println("55555");
		
		System.out.println("-----------------");
		//i: 1 2 3 4 5
		for(int i=1; i<=5; i++) {
			System.out.println(""+i+i+i+i+i);
		}
		
		System.out.println("-----------------");
		//i: 1 2 3 4 5
		for(int i=1; i<=5; i++) {
			System.out.println(11111 * i);
		}
		
		System.out.println("-----------------");
		//i: 1 2 3 4 5
		for(int i=11111; i<=55555; i=i+11111) {
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		for(int i=1; i<=5; i++) { //i: 1 11 1 1 22 2 22 3 3 3  3 4  55 
			for(int j=1; j<=5; j++) { //단순 5회 반복용
				System.out.print(i);
			}
			System.out.println(); //줄바꿈
		}
	}

}
